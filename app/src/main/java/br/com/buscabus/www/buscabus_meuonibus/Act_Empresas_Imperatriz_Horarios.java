package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;

public class Act_Empresas_Imperatriz_Horarios extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__empresas__imperatriz__horarios);

        // Comandos para o WebView
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeLinha = (String) intent.getSerializableExtra("Nome da Linha");

        // Parametro para exibir Mapa
        switch(parametroNomeLinha) {
            case "Águas Mornas-Florianópolis":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6240-aguas-mornas-florianopolis/50");
                break;
            case "Alto Aririu-Florianópolis via BR 101/Expressa":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6281-alto-aririu-florianopolis/6281");
                break;
            case "Aririu-Caldas":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/681-aririu-caldas-da-imperatriz/681");
                break;
            case "Caldas-Florianópolis":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/680-florianopolis-caldas-da-imperatriz/680");
                break;
            case "Caldas-Florianópolis via B. São Francisco":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/682-florianopolis-caldas-da-imperatriz/682");
                break;
            case "Caldas-Florianópolis via BR 101/Expressa":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/683-florianopolis-caldas-da-imperatriz/683");
                break;
            case "Capela/Alto Aririu-Florianópolis":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6282-capela-alto-aririu-florianopolis/6282");
                break;
            case "Capela/Alto Aririu-Florianópolis via BR 101/Expressa":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6283-florianopolis-capela-alto-aririu/6280");
                break;
            case "Lourdes-Florianópolis":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/970-lourdes-2-florianopolis/970");
                break;
            case "Lourdes-Santo Amaro":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6290-lourdes-2-s-a-imperatriz/6290");
                break;
            case "Queçaba-Florianópolis":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/660-quecaba-florianopolis/660");
                break;
            case "Santa Isabel-Florianópolis":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/830-santa-isabel-florianopolis/830");
                break;
            case "Santo Amaro-Florianópolis":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/670-s-a-imperatriz-florianopolis/670");
                break;
            case "Santo Amaro-Florianópolis via B. São Francisco":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/671-s-a-imperatriz-florianopolis/671");
                break;
            case "Santo Amaro-Florianópolis via BR 101/Expressa":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6261-s-a-imperatriz-florianopolis/6261");
                break;
            case "Santo Amaro-Florianópolis via BR 282/BR 101/Expressa":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6260-s-a-imperatriz-florianopolis/6260");
                break;
            case "Santo Amaro-Florianópolis via Sertão":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6271-s-a-imperatriz-florianopolis/6271");
                break;
            case "Santo Amaro-Florianópolis via Sul do Rio":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6270-s-a-imperatriz-florianopolis/6270");
                break;
            case "Vargem Grande-Florianópolis":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6250-vargem-grande-2-florianopolis/6250");
                break;
            case "Vargem Grande-Florianópolis via BR 101/Expressa":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6252-vargem-grande-2-florianopolis/6252");
                break;
        }

    }
}
