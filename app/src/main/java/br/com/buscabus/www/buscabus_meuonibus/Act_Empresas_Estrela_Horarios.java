package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;

public class Act_Empresas_Estrela_Horarios extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__empresas__estrela__horarios);

        // Comandos para o WebView
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeLinha = (String) intent.getSerializableExtra("Nome da Linha");

        // Parametro para exibir Mapa
        switch(parametroNomeLinha) {
            case "Arthur Mariano-Circular Forquilhinhas":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0651.htm");
                break;
            case "Bairro São Luiz":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0142.htm");
                break;
            case "Barreiros-Sede":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/interbairros/0110.htm");
                break;
            case "Campinas":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0317.htm");
                break;
            case "Campinas via Ginásio":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/3171.htm");
                break;
            case "Ceasa via Shopping":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0328.htm");
                break;
            case "Ceniro via Jardim Palmeiras":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0131.htm");
                break;
            case "Diretão":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/interbairros/0130.htm");
                break;
            case "Diretão Executivo":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/interbairros/0140.htm");
                break;
            case "Executivo San Marino/Lisboa":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/7633.htm");
                break;
            case "Executivo Zenaide/Barreiros via Estreito":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/1311.htm");
                break;
            case "Forquilhas":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0039.htm");
                break;
            case "Forquilhas-Kobrasol":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/interbairros/0120.htm");
                break;
            case "Forquilhinhas":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0117.htm");
                break;
            case "Forquilhinhas via Rodeio/Palmares":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0392.htm");
                break;
            case "Kobrasol via Expressa":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0141.htm");
                break;
            case "Kobrasol VIP":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/1412.htm");
                break;
            case "Los Angeles":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0763.htm");
                break;
            case "Lisboa":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/7631.htm");
                break;
            case "Potecas":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0020.htm");
                break;
            case "Potecas via Santos Saraiva":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0201.htm");
                break;
            case "Potecas-Kobrasol":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/interbairros/0135.htm");
                break;
            case "Recanto da Natureza via Ceniro":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/0202.htm");
                break;
            case "Serraria-Forquilhinhas":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/interbairros/0105.htm");
                break;
            case "Vila Formosa-Lisboa-Kobrasol":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/interbairros/0125.htm");
                break;
            case "Zenaide/Santa Felicidade via Ceniro":
                WebView.loadUrl("http://insulartc.com.br/estrela/ws1/linhas/horarios/intermunicipal/7632.htm");
                break;
        }

    }
}