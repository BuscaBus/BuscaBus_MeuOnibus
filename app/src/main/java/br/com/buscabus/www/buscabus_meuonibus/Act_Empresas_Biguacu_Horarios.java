package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;

public class Act_Empresas_Biguacu_Horarios extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__empresas__biguacu__horarios);

        // Comandos para o WebView
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeLinha = (String) intent.getSerializableExtra("Nome da Linha");

        // Parametro para exibir Mapa
        switch(parametroNomeLinha) {
            case "Antônio Carlos-Florianópolis":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10500");
                break;
            case "Antônio Carlos-Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/64100");
                break;
            case "Araucária":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/11302");
                break;
            case "Armação da Piedade-Florianópolis":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10300");
                break;
            case "Armação da Piedade-Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10301");
                break;
            case "Avenida das Torres":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/84500");
                break;
            case "Avenida das Torres-Kobrasol":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/90300");
                break;
            case "Bairro Ipiranga":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10400");
                break;
            case "Bairro Ipiranga via Expressa":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/66800");
                break;
            case "Bairro São Pedro":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10200");
                break;
            case "Bairro São Pedro via Expressa":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/69500");
                break;
            case "Barreiros":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/44200");
                break;
            case "Barreiros-Sede":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/90600");
                break;
            case "Bela Vista":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/43100");
                break;
            case "Bela Vista via Expressa":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/55900");
                break;
            case "Bela Vista via Floresta":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/43101");
                break;
            case "Bela Vista via Floresta/Expressa":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/43102");
                break;
            case "Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/44300");
                break;
            case "Biguaçu via Expressa":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/55700");
                break;
            case "Biguaçu-Palhoça":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/8800");
                break;
            case "Bom Viver":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10000");
                break;
            case "Bom Viver via Expressa":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10001");
                break;
            case "Bom Viver-Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/900056");
                break;
            case "Catarina":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/14600");
                break;
            case "Ceasa via Estreito":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/43500");
                break;
            case "Circular Barreiros":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/90900");
                break;
            case "Circular Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/900006");
                break;
            case "Diretão":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/90800");
                break;
            case "Dona Adélia":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/9900");
                break;
            case "Dona Wanda":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/43402");
                break;
            case "Dona Wanda via Expressa":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/43403");
                break;
            case "Egito-Antônio Carlos":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/920000");
                break;
            case "Estiva-Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/900057");
                break;
            case "Executivo Antônio Carlos":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10501");
                break;
            case "Executivo Bela Vista":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/43103");
                break;
            case "Executivo Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/76403");
                break;
            case "Executivo Dona Adélia":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/9902");
                break;
            case "Executivo Dona Wanda":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/43404");
                break;
            case "Executivo Governador Celso Ramos":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/44701");
                break;
            case "Executivo Ipiranga":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10401");
                break;
            case "Executivo Zenaide":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/14601");
                break;
            case "Floresta via Expressa":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/66900");
                break;
            case "Floresta via Kobrasol":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/2200");
                break;
            case "Fundos":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/76400");
                break;
            case "Governador Celso Ramos-Florianópolis":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/44700");
                break;
            case "Governador Celso Ramos-Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/54600");
                break;
            case "Heriberto Hulse":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/44201");
                break;
            case "Jardim Carandai":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/76401");
                break;
            case "Jardim Cidade Florianópolis":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/9800");
                break;
            case "Jardim das Acácias":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/75900");
                break;
            case "Jardim Janaina":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/43400");
                break;
            case "Jardim Janaina via Expressa":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/43401");
                break;
            case "Jardim Zanellato":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/11300");
                break;
            case "Jardim Zanellato via Expressa":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/11301");
                break;
            case "José Nitro":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10002");
                break;
            case "Loro-Antônio Carlos":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/930000");
                break;
            case "Palmas-Florianópolis":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/43300");
                break;
            case "Palmas-Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/43302");
                break;
            case "Prado":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10901");
                break;
            case "Praia João Rosa":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/44301");
                break;
            case "Rachadel-Antônio Carlos":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/910000");
                break;
            case "Roçado":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/67200");
                break;
            case "Rua Santo Antônio":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/64001");
                break;
            case "Santa Maria-Antônio Carlos":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/960000");
                break;
            case "São Miguel":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/10900");
                break;
            case "Saudades":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/44303");
                break;
            case "Serraria-Forquilhinhas":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/90700");
                break;
            case "Shopping Center Itaguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/12400");
                break;
            case "Sorocaba-Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/64201");
                break;
            case "Tijucas-Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/64300");
                break;
            case "Três Riachos-Florianópolis":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/44800");
                break;
            case "Três Riachos-Biguaçu":
                WebView.loadUrl("http://www.tcbiguacu.com.br/horarios/44801");
                break;

        }

    }
}