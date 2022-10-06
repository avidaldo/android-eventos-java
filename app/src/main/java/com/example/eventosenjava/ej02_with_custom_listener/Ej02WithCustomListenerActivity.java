package com.example.eventosenjava.ej02_with_custom_listener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eventosenjava.R;

public class Ej02WithCustomListenerActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varias);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        Button boton = findViewById(R.id.button);


        /** Creación de clase que implementa el listener. Estilo clásico Java. Es raro hacerlo así ya que no
         tiene mucho sentido tener un clase solo para eso. Generas ficheros innecesariamente.
         Simplemente es importante comprenderlo como paso previo para comprender el uso de
         * clases anónimas (Ej04). */


        /* Se asigna un escuchador OnClickListener; objeto que contiene el método al que se llamará
        ante el evento de pulsar en el botón. De este modo, el objeto boton tendrá un
        objeto Listener que tiene el método onClick al que se llamará cuando suceda el evento. */
        boton.setOnClickListener(new CustomOnClickListener(textView,editText));
        // Se asigna un objeto anónimo de la clase CustomOnClickListener.
    }


}

