package com.example.eventosenjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ClaseAnonimaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varias);

        TextView tv = findViewById(R.id.textView);
        EditText et = findViewById(R.id.editText);
        Button boton = findViewById(R.id.button);


        /** Implementación usando una clase anónima. */

        // El listener se instancia (new) a partir de una clase anónima
        // Implementando directamente los métodos que exige este interfaz:
        // Se sobreescribe el método onClick del escuchador
        boton.setOnClickListener(  // instanciamos un objeto que implementa el interfaz escuchador OnClickListener
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) { // el método recibe como parámetro la View sobre la que se hizo el click (el botón)

                        tv.setText(ClaseAnonimaActivity.this.getString(R.string.hola_coma) + et.getText());
                        ((Button) view).setText(R.string.saluda_nuevo);

                        Toast.makeText(ClaseAnonimaActivity.this, R.string.clase_an_nima, Toast.LENGTH_SHORT).show();
            /* No estamos directamente dentro de la Activity, sino del listener (la clase anónima).
            El contexto es la enclosing class */
                    }
                }
        );

    }
}