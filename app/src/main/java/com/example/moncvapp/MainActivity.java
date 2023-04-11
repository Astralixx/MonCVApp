package com.example.moncvapp;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Experience> experiences = new ArrayList<Experience>();
        experiences.add(new Experience("Septembre 2022",
                "Aujourd'hui",
                "Ministère de l'intérieur",
                "Informaticien responsable de la conduite de projet"));
        experiences.add(new Experience("Avril 2018",
                "Août 2019",
                "Technoclic",
                "Apprenti Développeur"));
        experiences.add(new Experience("Octobre 2015",
                "Décembre 2015",
                "Viz Media Europe",
                "Assistant Multimedia Supervisor"));
        ListView listViewExperiences= findViewById(R.id.listViewExperiences);
        ExperienceBaseAdapter adapter = new ExperienceBaseAdapter(experiences,this);
        listViewExperiences.setAdapter(adapter);



        ArrayList<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("2023 à 2025",
                "Architecte en informatique option Solutions Logicielles",
                "CFA INSTA, Paris(75002)"));
        formations.add(new Formation("2022 à 2023",
                "Concepteur / Développeur d'application",
                "CFA INSTA, Paris(75002)"));
        formations.add(new Formation("2019",
                "BTS SIO option SLAM",
                "CFA de la Faculté des métiers de Massy(91300)"));
        formations.add(new Formation("2014 à 2017",
                "niveau 2eme année",
                "Epitech, Paris"));
        formations.add(new Formation("2013",
                "Baccalauréat Scientifique",
                "Lycée Louise Michel, Gisors(27140)"));
        ListView listeViewFormation= findViewById(R.id.listViewFormation);
        FormationBaseAdapter adapterFormation = new FormationBaseAdapter(formations, this);
        listeViewFormation.setAdapter(adapterFormation);

        Button button= findViewById(R.id.buttonCompetence);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent(MainActivity.this, CompetenceActivity.class);
        startActivity(intent);
    }
}