package com.example.eventosenjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ej01MetodoXMLActivity extends AppCompatActivity {
    private TextView tv;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodo_xml);

        tv = findViewById(R.id.textView); // buscamos el objeto con id "textView" autogenerado desde el layout
        et = findViewById(R.id.editText);
        /* La clase R contiene los identificadores de todos los objetos autogenerados desde los
        ficheros de recursos en res/layout */
    }

    /**
     * Método asociado al TextView a través del atributo android:onClick en res/layout/activity_metodo_xml.xml
     * DEPRECATED (Obsoleto): https://developer.android.com/reference/android/R.attr#onClick
     */
    public void miMetodoOnClick(View view) { // el método recibe como parámetro la View sobre la que se hizo el click (el botón)

        // Cambiando el texto del TextView con el contenido del EditText
        tv.setText("Hola, " + et.getText()); // (1)
        //tv.setText(getString(R.string.hola_coma) + et.getText());

        // Mostrando una notificación Toast
        Toast.makeText(this, R.string.metodo_xml, Toast.LENGTH_SHORT).show();
        /* El contexto es this, ya que al pertenecer el método onClick a la Activity, ésta es el contexto. */
    }

}

/*
 * (1) No deben hardcodearse strings literales, sino recuperarse como recursos de strings.xml.
 * La línea sería mejor así:
 tv.setText(getString(R.string.hola_coma) + et.getText());
 *
 * Para poder acceder a un recurso es necesario tener acceso al contexto.
 * El método "getString(int)" de la clase Context (de la que hereda Activity) permite recuperar un
 * String declarado en el fichero de recursos res/values/strings.xml.
 *
 *  Todos los strings de nuestra aplicación deben estar siempre en ficheros de recursos para poder,
 *  por ejemplo, tener versiones en distintos idiomas que cambien acorde a la configuración del
 *  sistema.
 */
