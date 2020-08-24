package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Act_Empresas_Imperatriz_WebView extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_empresas_imperatriz_webview);

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
            case "Águas Mornas-Florianópolis":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus");
                break;
            case "Alto Aririu-Florianópolis":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6281-alto-aririu-florianopolis/6280");
                break;
            case "Alto Aririu-Florianópolis via BR 101":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6281-alto-aririu-florianopolis/6281");
                break;
            case "Alto Aririu-Florianópolis via Capela":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6282-capela-alto-aririu-florianopolis/6282");
                break;
            case "Alto Aririu-Florianópolis via Capela/BR 101":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6283-florianopolis-capela-alto-aririu/6280");
                break;
            case "Aririu-Caldas":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/681-aririu-caldas-da-imperatriz/681");
                break;
            case "Caldas-Florianópolis":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus");
                break;
            case "Caldas-Florianópolis via B. São Francisco":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/682-florianopolis-caldas-da-imperatriz/682");
                break;
            case "Caldas-Florianópolis via BR 101":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/683-florianopolis-caldas-da-imperatriz/683");
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
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus");
                break;
            case "Santo Amaro-Florianópolis via B. São Francisco":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/671-s-a-imperatriz-florianopolis/671");
                break;
            case "Santo Amaro-Florianópolis via B. São Francisco/BR 101":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/671-s-a-imperatriz-florianopolis/6262");
                break;
            case "Santo Amaro-Florianópolis via BR 101":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6261-s-a-imperatriz-florianopolis/6261");
                break;
            case "Santo Amaro-Florianópolis via BR 282":
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
            case "Vargem Grande-Florianópolis via BR 101":
                WebView.loadUrl("http://www.avimperatriz.com.br/site/horariosDeOnibus/6252-vargem-grande-2-florianopolis/6252");
                break;
        }

        // Ação do botão Mapa
        Btn_Mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (parametroNomeLinha) {
                    case "Águas Mornas-Florianópolis":
                        Intent linha6240 = new Intent(Act_Empresas_Imperatriz_WebView.this, Act_Mapas_WebView.class);
                        linha6240.putExtra("Nome da Linha", "Águas Mornas-Florianópolis");
                        startActivity(linha6240);
                        break;
                    case "Alto Aririu-Florianópolis":
                        Intent linha6280 = new Intent(Act_Empresas_Imperatriz_WebView.this, Act_Mapas_WebView.class);
                        linha6280.putExtra("Nome da Linha", "Alto Aririu-Florianópolis");
                        startActivity(linha6280);
                        break;
                    case "Aririu-Caldas":
                        Intent linha681 = new Intent(Act_Empresas_Imperatriz_WebView.this, Act_Mapas_WebView.class);
                        linha681.putExtra("Nome da Linha", "Aririu-Caldas");
                        startActivity(linha681);
                        break;
                    case "Caldas-Florianópolis":
                        Intent linha680 = new Intent(Act_Empresas_Imperatriz_WebView.this, Act_Mapas_WebView.class);
                        linha680.putExtra("Nome da Linha", "Caldas-Florianópolis");
                        startActivity(linha680);
                        break;
                    case "Lourdes-Florianópolis":
                        Intent linha970 = new Intent(Act_Empresas_Imperatriz_WebView.this, Act_Mapas_WebView.class);
                        linha970.putExtra("Nome da Linha", "Lourdes-Florianópolis");
                        startActivity(linha970);
                        break;
                    case "Lourdes-Santo Amaro":
                        Intent linha6290 = new Intent(Act_Empresas_Imperatriz_WebView.this, Act_Mapas_WebView.class);
                        linha6290.putExtra("Nome da Linha", "Lourdes-Santo Amaro");
                        startActivity(linha6290);
                        break;
                    case "Queçaba-Florianópolis":
                        Intent linha660 = new Intent(Act_Empresas_Imperatriz_WebView.this, Act_Mapas_WebView.class);
                        linha660.putExtra("Nome da Linha", "Queçaba-Florianópolis");
                        startActivity(linha660);
                        break;
                    case "Santa Isabel-Florianópolis":
                        Intent linha830 = new Intent(Act_Empresas_Imperatriz_WebView.this, Act_Mapas_WebView.class);
                        linha830.putExtra("Nome da Linha", "Santa Isabel-Florianópolis");
                        startActivity(linha830);
                        break;
                    case "Santo Amaro-Florianópolis":
                        Intent linha670 = new Intent(Act_Empresas_Imperatriz_WebView.this, Act_Mapas_WebView.class);
                        linha670.putExtra("Nome da Linha", "Santo Amaro-Florianópolis");
                        startActivity(linha670);
                        break;
                    case "Vargem Grande-Florianópolis":
                        Intent linha6250 = new Intent(Act_Empresas_Imperatriz_WebView.this, Act_Mapas_WebView.class);
                        linha6250.putExtra("Nome da Linha", "Vargem Grande-Florianópolis");
                        startActivity(linha6250);
                        break;
                }

            }
        });

    }
}