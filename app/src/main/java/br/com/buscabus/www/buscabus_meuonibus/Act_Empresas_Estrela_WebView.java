package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Act_Empresas_Estrela_WebView extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_empresas_estrela_webview);

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
        
        // Ação do botão Mapa
        Btn_Mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (parametroNomeLinha) {
                    case "Arthur Mariano-Circular Forquilhinhas":
                        Intent linha1050 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha1050.putExtra("Nome da Linha", "Arthur Mariano-Circular Forquilhinhas");
                        startActivity(linha1050);
                        break;
                    case "Bairro São Luiz":
                        Intent linha1420 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha1420.putExtra("Nome da Linha", "Bairro São Luiz");
                        startActivity(linha1420);
                        break;
                    case "Barreiros-Sede":
                        Intent linha110 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha110.putExtra("Nome da Linha", "Barreiros-Sede");
                        startActivity(linha110);
                        break;
                    case "Campinas":
                        Intent linha3170 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha3170.putExtra("Nome da Linha", "Campinas");
                        startActivity(linha3170);
                        break;
                    case "Campinas via Ginásio":
                        Intent linha3171 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha3171.putExtra("Nome da Linha", "Campinas via Ginásio");
                        startActivity(linha3171);
                        break;
                    case "Ceasa via Shopping":
                        Intent linha3280 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha3280.putExtra("Nome da Linha", "Ceasa via Shopping");
                        startActivity(linha3280);
                        break;
                    case "Ceniro via Jardim Palmeiras":
                        Intent linha1310 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha1310.putExtra("Nome da Linha", "Ceniro via Jardim Palmeiras");
                        startActivity(linha1310);
                        break;
                    case "Diretão":
                        Intent linha130 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha130.putExtra("Nome da Linha", "Diretão");
                        startActivity(linha130);
                        break;
                    case "Diretão Executivo":
                        Intent linha140 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha140.putExtra("Nome da Linha", "Diretão Executivo");
                        startActivity(linha140);
                        break;
                    case "Executivo San Marino/Lisboa":
                        Intent linha7633 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha7633.putExtra("Nome da Linha", "Executivo San Marino/Lisboa");
                        startActivity(linha7633);
                        break;
                    case "Executivo Zenaide/Barreiros via Estreito":
                        Intent linha1311 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha1311.putExtra("Nome da Linha", "Executivo Zenaide/Barreiros via Estreito");
                        startActivity(linha1311);
                        break;
                    case "Forquilhas":
                        Intent linha390 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha390.putExtra("Nome da Linha", "Forquilhas");
                        startActivity(linha390);
                        break;
                    case "Forquilhas-Kobrasol":
                        Intent linha120 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha120.putExtra("Nome da Linha", "Forquilhas-Kobrasol");
                        startActivity(linha120);
                        break;
                    case "Forquilhinhas":
                        Intent linha1170 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha1170.putExtra("Nome da Linha", "Forquilhinhas");
                        startActivity(linha1170);
                        break;
                    case "Forquilhinhas via Rodeio/Palmares":
                        Intent linha392 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha392.putExtra("Nome da Linha", "Forquilhinhas via Rodeio/Palmares");
                        startActivity(linha392);
                        break;
                    case "Kobrasol via Expressa":
                        Intent linha1410 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha1410.putExtra("Nome da Linha", "Kobrasol via Expressa");
                        startActivity(linha1410);
                        break;
                    case "Kobrasol VIP":
                        Intent linha1412 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha1412.putExtra("Nome da Linha", "Kobrasol VIP");
                        startActivity(linha1412);
                        break;
                    case "Los Angeles":
                        Intent linha7630 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha7630.putExtra("Nome da Linha", "Los Angeles");
                        startActivity(linha7630);
                        break;
                    case "Lisboa":
                        Intent linha7631 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha7631.putExtra("Nome da Linha", "P.R.Lisboa");
                        startActivity(linha7631);
                        break;
                    case "Potecas":
                        Intent linha200 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha200.putExtra("Nome da Linha", "Potecas");
                        startActivity(linha200);
                        break;
                    case "Potecas via Santos Saraiva":
                        Intent linha201 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha201.putExtra("Nome da Linha", "Potecas via Santos Saraiva");
                        startActivity(linha201);
                        break;
                    case "Potecas-Kobrasol":
                        Intent linha135 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha135.putExtra("Nome da Linha", "Potecas-Kobrasol");
                        startActivity(linha135);
                        break;
                    case "Recanto da Natureza via Ceniro":
                        Intent linha202 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha202.putExtra("Nome da Linha", "Recanto da Natureza via Ceniro");
                        startActivity(linha202);
                        break;
                    case "Serraria-Forquilhinhas":
                        Intent linha105 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha105.putExtra("Nome da Linha", "Serraria-Forquilhinhas");
                        startActivity(linha105);
                        break;
                    case "Vila Formosa-Lisboa-Kobrasol":
                        Intent linha125 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha125.putExtra("Nome da Linha", "Vila Formosa-Lisboa-Kobrasol");
                        startActivity(linha125);
                        break;
                    case "Zenaide/Santa Felicidade via Ceniro":
                        Intent linha7632 = new Intent(Act_Empresas_Estrela_WebView.this, Act_Mapas_WebView.class);
                        linha7632.putExtra("Nome da Linha", "Zenaide/Santa Felicidade via Ceniro");
                        startActivity(linha7632);
                        break;
                }

            }
        });

    }
}