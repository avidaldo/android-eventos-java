package com.example.eventosjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv);



        /*
        View.OnClickListener es una interfaz funcional (una interfaz que solo tiene un único
        método abstracto). Desde Java 8, este tipo de interfaces pueden representarse mediante una
        función lambda.

        Las funciones lambda son funciones anónimas (no tienen un nombre) que pueden ser tratadas como
        objetos (asignadas a variables o pasadas como parámetros), de este modo, son una herramienta
        central del paradigma de programación funcional.

        Una función lambda se compopne de sus parámetros de entrada y el código que ejecuta, al igual
        que cualquier otra función o método, pero sin un nombre.

        Al tener una interfaz funcional un único método, lo relevante de ella son los parámetros
        que recibe la función que implementa y los parámetros que devuelve.

         */



        /* El método recibe directamente el método onClick de la clase anónima pero convertido a una
        función lambda. Esa función tiene el parámetro de entrada v(la view en la que se hizo click)
        y como salida la acción que realiza ante el evento onClick (el contenido del método onClick) */
        
        tv.setOnClickListener(v -> {
                    Toast.makeText(MainActivity.this, R.string.o3_clase_anonima, Toast.LENGTH_SHORT).show();
                }
        );

    }

}