package org.abrox.t5_ejemplos.android_5_2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.idBoton);


    }

    public void abrirSecundaria(View v){

        Intent i = new Intent(this, SecondaryActivity.class);
        //startActivity(i); //Si solo quisieramos abrirla sin respuesta.
        EditText ed = (EditText) findViewById(R.id.edTexto);

        i.putExtra("mensaje", ed.getText().toString());
        startActivityForResult(i,1);

    }

    //Para recibir la respuesta de la otra actividad.
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String mesajeContestacion = data.getStringExtra("contestacion");
        Toast.makeText(this, mesajeContestacion, Toast.LENGTH_LONG).show();
    }
}