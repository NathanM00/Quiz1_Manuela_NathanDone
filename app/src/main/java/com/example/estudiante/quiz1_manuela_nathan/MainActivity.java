package com.example.estudiante.quiz1_manuela_nathan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvIntroducir;

    EditText etUsuario;

    EditText etContraseña;

    TextView tvError;

    Button  btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvIntroducir = findViewById(R.id.tv_introducir);
        etUsuario = findViewById(R.id.et_usuario);
        etContraseña = findViewById(R.id.et_contraseña);
        tvError= findViewById(R.id.tv_error);
        btnIngresar= findViewById(R.id.btn_ingresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usuario = etUsuario.getText().toString();

                String contraseña = etContraseña.getText().toString();

                String administrador = "Administrador";

                String contra = "123456";

                Intent intento = new Intent(getApplicationContext(), Administrador.class);

                if(usuario.equals(administrador) && contraseña.equals(contra)  ){

                    Log.e("prueba", "hola");
                    tvError.setText("");

                   startActivity(intento);
                } else {

                    tvError.setText("El usuario o la contraseña NO es correcta");
                }

            }
        });



    }
}
