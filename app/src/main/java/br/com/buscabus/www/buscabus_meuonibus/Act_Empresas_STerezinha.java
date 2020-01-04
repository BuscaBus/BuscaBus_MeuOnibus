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

public class Act_Empresas_STerezinha extends AppCompatActivity {

    ArrayAdapter<String> adaptador;
    List<String> linha;
    private ListView listView;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__empresas__sterezinha);

        this.listView = (ListView) findViewById(R.id.LV_ListaLinhas);
        searchView = (SearchView) findViewById(R.id.Filtro);

        // Declaração dos itens no ListView
        linha = new ArrayList<String>();
        linha.add("Angelina-Florianópolis");
        linha.add("Flor de Nápolis-Florianópolis");
        linha.add("Jardim Pinheiros-Kobrasol");
        linha.add("Santana-Florianópolis");
        linha.add("Santana-Kobrasol");
        linha.add("São Pedro de Alcântara-Florianópolis");
        linha.add("Sertão do Maruim-Florianópolis");
        linha.add("Vila Formosa-Florianópolis");

        adaptador = new ArrayAdapter<String>(Act_Empresas_STerezinha.this, android.R.layout.simple_list_item_1, linha);
        listView.setAdapter(adaptador);

        // Chama nova tela passando o item clicado
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long ld) {
                Intent intent = new Intent(Act_Empresas_STerezinha.this, Act_Empresas_STerezinha_Horarios.class);
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
                    Toast.makeText(Act_Empresas_STerezinha.this, "Linha não encontrada",Toast.LENGTH_LONG).show();
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