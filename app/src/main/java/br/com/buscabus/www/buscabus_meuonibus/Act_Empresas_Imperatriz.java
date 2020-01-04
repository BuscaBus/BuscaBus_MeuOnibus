package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Act_Empresas_Imperatriz extends AppCompatActivity {

    ArrayAdapter<String> adaptador;
    List<String> linha;
    private ListView listView;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__empresas__imperatriz);

        this.listView = (ListView) findViewById(R.id.LV_ListaLinhas);
        searchView = (SearchView) findViewById(R.id.Filtro);

        // Declaração dos itens no ListView
        linha = new ArrayList<String>();
        linha.add("Águas Mornas-Florianópolis");
        linha.add("Alto Aririu-Florianópolis via BR 101/Expressa");
        linha.add("Aririu-Caldas");
        linha.add("Caldas-Florianópolis");
        linha.add("Caldas-Florianópolis via B. São Francisco");
        linha.add("Caldas-Florianópolis via BR 101/Expressa");
        linha.add("Capela/Alto Aririu-Florianópolis");
        linha.add("Capela/Alto Aririu-Florianópolis via BR 101/Expressa");
        linha.add("Lourdes-Florianópolis");
        linha.add("Lourdes-Santo Amaro");
        linha.add("Queçaba-Florianópolis");
        linha.add("Santa Isabel-Florianópolis");
        linha.add("Santo Amaro-Florianópolis");
        linha.add("Santo Amaro-Florianópolis via B. São Francisco");
        linha.add("Santo Amaro-Florianópolis via BR 101/Expressa");
        linha.add("Santo Amaro-Florianópolis via BR 282/BR 101/Expressa");
        linha.add("Santo Amaro-Florianópolis via Sertão");
        linha.add("Santo Amaro-Florianópolis via Sul do Rio");
        linha.add("Vargem Grande-Florianópolis");
        linha.add("Vargem Grande-Florianópolis via BR 101/Expressa");


        adaptador = new ArrayAdapter<String>(Act_Empresas_Imperatriz.this, android.R.layout.simple_list_item_1, linha);
        listView.setAdapter(adaptador);

        // Chama nova tela passando o item clicado
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long ld) {
                Intent intent = new Intent(Act_Empresas_Imperatriz.this, Act_Empresas_Imperatriz_Horarios.class);
                intent.putExtra("Nome da Linha", adapterView.getItemAtPosition(position).toString());
                startActivity(intent);
            }
        });

        // Construtor do filtro SearchView
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Condição para mensagem de "Linha não encontrada" no filtro
                if(linha.contains(query)){
                    adaptador.getFilter().filter(query);
                }else{
                    Toast.makeText(Act_Empresas_Imperatriz.this, "Linha não encontrada",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adaptador.getFilter().filter(newText);
                return false;
            }
        });
    }
}