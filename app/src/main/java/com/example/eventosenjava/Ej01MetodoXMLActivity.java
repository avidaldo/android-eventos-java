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

        tv = findViewById(R.id.textView);
        et = findViewById(R.id.editText);
    }

    /**
     * Método asociado al TextView a través del atributo android:onClick en res/layout/activity_metodo_xml.xml
     * DEPRECATED (Obsoleto): https://developer.android.com/reference/android/R.attr#onClick
     */
    public void miMetodoOnClick(View view) {

        String recursoHolaComa = getString(R.string.hola_coma);
        tv.setText(recursoHolaComa + et.getText()); // (1)
        // TODO: usar placeholders

        // Mostrando una notificación Toast
        Toast.makeText(this, R.string.metodo_xml, Toast.LENGTH_SHORT).show(); // (2)
    }

}

/*
 * (1) Cuando seteamos directamente un String podemos utilizar setText(int) para pasar un recurso,
 * como cuando usábamos tv.setText(R.string.hola_mundo). Sin embargo, al querer concatenar ese recurso
 * con un String recogido en tiempo de ejecución (runtime) del EditText, tenemos que recuperar
 * explicitamente el recurso. Para recuperar un String de strings.xml se puede utilizar el método
 * Context.getString(int) que recibe la variable que tiene el string en el fichero de recursos y
 * devuelve el string asociado.
 *
 * Para poder acceder a un recurso es necesario tener acceso al contexto.
 * El método "getString(int)" de la clase Context (de la que hereda Activity) permite recuperar un
 * String declarado en el fichero de recursos res/values/strings.xml.
 *
 * Todos los strings de nuestra aplicación deben estar siempre en ficheros de recursos para poder,
 * por ejemplo, tener versiones en distintos idiomas que cambien acorde a la configuración del
 * sistema.
 *
 *
 *
 * (2) El método factoría Toast.makeText() recibe como primer parámetro el contexto en el que se ejecuta.
 * Cada activity es un contexto, ya que la clase Activity hereda de la clase Context.
 * El contexto es this, ya que al pertenecer el método onClick a la Activity, ésta es el contexto.
 *
 * Al igual que el método TextView.setText, Toast.makeText() está sobrecargado para
 * aceptar como segundo parámetro Strings o ints. Cuando acepta ints interpreta estos como identificadores
 * de recursos.
 */
