package org.example.entities;

public class Carte {
    private String agence;
    private Argent somme;

    public Carte(String agence, Argent somme) {
        this.agence = agence;
        this.somme = somme;
    }

    public String getAgence() {
        return agence;
    }

    public Argent getSomme() {
        return somme;
    }

    public void setSomme(Argent somme) {
        this.somme = somme;
    }
}
