package com.example.eventosjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /* También se podría implementar la interfaz-listener en la propia Activity, aunque es poco
    habitual. Normalmente no es la mejor solución */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv);

        tv.setOnClickListener(this); /* El método recibe el propio objeto de la activity, ya que
        ahora es también un escuchador (contiene el método al que se llamará cuando suceda el evento) */
    }

    // Métcdo del listener
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, R.string.activity_as_listener, Toast.LENGTH_SHORT).show();
    }
}