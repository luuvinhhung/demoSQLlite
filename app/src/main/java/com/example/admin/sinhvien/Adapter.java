package com.example.admin.sinhvien;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter {
    private Context context;
    private int layout;
    private ArrayList<SV> list;
    public Adapter(@NonNull Context context, int resource, @NonNull ArrayList<SV> objects) {
        super(context, resource, objects);
        this.context=context;
        this.layout=resource;
        this.list= objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,parent, false);

        TextView txtMa=convertView.findViewById(R.id.txtMa);
        TextView txtTen=convertView.findViewById(R.id.txtTen);

        SV sv=new SV(list.get(position));
        txtMa.setText(sv.getMa().toString());
        txtTen.setText(sv.getTen().toString());
        return convertView;
    }
}
