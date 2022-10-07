package com.example.eventosenjava;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Ej06VersionFinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varias);

        TextView tv = findViewById(R.id.textView);
        EditText et = findViewById(R.id.editText);
        Button boton = findViewById(R.id.button);


        boton.setOnClickListener(v -> {
            if (!et.getText().toString().isEmpty()) { // (1)
                tv.setText(getString(R.string.hola_placeholder, et.getText())); // (2)
                ((Button) v).setText(R.string.saluda_nuevo);
            } else {
                Toast.makeText(this, R.string.error_no_name, Toast.LENGTH_SHORT).show();
            }
        });

    }

}

/*
(1) Comprobamos si el EditText está vacío, en cuyo caso mostramos un mensaje de error en lugar
de "Hola, " mejorando así la experiencia de usuario (UX).

(2) Utilizamos un placeholder en el recurso del string. Al recuperar el recurso, el método
Context.getString() permite pasar además del identificador, una serie de argumentos que se pondrán
en los huecos del string indicados mediante etiquetas (estos son los placeholders).
https://developer.android.com/guide/topics/resources/string-resource#formatting-strings
https://developer.android.com/reference/java/util/Formatter.html
 */