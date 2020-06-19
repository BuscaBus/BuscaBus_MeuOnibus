package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;

public class Act_Op_Hor_Linh_STerezinha_WebHor extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_op_hor_linh_sterezinha_webhor);

        // Comandos para o WebView
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeLinha = (String) intent.getSerializableExtra("Nome da Linha");

        // Parametro para exibir Mapa
        switch(parametroNomeLinha) {
            case "Angelina-Florianópolis":
                WebView.loadUrl("http://www.santaterezinha.com/?area=linhas&id=21");
                break;
            case "Flor de Nápolis-Florianópolis":
                WebView.loadUrl("http://www.santaterezinha.com/?area=linhas&id=5");
                break;
            case "Jardim Pinheiros-Kobrasol":
                WebView.loadUrl("http://www.santaterezinha.com/?area=linhas&id=23");
                break;
            case "Picadas do Sul-Florianópolis":
                WebView.loadUrl("http://www.santaterezinha.com/?area=linhas&id=26");
                break;
            case "Santana-Florianópolis":
                WebView.loadUrl("http://www.santaterezinha.com/?area=linhas&id=7");
                break;
            case "Santana-Kobrasol":
                WebView.loadUrl("http://www.santaterezinha.com/?area=linhas&id=4");
                break;
            case "São Pedro de Alcântara-Florianópolis":
                WebView.loadUrl("http://www.santaterezinha.com/?area=linhas&id=6");
                break;
            case "Sertão do Maruim-Florianópolis":
                WebView.loadUrl("http://www.santaterezinha.com/?area=linhas&id=25");
                break;
            case "Vila Formosa-Florianópolis":
                WebView.loadUrl("http://www.santaterezinha.com/?area=linhas&id=8");
                break;
        }

    }
}