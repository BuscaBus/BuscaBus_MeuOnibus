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

public class Act_Empresas_Estrela extends AppCompatActivity {

    ArrayAdapter<String> adaptador;
    List<String> linha;
    private ListView listView;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__empresas__estrela);

        this.listView = (ListView) findViewById(R.id.LV_ListaLinhas);
        searchView = (SearchView) findViewById(R.id.Filtro);

        // Declaração dos itens no ListView
        linha = new ArrayList<String>();
        linha.add("Arthur Mariano-Circular Forquilhinhas");
        linha.add("Bairro São Luiz");
        linha.add("Barreiros-Sede");
        linha.add("Campinas");
        linha.add("Campinas via Ginásio");
        linha.add("Ceasa via Shopping");
        linha.add("Ceniro via Jardim Palmeiras");
        linha.add("Diretão");
        linha.add("Diretão Executivo");
        linha.add("Executivo San Marino/Lisboa");
        linha.add("Executivo Zenaide/Barreiros via Estreito");
        linha.add("Forquilhas");
        linha.add("Forquilhas-Kobrasol");
        linha.add("Forquilhinhas");
        linha.add("Forquilhinhas via Rodeio/Palmares");
        linha.add("Kobrasol via Expressa");
        linha.add("Kobrasol VIP");
        linha.add("Los Angeles");
        linha.add("Lisboa");
        linha.add("Potecas");
        linha.add("Potecas via Santos Saraiva");
        linha.add("Potecas-Kobrasol");
        linha.add("Recanto da Natureza via Ceniro");
        linha.add("Serraria-Forquilhinhas");
        linha.add("Vila Formosa-Lisboa-Kobrasol");
        linha.add("Zenaide/Santa Felicidade via Ceniro");

        adaptador = new ArrayAdapter<String>(Act_Empresas_Estrela.this, android.R.layout.simple_list_item_1, linha);
        listView.setAdapter(adaptador);

        // Chama nova tela passando o item clicado
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long ld) {
                Intent intent = new Intent(Act_Empresas_Estrela.this, Act_Empresas_Estrela_Horarios.class);
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
                    Toast.makeText(Act_Empresas_Estrela.this, "Linha não encontrada",Toast.LENGTH_LONG).show();
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