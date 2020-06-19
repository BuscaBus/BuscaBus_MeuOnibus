package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Act_Op_Map_Linh_CFenix_WebMap extends AppCompatActivity {

    private android.webkit.WebView WebView;
    private Button Btn_VerMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_op_map_linh_c_fenix_webmap);

        // Comandos para o WebView
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeLinha = (String) intent.getSerializableExtra("Nome da Linha");

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
            case "1119 - Circular Ponte Viva":
                WebView.loadUrl("https://www.consorciofenix.com.br/horarios/circular-ponte-viva,1119");
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
            case "135 - Volta ao Morro/Carvoeira Norte":
                WebView.loadUrl("https://goo.gl/maps/rQxEcecrrMLdU4s3A");
                break;
            case "136 - Volta ao Morro/Carvoeira Sul":
                WebView.loadUrl("https://goo.gl/maps/4pyUXBYp4PvV66we6");
                break;
            case "137 - Volta ao Morro/Pantanal Norte":
                WebView.loadUrl("https://goo.gl/maps/vDnndaXjUH3EgjwC8");
                break;
            case "138 - Volta ao Morro/Pantanal Sul":
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
            case "183 - Corredor Sudoeste":
                WebView.loadUrl("https://goo.gl/maps/Rz9SvffqYNzsug3v7");
                break;
            case "184 - UDESC via Beira Mar":
                WebView.loadUrl("https://goo.gl/maps/QyFTqPLRLDw6oQvC7");
                break;
            case "185 - UFSC Semidireto":
                WebView.loadUrl("https://goo.gl/maps/Phagd4J4xLEKuGmc7");
                break;
            case "186 - Corredor Sudoeste Semidireto":
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
            case "260 - Cachoeira":
                WebView.loadUrl("https://goo.gl/maps/17GVEeKBr5pSwW4i9");
                break;
            case "261 - Capivari via Graciliano Gomes":
                WebView.loadUrl("https://goo.gl/maps/CvCgCHQ2spqtHfep6");
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
            case "468 - TIRIO-Aeroporto":
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
            case "477 - Circular Tapera-Aeroporto-Carianos":
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
            case "840 - TICAN-TILAG via Cidade da Barra":
                WebView.loadUrl("https://goo.gl/maps/xuQZ72AMqauWCfdJ9");
                break;
            case "841 - TILAG-TIRIO":
                WebView.loadUrl("https://goo.gl/maps/tU3A97hnrGTQqjEH9");
                break;
            case "843 - TILAG-TIRIO via LIC":
                WebView.loadUrl("https://goo.gl/maps/ospkPsjbB7zoRNcW6");
                break;
            case "844 - Bairro de Fátima":
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
    }

}