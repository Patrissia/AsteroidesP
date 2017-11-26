package com.example.ratones.asteroidesp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bAcercaDe;
    private Button bSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_con_linearlayout);
        setContentView(R.layout.activity_main);
        bAcercaDe = (Button)findViewById(R.id.button7);
        bAcercaDe.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                lanzarAcercaDe(null);
            }
        });

        /*Práctica Botón Salir - Mediante Escuchador*/
        Button bSalir=(Button) findViewById(R.id.button8);
        bSalir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
            }
        });
    }
    public void lanzarAcercaDe(View view){
        Intent i = new Intent(this, AcercaDeActivity.class);
        startActivity(i);
    }

    public void salir(View view){
        finish();
    }

    /*Menu*/
    @Override public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true; /*true->el menu ya está visible*/
    }

    @Override public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.action_settings){
            return true;
        }
        if(id==R.id.acercaDe){
            lanzarAcercaDe(null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

