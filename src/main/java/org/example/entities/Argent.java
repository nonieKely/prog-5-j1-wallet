package org.example.entities;

public class Argent {
    private Double valeur;
    private String devise;

    public Argent(Double valeur, String devise) {
        this.valeur = valeur;
        this.devise = devise;
    }

    public Double getValeur() {
        return valeur;
    }

    public String getDevise() {
        return devise;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }
}
