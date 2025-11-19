package org.example;

public class Table {
    private Double longueur;
    private Double largeur ;
    private String etat;
    private String couleur;

    public Table(Double longueur, Double largeur, String etat, String couleur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.etat = etat;
        this.couleur = couleur;
    }

    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }

    public Double getLargeur() {
        return largeur;
    }

    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }


    public Double getSurface( Double longueur , Double largeur ) {
        return longueur*largeur;
    }
}
