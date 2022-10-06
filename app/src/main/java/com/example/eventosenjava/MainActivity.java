package com.example.eventosenjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Setea la vista a partir del fichero activity_main.xml


        // Busca objeto con id "button01" en clase R (autogenerada a partir de los xml)
        Button b1 = findViewById(R.id.btn_to_metodo_xml);


        /** Para movernos entre activities (1), será necesario usar Intents explicitos.
         Instanciamos un objeto Intent, una abstracción de la intención de cambiar de actividad.
         Su constructor recibe como argumentos:
           - El contexto de partida: la activity en que está.
           (AppCompatActivity hereda de Activity, que a su vez hereda de Context. Por tanto, toda activity es un contexto válido.)
           - La clase de la Activity que ha de ser creada. Como esta activity todavía no se puede
             instaciar, se usa la sintaxis .class (reflection).
         */
        Intent intent = new Intent(this, MetodoXMLActivity.class);


        /** Asigno al botón la función de callback (la acción a realizar cuando se pulsa).
         En este caso llamo al método startActivity que recibe como argumento el intent que le indica qué activity crear.
         */
        b1.setOnClickListener(v -> startActivity(intent));


        /* Haciendo lo mismo con el resto de botones: */

        findViewById(R.id.btn_to_listener_personalizado).setOnClickListener(
                v -> startActivity(new Intent(this, WithCustomListenerActivity.class)));
        findViewById(R.id.btn_to_clase_anonima).setOnClickListener(
                v -> startActivity(new Intent(this, ClaseAnonimaActivity.class)));
        findViewById(R.id.btn_to_lambda).setOnClickListener(
                v -> startActivity(new Intent(this, LambdaActivity.class)));
        findViewById(R.id.btn_to_activity_listener).setOnClickListener(
                v -> startActivity(new Intent(this, ListenerIsActivity.class)));

    }

}

/** (1) Para crear una nueva activity: (File > New > Activity > Empty Activity). */