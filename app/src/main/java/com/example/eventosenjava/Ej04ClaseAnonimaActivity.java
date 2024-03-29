package com.example.eventosenjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ej04ClaseAnonimaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varias);

        TextView tv = findViewById(R.id.textView);
        EditText et = findViewById(R.id.editText);
        Button boton = findViewById(R.id.button);

        /* Implementación usando una clase anónima. */

        boton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tv.setText(Ej04ClaseAnonimaActivity.this.getString(R.string.hola_coma) + et.getText());
                        ((Button) view).setText(R.string.saluda_nuevo);
                        Toast.makeText(Ej04ClaseAnonimaActivity.this, R.string.clase_an_nima,
                                Toast.LENGTH_SHORT).show();
            /* No estamos directamente dentro de la Activity, sino del listener (la clase anónima).
            El contexto es la enclosing class. */
                    }
                }
        );

    }
}