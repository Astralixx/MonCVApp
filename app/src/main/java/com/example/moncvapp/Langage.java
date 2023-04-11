package com.example.moncvapp;

public class Langage {
    private String  langages;
    private Float   rating;

    public Langage(String langages, Float rating) {
        this.langages = langages;
        this.rating = rating;
    }

    public String getLangages() {
        return langages;
    }

    public void setLangages(String langages) {
        this.langages = langages;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Langage{" +
                "langages='" + langages + '\'' +
                ", rating=" + rating +
                '}';
    }
}
