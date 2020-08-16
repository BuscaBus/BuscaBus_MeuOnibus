package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Act_Empresas_STerezinha_WebView extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_empresas_sterezinha_webview);

        // Comandos para o WebView
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeLinha = (String) intent.getSerializableExtra("Nome da Linha");

        // Declaração dos botão Mapa
        final Button Btn_Mapa = (Button) findViewById(R.id.Btn_Mapa);

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

        // Ação do botão Mapa
        Btn_Mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (parametroNomeLinha) {
                    case "Angelina-Florianópolis":
                        Intent linha5530 = new Intent(Act_Empresas_STerezinha_WebView.this, Act_Mapas_WebView.class);
                        linha5530.putExtra("Nome da Linha", "Angelina-Florianópolis");
                        startActivity(linha5530);
                        break;
                    case "Flor de Nápolis-Florianópolis":
                        Intent linha1750 = new Intent(Act_Empresas_STerezinha_WebView.this, Act_Mapas_WebView.class);
                        linha1750.putExtra("Nome da Linha", "Flor de Nápolis-Florianópolis");
                        startActivity(linha1750);
                        break;
                    case "Jardim Pinheiros-Kobrasol":
                        Intent linha9000 = new Intent(Act_Empresas_STerezinha_WebView.this, Act_Mapas_WebView.class);
                        linha9000.putExtra("Nome da Linha", "Jardim Pinheiros-Kobrasol");
                        startActivity(linha9000);
                        break;
                    case "Santana-Florianópolis":
                        Intent linha1780 = new Intent(Act_Empresas_STerezinha_WebView.this, Act_Mapas_WebView.class);
                        linha1780.putExtra("Nome da Linha", "Santana-Florianópolis");
                        startActivity(linha1780);
                        break;
                    case "Santana-Kobrasol":
                        Intent linha9010 = new Intent(Act_Empresas_STerezinha_WebView.this, Act_Mapas_WebView.class);
                        linha9010.putExtra("Nome da Linha", "Santana-Kobrasol");
                        startActivity(linha9010);
                        break;
                    case "São Pedro de Alcântara-Florianópolis":
                        Intent linha1770 = new Intent(Act_Empresas_STerezinha_WebView.this, Act_Mapas_WebView.class);
                        linha1770.putExtra("Nome da Linha", "São Pedro de Alcântara-Florianópolis");
                        startActivity(linha1770);
                        break;
                    case "Sertão do Maruim-Florianópolis":
                        Intent linha5540 = new Intent(Act_Empresas_STerezinha_WebView.this, Act_Mapas_WebView.class);
                        linha5540.putExtra("Nome da Linha", "Sertão do Maruim-Florianópolis");
                        startActivity(linha5540);
                        break;
                    case "Vila Formosa-Florianópolis":
                        Intent linha5541 = new Intent(Act_Empresas_STerezinha_WebView.this, Act_Mapas_WebView.class);
                        linha5541.putExtra("Nome da Linha", "Vila Formosa-Florianópolis");
                        startActivity(linha5541);
                        break;
                }

            }
        });

    }
}
