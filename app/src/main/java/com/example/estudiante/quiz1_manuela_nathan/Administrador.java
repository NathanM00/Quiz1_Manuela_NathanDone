package com.example.estudiante.quiz1_manuela_nathan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Administrador extends AppCompatActivity {

    TextView tvHola;

    TextView tvProximamente;

    Button btnCerrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);


        tvHola= findViewById(R.id.tv_hola);
        tvProximamente= findViewById(R.id.tv_proximamente);
        btnCerrar= findViewById(R.id.btn_cerrar);

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
