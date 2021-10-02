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


        // Implementación usando una clase anónima.

        TextView tv = findViewById(R.id.tv);
        // El escuchador se instancia (new) a partir de una clase anónima
        tv.setOnClickListener(  // instanciamos un objeto que implementa el interfaz escuchador OnClickListener
                new View.OnClickListener() { // Implementando directamente los métodos que exige este interfaz:
                    @Override  // Se sobreescribe el método onClick del escuchador
                    public void onClick(View v) { // el método recibe como parámetro la View sobre la que se hizo el click (el botón)
                        Toast.makeText(MainActivity.this, R.string.o3_clase_anonima, Toast.LENGTH_SHORT).show();
                        // El contexto ya no puede ser this, ya que estamos en la clase anónima
                    }
                }
        );

    }

}