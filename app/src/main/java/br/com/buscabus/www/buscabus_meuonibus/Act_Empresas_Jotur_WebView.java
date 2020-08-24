package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Act_Empresas_Jotur_WebView extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_empresas_jotur_webview);

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
            case "Albardão-Estação Palhoça":
                WebView.loadUrl("https://www.google.com/maps/d/edit?mid=1O6W-G8qOEpapAHbjEkgfWOA6i5-_JxSU&usp=sharing");
                break;
            case "Alto Aririu-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/alto-aririu-e-loteamento-schutz-estacao-palhoca,2o");
                break;
            case "Aririu Formiga-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/aririu-formiga-estacao-palhoca,14");
                break;
            case "Aririu Formiga-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/aririu-formiga-florianopolis,11");
                break;
            case "Aririu-Florianpolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/aririu-florianopolis,1c");
                break;
            case "Bairro São Luiz-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/sao-jose,2/bairro-sao-luiz-florianopolis,26");
                break;
            case "Barra do Aririu-Barreiros":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/barra-do-aririu-barreiros-paradora,m");
                break;
            case "Barra do Aririu-Ponte do Imaruim (Circular)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/barra-do-aririu-estacao-palhoca-circular,10");
                break;
            case "Barra do Aririu-Estação Palhoça via Rio Grande":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/barra-do-aririu-estacao-palhoca-via-rg,o");
                break;
            case "Barra do Aririu-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/barra-do-aririu-florianopolis,7");
                break;
            case "Barra do Aririu-Hospital Regional":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/barra-do-aririu-hospital-regional-paradora,n");
                break;
            case "Bela Vista-Ponte do Imaruim":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/bela-vista-estacao-palhoca,1e");
                break;
            case "Bela Vista-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/bela-vista-florianopolis,19");
                break;
            case "Caminho Novo/Terra Nova-Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/caminho-novo-terra-nova-estacao-palhoca,2e");
                break;
            case "Caminho Novo/Terra Nova-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/caminho-novo-terra-nova-florianopolis,2h");
                break;
            case "Circulares Região Sul (Escolar)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/circulares-municipais-escolar-da-regiao-sul-de-palhoca,30");
                break;
            case "Cidade Univercitária - Interbairros (Circular)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/cidade-universitaria-interbairros-circular-via-unisul-jardim-aquarius-jardim-eldorado,1q");
                break;
            case "Diretão":
                WebView.loadUrl("https://www.jotur.com.br/horarios/sao-jose,2/barreiros-sao-jose-diretao,20");
                break;
            case "Diretão Executivo":
                WebView.loadUrl("https://www.jotur.com.br/horarios/sao-jose,2/barreiros-sao-jose-diretao-executivo,21");
                break;
            case "Enseada do Brito (Escolar)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/enseada-do-brito-escolar,45");
                break;
            case "Enseada do Brito-Ponte do Imaruim":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/enseada-do-brito-estacao-palhoca,2n");
                break;
            case "Enseada do Brito-Florianópolis (Executivo)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/enseada-do-brito-florianopolis-executivo,48");
                break;
            case "Estação Palhoça-Área Industrial (Circular)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/estacao-palhoca-area-industrial-shopping-continente-circular,2r");
                break;
            case "Estação Palhoça-Jardim Aquárius (Circular)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/estacao-palhoca-jardim-aquarius-circular,1r");
                break;
            case "Estação Palhoça-Jardim Eldorado (Circular)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/estacao-palhoca-jardim-eldorado-circular,1q");
                break;
            case "Estação Palhoça-Ponte do Imaruim (Circular)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/estacao-palhoca-ponte-do-imaruim-circular,1u");
                break;
            case "Estação Palhoça-Ponte Hercílio Luz":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/estacao-palhoca-ponte-hercilio-luz,a");
                break;
            case "Estação Palhoça-São José (Roçado)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/estacao-palhoca-sao-jose-rocado,v");
                break;
            case "Estação Palhoça-TICEN (Expresso)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/estacao-palhoca-florianopolis-expresso,4");
                break;
            case "Estação Palhoça-TICEN via BR 101":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/estacao-palhoca-florianopolis-br-101-paradora,2l");
                break;
            case "Estação Palhoça-TICEN via P.Imaruim":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/estacao-palhoca-florianopolis-paradora,6");
                break;
            case "Fazenda Jomar-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/fazenda-jomar-estacao-palhoca,42");
                break;
            case "Florianópolis-Unisul":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/florianopolis-unisul,1s");
                break;
            case "Forquilhas-São José":
                WebView.loadUrl("https://www.jotur.com.br/horarios/sao-jose,2/forquilhas-sao-jose,22");
                break;
            case "Guarda do Cubatão-Ponte do Imaruim":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/guarda-do-cubatao-estacao-palhoca,13");
                break;
            case "Guarda do Cubatão-Ponte do Imaruim (Circular)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/guarda-do-cubatao-estacao-palhoca-circular,15");
                break;
            case "Guarda do Cubatão-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/guarda-do-cubatao-florianopolis,12");
                break;
            case "Hospital Regional-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/sao-jose,2/praia-comprida-hospital-regional-florianopolis,27");
                break;
            case "Interbairros (Bela Vista/Passa Vinte)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/interbairros,4b");
                break;
            case "Irineu Comelli-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/sao-jose,2/irineu-comelli-florianopolis,28");
                break;
            case "Jaqueira-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/jaqueira-florianopolis,1d");
                break;
            case "Jardim Aquárius-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/jardim-aquarius-florianopolis,1p");
                break;
            case "Jardim Eldorado-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/jardim-eldorado-florianopolis,1o");
                break;
            case "Kobrasol-Área Industrial":
                WebView.loadUrl("https://www.jotur.com.br/horarios/sao-jose,2/kobrasol-area-industrial,23");
                break;
            case "Laranjeiras-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/laranjeiras-estacao-palhoca,p");
                break;
            case "Madri/Caminho Novo-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/madri-caminho-novo-florianopolis,2g");
                break;
            case "Madri-Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/madri-via-pagani-estacao-palhoca,1k");
                break;
            case "Madri-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/madri-via-pagani-florianopolis,44");
                break;
            case "Pachecos-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/pachecos-estacao-palhoca,q");
                break;
            case "Pachecos-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/pachecos-florianopolis,8");
                break;
            case "Palhoça-Biguaçu":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/palhoca-biguacu,2j");
                break;
            case "Palhoça-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/palhoca-florianopolis-paradora,2");
                break;
            case "Palhoça-Florianópolis (Executivo)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/palhoca-florianopolis-executivo,t");
                break;
            case "Pedra Branca-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/pedra-branca-florianopolis,l");
                break;
            case "Pinheira-Enseada do Brito (Escolar)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/pinheira-enseada-do-brito-escolar,35");
                break;
            case "Pinheira-Ponte do Imaruim":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/pinheira-estacao-palhoca,2q");
                break;
            case "Pinheira-Florianópolis (Executivo)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/pinheira-florianopolis-executivo,46");
                break;
            case "Ponta de Baixo-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/sao-jose,2/ponta-de-baixo-florianopolis,29");
                break;
            case "São José-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/sao-jose,2/sao-jose-florianopolis-circular,2a");
                break;
            case "São Sebastião-Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/sao-sebastiao-estacao-palhoca,1i");
                break;
            case "São Sebastião-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/sao-sebastiao-florianopolis,1g");
                break;
            case "São Sebastião-São José (Roçado)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/sao-sebastiao-sao-jose-rocado,1h");
                break;
            case "Serraria-Forquilhinhas":
                WebView.loadUrl("https://www.jotur.com.br/horarios/sao-jose,2/serraria-forquilhinha,24");
                break;
            case "Terra Nova-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/terra-nova-via-bela-vista-estacao-palhoca,1f");
                break;
            case "Unisul-Ponte do Imaruim":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/unisul-estacao-palhoca,1t");
                break;
            case "Vila Nova-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/vila-nova-estacao-palhoca,r");
                break;
            case "Vila Nova-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/vila-nova-florianopolis,9");
                break;
        }

        // Ação do botão Mapa
        Btn_Mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (parametroNomeLinha) {
                    case "Aririu-Florianpolis":
                        Intent linha0355 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha0355.putExtra("Nome da Linha", "Aririu-Florianpolis");
                        startActivity(linha0355);
                        break;
                    case "Barra do Aririu-Barreiros":
                        Intent linha0270 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha0270.putExtra("Nome da Linha", "Barra do Aririu-Barreiros");
                        startActivity(linha0270);
                        break;
                    case "Barra do Aririu-Ponte do Imaruim (Circular)":
                        Intent linha213 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha213.putExtra("Nome da Linha", "Barra do Aririu-Ponte do Imaruim (Circular)");
                        startActivity(linha213);
                        break;
                    case "Barra do Aririu-Florianópolis":
                        Intent linha0361 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha0361.putExtra("Nome da Linha", "Barra do Aririu-Florianópolis");
                        startActivity(linha0361);
                        break;
                    case "Bela Vista-Ponte do Imaruim":
                        Intent linha403 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha403.putExtra("Nome da Linha", "Bela Vista-Ponte do Imaruim");
                        startActivity(linha403);
                        break;
                    case "Bela Vista-Florianópolis":
                        Intent linha7161 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha7161.putExtra("Nome da Linha", "Bela Vista-Florianópolis");
                        startActivity(linha7161);
                        break;
                    case "Caminho Novo/Terra Nova-Palhoça":
                        Intent linha543 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha543.putExtra("Nome da Linha", "Caminho Novo/Terra Nova-Palhoça");
                        startActivity(linha543);
                        break;
                    case "Caminho Novo/Terra Nova-Florianópolis":
                        Intent linha0280 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha0280.putExtra("Nome da Linha", "Caminho Novo/Terra Nova-Florianópolis");
                        startActivity(linha0280);
                        break;
                    case "Cidade Univercitária - Interbairros (Circular)":
                        Intent linha620 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha620.putExtra("Nome da Linha", "Cidade Univercitária - Interbairros (Circular)");
                        startActivity(linha620);
                        break;
                    case "Diretão":
                        Intent linha018 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha018.putExtra("Nome da Linha", "Diretão");
                        startActivity(linha018);
                        break;
                    case "Enseada do Brito-Ponte do Imaruim":
                        Intent linha013 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha013.putExtra("Nome da Linha", "Enseada do Brito-Ponte do Imaruim");
                        startActivity(linha013);
                        break;
                    case "Guarda do Cubatão-Ponte do Imaruim":
                        Intent linha303 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha303.putExtra("Nome da Linha", "Guarda do Cubatão-Ponte do Imaruim");
                        startActivity(linha303);
                        break;
                    case "Guarda do Cubatão-Ponte do Imaruim (Circular)":
                        Intent linha323 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha323.putExtra("Nome da Linha", "Guarda do Cubatão-Ponte do Imaruim (Circular)");
                        startActivity(linha323);
                        break;
                    case "Guarda do Cubatão-Florianópolis":
                        Intent linha0350 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha0350.putExtra("Nome da Linha", "Guarda do Cubatão-Florianópolis");
                        startActivity(linha0350);
                        break;
                    case "Interbairros (Bela Vista/Passa Vinte)":
                        Intent linha101 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha101.putExtra("Nome da Linha", "Interbairros (Bela Vista/Passa Vinte)");
                        startActivity(linha101);
                        break;
                    case "Madri-Palhoça":
                        Intent linha533 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha533.putExtra("Nome da Linha", "Madri-Palhoça");
                        startActivity(linha533);
                        break;
                    case "Palhoça-Biguaçu":
                        Intent linha1330 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha1330.putExtra("Nome da Linha", "Palhoça-Biguaçu");
                        startActivity(linha1330);
                        break;
                    case "Pinheira-Ponte do Imaruim":
                        Intent linha006 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha006.putExtra("Nome da Linha", "Pinheira-Ponte do Imaruim");
                        startActivity(linha006);
                        break;
                    case "São José-Florianópolis":
                        Intent linha0372 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha0372.putExtra("Nome da Linha", "São José-Florianópolis");
                        startActivity(linha0372);
                        break;
                    case "São Sebastião-Palhoça":
                        Intent linha503 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha503.putExtra("Nome da Linha", "São Sebastião-Palhoça");
                        startActivity(linha503);
                        break;
                    case "São Sebastião-Florianópolis":
                        Intent linha0242 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha0242.putExtra("Nome da Linha", "São Sebastião-Florianópolis");
                        startActivity(linha0242);
                        break;
                    case "Unisul-Ponte do Imaruim":
                        Intent linha630 = new Intent(Act_Empresas_Jotur_WebView.this, Act_Mapas_WebView.class);
                        linha630.putExtra("Nome da Linha", "Unisul-Ponte do Imaruim");
                        startActivity(linha630);
                        break;

                }
            }
        });

    }
}