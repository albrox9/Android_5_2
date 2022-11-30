package org.abrox.t5_ejemplos.android_5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        //Recibimos el mensaje de la pantalla principal y lo mostramos
        mostrarMensaje();

    }

    private void mostrarMensaje() {

        //Recibimos el mensaje del intent principal.
        String mensaje = getIntent().getStringExtra("mensaje");

        //mostramos el mensaje recibido en un toast.
        Toast.makeText(this,mensaje, Toast.LENGTH_LONG).show();
    }

    public void contestar(View view) {

        EditText et = findViewById(R.id.edTextoContesta);
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("contestacion", et.getText().toString());

        //La contestación.
        setResult(RESULT_OK,i);

        finish();


    }

    /*public void contestar(){
        String mensajeContesta = ((EditText)(findViewById(R.id.edTexto))).getText().toString();
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("contestacion", mensajeContesta);
        setResult(RESULT_OK,i);
        finish();

    }*/
}