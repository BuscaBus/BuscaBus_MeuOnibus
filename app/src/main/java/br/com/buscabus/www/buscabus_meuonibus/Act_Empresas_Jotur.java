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

public class Act_Empresas_Jotur extends AppCompatActivity {

    ArrayAdapter<String> adaptador;
    List<String> linha;
    private ListView listView;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__empresas__jotur);

        this.listView = (ListView) findViewById(R.id.LV_ListaLinhas);
        searchView = (SearchView) findViewById(R.id.Filtro);

        // Declaração dos itens no ListView
        linha = new ArrayList<String>();
        linha.add("Albardão-Estação Palhoça");
        linha.add("Alto Aririu-Estação Palhoça");
        linha.add("Aririu Formiga-Estação Palhoça");
        linha.add("Aririu Formiga-Florianópolis");
        linha.add("Aririu-Florianpolis");
        linha.add("Bairro São Luiz-Florianópolis");
        linha.add("Barra do Aririu-Barreiros");
        linha.add("Barra do Aririu-Estação Palhoça (Circular)");
        linha.add("Barra do Aririu-Estação Palhoça via Rio Grande");
        linha.add("Barra do Aririu-Florianópolis");
        linha.add("Barra do Aririu-Hospital Regional");
        linha.add("Bela Vista-Estação Palhoça");
        linha.add("Bela Vista-Florianópolis");
        linha.add("Caminho Novo/Terra Nova-Estação Palhoça");
        linha.add("Caminho Novo/Terra Nova-Florianópolis");
        linha.add("Circulares Região Sul (Escolar)");
        linha.add("Diretão");
        linha.add("Diretão Executivo");
        linha.add("Enseada do Brito (Escolar)");
        linha.add("Enseada do Brito-Estação Palhoça");
        linha.add("Enseada do Brito-Florianópolis (Executivo)");
        linha.add("Estação Palhoça-Área Industrial (Circular)");
        linha.add("Estação Palhoça-Jardim Aquárius (Circular)");
        linha.add("Estação Palhoça-Jardim Eldorado (Circular)");
        linha.add("Estação Palhoça-Ponte do Imaruim (Circular)");
        linha.add("Estação Palhoça-Ponte Hercílio Luz");
        linha.add("Estação Palhoça-São José (Roçado)");
        linha.add("Estação Palhoça-TICEN (Expresso)");
        linha.add("Estação Palhoça-TICEN via BR 101");
        linha.add("Estação Palhoça-TICEN via P.Imaruim");
        linha.add("Fazenda Jomar-Estação Palhoça");
        linha.add("Florianópolis-Unisul");
        linha.add("Forquilhas-São José");
        linha.add("Guarda do Cubatão-Estação Palhoça");
        linha.add("Guarda do Cubatão-Estação Palhoça (Circular)");
        linha.add("Guarda do Cubatão-Florianópolis");
        linha.add("Hospital Regional-Florianópolis");
        linha.add("Interbairros (Bela Vista/Passa Vinte)");
        linha.add("Irineu Comelli-Florianópolis");
        linha.add("Jaqueira-Florianópolis");
        linha.add("Jardim Aquárius-Florianópolis");
        linha.add("Jardim Eldorado-Florianópolis");
        linha.add("Kobrasol-Área Industrial");
        linha.add("Laranjeiras-Estação Palhoça");
        linha.add("Madri/Caminho Novo-Florianópolis");
        linha.add("Madri-Estação Palhoça");
        linha.add("Madri-Florianópolis");
        linha.add("Pachecos-Estação Palhoça");
        linha.add("Pachecos-Florianópolis");
        linha.add("Palhoça-Biguaçu");
        linha.add("Palhoça-Florianópolis");
        linha.add("Palhoça-Florianópolis (Executivo)");
        linha.add("Pedra Branca-Florianópolis");
        linha.add("Pinheira-Enseada do Brito (Escolar)");
        linha.add("Pinheira-Estação Palhoça");
        linha.add("Pinheira-Florianópolis (Executivo)");
        linha.add("Ponta de Baixo-Florianópolis");
        linha.add("São José-Florianópolis");
        linha.add("São Sebastião-Estação Palhoça");
        linha.add("São Sebastião-Florianópolis");
        linha.add("São Sebastião-São José (Roçado)");
        linha.add("Serraria-Forquilhinhas");
        linha.add("Terra Nova-Estação Palhoça");
        linha.add("Unisul-Estação Palhoça");
        linha.add("Vila Nova-Estação Palhoça");
        linha.add("Vila Nova-Florianópolis");


        adaptador = new ArrayAdapter<String>(Act_Empresas_Jotur.this, android.R.layout.simple_list_item_1, linha);
        listView.setAdapter(adaptador);

        // Chama nova tela passando o item clicado
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long ld) {
                Intent intent = new Intent(Act_Empresas_Jotur.this, Act_Empresas_Jotur_Horarios.class);
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
                    Toast.makeText(Act_Empresas_Jotur.this, "Linha não encontrada",Toast.LENGTH_LONG).show();
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