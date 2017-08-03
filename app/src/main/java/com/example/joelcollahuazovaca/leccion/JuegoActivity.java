package com.example.joelcollahuazovaca.leccion;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.joelcollahuazovaca.leccion.R.id.btnJugar;

public class JuegoActivity extends AppCompatActivity {

    private View btn1;
    private View btn2;
    private View btn3;
    private View btn4;
    private View btn5;
    MediaPlayer mp;

    public JuegoActivity(View btn1) {
        this.btn1 = btn1;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        Toast.makeText(JuegoActivity.this, "Selecciona el numero 4", Toast.LENGTH_LONG).show();
        btn1= (Button) findViewById(R.id.btn1);
        mp= MediaPlayer.create(this, R.raw.clic)
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Toast.makeText(JuegoActivity.this, "Numero incorrecto", Toast.LENGTH_LONG).show();

            }
        });

        btn2= (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JuegoActivity.this, "Numero incorrecto", Toast.LENGTH_LONG).show();

            }
        });

        btn3= (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JuegoActivity.this, "Numero incorrecto", Toast.LENGTH_LONG).show();

            }
        });

        btn4= (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JuegoActivity.this, "Numero incorrecto", Toast.LENGTH_LONG).show();

            }
        });

        btn5= (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JuegoActivity.this, "Numero incorrecto", Toast.LENGTH_LONG).show();

            }
        });


    }
}
