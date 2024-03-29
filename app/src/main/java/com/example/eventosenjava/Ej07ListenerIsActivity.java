package com.example.eventosenjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ej07ListenerIsActivity extends AppCompatActivity implements View.OnClickListener {
    /* También se puede implementar la interfaz-listener en la propia Activity, aunque puede confundir,
     ya que rompe el Principio de responsabilidad única
    (https://es.wikipedia.org/wiki/Principio_de_responsabilidad_%C3%BAnica).
    Normalmente no es la mejor solución. Sin embargo, fue una práctica habitual en algún tiempo y
    aún pueden encontrarse códigos que lo utilizan.
    */

    TextView tv;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varias);

        tv = findViewById(R.id.textView);
        et = findViewById(R.id.editText);

        Button boton = findViewById(R.id.button);

        boton.setOnClickListener(this); /* El método recibe el propio objeto de la activity, ya que
        ahora es también un escuchador (contiene el método al que se llamará cuando suceda el evento) */

    }

    @Override
    public void onClick(View v) {
        tv.setText(getString(R.string.hola_coma) + et.getText());
        ((Button) v).setText(R.string.saluda_nuevo);
        Toast.makeText(this, R.string.activity_como_listener, Toast.LENGTH_SHORT).show();
        /* Permite acceso directo al contexto (la activity) */
    }

}