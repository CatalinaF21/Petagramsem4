package com.cata.petagram;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PerfilFragment extends Fragment {

    private View view;
   /* private RecyclerView listaMascotasPer;
    ArrayList<mascota> mascotas;*/

    public PerfilFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_perfil, container, false);
        inicializarFotosMascotas();
        return view;
    }

    private  void inicializarFotosMascotas () {
        ArrayList<mascota> mascotas = new ArrayList<>();
        mascotas.add(new mascota (R.drawable.mas10,"Buny", "2"));
        mascotas.add(new mascota(R.drawable.mas10,"Buny","7"));
        mascotas.add(new mascota(R.drawable.mas10, "Buny","9"));
        mascotas.add(new mascota(R.drawable.mas10,"Buny","5"));
        mascotas.add(new mascota(R.drawable.mas10,"Buny","3"));
        mascotas.add(new mascota(R.drawable.mas10,"Buny","3"));
        mascotas.add(new mascota(R.drawable.mas10,"Buny","1"));
        mascotas.add(new mascota(R.drawable.mas10,"Buny","10"));
        mascotas.add(new mascota(R.drawable.mas10,"Buny","6"));
        mascotas.add(new mascota(R.drawable.mas10,"Buny","8"));

        RecyclerView recycler = view.findViewById(R.id.rvperfil);
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 2);
        recycler.setLayoutManager(grid);
        MascotaAdaptador adapter = new MascotaAdaptador(mascotas, getActivity(), true);
        recycler.setAdapter(adapter);
    }

}