package com.example.eventosenjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LambdaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varias);

        TextView tv = findViewById(R.id.textView);
        EditText et = findViewById(R.id.editText);
        Button boton = findViewById(R.id.button);

        /**

         View.OnClickListener es una interfaz funcional (una interfaz que solo tiene un único
         método abstracto). Desde Java 8, este tipo de interfaces pueden representarse mediante una
         función lambda.

         Las funciones lambda son funciones anónimas (no tienen un nombre) que pueden ser tratadas como
         objetos (asignadas a variables o pasadas como parámetros), de este modo, son una herramienta
         central del paradigma de programación funcional.

         Una función lambda se compone de sus parámetros de entrada y el código que ejecuta, al igual
         que cualquier otra función o método, pero sin un nombre.

         Al tener una interfaz funcional un único método, lo relevante de ella son los parámetros
         que recibe la función que implementa y los parámetros que devuelve.

         */


        /* El método recibe directamente el método onClick de la clase anónima pero convertido a una
        función lambda. Esa función tiene el parámetro de entrada v(la view en la que se hizo click)
        y como salida la acción que realiza ante el evento onClick (el contenido del método onClick).
        Cuando se implementa una clase anónima, el propio IDE sugiere cambiarla por una lambda. */

        boton.setOnClickListener(v -> {

            if (!et.getText().toString().isEmpty()) {
                tv.setText(getString(R.string.hola_coma) + et.getText());
                ((Button) v).setText(R.string.saluda_nuevo);
            } else {
                Toast.makeText(this, R.string.error_no_name, Toast.LENGTH_SHORT).show();
                /* Al pasar directamente una función como objeto, no estamos en otra clase sino directamente
                en la Activity. */
            }


        });

    }

}