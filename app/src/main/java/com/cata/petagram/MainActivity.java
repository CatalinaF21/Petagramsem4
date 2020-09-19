package com.cata.petagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        androidx.appcompat.widget.Toolbar miActionBar=(androidx.appcompat.widget.Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvmascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdpatador();
    }

    public void irSegundaActividad (View view){
        Intent intent = new Intent(MainActivity.this, MascotaFavorita.class);
        startActivity(intent);

    }
    public MascotaAdaptador adaptador;
    private void inicializarAdpatador (){
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }
    public  void inicializarListaMascotas () {
        mascotas = new ArrayList<mascota>();
        mascotas.add(new mascota(R.drawable.mas1,"Mikke","3"));
        mascotas.add(new mascota(R.drawable.mas2,"Tomm","5"));
        mascotas.add(new mascota(R.drawable.mas3,"Padi","2"));
        mascotas.add(new mascota(R.drawable.mas4,"Astro","1"));
        mascotas.add(new mascota(R.drawable.mas5,"Leila","6"));
        mascotas.add(new mascota(R.drawable.mas6,"Jymm","4"));
        mascotas.add(new mascota(R.drawable.mas7,"Celus","4"));
        mascotas.add(new mascota(R.drawable.mas8,"Candy","6"));
        mascotas.add(new mascota(R.drawable.mas9,"Nilo","7"));
        mascotas.add(new mascota(R.drawable.mas10,"Buny","2"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mAcerca:
                Intent intent = new Intent(this,ActivityAcerca.class);
                startActivity(intent);
                break;

            case R.id.mContacto:
                Intent intent1 = new Intent(this,ActivityContacto.class);
                startActivity(intent1);
                break;

        }


        return super.onOptionsItemSelected(item);
    }
}