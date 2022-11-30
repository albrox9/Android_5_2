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


    }



    public void abreVentana(View view) {
        Intent i =  new Intent(this, SecondaryActivity.class);

        EditText ed = findViewById(R.id.edTexto);

        i.putExtra("mensaje", ed.getText().toString());

        startActivityForResult(i, 1);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(this, data.getStringExtra("contestacion"), Toast.LENGTH_SHORT).show();
    }

    //Para recibir la respuesta de la otra actividad.
    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String mesajeContestacion = data.getStringExtra("contestacion");
        Toast.makeText(this, mesajeContestacion, Toast.LENGTH_LONG).show();
    }*/
}