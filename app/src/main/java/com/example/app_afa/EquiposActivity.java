package com.example.app_afa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Adapter.EquiposAdapter;
import Models.Equipo;

public class EquiposActivity extends AppCompatActivity {

    private ListView listaEquipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipos);

        listaEquipos = (ListView) findViewById(R.id.lv_listaequipo);
        List<Equipo> equipos = new ArrayList<>();
        equipos.add(new Equipo(1901,"RIVER PLATE","BUENOS AIRES") );
        equipos.add(new Equipo(1901,"BOCA JUNIORS","BUENOS AIRES") );
        equipos.add(new Equipo(1903,"RACING CLUB","BUENOS AIRES") );
        equipos.add(new Equipo(1904,"INDEPENDIENTE","BUENOS AIRES") );
        equipos.add(new Equipo(1908,"SAN LORENZO","BUENOS AIRES") );
        equipos.add(new Equipo(1908,"HURACAN","BUENOS AIRES") );
        equipos.add(new Equipo(1903,"NEWELL´S OLD BOYS","SANTA FE") );
        equipos.add(new Equipo(1889,"ROSARIO CENTRAL","SANTA FE") );
        equipos.add(new Equipo(1913,"TALLERES","CORDOBA") );
        equipos.add(new Equipo(1915,"LANUS","BUENOS AIRES") );

        listaEquipos.setAdapter(new EquiposAdapter(equipos));

        listaEquipos.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                Equipo equipo = (Equipo) listaEquipos.getItemAtPosition(i);
                Toast.makeText(EquiposActivity.this,
                        "Fundacion" + equipo.getAnio_fundacion() +"Nombre" + equipo.getNombre()
                                + "provincia" + equipo.getProvincia(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}