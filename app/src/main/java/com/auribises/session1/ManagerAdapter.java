package com.auribises.session1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ishantkumar on 10/03/18.
 */

public class ManagerAdapter extends ArrayAdapter<Manager> {

    Context context;
    int resource;
    ArrayList<Manager> objects;

    public ManagerAdapter(Context context, int resource, ArrayList<Manager> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.objects = objects;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View view = null;

        view = LayoutInflater.from(context).inflate(resource,parent,false);

        ImageView iv = view.findViewById(R.id.imageView);
        TextView txtName = view.findViewById(R.id.textViewName);
        TextView txtPhone = view.findViewById(R.id.textViewPhone);

        Manager manager = objects.get(position);

        iv.setBackgroundResource(manager.image);
        txtName.setText(manager.name);
        txtPhone.setText(manager.phone);


        return view;
    }
}
