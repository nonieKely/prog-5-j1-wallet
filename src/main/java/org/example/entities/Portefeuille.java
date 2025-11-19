package org.example.entities;

public class Portefeuille {
    private String couleur;
    private Integer porte_carte;
    private Double poids;
    private String marque;
    private Argent argent;

    public Portefeuille(String couleur, Integer porte_carte, Double poids, String marque, Argent argent) {
        this.couleur = couleur;
        this.porte_carte = porte_carte;
        this.poids = poids;
        this.marque = marque;
        this.argent = argent;
    }

    public String getCouleur() {
        return couleur;
    }

    public Integer getPorte_carte() {
        return porte_carte;
    }

    public Double getPoids() {
        return poids;
    }

    public String getMarque() {
        return marque;
    }

    public Argent getArgent() {
        return argent;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public void setArgent(Argent argent) {
        this.argent = argent;
    }
}
