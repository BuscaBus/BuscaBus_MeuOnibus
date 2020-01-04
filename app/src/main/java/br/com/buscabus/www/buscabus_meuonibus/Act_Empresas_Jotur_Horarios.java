package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;

public class Act_Empresas_Jotur_Horarios extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__empresas__jotur__horarios);

        // Comandos para o WebView
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeLinha = (String) intent.getSerializableExtra("Nome da Linha");

        // Parametro para exibir Mapa
        switch(parametroNomeLinha) {
            case "Albardão-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/albardao-estacao-palhoca,43");
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
            case "Barra do Aririu-Estação Palhoça (Circular)":
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
            case "Bela Vista-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/bela-vista-estacao-palhoca,1e");
                break;
            case "Bela Vista-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/bela-vista-florianopolis,19");
                break;
            case "Caminho Novo/Terra Nova-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/caminho-novo-terra-nova-estacao-palhoca,2e");
                break;
            case "Caminho Novo/Terra Nova-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/caminho-novo-terra-nova-florianopolis,2h");
                break;
            case "Circulares Região Sul (Escolar)":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/circulares-municipais-escolar-da-regiao-sul-de-palhoca,30");
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
            case "Enseada do Brito-Estação Palhoça":
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
            case "Guarda do Cubatão-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/guarda-do-cubatao-estacao-palhoca,13");
                break;
            case "Guarda do Cubatão-Estação Palhoça (Circular)":
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
            case "Madri-Estação Palhoça":
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
            case "Pinheira-Estação Palhoça":
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
            case "São Sebastião-Estação Palhoça":
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
            case "Unisul-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/unisul-estacao-palhoca,1t");
                break;
            case "Vila Nova-Estação Palhoça":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/vila-nova-estacao-palhoca,r");
                break;
            case "Vila Nova-Florianópolis":
                WebView.loadUrl("https://www.jotur.com.br/horarios/palhoca,1/vila-nova-florianopolis,9");
                break;
        }

    }
}