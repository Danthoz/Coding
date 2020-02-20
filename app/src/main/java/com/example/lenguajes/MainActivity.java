package com.example.lenguajes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //Metodo para asgirnar funciones de las opciones
    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();

        if (id==R.id.inicio){
            Toast.makeText(this,"Inicio", Toast.LENGTH_SHORT).show();
        } else if (id==R.id.ce){
            Toast.makeText(this,"Opcion C#", Toast.LENGTH_SHORT).show();
        } else if (id==R.id.java){
            Toast.makeText(this,"Opcion Java", Toast.LENGTH_SHORT).show();
        } else if (id==R.id.javascript){
            Toast.makeText(this,"Opcion JavaScript", Toast.LENGTH_SHORT).show();
        } else if (id==R.id.python){
            Toast.makeText(this,"Opcion Python", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
