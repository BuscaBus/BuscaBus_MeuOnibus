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

        // Parametro para exibir Horários
        switch(parametroNomeLinha) {
            /*case "100 - Madrugadão Centro-UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/madrugadao-centro-ufsc,100");
                break;
            case "101 - Circular Centro":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-centro,101");
                break;*/
            case "104 - TICEN-Itacorubi via Mauro Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ticen-itacorubi-via-mauro-ramos,104");
                break;
            /*case "110 - TITRI-TICEN Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-direto,110");
                break;
            case "1112 - Executivo Santa Mônica":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-santa-monica,1112");
                break;*/
            case "1113 - Executivo Parque São Jorge":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-parque-sao-jorge,1113");
                break;
            case "1115 - Executivo Córrego Grande via G D`Eça":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-corrego-grande-gama-deca,1115");
                break;
            case "1117 - Executivo João Paulo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-joao-paulo,1117");
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
            /*case "133 - TITRI-TICEN via Mauro Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-mauro-ramos,133");
                break;
            case "134 - TITRI-TICEN via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-beira-mar,134");
                break;*/
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
            /*case "150 - TICEN-Itacorubi via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ticen-itacorubi-via-beira-mar,150");
                break;
            case "151 - Centro Aministrativo via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/centro-administrativo-via-beira-mar-norte,151");
                break;
            case "153 - Costeira do Pirajubaé":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/costeira-do-pirajubae,153");
                break;*/
            case "155 - Sol Nascente":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/sol-nascente,155");
                break;
            case "160 - Morro da Cruz":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-da-cruz,160");
                break;
            case "161 - Morro da Penitenciária":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-da-penitenciaria,161");
                break;
            /*case "162 - Saco dos Limões":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-dos-limoes,162");
                break;
            case "163 - Córrego Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corrego-grande,163");
                break;*/
            case "164 - Córrego Grande - Poção":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corrego-grande-pocao,164");
                break;
            case "165 - Itacorubi":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/itacorubi,165");
                break;
            /*case "167 - João Paulo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/joao-paulo,167");
                break;
            case "168 - Monte Verde":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/monte-verde,168");
                break;*/
            case "169 - Monte Verde via Mané Vicente":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/monte-verde-via-mane-vicente,169");
                break;
            /*case "170 - Caminho da Cruz via João Paulo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/caminho-da-cruz-via-joao-paulo,170");
                break;
            case "172 - Parque São Jorge via SC 404":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/parque-sao-jorge-via-sc-404,172");
                break;*/
            case "173 - Morro do Quilombo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-do-quilombo,173");
                break;
            case "174 - Saco Grande via João Paulo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-grande-via-joao-paulo,174");
                break;
            /*case "175 - SC 401 Retorno/Saco Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/sc-401-retorno-saco-grande,175");
                break;
            case "176 - Saco Grande via HU":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-grande-via-hu,176");
                break;
            case "177 - Santa Mônica":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/santa-monica,177");
                break;*/
            case "178 - Saco Grande/Retorno SC 401":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/saco-grande-retorno-sc-401,178");
                break;
            case "179 - Serrinha":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/serrinha,179");
                break;
            /*case "180 - TITRI-UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ufsc,180");
                break;
            case "181 - Cacupé/João Paulo via Barreira do Janga":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/cacupe-joao-paulo-via-barreira-do-janga,181");
                break;
            case "182 - Tecnópolis":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tecnopolis,182");
                break;*/
            case "183 - Corredor Sudoeste via Saco dos Limões":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corredor-sudoeste,183");
                break;
            case "184 - UDESC via Beira Mar/TITRI":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/udesc-via-beira-mar,184");
                break;
            /*case "185 - UFSC Semidireto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ufsc-semidireto,185");
                break;*/
            case "186 - Corredor Sudoeste via Túnel":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corredor-sudoeste-via-tunel,186");
                break;
            case "191 - TITRI-TICEN via Transcaeira":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/titri-ticen-via-transcaeira,191");
                break;
            /*case "200 - Madrugadão Norte":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/madrugadao-norte,200");
                break;*/
            case "210 - TICAN-TICEN Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-ticen-direto,210");
                break;
            /*case "212 - TISAN-TICEN Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tisan-ticen-direto,212");
                break;*/
            case "2120 - Executivo Barra da Lagoa":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-barra-da-lagoa,2120");
                break;
            case "2123 - Executivo Lagoa da Conceição via Joaquina":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-lagoa-da-conceicao-via-joaquina,2123");
                break;
            /*case "2124 - Executivo Sambaqui":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-sambaqui,2124");
                break;*/
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
            /*case "270 - Vargem Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vargem-grande,270");
                break;*/
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
            /*case "280 - Cachoeira-TICAN":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/cachoeira-tican,280");
                break;*/
            case "281 - Costa do Moçambique":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/costa-do-mocambique,281");
                break;
            case "282 - Vargem Pequena":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vargem-pequena,282");
                break;
            /*case "283 - Vargem do Bom Jesus":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vargem-do-bom-jesus,283");
                break;
            case "284 - Moçambique via Rua da Intendência":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/mocambique-via-rua-da-intendencia,284");
                break;*/
            case "285 - Circular Moçambique":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-mocambique,285");
                break;
            /*case "286 - TICAN-Sapiens Parque":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tican-sapiens-parque,286");
                break;*/
            case "287 - Rio Vermelho via Vargem Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/rio-vermelho-via-vargem-grande,287");
                break;
            case "288 - Circular Rio Vermelho":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-rio-vermelho,288");
                break;
            case "289 - Vargem Grande via Rio Vermelho":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vargem-grande-via-rio-vermelho,289");
                break;
            /*case "291 - Circular Canasvieiras/Praia Brava":
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
                break;*/
            case "320 - TILAG-TICEN via Beira Mar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tilag-ticen-via-beira-mar,320");
                break;
            case "330 - TILAG-TICEN via Mauro Ramos/TITRI":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tilag-ticen-via-mauro-ramos-titri,V-330");
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
            /*case "364 - Osni Ortiga":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/osni-ortiga,364");
                break;*/
            case "365 - Sambaqui":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/sambaqui,365");
                break;
            case "366 - Barra do Sambaqui via Padre Rohr":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/barra-do-sambaqui-via-padre-rohr,366");
                break;
            case "410 - TIRIO-TICEN Direto":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tirio-ticen-direto,410");
                break;
            /*case "4120 - Executivo Pântano do Sul via Eucaliptos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-pantano-do-sul-via-eucaliptos,4120");
                break;*/
            case "4121 - Executivo Pântano do Sul via Campeche":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-pantano-do-sul-via-campeche,4121");
                break;
            /*case "4122 - Executivo Campeche":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-campeche,4122");
                break;*/
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
            /*case "463 - Castanheiras via Eucaliptos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/castanheiras-via-eucaliptos,463");
                break;
            case "464 - Castanheiras via Gramal":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/castanheiras-via-gramal,464");
                break;*/
            case "467 - Tapera/Saco dos Limões":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tapera-saco-dos-limoes,467");
                break;
            case "468 - TIRIO-Aeroporto via Carianos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tirio-aeroporto-via-carianos,468");
                break;
            /*case "469 - Tapera-Rio Tavares":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tapera-rio-tavares,469");
                break;
            case "470 - Tapera-TITRI":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tapera-titri,470");
                break;
            case "472 - Campeche via Capela":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/campeche-via-capela,472");
                break;*/
            case "473 - Morro das Pedras via Eucaliptos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-das-pedras-via-eucaliptos,473");
                break;
            case "474 - Morro das Pedras via Gramal":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/morro-das-pedras-via-gramal,474");
                break;
            case "477 - TIRIO-Aeroporto via Tapera":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tirio-aeroporto-via-tapera,477");
                break;
            /*case "500 - Madrugadão Sul":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/madrugadao-sul,500");
                break;
            case "502 - Madrugadão Aeroporto-Tapera-Carianos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/madrugadao-aeroporto-tapera-carianos,502");
                break;
            case "560 - Armação":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/armacao,560");
                break;*/
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
            /*case "566 - Caieira via Tapera":
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
                break;*/
            case "6220 - Executivo Abraão":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/executivo-abraao,6220");
                break;
            case "630 - Corredor Continente":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/corredor-continente,630");
                break;
            case "631 - Capoeiras":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/capoeiras,631");
                break;
            /*case "660 - Aracy Vaz Callado":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/aracy-vaz-callado,660");
                break;
            case "661 - Balneário":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/balneario,661");
                break;*/
            case "663 - Coloninha":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/coloninha,663");
                break;
            case "664 - Itaguaçu":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/itaguacu,664");
                break;
            case "665 - Abraão":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/abraao,665");
                break;
            /*case "668 - Promorar via Ivo Silveira":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/promorar-via-ivo-silveira,668");
                break;*/
            case "670 - Monte Cristo":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/monte-cristo,670");
                break;
            case "671 - Vila/Promorar":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/vila-promorar,671");
                break;
            /*case "672 - Monte Cristo via Escola Edith Gama Ramos":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/monte-cristo-via-escola-edith-gama-ramos,672");
                break;*/
            case "673 - Ponte Viva":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/ponte-viva,673");
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
            /*case "845 - TILAG-TITRI via Córrego Grande":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tilag-titri-via-corrego-grande,845");
                break;*/
            case "846 - Cacupé":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/cacupe,846");
                break;
            /*case "847 - TIRIO-TITRI via UFSC":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tirio-titri-via-ufsc,847");
                break;*/
            case "850 - TILAG-Rio Vermelho via Cidade da Barra":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/tilag-rio-vermelho-via-cidade-da-barra,850");
                break;
            case "940 - Canasvieiras-Santo Antônio via Jurerê":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/canasvieiras-santo-antonio-via-jurere,940");
                break;
            /*case "941 - Canasvieiras-Santo Antônio via Ratones":
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
                break;*/

        }

    }
}