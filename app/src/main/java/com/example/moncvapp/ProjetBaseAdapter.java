package com.example.moncvapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjetBaseAdapter extends BaseAdapter {
    private ArrayList<Projet>   projets;
    private Context             context;

    public ProjetBaseAdapter(ArrayList<Projet> projets, Context context) {
        this.projets = projets;
        this.context = context;
    }

    @Override
    public int getCount() {
        return projets.size();
    }

    @Override
    public Object getItem(int position) {
        return projets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_projet, parent, false);
        }
        TextView textViewNomProjet = convertView.findViewById(R.id.textViewNomPojet);
        textViewNomProjet.setText(projets.get(position).getNom());
        TextView textViewProjetDescription = convertView.findViewById(R.id.textViewProjetDescription);
        textViewProjetDescription.setText(projets.get(position).getDescription());
        Button buttonGit = convertView.findViewById(R.id.buttonGit);
        buttonGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(projets.get(position).getLien()));
                context.startActivity(intent);
            }
        });
        return convertView;
    }
}
