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

        /***************************************************************************************
         * 2. Creación de clase que implemente el listener (es raro hacerlo así,
         * solo tendría sentido si ese listener se reutilizase.
         */
        Button button1 = findViewById(R.id.button1); // Busca objeto con id "button1" en clase R, autogenerada a partir de los xml
        // se asigna al boton un escuchador de tipo OnClickListener; un objeto que indica qué hacer cuando se hace click en el botón
        button1.setOnClickListener(new MyOnClickListener()); // Asignamos un objeto OnClickListener


        /***************************************************************************************
         * 3. Implementación usando una clase anónima.
         */
        Button button2 = findViewById(R.id.button2);
        // El escuchador se instancia (new) a partir de una clase anónima
        button2.setOnClickListener(  // instanciamos un objeto que implementa el interfaz escuchador OnClickListener
                new View.OnClickListener() { // Implementando directamente los métodos que exige este interfaz:
                    @Override  // Se sobreescribe el método onClick del escuchador
                    public void onClick(View v) { // el método recibe como parámetro la View sobre la que se hizo el click (el botón)
                        Toast.makeText(MainActivity.this, R.string.o3_clase_anonima, Toast.LENGTH_SHORT).show();
                        // El contexto ya no puede ser this, ya que estamos en la clase anónima
                    }
                }
        );

    }

    /** 1. Receptor de eventos. Se considera una mala práctica
     * Método asociado al TextView a través del atributo android:onClick */
    public void click1(View view) { // el método recibe como parámetro la View sobre la que se hizo el click (el botón)
        Toast.makeText(this, "Receptor de eventos", Toast.LENGTH_SHORT).show();

        /* El contexto es this, ya que al pertenecer el método click1 a la Activity, el objeto de la actividad es el contexto
        AppCompatActivity hereda de Activity, que a su vez hereda de Context. Por tanto, toda activity es un contexto válido.
        */
    }


}