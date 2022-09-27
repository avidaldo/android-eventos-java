package com.example.eventosenjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MetodoXMLActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodo_xml);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
    }

    /**
     * Método asociado al TextView a través del atributo android:onClick
     * DEPRECATED (Obsoleto):
     * https://developer.android.com/reference/android/R.attr#onClick
     */
    public void miMetodoOnClick(View view) { // el método recibe como parámetro la View sobre la que se hizo el click (el botón)

        // Cambiando el texto del TextView con el contenido del EditText
        textView.setText(getString(R.string.hola_coma) + editText.getText());

        // Mostrando una notificación Toast
        Toast.makeText(this, R.string.metodo_xml, Toast.LENGTH_SHORT).show();
        /* El contexto es this, ya que al pertenecer el método onClick a la Activity, ésta es el contexto. */
    }


}