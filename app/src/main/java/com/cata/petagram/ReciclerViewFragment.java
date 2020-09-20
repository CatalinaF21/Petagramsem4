package com.cata.petagram;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ReciclerViewFragment extends Fragment {

    ArrayList<mascota> mascotas;
    private RecyclerView listaMascotas;
    private View view;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) view.findViewById(R.id.rvmascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdpatador();
        return view;
    }
    public MascotaAdaptador adaptador;
    private void inicializarAdpatador (){
        adaptador = new MascotaAdaptador(mascotas, getActivity());
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

}
