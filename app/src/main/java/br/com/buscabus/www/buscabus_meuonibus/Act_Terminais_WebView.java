package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;

public class Act_Terminais_WebView extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_terminais_web_view);

        // Comandos para o WebView
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeTerminal = (String) intent.getSerializableExtra("Nome do Terminal");

        // Parametro para exibir Mapa
        switch(parametroNomeTerminal) {
            case "TICEN":
                WebView.loadUrl("https://goo.gl/maps/YtYon8Qq92czJbHG7");
                break;
        }

    }
}