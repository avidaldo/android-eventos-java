package com.example.eventosenjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class WithCustomListenerActivity extends AppCompatActivity {
    private TextView tv;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varias);

        // variable que referencia al objeto con id "textView" autogenerado desde el layout
        tv = findViewById(R.id.textView);
        // La clase R contiene los identificadores de todos los objetos autogenerados
        et = findViewById(R.id.editText);
        // tv y et necesitan ser declarados fuera del método para ser visibles desde la inner class


        Button boton = findViewById(R.id.button);

        /** Creación de clase que implementa el listener. Estilo clásico Java. Es raro hacerlo así ya que no
         tiene mucho sentido tener un clase solo para eso. Generas ficheros innecesariamente */

        // Se asigna un escuchador OnClickListener; objeto que indica qué hacer ante un click en el botón.
        boton.setOnClickListener(new CustomOnClickListener()); // Se asigna un objeto de la clase MyOnClickListener
        /* De este modo, el objeto boton tiene como atributo un objeto Listener que tiene el método
        onClick al que se llamará cuando suceda el evento. */
    }


    /**
     * Clase interna (inner class )que implementa la interfaz OnClickListener, diseñada para poder gestionar eventos de click
     * sobre elementos gráficos. Esta interfaz obliga a sobreescribir el método onClick.
     */
    private class CustomOnClickListener implements View.OnClickListener {

        /**
         * Método que saltará ante el evento de un click sobre el elemento
         *
         * @param v referencia al objeto de la vista que lanzó el evento (sobre la que se hizo click)
         */
        @Override
        public void onClick(View v) {

            // Cambiando el texto del TextView con el contenido del EditText
            tv.setText("Hola, " + et.getText()); // (1)

            /* Si queremos modificar el texto del propio botón necesitamos castear a Button ya que no toda view tiene texto.
            (Button, como toda vista, lo es por heredar de la clase View) */
            ((Button) v).setText(R.string.saluda_nuevo);

            Toast.makeText(WithCustomListenerActivity.this, R.string.listener_personalizado, Toast.LENGTH_SHORT).show();
            /* El contexto es el de la actividad. */
        }
    }

}

/*
// (1) No deben hardcodearse strings literales, sino recuperarse como recursos de strings.xml.
// Para poder acceder a un recurso es necesario tener acceso al contexto.
// El contexto puede ser accesible desde la vista que se recibe como parámetro.
// La linea sería mejor así:
tv.setText(v.getContext().getString(R.string.hola_coma) + et.getText());
tv.setText(getParent().getString(R.string.hola_coma) + et.getText());
 */