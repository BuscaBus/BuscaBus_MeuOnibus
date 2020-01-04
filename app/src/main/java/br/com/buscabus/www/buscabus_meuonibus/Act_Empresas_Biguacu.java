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

public class Act_Empresas_Biguacu extends AppCompatActivity {

    ArrayAdapter<String> adaptador;
    List<String> linha;
    private ListView listView;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__empresas__biguacu);

        this.listView = (ListView) findViewById(R.id.LV_ListaLinhas);
        searchView = (SearchView) findViewById(R.id.Filtro);

        // Declaração dos itens no ListView
        linha = new ArrayList<String>();
        linha.add("Antônio Carlos-Florianópolis");
        linha.add("Antônio Carlos-Biguaçu");
        linha.add("Araucária");
        linha.add("Armação da Piedade-Florianópolis");
        linha.add("Armação da Piedade-Biguaçu");
        linha.add("Avenida das Torres");
        linha.add("Avenida das Torres-Kobrasol");
        linha.add("Bairro Ipiranga");
        linha.add("Bairro Ipiranga via Expressa");
        linha.add("Bairro São Pedro");
        linha.add("Bairro São Pedro via Expressa");
        linha.add("Barreiros");
        linha.add("Barreiros-Sede");
        linha.add("Bela Vista");
        linha.add("Bela Vista via Expressa");
        linha.add("Bela Vista via Floresta");
        linha.add("Bela Vista via Floresta/Expressa");
        linha.add("Biguaçu");
        linha.add("Biguaçu via Expressa");
        linha.add("Biguaçu-Palhoça");
        linha.add("Bom Viver");
        linha.add("Bom Viver via Expressa");
        linha.add("Bom Viver-Biguaçu");
        linha.add("Catarina");
        linha.add("Ceasa via Estreito");
        linha.add("Circular Barreiros");
        linha.add("Circular Biguaçu");
        linha.add("Diretão");
        linha.add("Dona Adélia");
        linha.add("Dona Wanda");
        linha.add("Dona Wanda via Expressa");
        linha.add("Egito-Antônio Carlos");
        linha.add("Estiva-Biguaçu");
        linha.add("Executivo Antônio Carlos");
        linha.add("Executivo Bela Vista");
        linha.add("Executivo Biguaçu");
        linha.add("Executivo Dona Adélia");
        linha.add("Executivo Dona Wanda");
        linha.add("Executivo Governador Celso Ramos");
        linha.add("Executivo Ipiranga");
        linha.add("Executivo Zenaide");
        linha.add("Floresta via Expressa");
        linha.add("Floresta via Kobrasol");
        linha.add("Fundos");
        linha.add("Governador Celso Ramos-Florianópolis");
        linha.add("Governador Celso Ramos-Biguaçu");
        linha.add("Heriberto Hulse");
        linha.add("Jardim Carandai");
        linha.add("Jardim Cidade Florianópolis");
        linha.add("Jardim das Acácias");
        linha.add("Jardim Janaina");
        linha.add("Jardim Janaina via Expressa");
        linha.add("Jardim Zanellato");
        linha.add("Jardim Zanellato via Expressa");
        linha.add("José Nitro");
        linha.add("Loro-Antônio Carlos");
        linha.add("Palmas-Florianópolis");
        linha.add("Palmas-Biguaçu");
        linha.add("Prado");
        linha.add("Praia João Rosa");
        linha.add("Rachadel-Antônio Carlos");
        linha.add("Roçado");
        linha.add("Rua Santo Antônio");
        linha.add("Santa Maria-Antônio Carlos");
        linha.add("São Miguel");
        linha.add("Saudades");
        linha.add("Serraria-Forquilhinhas");
        linha.add("Shopping Center Itaguaçu");
        linha.add("Sorocaba-Biguaçu");
        linha.add("Tijucas-Biguaçu");
        linha.add("Três Riachos-Florianópolis");
        linha.add("Três Riachos-Biguaçu");

        adaptador = new ArrayAdapter<String>(Act_Empresas_Biguacu.this, android.R.layout.simple_list_item_1, linha);
        listView.setAdapter(adaptador);

        // Chama nova tela passando o item clicado
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long ld) {
                Intent intent = new Intent(Act_Empresas_Biguacu.this, Act_Empresas_Biguacu_Horarios.class);
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
                    Toast.makeText(Act_Empresas_Biguacu.this, "Linha não encontrada",Toast.LENGTH_LONG).show();
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
