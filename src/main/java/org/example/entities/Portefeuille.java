package org.example.entities;

import java.util.List;

public class Portefeuille {
    private String couleur;
    private Integer porte_carte;
    private Double poids;
    private String marque;
    private List<Billet> argent;

    public Portefeuille(String couleur, Integer porte_carte, Double poids, String marque, List<Billet> argent) {
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

    public List<Billet> getArgent() {
        return argent;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public void setArgent(List<Billet> argent) {
        this.argent = argent;
    }
}
