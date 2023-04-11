package com.example.moncvapp;

public class Projet {
    private String  nom;
    private String  description;
    private String  lien;

    public Projet(String nom, String description, String lien) {
        this.nom = nom;
        this.description = description;
        this.lien = lien;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    @Override
    public String toString() {
        return "Projet{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", lien='" + lien + '\'' +
                '}';
    }
}
