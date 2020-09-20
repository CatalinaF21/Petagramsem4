package com.cata.petagram;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MascotaFavorita extends AppCompatActivity {
    ArrayList<mascota> mascotasfav;
    private RecyclerView listaMascotasFav;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota_favorita);

        androidx.appcompat.widget.Toolbar miActionBar=(androidx.appcompat.widget.Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        findViewById(R.id.space).setVisibility(View.GONE);

        listaMascotasFav = (RecyclerView) findViewById(R.id.rvfavmascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotasFav.setLayoutManager(llm);
        inicializarListaMascotasFav();
        inicializarAdpatador();

    }
    public MascotaAdaptador adaptador;
    private void inicializarAdpatador (){
        adaptador = new MascotaAdaptador(mascotasfav, this);
        listaMascotasFav.setAdapter(adaptador);
    }
    public  void inicializarListaMascotasFav () {
        mascotasfav = new ArrayList<mascota>();
        mascotasfav.add(new mascota(R.drawable.mas9,"Nilo","7"));
        mascotasfav.add(new mascota(R.drawable.mas8,"Candy","6"));
        mascotasfav.add(new mascota(R.drawable.mas5,"Leila","6"));
        mascotasfav.add(new mascota(R.drawable.mas2,"Tomm","5"));
        mascotasfav.add(new mascota(R.drawable.mas6,"Jymm","4"));
    }

}