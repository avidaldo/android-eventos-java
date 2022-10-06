package com.example.eventosenjava.ej02_with_custom_listener;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.eventosenjava.R;

/* Clase que implemente la interfaz OnClickListener, que obliga a sobreescribir el método onClick */
class CustomOnClickListener implements View.OnClickListener {
    TextView tv;
    EditText et;


    /**
     * El constructor tiene que recibir las referencias al TextView y al EditText ya que pertenecen a la
     * activity (están en su contexto), y necesitamos acceso a ellos para las acciones a realizar en
     * el método onClick.
     */
    public CustomOnClickListener(TextView textView, EditText editText) {
        this.tv = textView;
        this.et = editText;
    }


    /**
     * Método que saltará ante el evento de un click sobre el elemento.
     *
     * @param vista referencia la vista (1) que lanzó el evento (sobre la que se hizo click)
     */
    @Override
    public void onClick(View vista) {

        // Cambiando el texto del TextView con el contenido del EditText
        tv.setText(vista.getContext().getString(R.string.hola_coma) + et.getText()); // (2)

        /* Si queremos modificar el texto del propio botón necesitamos castear a su subclase Button
        ya que no toda view tiene un campo text. (Button, como toda vista, lo es por heredar de la clase View) */
        ((Button) vista).setText(R.string.saluda_nuevo);

        Toast.makeText(vista.getContext(), R.string.listener_personalizado, Toast.LENGTH_SHORT).show();
        /* Podemos usar el contexto de la vista, que es la activity que la contiene. */
    }
}


/**
 * (1) Todos los objetos "visuales" (Layouts, TextViews, botones...) se llaman vistas y heredan
 * de la clase View.
 *
 *
 * (2) El método "getString(int)" pertenece a la clase Context. Las activities son contextos válidos
 * (heredan de Context), pero nuestro listener es una clase diferente así que no tiene ese método.
 * Para poder acceder al recurso necesitaremos acceder al contexto a través de la vista que se recibe
 * como parámetro y que sí pertenece ya al contexto de la activity (desde que se cargó en esta al
 * llamar a setContentView).
 *
 */