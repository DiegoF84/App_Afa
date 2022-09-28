package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.app_afa.R;

import java.util.List;

import Models.Equipo;

public class EquiposAdapter extends BaseAdapter {

    private List<Equipo> equipos;

    public EquiposAdapter(List<Equipo> equipos){
        this.equipos=equipos;
    }
    @Override
    public int getCount() { return equipos.size();}

    @Override
    public Object getItem(int i) { return equipos.get(i);}

    @Override
    public long getItemId(int i) {return equipos.get(i).getAnio_fundacion();}

    @Override
    public View getView(int i, View ConvertView, ViewGroup parent) {

        View view;

        if( ConvertView == null)
            view=LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_equipo, parent, false);
        else
            view = ConvertView;

        Equipo equipo = (Equipo) getItem(i);

        TextView anio_fundacion = (TextView) view.findViewById(R.id.anio_fundacion);
        TextView nombre = (TextView) view.findViewById(R.id.nombre);
        TextView provincia= (TextView) view.findViewById(R.id.provincia);

        anio_fundacion.setText(String.valueOf(equipo.getAnio_fundacion()));
        nombre.setText(equipo.getNombre());
        provincia.setText(equipo.getProvincia());



        return view;
    }
}
