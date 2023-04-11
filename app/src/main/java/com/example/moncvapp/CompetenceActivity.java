package com.example.moncvapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CompetenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competences);

        ArrayList<Langage> langages = new ArrayList<Langage>();
        langages.add(new Langage("VBA", 4f));
        langages.add(new Langage("C", 3.5f));
        langages.add(new Langage("Python", 2f));
        langages.add(new Langage("Java", 2f));
        langages.add(new Langage("Php", 1.5f));
        langages.add(new Langage("C++", 2f));
        ListView listeViewLangage = findViewById(R.id.listViewLangage);
        LangageBaseAdapter adapterLangage = new LangageBaseAdapter(langages, this);
        listeViewLangage.setAdapter(adapterLangage);

        ArrayList<Projet> projets = new ArrayList<Projet>();
        projets.add(new Projet("ERP",
                "Création d'un logiciel ERP pour faciliter la gestion des notes de frais et des feuilles de congés",
                "https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        projets.add(new Projet("TABLEAU",
                "Mise en place d'une nouvelle solution d'auomatisation à l'aide de TABLEAU software",
                "https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        projets.add(new Projet("CDD",
                "Développement d'un logiciel pour automatiser la création de CDD",
                "https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        projets.add(new Projet("MonCv",
                "Petite application androïd pour présenter un CV",
                "https://www.youtube.com/watch?v=dQw4w9WgXcQ"));

        ListView listViewProjet = findViewById(R.id.listViewProjet);
        ProjetBaseAdapter adapterProjet = new ProjetBaseAdapter(projets, this);
        listViewProjet.setAdapter(adapterProjet);
    }
}
