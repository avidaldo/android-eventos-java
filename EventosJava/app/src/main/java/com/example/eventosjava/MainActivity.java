package com.example.eventosjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // variable que referencia al objeto con id "textView" autogenerado desde el layout
        TextView tv = findViewById(R.id.textView);
        // La clase R contiene los identificadores de todos los objetos autoenerados

        // se asigna un escuchador OnClickListener; objeto que indica qué hacer ante un click en la vista
        tv.setOnClickListener(new MyOnClickListener()); // Se asigna un objeto de la clase MyOnClickListener

        // De este modo, el objeto tv tiene como atributo un objeto Listener que tiene el método
        // onClick al que se llamará cuando suceda el evento.


    }
}