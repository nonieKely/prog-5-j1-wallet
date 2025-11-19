package org.example.entities;

import java.util.List;

public class Portefeuille {
    private String couleur;
    private Integer porte_carte;
    private Double poids;
    private String marque;
    private List<Argent> somme;

    public Portefeuille(String couleur, Integer porte_carte, Double poids, String marque, List<Argent> somme) {
        this.couleur = couleur;
        this.porte_carte = porte_carte;
        this.poids = poids;
        this.marque = marque;
        this.somme = somme;
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

    public List<Argent> getArgent() {
        return somme;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public void setArgent(List<Argent> somme) {
        this.somme = somme;
    }
}
