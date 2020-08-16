package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Act_Empresas_Biguacu_WebView extends AppCompatActivity {

    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_empresas_biguacu_webview);

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

        // Ação do botão Mapa
        Btn_Mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (parametroNomeLinha) {
                    case "Antônio Carlos-Florianópolis":
                        Intent linha1050 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1050.putExtra("Nome da Linha", "Antônio Carlos-Florianópolis");
                        startActivity(linha1050);
                        break;
                    case "Antônio Carlos-Biguaçu":
                        Intent linha6410 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha6410.putExtra("Nome da Linha", "Antônio Carlos-Biguaçu");
                        startActivity(linha6410);
                        break;
                    case "Araucária":
                        Intent linha1132 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1132.putExtra("Nome da Linha", "Araucária");
                        startActivity(linha1132);
                        break;
                    case "Armação da Piedade-Florianópolis":
                        Intent linha1030 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1030.putExtra("Nome da Linha", "Armação da Piedade-Florianópolis");
                        startActivity(linha1030);
                        break;
                    case "Avenida das Torres":
                        Intent linha8450 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha8450.putExtra("Nome da Linha", "Avenida das Torres");
                        startActivity(linha8450);
                        break;
                    case "Avenida das Torres-Kobrasol":
                        Intent linha9030 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9030.putExtra("Nome da Linha", "Avenida das Torres-Kobrasol");
                        startActivity(linha9030);
                        break;
                    case "Bairro Ipiranga":
                        Intent linha1040 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1040.putExtra("Nome da Linha", "Bairro Ipiranga");
                        startActivity(linha1040);
                        break;
                    case "Bairro Ipiranga via Expressa":
                        Intent linha6680 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha6680.putExtra("Nome da Linha", "Bairro Ipiranga via Expressa");
                        startActivity(linha6680);
                        break;
                    case "Bairro São Pedro":
                        Intent linha1020 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1020.putExtra("Nome da Linha", "Bairro São Pedro");
                        startActivity(linha1020);
                        break;
                    case "Bairro São Pedro via Expressa":
                        Intent linha6950 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha6950.putExtra("Nome da Linha", "Bairro São Pedro via Expressa");
                        startActivity(linha6950);
                        break;
                    case "Barreiros":
                        Intent linha4420 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4420.putExtra("Nome da Linha", "Barreiros");
                        startActivity(linha4420);
                        break;
                    case "Barreiros-Sede":
                        Intent linha9060 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9060.putExtra("Nome da Linha", "Barreiros-Sede");
                        startActivity(linha9060);
                        break;
                    case "Bela Vista":
                        Intent linha4310 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4310.putExtra("Nome da Linha", "Bela Vista");
                        startActivity(linha4310);
                        break;
                    case "Bela Vista via Expressa":
                        Intent linha5590 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha5590.putExtra("Nome da Linha", "Bela Vista via Expressa");
                        startActivity(linha5590);
                        break;
                    case "Bela Vista via Floresta":
                        Intent linha4311 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4311.putExtra("Nome da Linha", "Bela Vista via Floresta");
                        startActivity(linha4311);
                        break;
                    case "Bela Vista via Floresta/Expressa":
                        Intent linha4312 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4312.putExtra("Nome da Linha", "Bela Vista via Floresta/Expressa");
                        startActivity(linha4312);
                        break;
                    case "Biguaçu":
                        Intent linha4430 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4430.putExtra("Nome da Linha", "Biguaçu");
                        startActivity(linha4430);
                        break;
                    case "Biguaçu via Expressa":
                        Intent linha5570 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha5570.putExtra("Nome da Linha", "Biguaçu via Expressa");
                        startActivity(linha5570);
                        break;
                    case "Biguaçu-Palhoça":
                        Intent linha880 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha880.putExtra("Nome da Linha", "Biguaçu-Palhoça");
                        startActivity(linha880);
                        break;
                    case "Bom Viver":
                        Intent linha1000 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1000.putExtra("Nome da Linha", "Bom Viver");
                        startActivity(linha1000);
                        break;
                    case "Bom Viver via Expressa":
                        Intent linha1001 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1001.putExtra("Nome da Linha", "Bom Viver via Expressa");
                        startActivity(linha1001);
                        break;
                    case "Bom Viver-Biguaçu":
                        Intent linha9056 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9056.putExtra("Nome da Linha", "Bom Viver-Biguaçu");
                        startActivity(linha9056);
                        break;
                    case "Catarina":
                        Intent linha1460 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1460.putExtra("Nome da Linha", "Catarina");
                        startActivity(linha1460);
                        break;
                    case "Ceasa via Estreito":
                        Intent linha4350 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4350.putExtra("Nome da Linha", "Ceasa via Estreito");
                        startActivity(linha4350);
                        break;
                    case "Circular Barreiros":
                        Intent linha9090 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9090.putExtra("Nome da Linha", "Circular Barreiros");
                        startActivity(linha9090);
                        break;
                    case "Circular Biguaçu":
                        Intent linha9006 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9006.putExtra("Nome da Linha", "Circular Biguaçu");
                        startActivity(linha9006);
                        break;
                    case "Diretão":
                        Intent linha9080 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9080.putExtra("Nome da Linha", "Diretão");
                        startActivity(linha9080);
                        break;
                    case "Diretão Executivo":
                        Intent linha9081 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9081.putExtra("Nome da Linha", "Diretão Executivo");
                        startActivity(linha9081);
                        break;
                    case "Dona Adélia":
                        Intent linha990 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha990.putExtra("Nome da Linha", "Dona Adélia");
                        startActivity(linha990);
                        break;
                    case "Dona Wanda":
                        Intent linha4342 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4342.putExtra("Nome da Linha", "Dona Wanda");
                        startActivity(linha4342);
                        break;
                    case "Dona Wanda via Expressa":
                        Intent linha4343 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4343.putExtra("Nome da Linha", "Dona Wanda via Expressa");
                        startActivity(linha4343);
                        break;
                    case "Egito-Antônio Carlos":
                        Intent linha9200 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9200.putExtra("Nome da Linha", "Egito-Antônio Carlos");
                        startActivity(linha9200);
                        break;
                    case "Estiva-Biguaçu":
                        Intent linha9057 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9057.putExtra("Nome da Linha", "Estiva-Biguaçu");
                        startActivity(linha9057);
                        break;
                    case "Floresta via Kobrasol":
                        Intent linha220 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha220.putExtra("Nome da Linha", "Floresta via Kobrasol");
                        startActivity(linha220);
                        break;
                    case "Executivo Antônio Carlos":
                        Intent linha1051 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1051.putExtra("Nome da Linha", "Executivo Antônio Carlos");
                        startActivity(linha1051);
                        break;
                    case "Executivo Bela Vista":
                        Intent linha4313 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4313.putExtra("Nome da Linha", "Executivo Bela Vista");
                        startActivity(linha4313);
                        break;
                    case "Executivo Biguaçu":
                        Intent linha7643 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha7643.putExtra("Nome da Linha", "Executivo Biguaçu");
                        startActivity(linha7643);
                        break;
                    case "Executivo Dona Adélia":
                        Intent linha992 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha992.putExtra("Nome da Linha", "Executivo Dona Adélia");
                        startActivity(linha992);
                        break;
                    case "Executivo Dona Wanda":
                        Intent linha4344 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4344.putExtra("Nome da Linha", "Executivo Dona Wanda");
                        startActivity(linha4344);
                        break;
                    case "Executivo Gov. Celso Ramos":
                        Intent linha4471 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4471.putExtra("Nome da Linha", "Executivo Gov. Celso Ramos");
                        startActivity(linha4471);
                        break;
                    case "Executivo Ipiranga":
                        Intent linha1041 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1041.putExtra("Nome da Linha", "Executivo Ipiranga");
                        startActivity(linha1041);
                        break;
                    case "Executivo Zenaide/Barreiros via Estreito":
                        Intent linha1461 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1461.putExtra("Nome da Linha", "Executivo Zenaide/Barreiros via Estreito");
                        startActivity(linha1461);
                        break;
                    case "Floresta via Expressa":
                        Intent linha6690 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha6690.putExtra("Nome da Linha", "Floresta via Expressa");
                        startActivity(linha6690);
                        break;
                    case "Fundos":
                        Intent linha7640 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha7640.putExtra("Nome da Linha", "Fundos");
                        startActivity(linha7640);
                        break;
                    case "Governador Celso Ramos-Florianópolis":
                        Intent linha4470 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4470.putExtra("Nome da Linha", "Governador Celso Ramos-Florianópolis");
                        startActivity(linha4470);
                        break;
                    case "Governador Celso Ramos-Biguaçu":
                        Intent linha5460 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha5460.putExtra("Nome da Linha", "Governador Celso Ramos-Biguaçu");
                        startActivity(linha5460);
                        break;
                    case "Heriberto Hulse":
                        Intent linha4421 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4421.putExtra("Nome da Linha", "Heriberto Hulse");
                        startActivity(linha4421);
                        break;
                    case "Jardim Carandai":
                        Intent linha7461 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha7461.putExtra("Nome da Linha", "Jardim Carandai");
                        startActivity(linha7461);
                        break;
                    case "Jardim Cidade Florianópolis":
                        Intent linha980 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha980.putExtra("Nome da Linha", "Jardim Cidade Florianópolis");
                        startActivity(linha980);
                        break;
                    case "Jardim das Acácias":
                        Intent linha7590 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha7590.putExtra("Nome da Linha", "Jardim das Acácias");
                        startActivity(linha7590);
                        break;
                    case "Jardim Janaina":
                        Intent linha4340 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4340.putExtra("Nome da Linha", "Jardim Janaina");
                        startActivity(linha4340);
                        break;
                    case "Jardim Janaina via Expressa":
                        Intent linha4341 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4341.putExtra("Nome da Linha", "Jardim Janaina via Expressa");
                        startActivity(linha4341);
                        break;
                    case "Jardim Zanellato":
                        Intent linha1130 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1130.putExtra("Nome da Linha", "Jardim Zanellato");
                        startActivity(linha1130);
                        break;
                    case "Jardim Zanellato via Expressa":
                        Intent linha1131 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1131.putExtra("Nome da Linha", "Jardim Zanellato via Expressa");
                        startActivity(linha1131);
                        break;
                    case "José Nitro":
                        Intent linha1002 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1002.putExtra("Nome da Linha", "José Nitro");
                        startActivity(linha1002);
                        break;
                    case "Loro-Antônio Carlos":
                        Intent linha9300 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9300.putExtra("Nome da Linha", "Loro-Antônio Carlos");
                        startActivity(linha9300);
                        break;
                    case "Palmas-Florianópolis":
                        Intent linha4330 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4330.putExtra("Nome da Linha", "Palmas-Florianópolis");
                        startActivity(linha4330);
                        break;
                    case "Palmas-Biguaçu":
                        Intent linha4332 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4332.putExtra("Nome da Linha", "Palmas-Biguaçu");
                        startActivity(linha4332);
                        break;
                    case "Prado":
                        Intent linha1091 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1091.putExtra("Nome da Linha", "Prado");
                        startActivity(linha1091);
                        break;
                    case "Praia João Rosa":
                        Intent linha4431 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4431.putExtra("Nome da Linha", "Praia João Rosa");
                        startActivity(linha4431);
                        break;
                    case "Rachadel-Antônio Carlos":
                        Intent linha9100 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9100.putExtra("Nome da Linha", "Rachadel-Antônio Carlos");
                        startActivity(linha9100);
                        break;
                    case "Roçado":
                        Intent linha6720 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha6720.putExtra("Nome da Linha", "Roçado");
                        startActivity(linha6720);
                        break;
                    case "Rua Santo Antônio":
                        Intent linha6401 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha6401.putExtra("Nome da Linha", "Rua Santo Antônio");
                        startActivity(linha6401);
                        break;
                    case "Santa Maria-Antônio Carlos":
                        Intent linha9600 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9600.putExtra("Nome da Linha", "Santa Maria-Antônio Carlos");
                        startActivity(linha9600);
                        break;
                    case "São Miguel":
                        Intent linha1090 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1090.putExtra("Nome da Linha", "São Miguel");
                        startActivity(linha1090);
                        break;
                    case "Saudades":
                        Intent linha4433 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4433.putExtra("Nome da Linha", "Saudades");
                        startActivity(linha4433);
                        break;
                    case "Serraria-Forquilhinhas":
                        Intent linha9070 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha9070.putExtra("Nome da Linha", "Serraria-Forquilhinhas");
                        startActivity(linha9070);
                        break;
                    case "Shopping Center Itaguaçu":
                        Intent linha1240 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha1240.putExtra("Nome da Linha", "Shopping Center Itaguaçu");
                        startActivity(linha1240);
                        break;
                    case "Sorocaba-Biguaçu":
                        Intent linha6421 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha6421.putExtra("Nome da Linha", "Sorocaba-Biguaçu");
                        startActivity(linha6421);
                        break;
                    case "Tijucas-Biguaçu":
                        Intent linha6430 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha6430.putExtra("Nome da Linha", "Tijucas-Biguaçu");
                        startActivity(linha6430);
                        break;
                    case "Três Riachos-Florianópolis":
                        Intent linha4480 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4480.putExtra("Nome da Linha", "Três Riachos-Florianópolis");
                        startActivity(linha4480);
                        break;
                    case "Três Riachos-Biguaçu":
                        Intent linha4481 = new Intent(Act_Empresas_Biguacu_WebView.this, Act_Mapas_WebView.class);
                        linha4481.putExtra("Nome da Linha", "Três Riachos-Biguaçu");
                        startActivity(linha4481);
                        break;

                }

            }
        });

    }
}
