package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Act_Empresas_CFenix_WebView extends AppCompatActivity {

    private android.webkit.WebView WebView;
    private Button Btn_Mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_empresas_c_fenix_webview);

        // Comandos para o WebView
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeLinha = (String) intent.getSerializableExtra("Nome da Linha");

        // Declaração dos botão Mapa
        final Button Btn_Mapa = (Button) findViewById(R.id.Btn_Mapa);

        // Parametro para exibir Horários
        switch(parametroNomeLinha) {
            case "100 - Madrugadão Centro-UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/madrugadao-centro-ufsc,100");
                break;
            case "101 - Circular Centro":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-centro,101");
                break;
            case "104 - TICEN-Itacorubi via Mauro Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ticen-itacorubi-via-mauro-ramos,104");
                break;
            case "110 - TITRI-TICEN Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-direto,110");
                break;
            case "1112 - Executivo Santa Mônica":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-santa-monica,1112");
                break;
            case "1113 - Executivo Parque São Jorge":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-parque-sao-jorge,1113");
                break;
            case "1115 - Executivo Córrego Grande via G D`Eça":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-corrego-grande-gama-deca,1115");
                break;
            case "1117 - Executivo João Paulo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-joao-paulo,1117");
                break;
            case "1119 - Circular Ponte Viva":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-ponte-viva,1119");
                break;
            case "1120 - Executivo Canasvieiras":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-canasvieiras,1120");
                break;
            case "1121 - Executivo Ingleses/Santinho":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-ingleses-santinho,1121");
                break;
            case "1122 - Executivo Praia Brava":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-praia-brava,1122");
                break;
            case "1123 - Executivo Jurerê":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-jurere,1123");
                break;
            case "1125 - Executivo Rio Vermelho":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-rio-vermelho,1125");
                break;
            case "1126 - Executivo Cachoeira":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-cachoeira,1126");
                break;
            case "1127 - Executivo Gaivotas":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-gaivotas,1127");
                break;
            case "1128 - Executivo Costa do Moçambique":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-costa-do-mocambique,1128");
                break;
            case "1129 - Executivo Muquem":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-muquem,1129");
                break;
            case "131 - TITRI-TICEN via Gama D`Eça":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-gama-deca,131");
                break;
            case "132 - TITRI-TICEN via Gama D`Eça/HI":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-gama-deca-hi,132");
                break;
            case "133 - TITRI-TICEN via Mauro Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-mauro-ramos,133");
                break;
            case "134 - TITRI-TICEN via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-beira-mar,134");
                break;
            case "135 - Volta ao Morro/Carvoeira Norte via TITRI":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/volta-ao-morro-carvoeira-norte,135");
                break;
            case "136 - Volta ao Morro/Carvoeira Sul via TITRI":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/volta-ao-morro-carvoeira-sul,136");
                break;
            case "137 - Volta ao Morro/Pantanal Norte via TITRI":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/volta-ao-morro-pantanal-norte,137");
                break;
            case "138 - Volta ao Morro/Pantanal Sul via TITRI":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/volta-ao-morro-pantanal-sul,138");
                break;
            case "150 - TICEN-Itacorubi via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ticen-itacorubi-via-beira-mar,150");
                break;
            case "151 - Centro Aministrativo via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/centro-administrativo-via-beira-mar-norte,151");
                break;
            case "153 - Costeira do Pirajubaé":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/costeira-do-pirajubae,153");
                break;
            case "155 - Sol Nascente":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/sol-nascente,155");
                break;
            case "160 - Morro da Cruz":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-da-cruz,160");
                break;
            case "161 - Morro da Penitenciária":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-da-penitenciaria,161");
                break;
            case "162 - Saco dos Limões":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-dos-limoes,162");
                break;
            case "163 - Córrego Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corrego-grande,163");
                break;
            case "164 - Córrego Grande - Poção":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corrego-grande-pocao,164");
                break;
            case "165 - Itacorubi":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/itacorubi,165");
                break;
            case "167 - João Paulo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/joao-paulo,167");
                break;
            case "168 - Monte Verde":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/monte-verde,168");
                break;
            case "169 - Monte Verde via Mané Vicente":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/monte-verde-via-mane-vicente,169");
                break;
            case "170 - Caminho da Cruz via João Paulo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/caminho-da-cruz-via-joao-paulo,170");
                break;
            case "172 - Parque São Jorge via SC 404":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/parque-sao-jorge-via-sc-404,172");
                break;
            case "173 - Morro do Quilombo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-do-quilombo,173");
                break;
            case "174 - Saco Grande via João Paulo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-grande-via-joao-paulo,174");
                break;
            case "175 - SC 401 Retorno/Saco Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/sc-401-retorno-saco-grande,175");
                break;
            case "176 - Saco Grande via HU":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-grande-via-hu,176");
                break;
            case "177 - Santa Mônica":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/santa-monica,177");
                break;
            case "178 - Saco Grande/Retorno SC 401":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-grande-retorno-sc-401,178");
                break;
            case "179 - Serrinha":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/serrinha,179");
                break;
            case "180 - TITRI-UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ufsc,180");
                break;
            case "181 - Cacupé/João Paulo via Barreira do Janga":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/cacupe-joao-paulo-via-barreira-do-janga,181");
                break;
            case "182 - Tecnópolis":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tecnopolis,182");
                break;
            case "183 - Corredor Sudoeste via Saco dos Limões":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corredor-sudoeste,183");
                break;
            case "184 - UDESC via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/udesc-via-beira-mar,184");
                break;
            case "185 - UFSC Semidireto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ufsc-semidireto,185");
                break;
            case "186 - Corredor Sudoeste Semidireto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corredor-sudoeste-semidireto,186");
                break;
            case "191 - TITRI-TICEN via Transcaeira":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-transcaeira,191");
                break;
            case "200 - Madrugadão Norte":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/madrugadao-norte,200");
                break;
            case "210 - TICAN-TICEN Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-ticen-direto,210");
                break;
            case "212 - TISAN-TICEN Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tisan-ticen-direto,212");
                break;
            case "2120 - Executivo Barra da Lagoa":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-barra-da-lagoa,2120");
                break;
            case "2123 - Executivo Lagoa da Conceição via Joaquina":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-lagoa-da-conceicao-via-joaquina,2123");
                break;
            case "2124 - Executivo Sambaqui":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-sambaqui,2124");
                break;
            case "221 - TICAN-TICEN via Mauro Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-ticen-via-mauro-ramos,221");
                break;
            case "230 - Canasvieiras via Gama D`Eça":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/canasvieiras-via-gama-deca,230");
                break;
            case "231 - TICAN-TICEN via TITRI":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-ticen-via-titri,231");
                break;
            case "233 - TICAN-TITRI via UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-titri-via-ufsc,233");
                break;
            case "235 - TICAN-TITRI via TISAN":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-titri-via-tisan,235");
                break;
            case "250 - Forte-Canasvieiras":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/forte-canasvieiras,250");
                break;
            case "260 - Cachoeira do Bom Jesus":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/cachoeira-do-bom-jesus,260");
                break;
            case "261 - Capivari via Graciliano Gomes":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/capivari-via-graciliano-gomes,261");
                break;
            case "262 - Circular Canasvieiras":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-canasvieiras,262");
                break;
            case "263 - Gaivotas":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/gaivotas,263");
                break;
            case "264 - Ingleses":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ingleses,264");
                break;
            case "265 - Ponta das Canas":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ponta-das-canas,265");
                break;
            case "266 - Praia Brava":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/praia-brava,266");
                break;
            case "267 - Rio Vermelho":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/rio-vermelho,267");
                break;
            case "268 - Sitio de Baixo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/sitio-de-baixo,268");
                break;
            case "269 - Moçambique via Alzira Rosa Aguiar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/mocambique-via-r-alzira-rosa-aguiar,269");
                break;
            case "270 - Vargem Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vargem-grande,270");
                break;
            case "271 - Daniela":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/daniela,271");
                break;
            case "272 - Jurerê":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/jurere,272");
                break;
            case "273 - Circular Ratones":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-ratones,273");
                break;
            case "274 - Rio Vermelho via Muquem":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/rio-vermelho-via-muquem,274");
                break;
            case "276 - Balneário Canasvieiras":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/balneario-canasvieiras,276");
                break;
            case "277 - Balneário Ingleses":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/balneario-ingleses,277");
                break;
            case "280 - Cachoeira-TICAN":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/cachoeira-tican,280");
                break;
            case "281 - Costa do Moçambique":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/costa-do-mocambique,281");
                break;
            case "282 - Vargem Pequena":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vargem-pequena,282");
                break;
            case "283 - Vargem do Bom Jesus":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vargem-do-bom-jesus,283");
                break;
            case "284 - Moçambique via Rua da Intendência":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/mocambique-via-rua-da-intendencia,284");
                break;
            case "285 - Circular Moçambique":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-mocambique,285");
                break;
            case "286 - TICAN-Sapiens Parque":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-sapiens-parque,286");
                break;
            case "287 - Rio Vermelho via Vargem Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/rio-vermelho-via-vargem-grande,287");
                break;
            case "288 - Circular Rio Vermelho":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-rio-vermelho,288");
                break;
            case "289 - Vargem Grande via Rio Vermelho":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vargem-grande-via-rio-vermelho,289");
                break;
            case "291 - Circular Canasvieiras/Praia Brava":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-canasvieiras-praia-brava,291");
                break;
            case "294 - Interpraias":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/interpraias,294");
                break;
            case "296 - Circular Santinho/Ingleses":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-santinho-ingleses,296");
                break;
            case "300 - Madrugadão Leste":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/madrugadao-leste,300");
                break;
            case "3001 - Executivo Abraão-UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-abraao-ufsc,3001");
                break;
            case "3002 - Executivo Jardim Atlântico-UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-jardim-atlantico-ufsc,3002");
                break;
            case "311 - TILAG-TICEN Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tilag-ticen-direto,311");
                break;
            case "320 - TILAG-TICEN via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tilag-ticen-via-beira-mar,320");
                break;
            case "330 - TILAG-TICEN via Mauro Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tilag-ticen-via-mauro-ramos,330");
                break;
            case "331 - TISAN-TICEN via Mauro Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tisan-ticen-via-mauro-ramos,331");
                break;
            case "332 - TISAN-TICEN via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tisan-ticen-via-beira-mar,332");
                break;
            case "333 - TILAG-TITRI via Madre Benvenuta":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tilag-titri-via-madre-benvenuta,333");
                break;
            case "360 - Barra da Lagoa":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/barra-da-lagoa,360");
                break;
            case "362 - Canto dos Araças":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/canto-dos-aracas,362");
                break;
            case "363 - Joaquina":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/joaquina,363");
                break;
            case "364 - Osni Ortiga":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/osni-ortiga,364");
                break;
            case "365 - Sambaqui":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/sambaqui,365");
                break;
            case "366 - Barra do Sambaqui via Padre Rohr":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/barra-do-sambaqui-via-padre-rohr,366");
                break;
            case "410 - TIRIO-TICEN Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tirio-ticen-direto,410");
                break;
            case "4120 - Executivo Pântano do Sul via Eucaliptos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-pantano-do-sul-via-eucaliptos,4120");
                break;
            case "4121 - Executivo Pântano do Sul via Campeche":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-pantano-do-sul-via-campeche,4121");
                break;
            case "4122 - Executivo Campeche":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-campeche,4122");
                break;
            case "4123 - Executivo Ribeirão da Ilha":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-ribeirao-da-ilha,4123");
                break;
            case "4124 - Executivo Caieira Barra do Sul via Tapera":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-caieira-da-barra-do-sul-via-tapera,4124");
                break;
            case "4125 - Executivo Pântano do Sul via Gramal":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-pantano-do-sul-via-gramal,4125");
                break;
            case "430 - TIRIO-TICEN via Costeira":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tirio-ticen-via-costeira,430");
                break;
            case "431 - TICEN-Aeroporto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ticen-aeroporto,431");
                break;
            case "460 - Porto da Lagoa":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/porto-da-lagoa,460");
                break;
            case "461 - Tapera via Túnel":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tapera-via-tunel,461");
                break;
            case "462 - Campeche":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/campeche,462");
                break;
            case "463 - Castanheiras via Eucaliptos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/castanheiras-via-eucaliptos,463");
                break;
            case "464 - Castanheiras via Gramal":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/castanheiras-via-gramal,464");
                break;
            case "467 - Tapera/Saco dos Limões":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tapera-saco-dos-limoes,467");
                break;
            case "468 - TIRIO-Aeroporto via Carianos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tirio-aeroporto-via-carianos,468");
                break;
            case "469 - Tapera-Rio Tavares":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tapera-rio-tavares,469");
                break;
            case "470 - Tapera-TITRI":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tapera-titri,470");
                break;
            case "472 - Campeche via Capela":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/campeche-via-capela,472");
                break;
            case "473 - Morro das Pedras via Eucaliptos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-das-pedras-via-eucaliptos,473");
                break;
            case "474 - Morro das Pedras via Gramal":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-das-pedras-via-gramal,474");
                break;
            case "477 - TIRIO-Aeroporto via Tapera":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tirio-aeroporto-via-tapera,477");
                break;
            case "500 - Madrugadão Sul":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/madrugadao-sul,500");
                break;
            case "502 - Madrugadão Aeroporto-Tapera-Carianos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/madrugadao-aeroporto-tapera-carianos,502");
                break;
            case "560 - Armação":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/armacao,560");
                break;
            case "561 - Caieira da Barra do Sul":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/caieira-da-barra-do-sul,561");
                break;
            case "562 - Costa de Cima":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/costa-de-cima,562");
                break;
            case "563 - Costa de Dentro":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/costa-de-dentro,563");
                break;
            case "564 - Pântano do Sul":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/pantano-do-sul,564");
                break;
            case "565 - Ribeirão da Ilha":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ribeirao-da-ilha,565");
                break;
            case "566 - Caieira via Tapera":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/caieira-via-tapera,566");
                break;
            case "600 - Madrugadão Continente":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/madrugadao-continente,600");
                break;
            case "601 - Circular Abraão-Estreito":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-abraao-estreito,601");
                break;
            case "605 - Circular Estreito-Abraão":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-estreito-abraao,605");
                break;
            case "6220 - Executivo Abraão":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-abraao,6220");
                break;
            case "630 - Corredor Continente":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corredor-continente,630");
                break;
            case "631 - Capoeiras":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/capoeiras,631");
                break;
            case "660 - Aracy Vaz Callado":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/aracy-vaz-callado,660");
                break;
            case "661 - Balneário":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/balneario,661");
                break;
            case "663 - Coloninha":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/coloninha,663");
                break;
            case "664 - Itaguaçu":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/itaguacu,664");
                break;
            case "665 - Abraão":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/abraao,665");
                break;
            case "668 - Promorar via Ivo Silveira":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/promorar-via-ivo-silveira,668");
                break;
            case "670 - Monte Cristo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/monte-cristo,670");
                break;
            case "671 - Vila/Promorar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vila-promorar,671");
                break;
            case "672 - Monte Cristo via Escola Edith Gama Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/monte-cristo-via-escola-edith-gama-ramos,672");
                break;
            case "760 - Morro do Geraldo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-do-geraldo,760");
                break;
            case "761 - Vila Aparecida":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vila-aparecida,761");
                break;
            case "762 - Ângelo Laporta":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/angelo-laporta,762");
                break;
            case "763 - Caeira Saco dos Limões":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/caeira-do-saco-dos-limoes,763");
                break;
            case "764 - Monte Serrat":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/monte-serrat,764");
                break;
            case "765 - Morro da Queimada":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-da-queimada,765");
                break;
            case "766 - Morro do 25":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-do-25,766");
                break;
            case "768 - Morro do Horácio via Mauro Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-do-horacio-via-mauro-ramos,768");
                break;
            case "769 - Morro Nova Trento":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-nova-trento,769");
                break;
            case "772 - Chico Mendes":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/chico-mendes,772");
                break;
            case "840 - TICAN-TILAG via Barra da Lagoa":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-tilag-via-barra-da-lagoa,840");
                break;
            case "841 - TILAG-TIRIO":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tilag-tirio,841");
                break;
            case "843 - TILAG-TIRIO via LIC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tilag-tirio-via-lic,843");
                break;
            case "844 - Bairro de Fátima via Aracy Vaz Callado":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/bairro-de-fatima-via-aracy-vaz-callado,844");
                break;
            case "845 - TILAG-TITRI via Córrego Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tilag-titri-via-corrego-grande,845");
                break;
            case "846 - Cacupé":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/cacupe,846");
                break;
            case "847 - TIRIO-TITRI via UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tirio-titri-via-ufsc,847");
                break;
            case "850 - TILAG-Rio Vermelho via Cidade da Barra":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tilag-rio-vermelho-via-cidade-da-barra,850");
                break;
            case "940 - Canasvieiras-Santo Antônio via Jurerê":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/canasvieiras-santo-antonio-via-jurere,940");
                break;
            case "941 - Canasvieiras-Santo Antônio via Ratones":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/canasvieiras-santo-antonio-via-ratones,941");
                break;
            case "943 - Saco dos Limões-Trindade":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-dos-limoes-trindade,943");
                break;
            case "944 - Saco dos Limões-Trindade via Madre Benvenuta":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-dos-limoes-trindade-via-m-benvenuta,944");
                break;
            case "946 - Jardim Atlântico-UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/jardim-atlantico-ufsc,946");
                break;
            case "948 - Capoeiras-UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/capoeiras-ufsc,948");
                break;
            case "949 - Abraão-UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/abraao-ufsc,949");
                break;
            case "950 - Escolar Canasvieiras-Ratones":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/escolar-canasvieiras-ratones,950");
                break;
            case "D163 - Córrego Grande Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corrego-grande-direto,D-163");
                break;
            case "D168 - Monte Verde Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/monte-verde-direto,D-168");
                break;
            case "D174 - Saco Grande Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-grande-direto,D-174");
                break;
            case "D260 - Cachoeira Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/cachoeira-direto,D-260");
                break;
            case "D264 - Ingleses Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ingleses-direto,D-264");
                break;
            case "D266 - Praia Brava Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/praia-brava-direto,D-266");
                break;
            case "D267 - Rio Vermelho Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/rio-vermelho-direto,D-267");
                break;
            case "D360 - Barra da Lagoa Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/barra-da-lagoa-direto,D-360");
                break;
            case "D365 - Sambaqui Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/sambaqui-direto,D-365");
                break;
            case "D563 - Costa de Dentro Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/costa-de-dentro-direto,D-563");
                break;
            case "D565 - Ribeirâo da Ilha Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ribeirao-da-ilha-direto,D-565");
                break;
            case "D846 - Cacupé via Gama D'Eça":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/cacupe-via-gama-deca,D-846");
                break;

        }

        // Ação do botão Mapa
        Btn_Mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(parametroNomeLinha) {
                    case "100 - Madrugadão Centro-UFSC":
                        Intent linha100 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha100.putExtra("Nome da Linha", "100 - Madrugadão Centro-UFSC");
                        startActivity(linha100);
                        break;
                    case "101 - Circular Centro":
                        Intent linha101 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha101.putExtra("Nome da Linha", "101 - Circular Centro");
                        startActivity(linha101);
                        break;
                    case "104 - TICEN-Itacorubi via Mauro Ramos":
                        Intent linha104 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha104.putExtra("Nome da Linha", "104 - TICEN-Itacorubi via Mauro Ramos");
                        startActivity(linha104);
                        break;
                    case "110 - TITRI-TICEN Direto":
                        Intent linha110 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha110.putExtra("Nome da Linha", "110 - TITRI-TICEN Direto");
                        startActivity(linha110);
                        break;
                    case "1112 - Executivo Santa Mônica":
                        Intent linha1112 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1112.putExtra("Nome da Linha", "1112 - Executivo Santa Mônica");
                        startActivity(linha1112);
                        break;
                    case "1113 - Executivo Parque São Jorge":
                        Intent linha1113 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1113.putExtra("Nome da Linha", "1113 - Executivo Parque São Jorge");
                        startActivity(linha1113);
                        break;
                    case "1115 - Executivo Córrego Grande via G D`Eça":
                        Intent linha1115 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1115.putExtra("Nome da Linha", "1115 - Executivo Córrego Grande via G D`Eça");
                        startActivity(linha1115);
                        break;
                    case "1117 - Executivo João Paulo":
                        Intent linha1117 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1117.putExtra("Nome da Linha", "1117 - Executivo João Paulo");
                        startActivity(linha1117);
                        break;
                    case "1120 - Executivo Canasvieiras":
                        Intent linha1120 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1120.putExtra("Nome da Linha", "1120 - Executivo Canasvieiras");
                        startActivity(linha1120);
                        break;
                    case "1121 - Executivo Ingleses/Santinho":
                        Intent linha1121 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1121.putExtra("Nome da Linha", "1121 - Executivo Ingleses/Santinho");
                        startActivity(linha1121);
                        break;
                    case "1122 - Executivo Praia Brava":
                        Intent linha1122 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1122.putExtra("Nome da Linha", "1122 - Executivo Praia Brava");
                        startActivity(linha1122);
                        break;
                    case "1123 - Executivo Jurerê":
                        Intent linha1123 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1123.putExtra("Nome da Linha", "1123 - Executivo Jurerê");
                        startActivity(linha1123);
                        break;
                    case "1125 - Executivo Rio Vermelho":
                        Intent linha1125 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1125.putExtra("Nome da Linha", "1125 - Executivo Rio Vermelho");
                        startActivity(linha1125);
                        break;
                    case "1126 - Executivo Cachoeira":
                        Intent linha1126 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1126.putExtra("Nome da Linha", "1126 - Executivo Cachoeira");
                        startActivity(linha1126);
                        break;
                    case "1127 - Executivo Gaivotas":
                        Intent linha1127 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1127.putExtra("Nome da Linha", "1127 - Executivo Gaivotas");
                        startActivity(linha1127);
                        break;
                    case "1128 - Executivo Costa do Moçambique":
                        Intent linha1128 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1128.putExtra("Nome da Linha", "1128 - Executivo Costa do Moçambique");
                        startActivity(linha1128);
                        break;
                    case "1129 - Executivo Muquem":
                        Intent linha1129 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha1129.putExtra("Nome da Linha", "1129 - Executivo Muquem");
                        startActivity(linha1129);
                        break;
                    case "131 - TITRI-TICEN via Gama D`Eça":
                        Intent linha131 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha131.putExtra("Nome da Linha", "131 - TITRI-TICEN via Gama D`Eça");
                        startActivity(linha131);
                        break;
                    case "132 - TITRI-TICEN via Gama D`Eça/HI":
                        Intent linha132 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha132.putExtra("Nome da Linha", "132 - TITRI-TICEN via Gama D`Eça/HI");
                        startActivity(linha132);
                        break;
                    case "133 - TITRI-TICEN via Mauro Ramos":
                        Intent linha133 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha133.putExtra("Nome da Linha", "133 - TITRI-TICEN via Mauro Ramos");
                        startActivity(linha133);
                        break;
                    case "134 - TITRI-TICEN via Beira Mar":
                        Intent linha134 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha134.putExtra("Nome da Linha", "134 - TITRI-TICEN via Beira Mar");
                        startActivity(linha134);
                        break;
                    case "135 - Volta ao Morro/Carvoeira Norte via TITRI":
                        Intent linha135 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha135.putExtra("Nome da Linha", "135 - Volta ao Morro/Carvoeira Norte via TITRI");
                        startActivity(linha135);
                        break;
                    case "136 - Volta ao Morro/Carvoeira Sul via TITRI":
                        Intent linha136 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha136.putExtra("Nome da Linha", "136 - Volta ao Morro/Carvoeira Sul via TITRI");
                        startActivity(linha136);
                        break;
                    case "137 - Volta ao Morro/Pantanal Norte via TITRI":
                        Intent linha137 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha137.putExtra("Nome da Linha", "137 - Volta ao Morro/Pantanal Norte via TITRI");
                        startActivity(linha137);
                        break;
                    case "138 - Volta ao Morro/Pantanal Sul via TITRI":
                        Intent linha138 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha138.putExtra("Nome da Linha", "138 - Volta ao Morro/Pantanal Sul via TITRI");
                        startActivity(linha138);
                        break;
                    case "150 - TICEN-Itacorubi via Beira Mar":
                        Intent linha150 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha150.putExtra("Nome da Linha", "150 - TICEN-Itacorubi via Beira Mar");
                        startActivity(linha150);
                        break;
                    case "151 - Centro Aministrativo via Beira Mar":
                        Intent linha151 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha151.putExtra("Nome da Linha", "151 - Centro Aministrativo via Beira Mar");
                        startActivity(linha151);
                        break;
                    case "153 - Costeira do Pirajubaé":
                        Intent linha153 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha153.putExtra("Nome da Linha", "153 - Costeira do Pirajubaé");
                        startActivity(linha153);
                        break;
                    case "155 - Sol Nascente":
                        Intent linha155 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha155.putExtra("Nome da Linha", "155 - Sol Nascente");
                        startActivity(linha155);
                        break;
                    case "160 - Morro da Cruz":
                        Intent linha160 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha160.putExtra("Nome da Linha", "160 - Morro da Cruz");
                        startActivity(linha160);
                        break;
                    case "161 - Morro da Penitenciária":
                        Intent linha161 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha161.putExtra("Nome da Linha", "161 - Morro da Penitenciária");
                        startActivity(linha161);
                        break;
                    case "162 - Saco dos Limões":
                        Intent linha162 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha162.putExtra("Nome da Linha", "162 - Saco dos Limões");
                        startActivity(linha162);
                        break;
                    case "163 - Córrego Grande":
                        Intent linha163 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha163.putExtra("Nome da Linha", "163 - Córrego Grande");
                        startActivity(linha163);
                        break;
                    case "164 - Córrego Grande - Poção":
                        Intent linha164 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha164.putExtra("Nome da Linha", "164 - Córrego Grande - Poção");
                        startActivity(linha164);
                        break;
                    case "165 - Itacorubi":
                        Intent linha165 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha165.putExtra("Nome da Linha", "165 - Itacorubi");
                        startActivity(linha165);
                        break;
                    case "167 - João Paulo":
                        Intent linha167 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha167.putExtra("Nome da Linha", "167 - João Paulo");
                        startActivity(linha167);
                        break;
                    case "168 - Monte Verde":
                        Intent linha168 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha168.putExtra("Nome da Linha", "168 - Monte Verde");
                        startActivity(linha168);
                        break;
                    case "169 - Monte Verde via Mané Vicente":
                        Intent linha169 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha169.putExtra("Nome da Linha", "169 - Monte Verde via Mané Vicente");
                        startActivity(linha169);
                        break;
                    case "170 - Caminho da Cruz via João Paulo":
                        Intent linha170 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha170.putExtra("Nome da Linha", "170 - Caminho da Cruz via João Paulo");
                        startActivity(linha170);
                        break;
                    case "173 - Morro do Quilombo":
                        Intent linha173 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha173.putExtra("Nome da Linha", "173 - Morro do Quilombo");
                        startActivity(linha173);
                        break;
                    case "174 - Saco Grande via João Paulo":
                        Intent linha174 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha174.putExtra("Nome da Linha", "174 - Saco Grande via João Paulo");
                        startActivity(linha174);
                        break;
                    case "175 - SC 401 Retorno/Saco Grande":
                        Intent linha175 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha175.putExtra("Nome da Linha", "175 - SC 401 Retorno/Saco Grande");
                        startActivity(linha175);
                        break;
                    case "176 - Saco Grande via HU":
                        Intent linha176 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha176.putExtra("Nome da Linha", "176 - Saco Grande via HU");
                        startActivity(linha176);
                        break;
                    case "177 - Santa Mônica":
                        Intent linha177 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha177.putExtra("Nome da Linha", "177 - Santa Mônica");
                        startActivity(linha177);
                        break;
                    case "178 - Saco Grande/Retorno SC 401":
                        Intent linha178 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha178.putExtra("Nome da Linha", "178 - Saco Grande/Retorno SC 401");
                        startActivity(linha178);
                        break;
                    case "179 - Serrinha":
                        Intent linha179 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha179.putExtra("Nome da Linha", "179 - Serrinha");
                        startActivity(linha179);
                        break;
                    case "180 - TITRI-UFSC":
                        Intent linha180 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha180.putExtra("Nome da Linha", "180 - TITRI-UFSC");
                        startActivity(linha180);
                        break;
                    case "181 - Cacupé/João Paulo via Barreira do Janga":
                        Intent linha181 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha181.putExtra("Nome da Linha", "181 - Cacupé/João Paulo via Barreira do Janga");
                        startActivity(linha181);
                        break;
                    case "182 - Tecnópolis":
                        Intent linha182 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha182.putExtra("Nome da Linha", "182 - Tecnópolis");
                        startActivity(linha182);
                        break;
                    case "183 - Corredor Sudoeste via Saco dos Limões":
                        Intent linha183 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha183.putExtra("Nome da Linha", "183 - Corredor Sudoeste via Saco dos Limões");
                        startActivity(linha183);
                        break;
                    case "184 - UDESC via Beira Mar":
                        Intent linha184 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha184.putExtra("Nome da Linha", "184 - UDESC via Beira Mar");
                        startActivity(linha184);
                        break;
                    case "185 - UFSC Semidireto":
                        Intent linha185 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha185.putExtra("Nome da Linha", "185 - UFSC Semidireto");
                        startActivity(linha185);
                        break;
                    case "186 - Corredor Sudoeste via Túnel":
                        Intent linha186 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha186.putExtra("Nome da Linha", "186 - Corredor Sudoeste via Túnel");
                        startActivity(linha186);
                        break;
                    case "191 - TITRI-TICEN via Transcaeira":
                        Intent linha191 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha191.putExtra("Nome da Linha", "191 - TITRI-TICEN via Transcaeira");
                        startActivity(linha191);
                        break;
                    case "200 - Madrugadão Norte":
                        Intent linha200 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha200.putExtra("Nome da Linha", "200 - Madrugadão Norte");
                        startActivity(linha200);
                        break;
                    case "210 - TICAN-TICEN Direto":
                        Intent linha210 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha210.putExtra("Nome da Linha", "210 - TICAN-TICEN Direto");
                        startActivity(linha210);
                        break;
                    case "212 - TISAN-TICEN Direto":
                        Intent linha212 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha212.putExtra("Nome da Linha", "212 - TISAN-TICEN Direto");
                        startActivity(linha212);
                        break;
                    case "2120 - Executivo Barra da Lagoa":
                        Intent linha2120 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha2120.putExtra("Nome da Linha", "2120 - Executivo Barra da Lagoa");
                        startActivity(linha2120);
                        break;
                    case "2123 - Executivo Lagoa da Conceição via Joaquina":
                        Intent linha2123 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha2123.putExtra("Nome da Linha", "2123 - Executivo Lagoa da Conceição via Joaquina");
                        startActivity(linha2123);
                        break;
                    case "2124 - Executivo Sambaqui":
                        Intent linha2124 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha2124.putExtra("Nome da Linha", "2124 - Executivo Sambaqui");
                        startActivity(linha2124);
                        break;
                    case "221 - TICAN-TICEN via Mauro Ramos":
                        Intent linha221 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha221.putExtra("Nome da Linha", "221 - TICAN-TICEN via Mauro Ramos");
                        startActivity(linha221);
                        break;
                    case "230 - Canasvieiras via Gama D`Eça":
                        Intent linha230 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha230.putExtra("Nome da Linha", "230 - Canasvieiras via Gama D`Eça");
                        startActivity(linha230);
                        break;
                    case "231 - TICAN-TICEN via TITRI":
                        Intent linha231 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha231.putExtra("Nome da Linha", "231 - TICAN-TICEN via TITRI");
                        startActivity(linha231);
                        break;
                    case "233 - TICAN-TITRI via UFSC":
                        Intent linha233 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha233.putExtra("Nome da Linha", "233 - TICAN-TITRI via UFSC");
                        startActivity(linha233);
                        break;
                    case "235 - TICAN-TITRI via TISAN":
                        Intent linha235 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha235.putExtra("Nome da Linha", "235 - TICAN-TITRI via TISAN");
                        startActivity(linha235);
                        break;
                    case "250 - Forte-Canasvieiras":
                        Intent linha250 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha250.putExtra("Nome da Linha", "250 - Forte-Canasvieiras");
                        startActivity(linha250);
                        break;
                    case "260 - Cachoeira do Bom Jesus":
                        Intent linha260 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha260.putExtra("Nome da Linha", "260 - Cachoeira do Bom Jesus");
                        startActivity(linha260);
                        break;
                    case "261 - Capivari via Graciliano Gomes":
                        Intent linha261 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha261.putExtra("Nome da Linha", "261 - Capivari via Graciliano Gomes");
                        startActivity(linha261);
                        break;
                    case "262 - Circular Canasvieiras":
                        Intent linha262 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha262.putExtra("Nome da Linha", "262 - Circular Canasvieiras");
                        startActivity(linha262);
                        break;
                    case "263 - Gaivotas":
                        Intent linha263 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha263.putExtra("Nome da Linha", "263 - Gaivotas");
                        startActivity(linha263);
                        break;
                    case "264 - Ingleses":
                        Intent linha264 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha264.putExtra("Nome da Linha", "264 - Ingleses");
                        startActivity(linha264);
                        break;
                    case "265 - Ponta das Canas":
                        Intent linha265 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha265.putExtra("Nome da Linha", "265 - Ponta das Canas");
                        startActivity(linha265);
                        break;
                    case "266 - Praia Brava":
                        Intent linha266 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha266.putExtra("Nome da Linha", "266 - Praia Brava");
                        startActivity(linha266);
                        break;
                    case "267 - Rio Vermelho":
                        Intent linha267 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha267.putExtra("Nome da Linha", "267 - Rio Vermelho");
                        startActivity(linha267);
                        break;
                    case "268 - Sitio de Baixo":
                        Intent linha268 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha268.putExtra("Nome da Linha", "268 - Sitio de Baixo");
                        startActivity(linha268);
                        break;
                    case "269 - Moçambique via Alzira Rosa Aguiar":
                        Intent linha269 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha269.putExtra("Nome da Linha", "269 - Moçambique via Alzira Rosa Aguiar");
                        startActivity(linha269);
                        break;
                    case "270 - Vargem Grande":
                        Intent linha270 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha270.putExtra("Nome da Linha", "270 - Vargem Grande");
                        startActivity(linha270);
                        break;
                    case "271 - Daniela":
                        Intent linha271 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha271.putExtra("Nome da Linha", "271 - Daniela");
                        startActivity(linha271);
                        break;
                    case "272 - Jurerê":
                        Intent linha272 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha272.putExtra("Nome da Linha", "272 - Jurerê");
                        startActivity(linha272);
                        break;
                    case "273 - Circular Ratones":
                        Intent linha273 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha273.putExtra("Nome da Linha", "273 - Circular Ratones");
                        startActivity(linha273);
                        break;
                    case "274 - Rio Vermelho via Muquem":
                        Intent linha274 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha274.putExtra("Nome da Linha", "274 - Rio Vermelho via Muquem");
                        startActivity(linha274);
                        break;
                    case "276 - Balneário Canasvieiras":
                        Intent linha276 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha276.putExtra("Nome da Linha", "276 - Balneário Canasvieiras");
                        startActivity(linha276);
                        break;
                    case "277 - Balneário Ingleses":
                        Intent linha277 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha277.putExtra("Nome da Linha", "277 - Balneário Ingleses");
                        startActivity(linha277);
                        break;
                    case "280 - Cachoeira-TICAN":
                        Intent linha280 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha280.putExtra("Nome da Linha", "280 - Cachoeira-TICAN");
                        startActivity(linha280);
                        break;
                    case "281 - Costa do Moçambique":
                        Intent linha281 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha281.putExtra("Nome da Linha", "281 - Costa do Moçambique");
                        startActivity(linha281);
                        break;
                    case "282 - Vargem Pequena":
                        Intent linha282 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha282.putExtra("Nome da Linha", "282 - Vargem Pequena");
                        startActivity(linha282);
                        break;
                    case "283 - Vargem do Bom Jesus":
                        Intent linha283 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha283.putExtra("Nome da Linha", "283 - Vargem do Bom Jesus");
                        startActivity(linha283);
                        break;
                    case "284 - Moçambique via Rua da Intendência":
                        Intent linha284 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha284.putExtra("Nome da Linha", "284 - Moçambique via Rua da Intendência");
                        startActivity(linha284);
                        break;
                    case "285 - Circular Moçambique":
                        Intent linha285 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha285.putExtra("Nome da Linha", "285 - Circular Moçambique");
                        startActivity(linha285);
                        break;
                    case "286 - TICAN-Sapiens Parque":
                        Intent linha286 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha286.putExtra("Nome da Linha", "286 - TICAN-Sapiens Parque");
                        startActivity(linha286);
                        break;
                    case "287 - Rio Vermelho via Vargem Grande":
                        Intent linha287 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha287.putExtra("Nome da Linha", "287 - Rio Vermelho via Vargem Grande");
                        startActivity(linha287);
                        break;
                    case "288 - Circular Rio Vermelho":
                        Intent linha288 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha288.putExtra("Nome da Linha", "288 - Circular Rio Vermelho");
                        startActivity(linha288);
                        break;
                    case "289 - Vargem Grande via Rio Vermelho":
                        Intent linha289 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha289.putExtra("Nome da Linha", "289 - Vargem Grande via Rio Vermelho");
                        startActivity(linha289);
                        break;
                    case "291 - Circular Canasvieiras/Praia Brava":
                        Intent linha291 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha291.putExtra("Nome da Linha", "291 - Circular Canasvieiras/Praia Brava");
                        startActivity(linha291);
                        break;
                    case "294 - Interpraias":
                        Intent linha294 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha294.putExtra("Nome da Linha", "294 - Interpraias");
                        startActivity(linha294);
                        break;
                    case "296 - Circular Santinho/Ingleses":
                        Intent linha296 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha296.putExtra("Nome da Linha", "296 - Circular Santinho/Ingleses");
                        startActivity(linha296);
                        break;
                    case "300 - Madrugadão Leste":
                        Intent linha300 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha300.putExtra("Nome da Linha", "300 - Madrugadão Leste");
                        startActivity(linha300);
                        break;
                    case "3001 - Executivo Abraão-UFSC":
                        Intent linha3001 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha3001.putExtra("Nome da Linha", "3001 - Executivo Abraão-UFSC");
                        startActivity(linha3001);
                        break;
                    case "3002 - Executivo Jardim Atlântico-UFSC":
                        Intent linha3002 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha3002.putExtra("Nome da Linha", "3002 - Executivo Jardim Atlântico-UFSC");
                        startActivity(linha3002);
                        break;
                    case "311 - TILAG-TICEN Direto":
                        Intent linha311 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha311.putExtra("Nome da Linha", "311 - TILAG-TICEN Direto");
                        startActivity(linha311);
                        break;
                    case "320 - TILAG-TICEN via Beira Mar":
                        Intent linha320 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha320.putExtra("Nome da Linha", "320 - TILAG-TICEN via Beira Mar");
                        startActivity(linha320);
                        break;
                    case "330 - TILAG-TICEN via Mauro Ramos":
                        Intent linha330 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha330.putExtra("Nome da Linha", "330 - TILAG-TICEN via Mauro Ramos");
                        startActivity(linha330);
                        break;
                    case "331 - TISAN-TICEN via Mauro Ramos":
                        Intent linha331 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha331.putExtra("Nome da Linha", "331 - TISAN-TICEN via Mauro Ramos");
                        startActivity(linha331);
                        break;
                    case "332 - TISAN-TICEN via Beira Mar":
                        Intent linha332 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha332.putExtra("Nome da Linha", "332 - TISAN-TICEN via Beira Mar");
                        startActivity(linha332);
                        break;
                    case "333 - TILAG-TITRI via Madre Benvenuta":
                        Intent linha333 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha333.putExtra("Nome da Linha", "333 - TILAG-TITRI via Madre Benvenuta");
                        startActivity(linha333);
                        break;
                    case "360 - Barra da Lagoa":
                        Intent linha360 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha360.putExtra("Nome da Linha", "360 - Barra da Lagoa");
                        startActivity(linha360);
                        break;
                    case "362 - Canto dos Araças":
                        Intent linha362 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha362.putExtra("Nome da Linha", "362 - Canto dos Araças");
                        startActivity(linha362);
                        break;
                    case "363 - Joaquina":
                        Intent linha363 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha363.putExtra("Nome da Linha", "363 - Joaquina");
                        startActivity(linha363);
                        break;
                    case "364 - Osni Ortiga":
                        Intent linha364 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha364.putExtra("Nome da Linha", "364 - Osni Ortiga");
                        startActivity(linha364);
                        break;
                    case "365 - Sambaqui":
                        Intent linha365 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha365.putExtra("Nome da Linha", "365 - Sambaqui");
                        startActivity(linha365);
                        break;
                    case "366 - Barra do Sambaqui via Padre Rohr":
                        Intent linha366 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha366.putExtra("Nome da Linha", "366 - Barra do Sambaqui via Padre Rohr");
                        startActivity(linha366);
                        break;
                    case "410 - TIRIO-TICEN Direto":
                        Intent linha410 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha410.putExtra("Nome da Linha", "410 - TIRIO-TICEN Direto");
                        startActivity(linha410);
                        break;
                    case "4120 - Executivo Pântano do Sul via Eucaliptos":
                        Intent linha4120 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha4120.putExtra("Nome da Linha", "4120 - Executivo Pântano do Sul via Eucaliptos");
                        startActivity(linha4120);
                        break;
                    case "4121 - Executivo Pântano do Sul via Campeche":
                        Intent linha4121 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha4121.putExtra("Nome da Linha", "4121 - Executivo Pântano do Sul via Campeche");
                        startActivity(linha4121);
                        break;
                    case "4122 - Executivo Campeche":
                        Intent linha4122 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha4122.putExtra("Nome da Linha", "4122 - Executivo Campeche");
                        startActivity(linha4122);
                        break;
                    case "4123 - Executivo Ribeirão da Ilha":
                        Intent linha4123 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha4123.putExtra("Nome da Linha", "4123 - Executivo Ribeirão da Ilha");
                        startActivity(linha4123);
                        break;
                    case "4124 - Executivo Caieira Barra do Sul via Tapera":
                        Intent linha4124 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha4124.putExtra("Nome da Linha", "4124 - Executivo Caieira Barra do Sul via Tapera");
                        startActivity(linha4124);
                        break;
                    case "4125 - Executivo Pântano do Sul via Gramal":
                        Intent linha4125 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha4125.putExtra("Nome da Linha", "4125 - Executivo Pântano do Sul via Gramal");
                        startActivity(linha4125);
                        break;
                    case "430 - TIRIO-TICEN via Costeira":
                        Intent linha430 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha430.putExtra("Nome da Linha", "430 - TIRIO-TICEN via Costeira");
                        startActivity(linha430);
                        break;
                    case "431 - TICEN-Aeroporto":
                        Intent linha431 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha431.putExtra("Nome da Linha", "431 - TICEN-Aeroporto");
                        startActivity(linha431);
                        break;
                    case "460 - Porto da Lagoa":
                        Intent linha460 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha460.putExtra("Nome da Linha", "460 - Porto da Lagoa");
                        startActivity(linha460);
                        break;
                    case "461 - Tapera via Túnel":
                        Intent linha461 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha461.putExtra("Nome da Linha", "461 - Tapera via Túnel");
                        startActivity(linha461);
                        break;
                    case "462 - Campeche":
                        Intent linha462 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha462.putExtra("Nome da Linha", "462 - Campeche");
                        startActivity(linha462);
                        break;
                    case "463 - Castanheiras via Eucaliptos":
                        Intent linha463 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha463.putExtra("Nome da Linha", "463 - Castanheiras via Eucaliptos");
                        startActivity(linha463);
                        break;
                    case "464 - Castanheiras via Gramal":
                        Intent linha464 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha464.putExtra("Nome da Linha", "464 - Castanheiras via Gramal");
                        startActivity(linha464);
                        break;
                    case "467 - Tapera/Saco dos Limões":
                        Intent linha467 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha467.putExtra("Nome da Linha", "467 - Tapera/Saco dos Limões");
                        startActivity(linha467);
                        break;
                    case "468 - TIRIO-Aeroporto via Carianos":
                        Intent linha468 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha468.putExtra("Nome da Linha", "468 - TIRIO-Aeroporto via Carianos");
                        startActivity(linha468);
                        break;
                    case "469 - Tapera-Rio Tavares":
                        Intent linha469 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha469.putExtra("Nome da Linha", "469 - Tapera-Rio Tavares");
                        startActivity(linha469);
                        break;
                    case "470 - Tapera-TITRI":
                        Intent linha470 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha470.putExtra("Nome da Linha", "470 - Tapera-TITRI");
                        startActivity(linha470);
                        break;
                    case "472 - Campeche via Capela":
                        Intent linha472 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha472.putExtra("Nome da Linha", "472 - Campeche via Capela");
                        startActivity(linha472);
                        break;
                    case "473 - Morro das Pedras via Eucaliptos":
                        Intent linha473 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha473.putExtra("Nome da Linha", "473 - Morro das Pedras via Eucaliptos");
                        startActivity(linha473);
                        break;
                    case "474 - Morro das Pedras via Gramal":
                        Intent linha474 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha474.putExtra("Nome da Linha", "474 - Morro das Pedras via Gramal");
                        startActivity(linha474);
                        break;
                    case "477 - TIRIO-Aeroporto via Tapera":
                        Intent linha477 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha477.putExtra("Nome da Linha", "477 - TIRIO-Aeroporto via Tapera");
                        startActivity(linha477);
                        break;
                    case "500 - Madrugadão Sul":
                        Intent linha500 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha500.putExtra("Nome da Linha", "500 - Madrugadão Sul");
                        startActivity(linha500);
                        break;
                    case "502 - Madrugadão Aeroporto-Tapera-Carianos":
                        Intent linha502 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha502.putExtra("Nome da Linha", "502 - Madrugadão Aeroporto-Tapera-Carianos");
                        startActivity(linha502);
                        break;
                    case "560 - Armação":
                        Intent linha560 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha560.putExtra("Nome da Linha", "560 - Armação");
                        startActivity(linha560);
                        break;
                    case "561 - Caieira da Barra do Sul":
                        Intent linha561 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha561.putExtra("Nome da Linha", "561 - Caieira da Barra do Sul");
                        startActivity(linha561);
                        break;
                    case "562 - Costa de Cima":
                        Intent linha562 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha562.putExtra("Nome da Linha", "562 - Costa de Cima");
                        startActivity(linha562);
                        break;
                    case "563 - Costa de Dentro":
                        Intent linha563 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha563.putExtra("Nome da Linha", "563 - Costa de Dentro");
                        startActivity(linha563);
                        break;
                    case "564 - Pântano do Sul":
                        Intent linha564 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha564.putExtra("Nome da Linha", "564 - Pântano do Sul");
                        startActivity(linha564);
                        break;
                    case "565 - Ribeirão da Ilha":
                        Intent linha565 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha565.putExtra("Nome da Linha", "565 - Ribeirão da Ilha");
                        startActivity(linha565);
                        break;
                    case "566 - Caieira via Tapera":
                        Intent linha566 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha566.putExtra("Nome da Linha", "566 - Caieira via Tapera");
                        startActivity(linha566);
                        break;
                    case "600 - Madrugadão Continente":
                        Intent linha600 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha600.putExtra("Nome da Linha", "600 - Madrugadão Continente");
                        startActivity(linha600);
                        break;
                    case "601 - Circular Abraão-Estreito":
                        Intent linha601 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha601.putExtra("Nome da Linha", "601 - Circular Abraão-Estreito");
                        startActivity(linha601);
                        break;
                    case "605 - Circular Estreito-Abraão":
                        Intent linha605 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha605.putExtra("Nome da Linha", "605 - Circular Estreito-Abraão");
                        startActivity(linha605);
                        break;
                    case "6220 - Executivo Abraão":
                        Intent linha6220 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha6220.putExtra("Nome da Linha", "6220 - Executivo Abraão");
                        startActivity(linha6220);
                        break;
                    case "630 - Corredor Continente":
                        Intent linha630 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha630.putExtra("Nome da Linha", "630 - Corredor Continente");
                        startActivity(linha630);
                        break;
                    case "631 - Capoeiras":
                        Intent linha631 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha631.putExtra("Nome da Linha", "631 - Capoeiras");
                        startActivity(linha631);
                        break;
                    case "660 - Aracy Vaz Callado":
                        Intent linha660 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha660.putExtra("Nome da Linha", "660 - Aracy Vaz Callado");
                        startActivity(linha660);
                        break;
                    case "661 - Balneário":
                        Intent linha661 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha661.putExtra("Nome da Linha", "661 - Balneário");
                        startActivity(linha661);
                        break;
                    case "663 - Coloninha":
                        Intent linha663 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha663.putExtra("Nome da Linha", "663 - Coloninha");
                        startActivity(linha663);
                        break;
                    case "664 - Itaguaçu":
                        Intent linha664 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha664.putExtra("Nome da Linha", "664 - Itaguaçu");
                        startActivity(linha664);
                        break;
                    case "665 - Abraão":
                        Intent linha665 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha665.putExtra("Nome da Linha", "665 - Abraão");
                        startActivity(linha665);
                        break;
                    case "668 - Promorar via Ivo Silveira":
                        Intent linha668 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha668.putExtra("Nome da Linha", "668 - Promorar via Ivo Silveira");
                        startActivity(linha668);
                        break;
                    case "670 - Monte Cristo":
                        Intent linha670 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha670.putExtra("Nome da Linha", "670 - Monte Cristo");
                        startActivity(linha670);
                        break;
                    case "671 - Vila/Promorar":
                        Intent linha671 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha671.putExtra("Nome da Linha", "671 - Vila/Promorar");
                        startActivity(linha671);
                        break;
                    case "672 - Monte Cristo via Escola Edith Gama Ramos":
                        Intent linha672 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha672.putExtra("Nome da Linha", "672 - Monte Cristo via Escola Edith Gama Ramos");
                        startActivity(linha672);
                        break;
                    case "760 - Morro do Geraldo":
                        Intent linha760 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha760.putExtra("Nome da Linha", "760 - Morro do Geraldo");
                        startActivity(linha760);
                        break;
                    case "761 - Vila Aparecida":
                        Intent linha761 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha761.putExtra("Nome da Linha", "761 - Vila Aparecida");
                        startActivity(linha761);
                        break;
                    case "762 - Ângelo Laporta":
                        Intent linha762 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha762.putExtra("Nome da Linha", "762 - Ângelo Laporta");
                        startActivity(linha762);
                        break;
                    case "763 - Caeira Saco dos Limões":
                        Intent linha763 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha763.putExtra("Nome da Linha", "763 - Caeira Saco dos Limões");
                        startActivity(linha763);
                        break;
                    case "764 - Monte Serrat":
                        Intent linha764 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha764.putExtra("Nome da Linha", "764 - Monte Serrat");
                        startActivity(linha764);
                        break;
                    case "765 - Morro da Queimada":
                        Intent linha765 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha765.putExtra("Nome da Linha", "765 - Morro da Queimada");
                        startActivity(linha765);
                        break;
                    case "766 - Morro do 25":
                        Intent linha766 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha766.putExtra("Nome da Linha", "766 - Morro do 25");
                        startActivity(linha766);
                        break;
                    case "768 - Morro do Horácio via Mauro Ramos":
                        Intent linha768 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha768.putExtra("Nome da Linha", "768 - Morro do Horácio via Mauro Ramos");
                        startActivity(linha768);
                        break;
                    case "769 - Morro Nova Trento":
                        Intent linha769 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha769.putExtra("Nome da Linha", "769 - Morro Nova Trento");
                        startActivity(linha769);
                        break;
                    case "772 - Chico Mendes":
                        Intent linha772 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha772.putExtra("Nome da Linha", "772 - Chico Mendes");
                        startActivity(linha772);
                        break;
                    case "840 - TICAN-TILAG via Barra da Lagoa":
                        Intent linha840 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha840.putExtra("Nome da Linha", "840 - TICAN-TILAG via Cidade da Barra");
                        startActivity(linha840);
                        break;
                    case "841 - TILAG-TIRIO":
                        Intent linha841 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha841.putExtra("Nome da Linha", "841 - TILAG-TIRIO");
                        startActivity(linha841);
                        break;
                    case "843 - TILAG-TIRIO via LIC":
                        Intent linha843 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha843.putExtra("Nome da Linha", "843 - TILAG-TIRIO via LIC");
                        startActivity(linha843);
                        break;
                    case "844 - Bairro de Fátima via Aracy Vaz Callado":
                        Intent linha844 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha844.putExtra("Nome da Linha", "844 - Bairro de Fátima via Aracy Vaz Callado");
                        startActivity(linha844);
                        break;
                    case "845 - TILAG-TITRI via Córrego Grande":
                        Intent linha845 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha845.putExtra("Nome da Linha", "845 - TILAG-TITRI via Córrego Grande");
                        startActivity(linha845);
                        break;
                    case "846 - Cacupé":
                        Intent linha846 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha846.putExtra("Nome da Linha", "846 - Cacupé");
                        startActivity(linha846);
                        break;
                    case "847 - TIRIO-TITRI via UFSC":
                        Intent linha847 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha847.putExtra("Nome da Linha", "847 - TIRIO-TITRI via UFSC");
                        startActivity(linha847);
                        break;
                    case "850 - TILAG-Rio Vermelho via Cidade da Barra":
                        Intent linha850 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha850.putExtra("Nome da Linha", "850 - TILAG-Rio Vermelho via Cidade da Barra");
                        startActivity(linha850);
                        break;
                    case "940 - Canasvieiras-Santo Antônio via Jurerê":
                        Intent linha940 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha940.putExtra("Nome da Linha", "940 - Canasvieiras-Santo Antônio via Jurerê");
                        startActivity(linha940);
                        break;
                    case "941 - Canasvieiras-Santo Antônio via Ratones":
                        Intent linha941 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha941.putExtra("Nome da Linha", "941 - Canasvieiras-Santo Antônio via Ratones");
                        startActivity(linha941);
                        break;
                    case "943 - Saco dos Limões-Trindade":
                        Intent linha943 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha943.putExtra("Nome da Linha", "943 - Saco dos Limões-Trindade");
                        startActivity(linha943);
                        break;
                    case "944 - Saco dos Limões-Trindade via Madre Benvenuta":
                        Intent linha944 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha944.putExtra("Nome da Linha", "944 - Saco dos Limões-Trindade via Madre Benvenuta");
                        startActivity(linha944);
                        break;
                    case "946 - Jardim Atlântico-UFSC":
                        Intent linha946 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha946.putExtra("Nome da Linha", "946 - Jardim Atlântico-UFSC");
                        startActivity(linha946);
                        break;
                    case "948 - Capoeiras-UFSC":
                        Intent linha948 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha948.putExtra("Nome da Linha", "948 - Capoeiras-UFSC");
                        startActivity(linha948);
                        break;
                    case "949 - Abraão-UFSC":
                        Intent linha949 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linha949.putExtra("Nome da Linha", "949 - Abraão-UFSC");
                        startActivity(linha949);
                        break;
                    case "D163 - Córrego Grande Direto":
                        Intent linhaD163 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linhaD163.putExtra("Nome da Linha", "D163 - Córrego Grande Direto");
                        startActivity(linhaD163);
                        break;
                    case "D168 - Monte Verde Direto":
                        Intent linhaD168 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linhaD168.putExtra("Nome da Linha", "D168 - Monte Verde Direto");
                        startActivity(linhaD168);
                        break;
                    case "D174 - Saco Grande Direto":
                        Intent linhaD174 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linhaD174.putExtra("Nome da Linha", "D174 - Saco Grande Direto");
                        startActivity(linhaD174);
                        break;
                    case "D260 - Cachoeira Direto":
                        Intent linhaD260 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linhaD260.putExtra("Nome da Linha", "D260 - Cachoeira Direto");
                        startActivity(linhaD260);
                        break;
                    case "D264 - Ingleses Direto":
                        Intent linhaD264 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linhaD264.putExtra("Nome da Linha", "D264 - Ingleses Direto");
                        startActivity(linhaD264);
                        break;
                    case "D266 - Praia Brava Direto":
                        Intent linhaD266 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linhaD266.putExtra("Nome da Linha", "D266 - Praia Brava Direto");
                        startActivity(linhaD266);
                        break;
                    case "D267 - Rio Vermelho Direto":
                        Intent linhaD267 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linhaD267.putExtra("Nome da Linha", "D267 - Rio Vermelho Direto");
                        startActivity(linhaD267);
                        break;
                    case "D360 - Barra da Lagoa Direto":
                        Intent linhaD360 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linhaD360.putExtra("Nome da Linha", "D360 - Barra da Lagoa Direto");
                        startActivity(linhaD360);
                        break;
                    case "D365 - Sambaqui Direto":
                        Intent linhaD365 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linhaD365.putExtra("Nome da Linha", "D365 - Sambaqui Direto");
                        startActivity(linhaD365);
                        break;
                    case "D563 - Costa de Dentro Direto":
                        Intent linhaD563 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linhaD563.putExtra("Nome da Linha", "D563 - Costa de Dentro Direto");
                        startActivity(linhaD563);
                        break;
                    case "D565 - Ribeirâo da Ilha Direto":
                        Intent linhaD565 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linhaD565.putExtra("Nome da Linha", "D565 - Ribeirâo da Ilha Direto");
                        startActivity(linhaD565);
                        break;
                    case "D846 - Cacupé via Gama D'Eça":
                        Intent linhaD846 = new Intent(Act_Empresas_CFenix_WebView.this, Act_Mapas_WebView.class);
                        linhaD846.putExtra("Nome da Linha", "D846 - Cacupé via Gama D'Eça");
                        startActivity(linhaD846);
                        break;

                }
            }
        });

    }
}