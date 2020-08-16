package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act_Terminais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_terminais);

        // Pega a inteção com o nome das linha
        Intent intent = getIntent();
        final String parametroNomeLinha = (String) intent.getSerializableExtra("Nome do Terminal");

        // Declaração dos botões
        Button Btn_Ticen = (Button) findViewById(R.id.Btn_Ticen);
        Button Btn_Titri = (Button) findViewById(R.id.Btn_Titri);
        Button Btn_Tilag = (Button) findViewById(R.id.Btn_Tilag);
        Button Btn_Tirio = (Button) findViewById(R.id.Btn_Tirio);
        Button Btn_Tisan = (Button) findViewById(R.id.Btn_Tisan);
        Button Btn_Tican = (Button) findViewById(R.id.Btn_Tican);
        Button Btn_EstacaoPH = (Button) findViewById(R.id.Btn_EstacaoPH);

        // Chama tela por Empresa
        Btn_Ticen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ticen = new Intent(Act_Terminais.this, Act_Terminais_WebView.class);
                ticen.putExtra("Nome do Terminal", "TICEN");
                startActivity(ticen);
            }
        });
        Btn_Titri.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent titri = new Intent(Act_Terminais.this, Act_Terminais_WebView.class);
                titri.putExtra("Nome do Terminal", "TITRI");
                startActivity(titri);
            }
        });
        Btn_Tilag.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent tilag = new Intent(Act_Terminais.this, Act_Terminais_WebView.class);
                tilag.putExtra("Nome do Terminal", "TILAG");
                startActivity(tilag);
            }
        });
        Btn_Tirio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent tirio = new Intent(Act_Terminais.this, Act_Terminais_WebView.class);
                tirio.putExtra("Nome do Terminal", "TIRIO");
                startActivity(tirio);
            }
        });
        Btn_Tisan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent tisan = new Intent(Act_Terminais.this, Act_Terminais_WebView.class);
                tisan.putExtra("Nome do Terminal", "TISAN");
                startActivity(tisan);
            }
        });
        Btn_Tican.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent tican = new Intent(Act_Terminais.this, Act_Terminais_WebView.class);
                tican.putExtra("Nome do Terminal", "TICAN");
                startActivity(tican);
            }
        });
        Btn_EstacaoPH.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent EstacaoPH = new Intent(Act_Terminais.this, Act_Terminais_WebView.class);
                EstacaoPH.putExtra("Nome do Terminal", "ESTACAO PH");
                startActivity(EstacaoPH);
            }
        });


    }
}