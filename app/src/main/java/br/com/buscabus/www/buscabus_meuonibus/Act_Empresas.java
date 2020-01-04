package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act_Empresas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__empresas);

        // Declaração dos botões
        Button Btn_CFenix = (Button) findViewById(R.id.Btn_CFenix);
        Button Btn_Biguacu = (Button) findViewById(R.id.Btn_Biguacu);
        Button Btn_Estrela = (Button) findViewById(R.id.Btn_Estrela);
        Button Btn_Imperatriz = (Button) findViewById(R.id.Btn_Imperatriz);
        Button Btn_Jotur = (Button) findViewById(R.id.Btn_Jotur);
        Button Btn_STerezinha = (Button) findViewById(R.id.Btn_STerezinha);

        // Chama tela por Empresa
        Btn_CFenix.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent it = new Intent(Act_Empresas.this, Act_Empresas_CFenix.class);
                startActivity(it);
            }

        });
        Btn_Biguacu.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent it = new Intent(Act_Empresas.this, Act_Empresas_Biguacu.class);
                startActivity(it);
            }

        });
        Btn_Estrela.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent it = new Intent(Act_Empresas.this, Act_Empresas_Estrela.class);
                startActivity(it);
            }

        });
        Btn_Imperatriz.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent it = new Intent(Act_Empresas.this, Act_Empresas_Imperatriz.class);
                startActivity(it);
            }

        });
        Btn_Jotur.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent it = new Intent(Act_Empresas.this, Act_Empresas_Jotur.class);
                startActivity(it);
            }

        });
        Btn_STerezinha.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent it = new Intent(Act_Empresas.this, Act_Empresas_STerezinha.class);
                startActivity(it);
            }

        });



    }
}
