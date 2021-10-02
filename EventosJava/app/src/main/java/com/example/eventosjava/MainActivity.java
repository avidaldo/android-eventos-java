package com.example.eventosjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /** Receptor de eventos. Se considera una mala práctica
     * Método asociado al TextView a través del atributo android:onClick */
    public void click1(View view) { // el método recibe como parámetro la View sobre la que se hizo el click (el botón)
        Toast.makeText(this, "Receptor de eventos", Toast.LENGTH_SHORT).show();

        /* El contexto es this, ya que al pertenecer el método click1 a la Activity, el objeto de la actividad es el contexto
        AppCompatActivity hereda de Activity, que a su vez hereda de Context. Por tanto, toda activity es un contexto válido.
        */
    }


}