package com.example.eventosenjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.eventosenjava.ej02_with_custom_listener.Ej02WithCustomListenerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.btn_to_metodo_xml);
        Intent intent = new Intent(this, Ej01MetodoXMLActivity.class);
        b1.setOnClickListener(v -> startActivity(intent));


        /* Haciendo lo mismo con el resto de botones en un paso: */

        findViewById(R.id.btn_to_listener_personalizado).setOnClickListener(
                v -> startActivity(new Intent(this, Ej02WithCustomListenerActivity.class)));
        findViewById(R.id.btn_to_listener_personalizado_inner).setOnClickListener(
                v -> startActivity(new Intent(this, Ej03WithInnerCustomListenerActivity.class)));
        findViewById(R.id.btn_to_clase_anonima).setOnClickListener(
                v -> startActivity(new Intent(this, Ej04ClaseAnonimaActivity.class)));
        findViewById(R.id.btn_to_lambda).setOnClickListener(
                v -> startActivity(new Intent(this, Ej05LambdaActivity.class)));
        findViewById(R.id.btn_to_final).setOnClickListener(
                v -> startActivity(new Intent(this, Ej06VersionFinalActivity.class)));
        findViewById(R.id.btn_to_activity_listener).setOnClickListener(
                v -> startActivity(new Intent(this, Ej07ListenerIsActivity.class)));

    }

}
