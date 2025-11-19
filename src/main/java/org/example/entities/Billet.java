package org.example.entities;

public class Billet {
    private Double somme;
    private String devise;

    public Billet(Double somme, String devise) {
        this.somme = somme;
        this.devise = devise;
    }

    public Double getSomme() {
        return somme;
    }

    public String getDevise() {
        return devise;
    }

    public void setSomme(Double somme) {
        this.somme = somme;
    }
}
