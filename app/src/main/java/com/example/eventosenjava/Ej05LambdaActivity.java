package com.example.eventosenjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ej05LambdaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varias);

        TextView tv = findViewById(R.id.textView);
        EditText et = findViewById(R.id.editText);
        Button boton = findViewById(R.id.button);


        boton.setOnClickListener(v -> {
            tv.setText(getString(R.string.hola_coma) + et.getText()); // (1)
            ((Button) v).setText(R.string.saluda_nuevo);
            Toast.makeText(this, R.string.lambda, Toast.LENGTH_SHORT).show(); // (1)
        });

    }

}

/* (1) La diferencia entre pasar una lambda y un objeto (aunque sea de una clase anónima), es que
la lambda es directamente tratada como un objeto y por tanto sus instrucciones no están dentro
de una clase interna. De este modo, tenemos visibilidad directa de la Activity y por eso
podemos utilizar directamente el método getString o utilizar this como contexto.
 */