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

public class Act_Op_Hor_Linh_CFenix extends AppCompatActivity {

    ArrayAdapter<String> adaptador;
    List<String> linha;
    private ListView listView;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_op_hor_linh_c_fenix);

        this.listView = (ListView) findViewById(R.id.LV_ListaLinhas);
        searchView = (SearchView) findViewById(R.id.Filtro);

        // Declaração dos itens no ListView
        linha = new ArrayList<String>();
        linha.add("100 - Madrugadão Centro-UFSC");
        linha.add("101 - Circular Centro");
        linha.add("104 - TICEN-Itacorubi via Mauro Ramos");
        linha.add("110 - TITRI-TICEN Direto");
        linha.add("1112 - Executivo Santa Mônica");
        linha.add("1113 - Executivo Parque São Jorge");
        linha.add("1115 - Executivo Córrego Grande via G D`Eça");
        linha.add("1117 - Executivo João Paulo");
        linha.add("1119 - Circular Ponte Viva");
        linha.add("1120 - Executivo Canasvieiras");
        linha.add("1121 - Executivo Ingleses/Santinho");
        linha.add("1122 - Executivo Praia Brava");
        linha.add("1123 - Executivo Jurerê");
        linha.add("1125 - Executivo Rio Vermelho");
        linha.add("1126 - Executivo Cachoeira");
        linha.add("1127 - Executivo Gaivotas");
        linha.add("1128 - Executivo Costa do Moçambique");
        linha.add("1129 - Executivo Muquem");
        linha.add("131 - TITRI-TICEN via Gama D`Eça");
        linha.add("132 - TITRI-TICEN via Gama D`Eça/HI");
        linha.add("133 - TITRI-TICEN via Mauro Ramos");
        linha.add("134 - TITRI-TICEN via Beira Mar");
        linha.add("135 - Volta ao Morro/Carvoeira Norte");
        linha.add("136 - Volta ao Morro/Carvoeira Sul");
        linha.add("137 - Volta ao Morro/Pantanal Norte");
        linha.add("138 - Volta ao Morro/Pantanal Sul");
        linha.add("150 - TICEN-Itacorubi via Beira Mar");
        linha.add("151 - Centro Aministrativo via Beira Mar");
        linha.add("153 - Costeira do Pirajubaé");
        linha.add("155 - Sol Nascente");
        linha.add("160 - Morro da Cruz");
        linha.add("161 - Morro da Penitenciária");
        linha.add("162 - Saco dos Limões");
        linha.add("163 - Córrego Grande");
        linha.add("164 - Córrego Grande - Poção");
        linha.add("165 - Itacorubi");
        linha.add("167 - João Paulo");
        linha.add("168 - Monte Verde");
        linha.add("169 - Monte Verde via Mané Vicente");
        linha.add("170 - Caminho da Cruz via João Paulo");
        linha.add("173 - Morro do Quilombo");
        linha.add("174 - Saco Grande via João Paulo");
        linha.add("175 - SC 401 Retorno/Saco Grande");
        linha.add("176 - Saco Grande via HU");
        linha.add("177 - Santa Mônica");
        linha.add("178 - Saco Grande/Retorno SC 401");
        linha.add("179 - Serrinha");
        linha.add("180 - TITRI-UFSC");
        linha.add("181 - Cacupé/João Paulo via Barreira do Janga");
        linha.add("182 - Tecnópolis");
        linha.add("183 - Corredor Sudoeste");
        linha.add("184 - UDESC via Beira Mar");
        linha.add("185 - UFSC Semidireto");
        linha.add("186 - Corredor Sudoeste Semidireto");
        linha.add("191 - TITRI-TICEN via Transcaeira");
        linha.add("200 - Madrugadão Norte");
        linha.add("210 - TICAN-TICEN Direto");
        linha.add("212 - TISAN-TICEN Direto");
        linha.add("2120 - Executivo Barra da Lagoa");
        linha.add("2123 - Executivo Lagoa da Conceição via Joaquina");
        linha.add("2124 - Executivo Sambaqui");
        linha.add("221 - TICAN-TICEN via Mauro Ramos");
        linha.add("230 - Canasvieiras via Gama D`Eça");
        linha.add("231 - TICAN-TICEN via TITRI");
        linha.add("233 - TICAN-TITRI via UFSC");
        linha.add("235 - TICAN-TITRI via TISAN");
        linha.add("250 - Forte-Canasvieiras");
        linha.add("260 - Cachoeira do Bom Jesus");
        linha.add("262 - Circular Canasvieiras");
        linha.add("263 - Gaivotas");
        linha.add("264 - Ingleses");
        linha.add("265 - Ponta das Canas");
        linha.add("266 - Praia Brava");
        linha.add("267 - Rio Vermelho");
        linha.add("268 - Sitio de Baixo");
        linha.add("269 - Moçambique via Alzira Rosa Aguiar");
        linha.add("270 - Vargem Grande");
        linha.add("271 - Daniela");
        linha.add("272 - Jurerê");
        linha.add("273 - Circular Ratones");
        linha.add("274 - Rio Vermelho via Muquem");
        linha.add("276 - Balneário Canasvieiras");
        linha.add("277 - Balneário Ingleses");
        linha.add("280 - Cachoeira-TICAN");
        linha.add("281 - Costa do Moçambique");
        linha.add("282 - Vargem Pequena");
        linha.add("283 - Vargem do Bom Jesus");
        linha.add("284 - Moçambique via Rua da Intendência");
        linha.add("285 - Circular Moçambique");
        linha.add("286 - TICAN-Sapiens Parque");
        //linha.add("291 - Circular Canasvieiras/Praia Brava");
        linha.add("294 - Interpraias");
        linha.add("296 - Circular Santinho/Ingleses");
        linha.add("300 - Madrugadão Leste");
        linha.add("3001 - Executivo Abraão-UFSC");
        linha.add("3002 - Executivo Jardim Atlântico-UFSC");
        linha.add("311 - TILAG-TICEN Direto");
        linha.add("320 - TILAG-TICEN via Beira Mar");
        linha.add("330 - TILAG-TICEN via Mauro Ramos");
        linha.add("331 - TISAN-TICEN via Mauro Ramos");
        linha.add("332 - TISAN-TICEN via Beira Mar");
        linha.add("333 - TILAG-TITRI via Madre Benvenuta");
        linha.add("360 - Barra da Lagoa");
        linha.add("362 - Canto dos Araças");
        linha.add("363 - Joaquina");
        linha.add("364 - Osni Ortiga");
        linha.add("365 - Sambaqui");
        linha.add("366 - Barra do Sambaqui via Padre Rohr");
        linha.add("410 - TIRIO-TICEN Direto");
        linha.add("4120 - Executivo Pântano do Sul via Eucaliptos");
        linha.add("4121 - Executivo Pântano do Sul via Campeche");
        linha.add("4122 - Executivo Campeche");
        linha.add("4123 - Executivo Ribeirão da Ilha");
        linha.add("4124 - Executivo Caieira Barra do Sul via Tapera");
        linha.add("4125 - Executivo Pântano do Sul via Gramal");
        linha.add("430 - TIRIO-TICEN via Costeira");
        linha.add("431 - TICEN-Aeroporto");
        linha.add("460 - Porto da Lagoa");
        linha.add("461 - Tapera via Túnel");
        linha.add("462 - Campeche");
        linha.add("463 - Castanheiras via Eucaliptos");
        linha.add("464 - Castanheiras via Gramal");
        linha.add("467 - Tapera/Saco dos Limões");
        linha.add("468 - TIRIO-Aeroporto via Carianos");
        linha.add("469 - Tapera-Rio Tavares");
        linha.add("470 - Tapera-TITRI");
        linha.add("472 - Campeche via Capela");
        linha.add("473 - Morro das Pedras via Eucaliptos");
        linha.add("474 - Morro das Pedras via Gramal");
        linha.add("477 - TIRIO-Aeroporto via Tapera");
        linha.add("500 - Madrugadão Sul");
        linha.add("502 - Madrugadão Aeroporto-Tapera-Carianos");
        linha.add("560 - Armação");
        linha.add("561 - Caieira da Barra do Sul");
        linha.add("562 - Costa de Cima");
        linha.add("563 - Costa de Dentro");
        linha.add("564 - Pântano do Sul");
        linha.add("565 - Ribeirão da Ilha");
        linha.add("566 - Caieira via Tapera");
        linha.add("600 - Madrugadão Continente");
        linha.add("601 - Circular Abraão-Estreito");
        linha.add("605 - Circular Estreito-Abraão");
        linha.add("6220 - Executivo Abraão");
        linha.add("630 - Corredor Continente");
        linha.add("631 - Capoeiras");
        linha.add("660 - Aracy Vaz Callado");
        linha.add("661 - Balneário");
        linha.add("663 - Coloninha");
        linha.add("664 - Itaguaçu");
        linha.add("665 - Abraão");
        linha.add("668 - Promorar via Ivo Silveira");
        linha.add("670 - Monte Cristo");
        linha.add("671 - Vila/Promorar");
        linha.add("672 - Monte Cristo via Escola Edith Gama Ramos");
        linha.add("760 - Morro do Geraldo");
        linha.add("761 - Vila Aparecida");
        linha.add("762 - Ângelo Laporta");
        linha.add("763 - Caeira Saco dos Limões");
        linha.add("764 - Monte Serrat");
        linha.add("765 - Morro da Queimada");
        linha.add("766 - Morro do 25");
        linha.add("768 - Morro do Horácio via Mauro Ramos");
        linha.add("769 - Morro Nova Trento");
        linha.add("772 - Chico Mendes");
        linha.add("840 - TICAN-TILAG via Cidade da Barra");
        linha.add("841 - TILAG-TIRIO");
        linha.add("843 - TILAG-TIRIO via LIC");
        linha.add("844 - Bairro de Fátima");
        linha.add("845 - TILAG-TITRI via Córrego Grande");
        linha.add("846 - Cacupé");
        linha.add("847 - TIRIO-TITRI via UFSC");
        linha.add("850 - TILAG-Rio Vermelho via Cidade da Barra");
        linha.add("940 - Canasvieiras-Santo Antônio via Jurerê");
        linha.add("941 - Canasvieiras-Santo Antônio via Ratones");
        linha.add("943 - Saco dos Limões-Trindade");
        linha.add("944 - Saco dos Limões-Trindade via Madre Benvenuta");
        linha.add("946 - Jardim Atlântico-UFSC");
        linha.add("948 - Capoeiras-UFSC");
        linha.add("949 - Abraão-UFSC");
        //linha.add("950 - Escolar Canasvieiras-Ratones");
        linha.add("D163 - Córrego Grande Direto");
        linha.add("D168 - Monte Verde Direto");
        linha.add("D174 - Saco Grande Direto");
        linha.add("D260 - Cachoeira Direto");
        linha.add("D264 - Ingleses Direto");
        linha.add("D266 - Praia Brava Direto");
        linha.add("D267 - Rio Vermelho Direto");
        linha.add("D360 - Barra da Lagoa Direto");
        linha.add("D365 - Sambaqui Direto");
        linha.add("D563 - Costa de Dentro Direto");
        linha.add("D565 - Ribeirâo da Ilha Direto");
        linha.add("D846 - Cacupé via Gama D'Eça");


        adaptador = new ArrayAdapter<String>(Act_Op_Hor_Linh_CFenix.this, android.R.layout.simple_list_item_1, linha);
        listView.setAdapter(adaptador);

        // Chama nova tela passando o item clicado
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long ld) {
                Intent intent = new Intent(Act_Op_Hor_Linh_CFenix.this, Act_Op_Hor_Linh_CFenix_WebHor.class);
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
                    Toast.makeText(Act_Op_Hor_Linh_CFenix.this, "Linha não encontrada",Toast.LENGTH_LONG).show();
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
