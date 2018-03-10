package com.auribises.session1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ishantkumar on 10/03/18.
 */

public class ManagerRecyclerAdapter extends RecyclerView.Adapter<ManagerRecyclerAdapter.ViewHolder> {

    Context context;
    int resource;
    ArrayList<Manager> objects;

    public ManagerRecyclerAdapter(Context context, int resource, ArrayList<Manager> objects) {
        this.context = context;
        this.resource = resource;
        this.objects = objects;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(resource,parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Manager manager = objects.get(position);

        holder.iv.setBackgroundResource(manager.image);
        holder.txtName.setText(manager.name);
        holder.txtPhone.setText(manager.phone);

    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView iv;
        TextView txtName;
        TextView txtPhone;


        public ViewHolder(View itemView) {
            super(itemView);

            iv = itemView.findViewById(R.id.imageView);
            txtName = itemView.findViewById(R.id.textViewName);
            txtPhone = itemView.findViewById(R.id.textViewPhone);

        }
    }
}
