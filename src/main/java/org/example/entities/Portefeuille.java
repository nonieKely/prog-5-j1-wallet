package org.example.entities;

import java.util.List;

public class Portefeuille {
    private String couleur;
    private Integer porte_carte;
    private List<Carte> cartes;
    private Double poids;
    private String marque;
    private List<Argent> argent;

    public Portefeuille(String couleur, Integer porte_carte, Double poids, String marque, List<Argent> argent) {
        this.couleur = couleur;
        this.porte_carte = porte_carte;
        this.poids = poids;
        this.marque = marque;
        this.argent = argent;
    }

    // parce que ce ne sont pas toutes les portefeuilles qui ont des cartes
    public Portefeuille(String couleur, Integer porte_carte, List<Carte> cartes, Double poids, String marque, List<Argent> argent) {
        this.couleur = couleur;
        this.porte_carte = porte_carte;
        this.cartes = cartes;
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

    public List<Carte> getCartes() {
        return cartes;
    }

    public Double getPoids() {
        return poids;
    }

    public String getMarque() {
        return marque;
    }

    public List<Argent> getArgent() {
        return argent;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public void setArgent(List<Argent> argent) {
        this.argent = argent;
    }
}
