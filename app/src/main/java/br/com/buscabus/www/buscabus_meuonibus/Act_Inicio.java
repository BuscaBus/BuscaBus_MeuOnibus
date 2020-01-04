package br.com.buscabus.www.buscabus_meuonibus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act_Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_inicio);

        Button Btn_Horarios = (Button) findViewById(R.id.Btn_Horarios);
        Button Btn_Mapa = (Button) findViewById(R.id.Btn_Mapa);

        // Chama tela Act_Empresas
        Btn_Horarios.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Act_Inicio.this, Act_Empresas.class);
                startActivity(it);
            }
        });

        // Chama tela Act_Mapa
        Btn_Mapa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Act_Inicio.this, Act_Mapa.class);
                startActivity(it);
            }
        });
    }
}
