package com.example.eventosenjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ej03WithInnerCustomListenerActivity extends AppCompatActivity {
    private EditText et;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varias);

        et = findViewById(R.id.editText);
        tv = findViewById(R.id.textView);
        // tv y et necesitan ser declarados fuera del método para ser visibles desde la inner class

        Button boton = findViewById(R.id.button);


        boton.setOnClickListener(new CustomOnClickListener());
    }


    /**
     * Clase interna (inner class) que implementa la interfaz OnClickListener. Igual que en el Ej02 pero
     * ahora tenemos visibilidad a los campos de la clase externa (enclosing class) directamente y no
     * es necesario pasarlos en el constructor.
     */
    private class CustomOnClickListener implements View.OnClickListener {

        /**
         * Método que saltará ante el evento de un click sobre el elemento.
         * @param v referencia al objeto de la vista que lanzó el evento (sobre la que se hizo click)
         */
        @Override
        public void onClick(View v) {

            // Cambiando el texto del TextView con el contenido del EditText
            tv.setText(getString(R.string.hola_coma) + et.getText()); // (1)

            ((Button) v).setText(R.string.saluda_nuevo);

            Toast.makeText(Ej03WithInnerCustomListenerActivity.this, R.string.listener_personalizado, Toast.LENGTH_SHORT).show();
            //Toast.makeText(getParent(), R.string.listener_personalizado, Toast.LENGTH_SHORT).show();
            /* El contexto es el de la actividad: la enclosing class, que es también la clase padre (getParent()). */
        }
    }

}

/**
 * (1) Ahora podemos volver a llamar directamente al método getString ya que estamos dentro del scope (ámbito) de
 * visibilidad de la activity.
 */
