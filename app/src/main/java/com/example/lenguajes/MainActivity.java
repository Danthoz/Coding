package com.example.lenguajes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

        if (id==R.id.ce){
            Toast.makeText(this,"Opcion C#", Toast.LENGTH_SHORT).show();
            Intent abreC = new Intent(this, ActCe.class);
            startActivity(abreC);
        } else if (id==R.id.java){
            Toast.makeText(this,"Opcion Java", Toast.LENGTH_SHORT).show();
            Intent abreJava = new Intent(this, ActJava.class);
            startActivity(abreJava);
        } else if (id==R.id.javascript){
            Toast.makeText(this,"Opcion JavaScript", Toast.LENGTH_SHORT).show();
            Intent abreJS = new Intent(this, ActJS.class);
            startActivity(abreJS);
        } else if (id==R.id.python){
            Toast.makeText(this,"Opcion Python", Toast.LENGTH_SHORT).show();
            Intent abrePython = new Intent(this, ActPython.class);
            startActivity(abrePython);
        }
        return super.onOptionsItemSelected(item);
    }

    public void abreC(View view){
        Intent abreC = new Intent(this, ActCe.class);
        startActivity(abreC);
    }
    public void abreJava(View view){
        Intent abreJava = new Intent(this, ActJava.class);
        startActivity(abreJava);
    }
    public void abreJS(View view){
        Intent abreJS = new Intent(this, ActJS.class);
        startActivity(abreJS);
    }
    public void abrePython(View view){
        Intent abrePython = new Intent(this, ActPython.class);
        startActivity(abrePython);
    }
}
