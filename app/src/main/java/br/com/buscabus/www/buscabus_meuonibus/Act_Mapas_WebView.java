package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Act_Mapas_WebView extends AppCompatActivity {

    private android.webkit.WebView WebView;
    private Button Btn_VerMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_mapas_webview);

        // Comandos para o WebView
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeLinha = (String) intent.getSerializableExtra("Nome da Linha");

        // LINHAS CONSÓRCIO FÊNIX
        switch(parametroNomeLinha) {
            case "100 - Madrugadão Centro-UFSC":
                WebView.loadUrl("https://goo.gl/maps/naSwtpZkiew1EpKL7");
                break;
            case "101 - Circular Centro":
                WebView.loadUrl("https://goo.gl/maps/2LT839T4hQyCD6q28");
                break;
            case "104 - TICEN-Itacorubi via Mauro Ramos":
                WebView.loadUrl("https://goo.gl/maps/iFezsTrBZP1uEXrk6");
                break;
            case "110 - TITRI-TICEN Direto":
                WebView.loadUrl("https://goo.gl/maps/qnTvoCcHpAJyB27EA");
                break;
            case "1112 - Executivo Santa Mônica":
                WebView.loadUrl("https://goo.gl/maps/dsxDKyEckASNz5zG7");
                break;
            case "1113 - Executivo Parque São Jorge":
                WebView.loadUrl("https://goo.gl/maps/rZQnBNCXYscFVbEH7");
                break;
            case "1115 - Executivo Córrego Grande via G D`Eça":
                WebView.loadUrl("https://goo.gl/maps/cGd5MVrefQnBHyTXA");
                break;
            case "1117 - Executivo João Paulo":
                WebView.loadUrl("https://goo.gl/maps/NUQocsedHWX28urY8");
                break;
            case "1120 - Executivo Canasvieiras":
                WebView.loadUrl("https://goo.gl/maps/BHg5RV43ejh6oNiu9");
                break;
            case "1121 - Executivo Ingleses/Santinho":
                WebView.loadUrl("https://goo.gl/maps/8Z8bdQZvrsq12Z7W7");
                break;
            case "1122 - Executivo Praia Brava":
                WebView.loadUrl("https://goo.gl/maps/BcYGJPkhTV84GLMS8");
                break;
            case "1123 - Executivo Jurerê":
                WebView.loadUrl("https://goo.gl/maps/WV89J3EMiHNRTXYn8");
                break;
            case "1125 - Executivo Rio Vermelho":
                WebView.loadUrl("https://goo.gl/maps/pMbPY6cCmFiKmdBo8");
                break;
            case "1126 - Executivo Cachoeira":
                WebView.loadUrl("https://goo.gl/maps/4thZrzb3kwCRgsdQ8");
                break;
            case "1127 - Executivo Gaivotas":
                WebView.loadUrl("https://goo.gl/maps/C6MARLbbEg8ntUvg7");
                break;
            case "1128 - Executivo Costa do Moçambique":
                WebView.loadUrl("https://goo.gl/maps/ACQ3zpJpd3u1kY9k9");
                break;
            case "1129 - Executivo Muquem":
                WebView.loadUrl("https://goo.gl/maps/3A3jmLfJpkmx75wu5");
                break;
            case "131 - TITRI-TICEN via Gama D`Eça":
                WebView.loadUrl("https://goo.gl/maps/ECYyUVBSoQQMM2Js5");
                break;
            case "132 - TITRI-TICEN via Gama D`Eça/HI":
                WebView.loadUrl("https://goo.gl/maps/nGgRxfNL7LkzMFM86");
                break;
            case "133 - TITRI-TICEN via Mauro Ramos":
                WebView.loadUrl("https://goo.gl/maps/TdgJ5v6paGqdZMqy6");
                break;
            case "134 - TITRI-TICEN via Beira Mar":
                WebView.loadUrl("https://goo.gl/maps/1g3WNZvBa9SdVnc1A");
                break;
            case "135 - Volta ao Morro/Carvoeira Norte via TITRI":
                WebView.loadUrl("https://goo.gl/maps/rQxEcecrrMLdU4s3A");
                break;
            case "136 - Volta ao Morro/Carvoeira Sul via TITRI":
                WebView.loadUrl("https://goo.gl/maps/4pyUXBYp4PvV66we6");
                break;
            case "137 - Volta ao Morro/Pantanal Norte via TITRI":
                WebView.loadUrl("https://goo.gl/maps/vDnndaXjUH3EgjwC8");
                break;
            case "138 - Volta ao Morro/Pantanal Sul via TITRI":
                WebView.loadUrl("https://goo.gl/maps/U4rFE7GkcfSkTktf7");
                break;
            case "150 - TICEN-Itacorubi via Beira Mar":
                WebView.loadUrl("https://goo.gl/maps/HzvQd8si9UVS1o3c9");
                break;
            case "151 - Centro Aministrativo via Beira Mar":
                WebView.loadUrl("https://goo.gl/maps/PFMsx9o9Z6CvMcSD9");
                break;
            case "153 - Costeira do Pirajubaé":
                WebView.loadUrl("https://goo.gl/maps/eo1WJDVEAzRdNPNA8");
                break;
            case "155 - Sol Nascente":
                WebView.loadUrl("https://goo.gl/maps/ha3wCJ3QH4dsgAuWA");
                break;
            case "160 - Morro da Cruz":
                WebView.loadUrl("https://goo.gl/maps/FAnDFqeT1tDKUPbi7");
                break;
            case "161 - Morro da Penitenciária":
                WebView.loadUrl("https://goo.gl/maps/KC1YCRGB3i35cgwt7");
                break;
            case "162 - Saco dos Limões":
                WebView.loadUrl("https://goo.gl/maps/VZNricJv1VtC9iHV9");
                break;
            case "163 - Córrego Grande":
                WebView.loadUrl("https://goo.gl/maps/4VZGkFEDjs3oondXA");
                break;
            case "164 - Córrego Grande - Poção":
                WebView.loadUrl("https://goo.gl/maps/seDRQiYHCg78carZ6");
                break;
            case "165 - Itacorubi":
                WebView.loadUrl("https://goo.gl/maps/qXpYjc9fdB2KbwPB7");
                break;
            case "167 - João Paulo":
                WebView.loadUrl("https://goo.gl/maps/vq6ne4RK47pmkaqP7");
                break;
            case "168 - Monte Verde":
                WebView.loadUrl("https://goo.gl/maps/Xjb5EyDMfDhQn4Z39");
                break;
            case "169 - Monte Verde via Mané Vicente":
                WebView.loadUrl("https://goo.gl/maps/n58VSrtFUuKD5fdWA");
                break;
            case "170 - Caminho da Cruz via João Paulo":
                WebView.loadUrl("https://goo.gl/maps/kjdDTF7SsbA2XmVb6");
                break;
            case "172 - Parque São Jorge via SC 404":
                WebView.loadUrl("https://goo.gl/maps/rHG4HG994L31Jd2v6");
                break;
            case "173 - Morro do Quilombo":
                WebView.loadUrl("https://goo.gl/maps/wTEEXb8mrMDze4qz6");
                break;
            case "174 - Saco Grande via João Paulo":
                WebView.loadUrl("https://goo.gl/maps/NPHWfoVhjJ99Xgeu9");
                break;
            case "175 - SC 401 Retorno/Saco Grande":
                WebView.loadUrl("https://goo.gl/maps/KcVBcHF7dyRy8eE89");
                break;
            case "176 - Saco Grande via HU":
                WebView.loadUrl("https://goo.gl/maps/Z4nKUA6bJkSuay286");
                break;
            case "177 - Santa Mônica":
                WebView.loadUrl("https://goo.gl/maps/91uJjk9dvhp59zNQ7");
                break;
            case "178 - Saco Grande/Retorno SC 401":
                WebView.loadUrl("https://goo.gl/maps/7c1sZT2Ggo4zhZtRA");
                break;
            case "179 - Serrinha":
                WebView.loadUrl("https://goo.gl/maps/EKn4Z4CpovMQpivz7");
                break;
            case "180 - TITRI-UFSC":
                WebView.loadUrl("https://goo.gl/maps/1pHJiCN4sx8c8QJb7");
                break;
            case "181 - Cacupé/João Paulo via Barreira do Janga":
                WebView.loadUrl("https://goo.gl/maps/Ur1MmdpytQB39F276");
                break;
            case "182 - Tecnópolis":
                WebView.loadUrl("https://goo.gl/maps/U44AGU3gkfu5Y9c46");
                break;
            case "183 - Corredor Sudoeste via Saco dos Limões":
                WebView.loadUrl("https://goo.gl/maps/Rz9SvffqYNzsug3v7");
                break;
            case "184 - UDESC via Beira Mar":
                WebView.loadUrl("https://goo.gl/maps/QyFTqPLRLDw6oQvC7");
                break;
            case "185 - UFSC Semidireto":
                WebView.loadUrl("https://goo.gl/maps/Phagd4J4xLEKuGmc7");
                break;
            case "186 - Corredor Sudoeste via Túnel":
                WebView.loadUrl("https://goo.gl/maps/tKB3CPhoG37jyPbE9");
                break;
            case "191 - TITRI-TICEN via Transcaeira":
                WebView.loadUrl("https://goo.gl/maps/t9g65UBmBzfKC7Dt6");
                break;
            case "200 - Madrugadão Norte":
                WebView.loadUrl("https://goo.gl/maps/4CyDHPhD5BbzRqsv5");
                break;
            case "210 - TICAN-TICEN Direto":
                WebView.loadUrl("https://goo.gl/maps/C8jNL2geCNkEZH8S9");
                break;
            case "212 - TISAN-TICEN Direto":
                WebView.loadUrl("https://goo.gl/maps/wZw69YvxywfG8zRh8");
                break;
            case "2120 - Executivo Barra da Lagoa":
                WebView.loadUrl("https://goo.gl/maps/5zjfJCMWsyvLToig8");
                break;
            case "2123 - Executivo Lagoa da Conceição via Joaquina":
                WebView.loadUrl("https://goo.gl/maps/5ZhpUir4tBb9g7Wg6");
                break;
            case "2124 - Executivo Sambaqui":
                WebView.loadUrl("https://goo.gl/maps/TcRn1AQkbG4wzg7i9");
                break;
            case "221 - TICAN-TICEN via Mauro Ramos":
                WebView.loadUrl("https://goo.gl/maps/VyAEe6ZZfbsq9NfG8");
                break;
            case "230 - Canasvieiras via Gama D`Eça":
                WebView.loadUrl("https://goo.gl/maps/RfF6wjJxLDkzcUJb8");
                break;
            case "231 - TICAN-TICEN via TITRI":
                WebView.loadUrl("https://goo.gl/maps/v2Ae4E1outZMi3o47");
                break;
            case "233 - TICAN-TITRI via UFSC":
                WebView.loadUrl("https://goo.gl/maps/y2Ruj2QkUUmpjyt89");
                break;
            case "235 - TICAN-TITRI via TISAN":
                WebView.loadUrl("https://goo.gl/maps/p5iieui9283CJEqP8");
                break;
            case "250 - Forte-Canasvieiras":
                WebView.loadUrl("https://goo.gl/maps/EJYgJqH8vX6NNVwGA");
                break;
            case "260 - Cachoeira do Bom Jesus":
                WebView.loadUrl("https://goo.gl/maps/17GVEeKBr5pSwW4i9");
                break;
            case "261 - Capivari via Graciliano Gomes":
                WebView.loadUrl("https://goo.gl/maps/qAuo4Zi1AGYhsekT7");
                break;
            case "262 - Circular Canasvieiras":
                WebView.loadUrl("https://goo.gl/maps/qkyKdhe1Zx3FgQpg9");
                break;
            case "263 - Gaivotas":
                WebView.loadUrl("https://goo.gl/maps/NuxK6Y1iCeAFABEr5");
                break;
            case "264 - Ingleses":
                WebView.loadUrl("https://goo.gl/maps/vaTn4vNqE6AWRtsd6");
                break;
            case "265 - Ponta das Canas":
                WebView.loadUrl("https://goo.gl/maps/Y44sWRGqQCmXEGiz7");
                break;
            case "266 - Praia Brava":
                WebView.loadUrl("https://goo.gl/maps/ZzMsrkNTonZtoDz58");
                break;
            case "267 - Rio Vermelho":
                WebView.loadUrl("https://goo.gl/maps/chbidyoQnnKNj6Kq9");
                break;
            case "268 - Sitio de Baixo":
                WebView.loadUrl("https://goo.gl/maps/1XaArk87hhVW5ixt7");
                break;
            case "269 - Moçambique via Alzira Rosa Aguiar":
                WebView.loadUrl("https://goo.gl/maps/qeUcvTLrowCZHpux7");
                break;
            case "270 - Vargem Grande":
                WebView.loadUrl("https://goo.gl/maps/nK8M8ftKx41FQCcb8");
                break;
            case "271 - Daniela":
                WebView.loadUrl("https://goo.gl/maps/LxzzBQeuUt6j1rJJ7");
                break;
            case "272 - Jurerê":
                WebView.loadUrl("https://goo.gl/maps/B4DjweCc3GwDrFqAA");
                break;
            case "273 - Circular Ratones":
                WebView.loadUrl("https://goo.gl/maps/ehgQPQXiiVWRrqT27");
                break;
            case "274 - Rio Vermelho via Muquem":
                WebView.loadUrl("https://goo.gl/maps/wiCuXNWdptgrNm2D7");
                break;
            case "276 - Balneário Canasvieiras":
                WebView.loadUrl("https://goo.gl/maps/8mkfT15y2zKg1TD68");
                break;
            case "277 - Balneário Ingleses":
                WebView.loadUrl("https://goo.gl/maps/Mc74YoRuVSn2FVoVA");
                break;
            case "280 - TICAN-Cachoeira":
                WebView.loadUrl("https://goo.gl/maps/kk7cWihfiK3QR3WY8");
                break;
            case "281 - Costa do Moçambique":
                WebView.loadUrl("https://goo.gl/maps/NxNEH9DwvksrovmPA");
                break;
            case "282 - Vargem Pequena":
                WebView.loadUrl("https://goo.gl/maps/bAXBdEukjPD9VFjn9");
                break;
            case "283 - Vargem do Bom Jesus":
                WebView.loadUrl("https://goo.gl/maps/DpJGmiqPX2fjiGza6");
                break;
            case "284 - Moçambique via Rua da Intendência":
                WebView.loadUrl("https://goo.gl/maps/QRrDz4b9URtf7haK9");
                break;
            case "285 - Circular Moçambique":
                WebView.loadUrl("https://goo.gl/maps/W532pVcqPtJzExTy7");
                break;
            case "286 - TICAN-Sapiens Parque":
                WebView.loadUrl("https://goo.gl/maps/jW6GtKLcZLMPNVmG9");
                break;
            case "287 - Rio Vermelho via Vargem Grande":
                WebView.loadUrl("https://goo.gl/maps/h6AHaTaTgC1Hnhwi6");
                break;
            case "288 - Circular Rio Vermelho":
                WebView.loadUrl("https://goo.gl/maps/TiWM3cXQzeEayLLt9");
                break;
            case "289 - Vargem Grande via Rio Vermelho":
                WebView.loadUrl("https://goo.gl/maps/BP5gpW5MNoiZo8bo6");
                break;
            case "291 - Circular Canasvieiras/Praia Brava":
                WebView.loadUrl("https://goo.gl/maps/zzDyTFuZn3UscGrs5");
                break;
            case "294 - Interpraias":
                WebView.loadUrl("https://goo.gl/maps/scgyjT9WM7zZgMja6");
                break;
            case "296 - Circular Santinho/Ingleses":
                WebView.loadUrl("https://goo.gl/maps/fSKbnSK4dAr4ZfXbA");
                break;
            case "300 - Madrugadão Leste":
                WebView.loadUrl("https://goo.gl/maps/2DpgJgCuhtqBvHNr6");
                break;
            case "3001 - Executivo Abraão-UFSC":
                WebView.loadUrl("https://goo.gl/maps/N51GPbZz3zhHMio79");
                break;
            case "3002 - Executivo Jardim Atlântico-UFSC":
                WebView.loadUrl("https://goo.gl/maps/yX4xhbiSbhawWASf6");
                break;
            case "311 - TILAG-TICEN Direto":
                WebView.loadUrl("https://goo.gl/maps/CyamtR3LzWYWtUgJA");
                break;
            case "320 - TILAG-TICEN via Beira Mar":
                WebView.loadUrl("https://goo.gl/maps/3ebCz4BX2n7V9HAK9");
                break;
            case "330 - TILAG-TICEN via Mauro Ramos":
                WebView.loadUrl("https://goo.gl/maps/BjUvWkncihpPmfbB6");
                break;
            case "331 - TISAN-TICEN via Mauro Ramos":
                WebView.loadUrl("https://goo.gl/maps/rAS19XBf9EK4pL2s7");
                break;
            case "332 - TISAN-TICEN via Beira Mar":
                WebView.loadUrl("https://goo.gl/maps/vwB9TqpJRT7kLddc7");
                break;
            case "333 - TILAG-TITRI via Madre Benvenuta":
                WebView.loadUrl("https://goo.gl/maps/TrJC4hHTLRGqHpPz8");
                break;
            case "360 - Barra da Lagoa":
                WebView.loadUrl("https://goo.gl/maps/aa3Wbn26u9SseFiw8");
                break;
            case "362 - Canto dos Araças":
                WebView.loadUrl("https://goo.gl/maps/mTboTuawoGMoeBZs7");
                break;
            case "363 - Joaquina":
                WebView.loadUrl("https://goo.gl/maps/kDq7N7N3RLL6fLyS8");
                break;
            case "364 - Osni Ortiga":
                WebView.loadUrl("https://goo.gl/maps/z1K2CoovpVtHYY836");
                break;
            case "365 - Sambaqui":
                WebView.loadUrl("https://goo.gl/maps/DBogBLxGZAnuVZ9w5");
                break;
            case "366 - Barra do Sambaqui via Padre Rohr":
                WebView.loadUrl("https://goo.gl/maps/SmY2Q95fsMZQV6Bu5");
                break;
            case "410 - TIRIO-TICEN Direto":
                WebView.loadUrl("https://goo.gl/maps/m1STSJdp5V3RFrRu9");
                break;
            case "4120 - Executivo Pântano do Sul via Eucaliptos":
                WebView.loadUrl("https://goo.gl/maps/LLqSntjs53di8atN9");
                break;
            case "4121 - Executivo Pântano do Sul via Campeche":
                WebView.loadUrl("https://goo.gl/maps/eDj37E9X3dhcRjQB7");
                break;
            case "4122 - Executivo Campeche":
                WebView.loadUrl("https://goo.gl/maps/DKoUbaY1gTBpBEyX9");
                break;
            case "4123 - Executivo Ribeirão da Ilha":
                WebView.loadUrl("https://goo.gl/maps/T79zDX7rSF63otMx5");
                break;
            case "4124 - Executivo Caieira Barra do Sul via Tapera":
                WebView.loadUrl("https://goo.gl/maps/bMF3V2Y9j5wdrSLF6");
                break;
            case "4125 - Executivo Pântano do Sul via Gramal":
                WebView.loadUrl("https://goo.gl/maps/tYVDwNTZtDRmGnXh8");
                break;
            case "430 - TIRIO-TICEN via Costeira":
                WebView.loadUrl("https://goo.gl/maps/34kTx5dE8SdrxVhb8");
                break;
            case "431 - TICEN-Aeroporto":
                WebView.loadUrl("https://goo.gl/maps/tyABrvBjKyD9GEzj9");
                break;
            case "460 - Porto da Lagoa":
                WebView.loadUrl("https://goo.gl/maps/WjpR5D5xwRh8Ha1u9");
                break;
            case "461 - Tapera via Túnel":
                WebView.loadUrl("https://goo.gl/maps/FqpvmPGmNViDtQ497");
                break;
            case "462 - Campeche":
                WebView.loadUrl("https://goo.gl/maps/JTu42HnZyM7rVSkT8");
                break;
            case "463 - Castanheiras via Eucaliptos":
                WebView.loadUrl("https://goo.gl/maps/Hyo6mmb1PLBs2Piq6");
                break;
            case "464 - Castanheiras via Gramal":
                WebView.loadUrl("https://goo.gl/maps/mxK7pftcvDxLag366");
                break;
            case "467 - Tapera/Saco dos Limões":
                WebView.loadUrl("https://goo.gl/maps/SVtN4sLsJuDA16SA8");
                break;
            case "468 - TIRIO-Aeroporto via Carianos":
                WebView.loadUrl("https://goo.gl/maps/QzzDELYLSnBWwrJU9");
                break;
            case "469 - Tapera-Rio Tavares":
                WebView.loadUrl("https://goo.gl/maps/VctQwjcLkwEE7MPMA");
                break;
            case "470 - Tapera-TITRI":
                WebView.loadUrl("https://goo.gl/maps/X6aZDWZ2EBWzrUKK7");
                break;
            case "472 - Campeche via Capela":
                WebView.loadUrl("https://goo.gl/maps/fW4NtCTXNbKNgKSQ6");
                break;
            case "473 - Morro das Pedras via Eucaliptos":
                WebView.loadUrl("https://goo.gl/maps/hSr8g8FPfucUzi95A");
                break;
            case "474 - Morro das Pedras via Gramal":
                WebView.loadUrl("https://goo.gl/maps/KZpj8NY4yyUXk7Mm7");
                break;
            case "477 - TIRIO-Aeroporto via Tapera":
                WebView.loadUrl("https://goo.gl/maps/8Wo1azHzY3Zzuknb7");
                break;
            case "500 - Madrugadão Sul":
                WebView.loadUrl("https://goo.gl/maps/6tMjwaR5Djw2a1eo7");
                break;
            case "561 - Caeira Barra do Sul":
                WebView.loadUrl("https://goo.gl/maps/ZnxMwykKgTLVwcrNA");
                break;
            case "562 - Costa de Cima":
                WebView.loadUrl("https://goo.gl/maps/34enfeJ4ffvooPGX7");
                break;
            case "563 - Costa de Dentro":
                WebView.loadUrl("https://goo.gl/maps/1TzvRNg3BznpzHma7");
                break;
            case "564 - Pântano do Sul":
                WebView.loadUrl("https://goo.gl/maps/1h6yDH6NDtwW1Vte8");
                break;
            case "565 - Ribeirão da Ilha":
                WebView.loadUrl("https://goo.gl/maps/6V6pHqnQu3YVAHjn9");
                break;
            case "566 - Caeira via Tapera":
                WebView.loadUrl("https://goo.gl/maps/szcw96PiZf9FcYx2A");
                break;
            case "600 - Madrugadão Continente":
                WebView.loadUrl("https://goo.gl/maps/JwhjzmLDAyx1H5oZ9");
                break;
            case "601 - Circular Abraão-Estreito":
                WebView.loadUrl("https://goo.gl/maps/7gsEzvJjHRQzS1iZA");
                break;
            case "605 - Circular Estreito-Abraão":
                WebView.loadUrl("https://goo.gl/maps/2qSotepFPbGQAMau6");
                break;
            case "6220 - Executivo Abraão":
                WebView.loadUrl("https://goo.gl/maps/hZDwsFpvqvzkJfdZ8");
                break;
            case "630 - Corredor Continente":
                WebView.loadUrl("https://goo.gl/maps/WiHG3jwHVthYPhx18");
                break;
            case "631 - Capoeiras":
                WebView.loadUrl("https://goo.gl/maps/ytmP1NVNqupkTTuw6");
                break;
            case "660 - Aracy Vaz Callado":
                WebView.loadUrl("https://goo.gl/maps/HK48fhxDLBU2YWX56");
                break;
            case "661 - Balneário":
                WebView.loadUrl("https://goo.gl/maps/LPYQiPbxpcqT5cZq8");
                break;
            case "663 - Coloninha":
                WebView.loadUrl("https://goo.gl/maps/XNDvgqDHs5hkD9GF7");
                break;
            case "664 - Itaguaçu":
                WebView.loadUrl("https://goo.gl/maps/W59E8htqobCcdNV18");
                break;
            case "665 - Abraão":
                WebView.loadUrl("https://goo.gl/maps/k5ZnZ4J1z4PHnCgw6");
                break;
            case "668 - Promorar via Ivo Silveira":
                WebView.loadUrl("https://goo.gl/maps/zoRue5hKZpXmeNoZ6");
                break;
            case "670 - Monte Cristo":
                WebView.loadUrl("https://goo.gl/maps/qGCRh1rvqYHp5TZA8");
                break;
            case "671 - Vila/Promorar":
                WebView.loadUrl("https://goo.gl/maps/WjFtYKm7kYYWraz97");
                break;
            case "672 - Monte Cristo via Escola Edith Gama Ramos":
                WebView.loadUrl("https://goo.gl/maps/EagNZU5HTZmzHypY6");
                break;
            case "760 - Morro do Geraldo":
                WebView.loadUrl("https://goo.gl/maps/YCZbugDbHeE37FD48");
                break;
            case "761 - Vila Aparecida":
                WebView.loadUrl("https://goo.gl/maps/39Sz3j4BHjB1WSDo7");
                break;
            case "762 - Ângelo Laporta":
                WebView.loadUrl("https://goo.gl/maps/oHq5yvdaVLodmkx28");
                break;
            case "763 - Caeira Saco dos Limões":
                WebView.loadUrl("https://goo.gl/maps/YmYD71MvmzB1YXu4A");
                break;
            case "764 - Monte Serrat":
                WebView.loadUrl("https://goo.gl/maps/gG9fMZVdRVHnLxhZA");
                break;
            case "765 - Morro da Queimada":
                WebView.loadUrl("https://goo.gl/maps/6W1mD3tjqGQeNaTL7");
                break;
            case "766 - Morro do 25":
                WebView.loadUrl("https://goo.gl/maps/rD3sb4SC4h7AAjeA6");
                break;
            case "768 - Morro do Horácio":
                WebView.loadUrl("https://goo.gl/maps/HLL9ZcKewGN4WwjZ6");
                break;
            case "769 - Morro Nova Trento":
                WebView.loadUrl("https://goo.gl/maps/hsFrVPR14WG81HTX8");
                break;
            case "772 - Chico Mendes":
                WebView.loadUrl("https://goo.gl/maps/h7Hb7iV6ZqkZ1h2SA");
                break;
            case "840 - TICAN-TILAG via Barra da Lagoa":
                WebView.loadUrl("https://goo.gl/maps/xuQZ72AMqauWCfdJ9");
                break;
            case "841 - TILAG-TIRIO":
                WebView.loadUrl("https://goo.gl/maps/tU3A97hnrGTQqjEH9");
                break;
            case "843 - TILAG-TIRIO via LIC":
                WebView.loadUrl("https://goo.gl/maps/ospkPsjbB7zoRNcW6");
                break;
            case "844 - Bairro de Fátima via Aracy Vaz Callado":
                WebView.loadUrl("https://goo.gl/maps/WmNe2anns55MuUAR7");
                break;
            case "845 - TILAG-TITRI via Córrego Grande":
                WebView.loadUrl("https://goo.gl/maps/95UXDTuurkoeQYCn7");
                break;
            case "846 - Cacupé":
                WebView.loadUrl("https://goo.gl/maps/ULMTsoPg538LNv596");
                break;
            case "847 - TIRIO-TITRI via UFSC":
                WebView.loadUrl("https://goo.gl/maps/74v6Mxgx7nE8jHrv6");
                break;
            case "850 - TILAG-Rio Vermelho via Cidade da Barra":
                WebView.loadUrl("https://goo.gl/maps/G7BT7NXGVs1YhW4W8");
                break;
            case "940 - Canasvieiras-Santo Antônio via Jurerê":
                WebView.loadUrl("https://goo.gl/maps/PvkWFVZyFXN57yc57");
                break;
            case "941 - Canasvieiras-Santo Antônio via Ratones":
                WebView.loadUrl("https://goo.gl/maps/sGrLH9gV4iabDeVD7");
                break;
            case "943 - Saco dos Limões-Trindade":
                WebView.loadUrl("https://goo.gl/maps/XVmGEjYcsifihHiW9");
                break;
            case "944 - Saco dos Limões-Trindade via Madre Benvenuta":
                WebView.loadUrl("https://goo.gl/maps/d4ip5ycVbGQzAG61A");
                break;
            case "946 - Jardim Atlântico-UFSC":
                WebView.loadUrl("https://goo.gl/maps/PK2Ucr1TFKvxL4cJ9");
                break;
            case "948 - Capoeiras-UFSC":
                WebView.loadUrl("https://goo.gl/maps/jFhk1cuDWwUTYmt68");
                break;
            case "949 - Abraão-UFSC":
                WebView.loadUrl("https://goo.gl/maps/kYVrCPuW9YfoboaM8");
                break;
            case "D163 - Córrego Grande Direto":
                WebView.loadUrl("https://goo.gl/maps/RsgocknBD73Uq7VM9");
                break;
            case "D168 - Monte Verde Direto":
                WebView.loadUrl("https://goo.gl/maps/povqJBymJxsNhWnp8");
                break;
            case "D174 - Saco Grande Direto":
                WebView.loadUrl("https://goo.gl/maps/edbzbjdDTRtEzWXz6");
                break;
            case "D260 - Cachoeira Direto":
                WebView.loadUrl("https://goo.gl/maps/nQFr7Ff9wa3oU7rV8");
                break;
            case "D264 - Ingleses Direto":
                WebView.loadUrl("https://goo.gl/maps/cdaYxDjaLiUWCww46");
                break;
            case "D266 - Praia Brava Direto":
                WebView.loadUrl("https://goo.gl/maps/8WB8hBgdqLu4hbDSA");
                break;
            case "D267 - Rio Vermelho Direto":
                WebView.loadUrl("https://goo.gl/maps/ZyJSFqTw8C5fcBbo8");
                break;
            case "D360 - Barra da Lagoa Direto":
                WebView.loadUrl("https://goo.gl/maps/8J8M639gox1LKySV6");
                break;
            case "D365 - Sambaqui Direto":
                WebView.loadUrl("https://goo.gl/maps/tNH5Uef7WCfQMWedA");
                break;
            case "D563 - Costa de Dentro Direto":
                WebView.loadUrl("https://goo.gl/maps/dUZBumysfC2GewRh8");
                break;
            case "D565 - Ribeirâo da Ilha Direto":
                WebView.loadUrl("https://goo.gl/maps/Kp3ygCWXTETAs2TJ6");
                break;
            case "D846 - Cacupé via Gama D'Eça Direto":
                WebView.loadUrl("https://goo.gl/maps/rwsAiKVKMPJ7oTum6");
                break;
        }

        // LINHAS BIGUAÇU
        switch(parametroNomeLinha) {
            case "Antônio Carlos-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/xk1zf33iqP94jSSJ7");
                break;
            case "Antônio Carlos-Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10500");
                break;
            case "Araucária":
                WebView.loadUrl("https://goo.gl/maps/EjgFFj3weGbvvjbb8");
                break;
            case "Armação da Piedade-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/oLZztNYWXGZr2MAD6");
                break;
            case "Avenida das Torres":
                WebView.loadUrl("https://goo.gl/maps/yownV1JtzQ8SG2iz9");
                break;
            case "Avenida das Torres-Kobrasol":
                WebView.loadUrl("https://goo.gl/maps/Lr8ecGJBbWD8unTR7");
                break;
            case "Bairro Ipiranga":
                WebView.loadUrl("https://goo.gl/maps/y6QG8h4qEpwjWxoB7");
                break;
            case "Bairro Ipiranga via Expressa":
                WebView.loadUrl("https://goo.gl/maps/ZVkzS43BkR5C4Ai48");
                break;
            case "Bairro São Pedro":
                WebView.loadUrl("https://goo.gl/maps/hU9USjaurUT7gikMA");
                break;
            case "Bairro São Pedro via Expressa":
                WebView.loadUrl("https://goo.gl/maps/ni4ZCNmGyWZToTBTA");
                break;
            case "Barreiros":
                WebView.loadUrl("https://goo.gl/maps/QsWitGfBRRyj5wpg6");
                break;
            case "Barreiros-Sede":
                WebView.loadUrl("https://goo.gl/maps/WCuwh16mX1Zcc8GCA");
                break;
            case "Bela Vista":
                WebView.loadUrl("https://goo.gl/maps/zLrz48hV4fnf74377");
                break;
            case "Bela Vista via Expressa":
                WebView.loadUrl("https://goo.gl/maps/3H9WLZMK9cjFKFC19");
                break;
            case "Bela Vista via Floresta":
                WebView.loadUrl("https://goo.gl/maps/cYTk4y2xhgErTbMt8");
                break;
            case "Bela Vista via Floresta/Expressa":
                WebView.loadUrl("https://goo.gl/maps/ryRe5CzuwYtXfm4h8");
                break;
            case "Biguaçu":
                WebView.loadUrl("https://goo.gl/maps/XThGLTv662fehA4k8");
                break;
            case "Biguaçu via Expressa":
                WebView.loadUrl("https://goo.gl/maps/enmcydt5nfnLAUhA6");
                break;
            case "Biguaçu-Palhoça":
                WebView.loadUrl("https://goo.gl/maps/YNAJHCmJSryjXsUi9");
                break;
            case "Bom Viver":
                WebView.loadUrl("https://goo.gl/maps/zSyWbcWqeUmV84d6A");
                break;
            case "Bom Viver via Expressa":
                WebView.loadUrl("https://goo.gl/maps/APgtDBD2BedqsJ6u7");
                break;
            case "Bom Viver-Biguaçu":
                WebView.loadUrl("https://goo.gl/maps/BArrcJH16jZGYRD1A");
                break;
            case "Catarina":
                WebView.loadUrl("https://goo.gl/maps/P3THQb6ZvJ6pdtY29");
                break;
            case "Ceasa via Estreito":
                WebView.loadUrl("https://goo.gl/maps/5sMZAhLRJQ1XF7SW7");
                break;
            case "Circular Barreiros":
                WebView.loadUrl("https://goo.gl/maps/nWkVS6imJhLngnwB7");
                break;
            case "Circular Biguaçu":
                WebView.loadUrl("https://goo.gl/maps/dPXn3ZLQV2Qo81Vo8");
                break;
            case "Diretão":
                WebView.loadUrl("https://goo.gl/maps/LHm41eBB2Wnsncpw8");
                break;
            case "Diretão Executivo":
                WebView.loadUrl("https://goo.gl/maps/ydBtTC1eLvb5JB3Y9");
                break;
            case "Dona Adélia":
                WebView.loadUrl("https://goo.gl/maps/mYZAqPK8qRZ27ykg8");
                break;
            case "Dona Wanda":
                WebView.loadUrl("https://goo.gl/maps/wW5RkUrNjvbykEHK6");
                break;
            case "Dona Wanda via Expressa":
                WebView.loadUrl("https://goo.gl/maps/oKLNDDqsxBy5Rhpi9");
                break;
            case "Egito-Antônio Carlos":
                WebView.loadUrl("https://goo.gl/maps/KTwMvpEqiFVp2CfLA");
                break;
            case "Estiva-Biguaçu":
                WebView.loadUrl("https://goo.gl/maps/Vgd9kyWRbT64qjQJA");
                break;
            case "Executivo Antônio Carlos":
                WebView.loadUrl("https://goo.gl/maps/GRCWiF3UYsJo97Av7");
                break;
            case "Executivo Bela Vista":
                WebView.loadUrl("https://goo.gl/maps/rVvGstq77GLijyQK9");
                break;
            case "Executivo Biguaçu":
                WebView.loadUrl("https://goo.gl/maps/WYpKv3gTTkVsZYti6");
                break;
            case "Executivo Dona Adélia":
                WebView.loadUrl("https://goo.gl/maps/Q83xkJC2jCZ2YQaf8");
                break;
            case "Executivo Dona Wanda":
                WebView.loadUrl("https://goo.gl/maps/zTfnkwrXtLcgbhe18");
                break;
            case "Executivo Gov. Celso Ramos":
                WebView.loadUrl("https://goo.gl/maps/enN3rp29WqP1SdMTA");
                break;
            case "Executivo Ipiranga":
                WebView.loadUrl("https://goo.gl/maps/bkcLtRgLLYH83cvP7");
                break;
            case "Executivo Zenaide/Barreiros via Estreito":
                WebView.loadUrl("https://goo.gl/maps/FAgdJvZb3K9QN3Rk8");
                break;
            case "Floresta via Kobrasol":
                WebView.loadUrl("https://goo.gl/maps/aDoetKvh7bgECyJN7");
                break;
            case "Floresta via Expressa":
                WebView.loadUrl("https://goo.gl/maps/UpRFEe5PDMvNjEGh8");
                break;
            case "Fundos":
                WebView.loadUrl("https://goo.gl/maps/hUZQ2K7FDgTus8Fv6");
                break;
            case "Governador Celso Ramos-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/Y5TGXHuAhXYEXeMA7");
                break;
            case "Governador Celso Ramos-Biguaçu":
                WebView.loadUrl("https://goo.gl/maps/6Jckf2ZdjRnbrpjz8");
                break;
            case "Heriberto Hulse":
                WebView.loadUrl("https://goo.gl/maps/NUiXtnCJ9W3thsLGA");
                break;
            case "Jardim Carandai":
                WebView.loadUrl("https://goo.gl/maps/TwNP6Xee1ZEXhGUz8");
                break;
            case "Jardim Cidade Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/6ro8GxHqMzCkn9zX7");
                break;
            case "Jardim das Acácias":
                WebView.loadUrl("https://goo.gl/maps/xqbvsvzGtmpxL9Bu7");
                break;
            case "Jardim Janaina":
                WebView.loadUrl("https://goo.gl/maps/HYpVorwn2e89QHj5A");
                break;
            case "Jardim Janaina via Expressa":
                WebView.loadUrl("https://goo.gl/maps/CNPWmBt6B2W2mcE47");
                break;
            case "Jardim Zanellato":
                WebView.loadUrl("https://goo.gl/maps/quoKJYhaiSXRphEx9");
                break;
            case "Jardim Zanellato via Expressa":
                WebView.loadUrl("https://goo.gl/maps/TfHQT1C1mwmVr4PZ7");
                break;
            case "José Nitro":
                WebView.loadUrl("https://goo.gl/maps/59fogL5q1JSfRnR48");
                break;
            case "Loro-Antônio Carlos":
                WebView.loadUrl("https://goo.gl/maps/SABddavYXpzD6GFL7");
                break;
            case "Palmas-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/aHZrisqirENaYJPq6");
                break;
            case "Palmas-Biguaçu":
                WebView.loadUrl("https://goo.gl/maps/J711pf15jaZPxCvD6");
                break;
            case "Prado":
                WebView.loadUrl("https://goo.gl/maps/WpdBR24cJt4EXBBL7");
                break;
            case "Praia João Rosa":
                WebView.loadUrl("https://goo.gl/maps/gv3v58skNYRNVDRh7");
                break;
            case "Rachadel-Antônio Carlos":
                WebView.loadUrl("https://goo.gl/maps/dbxc69nU4VvjEiVc7");
                break;
            case "Roçado":
                WebView.loadUrl("https://goo.gl/maps/shAcSEpSNdNwQ8jR8");
                break;
            case "Rua Santo Antônio":
                WebView.loadUrl("https://goo.gl/maps/M1SvbEoauXmFqQ9n8");
                break;
            case "Santa Maria-Antônio Carlos":
                WebView.loadUrl("https://goo.gl/maps/8qSMwvqN5m6D5Uki8");
                break;
            case "São Miguel":
                WebView.loadUrl("https://goo.gl/maps/tYaiykuERZbWbq916");
                break;
            case "Saudade":
                WebView.loadUrl("https://goo.gl/maps/Kid3pukSggPHGA6M9");
                break;
            case "Serraria-Forquilhinhas":
                WebView.loadUrl("https://goo.gl/maps/Gn1YUwt8nSvHHmde7");
                break;
            case "Shopping Center Itaguaçu":
                WebView.loadUrl("https://goo.gl/maps/dvvx9rQPV4KgdhV86");
                break;
            case "Sorocaba-Biguaçu":
                WebView.loadUrl("https://goo.gl/maps/A6YbiooDgvz3P8V36");
                break;
            case "Tijucas-Biguaçu":
                WebView.loadUrl("https://goo.gl/maps/Tz2rRLtXjWUBFDoG9");
                break;
            case "Três Riachos-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/AxTsjXmG1kvh6MHE9");
                break;
            case "Três Riachos-Biguaçu":
                WebView.loadUrl("https://goo.gl/maps/1rqcrHxygQJ1JbWw6");
                break;
        }

        // LINHAS ESTRELA
        switch(parametroNomeLinha) {
            case "Arthur Mariano-Circular Forquilhinhas":
                WebView.loadUrl("https://goo.gl/maps/QbghAuXWFJAh9W9b8");
                break;
            case "Bairro São Luiz":
                WebView.loadUrl("https://goo.gl/maps/BvWz6okXwakBHpWA9");
                break;
            case "Barreiros-Sede":
                WebView.loadUrl("https://goo.gl/maps/hHk3NhTATQkQTpNZ7");
                break;
            case "Campinas via Kobrasol":
                WebView.loadUrl("https://goo.gl/maps/ApQ15mzLbLYoPNZQ6");
                break;
            case "Campinas via Ginásio":
                WebView.loadUrl("https://goo.gl/maps/BGa1TNsyMZHWWENFA");
                break;
            case "Ceasa via Shopping":
                WebView.loadUrl("https://goo.gl/maps/QV3CCguxPLEeo1nf7");
                break;
            case "Ceniro via Jardim Palmeiras":
                WebView.loadUrl("https://goo.gl/maps/PTRA463MyagBKVXr5");
                break;
            case "Diretão":
                WebView.loadUrl("https://goo.gl/maps/HxrWQtnHHxiNXEo97");
                break;
            case "Diretão Executivo":
                WebView.loadUrl("https://goo.gl/maps/HKRB3U1L2r2CjwtW7");
                break;
            case "Executivo San Marino/Lisboa":
                WebView.loadUrl("https://goo.gl/maps/BSdnEt47eNfjgrmS8");
                break;
            case "Executivo Zenaide/Barreiros via Estreito":
                WebView.loadUrl("https://goo.gl/maps/XpDudrDQbBj8Fmsu6");
                break;
            case "Forquilhas via Los Angeles":
                WebView.loadUrl("https://goo.gl/maps/PPeLRN7WoJ9nrVG9A");
                break;
            case "Forquilhas-Kobrasol":
                WebView.loadUrl("https://goo.gl/maps/MThgLeMNLTQ8sxM6A");
                break;
            case "Forquilhinhas":
                WebView.loadUrl("https://goo.gl/maps/ThG4ML6yPZZ1CHyYA");
                break;
            case "Forquilhinhas via Rodeio/Palmares":
                WebView.loadUrl("https://goo.gl/maps/PkfoNSV1kMDQsDgG6");
                break;
            case "Kobrasol via Expressa":
                WebView.loadUrl("https://goo.gl/maps/sDQY42eZ8fRBHCbJ9");
                break;
            case "Kobrasol VIP":
                WebView.loadUrl("https://goo.gl/maps/UouXwoR7a7fpHmbQ8");
                break;
            case "Los Angeles":
                WebView.loadUrl("https://goo.gl/maps/XdhJfDnvH14Cnhj49");
                break;
            case "Lisboa":
                WebView.loadUrl("https://goo.gl/maps/K3FXCH8bsaK6mkwc8");
                break;
            case "Potecas":
                WebView.loadUrl("https://goo.gl/maps/GqoMXjxHtRWEuape8");
                break;
            case "Potecas via Santos Saraiva":
                WebView.loadUrl("https://goo.gl/maps/1BrTrj6qEkTsrGrt6");
                break;
            case "Potecas-Kobrasol":
                WebView.loadUrl("https://goo.gl/maps/wTKKeiZSkNvRKjKt6");
                break;
            case "Recanto da Natureza via Ceniro":
                WebView.loadUrl("https://goo.gl/maps/A1G9JKNngDVEr7zHA");
                break;
            case "Serraria-Forquilhinhas":
                WebView.loadUrl("https://goo.gl/maps/bwY1RnSG9Nvp7s7x7");
                break;
            case "Vila Formosa-Lisboa-Kobrasol":
                WebView.loadUrl("https://goo.gl/maps/ib9QYN1Y1TJDGMBS6");
                break;
            case "Zenaide/Santa Felicidade via Ceniro":
                WebView.loadUrl("https://goo.gl/maps/g7wFkVaXSqrqvYB8A");
                break;
        }

        // LINHAS IMPERATRIZ
        switch(parametroNomeLinha) {
            case "Águas Mornas-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/Td4qc1qiziXP7rds6");
                break;
            case "Alto Aririu-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/7UQevYqgk4k91zqX8");
                break;
            case "Aririu-Caldas":
                WebView.loadUrl("https://goo.gl/maps/d2TQMUqhZ7rvVdFWA");
                break;
            case "Caldas-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/q7BrQan127cZDWs59");
                break;
            case "Lourdes-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/X4fSV9jg7pJECDaPA");
                break;
            case "Lourdes-Santo Amaro":
                WebView.loadUrl("https://goo.gl/maps/czTfwJevTZsYaisr8");
                break;
            case "Queçaba-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/d7ivmHKq2JEZDm1y9");
                break;
            case "Santa Isabel-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/Uye2ioYKsUTeWX6XA");
                break;
            case "Santo Amaro-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/U2z7DJpDTASGP8d16");
                break;
            case "Vargem Grande-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/35AARjH1FMGnJCJF8");
                break;
        }

        // LINHAS JOTUR
        switch(parametroNomeLinha) {
            case "Aririu-Florianpolis":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1IkGF0CKFOKYDczVnpCSyTxv-iZhtloSW&usp=sharing");
                break;
            case "Barra do Aririu-Barreiros":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1O6W-G8qOEpapAHbjEkgfWOA6i5-_JxSU&usp=sharing");
                break;
            case "Barra do Aririu-Ponte do Imaruim (Circular)":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1ebQ5NNbBcLq54mF_Vu9GA-i-umCcu_QZ&usp=sharing");
                break;
            case "Barra do Aririu-Florianópolis":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1DY1pr3Vqu3X4YgmijFFE3jGixBxZ90NA&usp=sharing");
                break;
            case "Bela Vista-Ponte do Imaruim":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1jnK6edkYjFnwMNyYWQ22IAGzKvAFwaKR&usp=sharing");
                break;
            case "Bela Vista-Florianópolis":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=19z3gam1h_AqBzzGJ53zNzWYzTwXcryGI&usp=sharing");
                break;
            case "Caminho Novo/Terra Nova-Palhoça":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1iHUdChAQkyeacBt2xS5_5CWj4JPoqhyM&usp=sharing");
                break;
            case "Caminho Novo/Terra Nova-Florianópolis":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1HyAzCf0EaTLtO7pxt4K3xhQSHBDJ1gSn&usp=sharing");
                break;
            case "Cidade Univercitária - Interbairros (Circular)":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1jqxI5s8SirqLOV0R-6sWNnsq_VHXnsWJ&usp=sharing");
                break;
            case "Diretão":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1ULgdQ3NTpmSz5jFQPdUEkNwhls3VJRgp&usp=sharing");
                break;
            case "Enseada do Brito-Ponte do Imaruim":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1q7mArkAeNgLP3jPNmnttWmRvY4oMoYMP&usp=sharing");
                break;
            case "Guarda do Cubatão-Ponte do Imaruim":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1DMEt0XbiINe47Riolpe6dnFpH9vCaSAJ&usp=sharing");
                break;
            case "Guarda do Cubatão-Ponte do Imaruim (Circular)":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1tujm4UazhyJAwfCekjLtqCxGWOLBhzlZ&usp=sharing");
                break;
            case "Guarda do Cubatão-Florianópolis":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1WTSHoaql24dfpwGaLJ2aXRZ4mTrHU8RT&usp=sharing");
                break;
            case "Interbairros (Bela Vista/Passa Vinte)":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1hUUrzIfclRjAVc9_gYh1K1K_qB4SP6bn&usp=sharing");
                break;
            case "Madri-Palhoça":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1YZLzDV1oQwkYty-tBxd2_N1unuOdxrT5&usp=sharing");
                break;
            case "Palhoça-Biguaçu":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1oRsRhJQfoY-s8ddoO5vLyKnnEtCirqv7&usp=sharing");
                break;
            case "Pinheira-Ponte do Imaruim":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1qz8iL26FdyZ36UWVoUkBwF2ot4ra0_-F&usp=sharing");
                break;
            case "São José-Florianópolis":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1XoFJxFpmgZwVAIDz3rX-gQ8LZU8VLNGO&usp=sharing");
                break;
            case "São Sebastião-Palhoça":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1La_4btc_8Hp5WG4Ww3qRruxgJ5SyZqOS&usp=sharing");
                break;
            case "São Sebastião-Florianópolis":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1ZP6mLGN6tYrfZTyRO8qy_QQXjT_gLh3A&usp=sharing");
                break;
            case "Unisul-Ponte do Imaruim":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1m8AY2DJYVYrIknn2DqiwIh7IfzG2EV1Y&usp=sharing");
                break;
        }

        // LINHAS SANTA TEREZINHA
        switch(parametroNomeLinha) {
            case "Angelina-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/Aa4BHCXbjN9ESq278");
                break;
            case "Flor de Nápolis-Florianópolis":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=16vtbDvij3_Z5fK-0PerDnRS0fMeIw7gh&usp=sharing");
                break;
            case "Jardim Pinheiros-Kobrasol":
                WebView.loadUrl("https://goo.gl/maps/XUQz9CadFZfE8bw88");
                break;
            case "Santana-Florianópolis":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1RANGZ8Mthj3qTwJPZVfUxKulRGWRI_F-&usp=sharing");
                break;
            case "Santana-Kobrasol":
                WebView.loadUrl("https://goo.gl/maps/nCJwKBSZ3jbqYGym8");
                break;
            case "São Pedro de Alcântara-Florianópolis":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1iRvEZOUFv0Zgtj9ZGAtSX3-ahfy69sNh&usp=sharing");
                break;
            case "Sertão do Maruim-Florianópolis":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=16zKiFMnSm90kpeqDNB5TvpSpM-rzSRTe&usp=sharing");
                break;
            case "Vila Formosa-Florianópolis":
                WebView.loadUrl("https://goo.gl/maps/KL3pnUvjntiZqvFj9");
                break;
        }

    }

}