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
        Button Btn_Terminais = (Button) findViewById(R.id.Btn_Terminais);

        // Chama tela Act_Empresas
        Btn_Horarios.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Act_Inicio.this, Act_Empresas.class);
                startActivity(it);
            }
        });

        // Chama tela Act_Mapa
        Btn_Terminais.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Act_Inicio.this, Act_Terminais.class);
                startActivity(it);
            }
        });
    }
}
