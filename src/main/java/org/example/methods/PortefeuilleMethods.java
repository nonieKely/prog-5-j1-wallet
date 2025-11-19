package org.example.methods;

import org.example.entities.Argent;
import org.example.entities.Carte;
import org.example.entities.Portefeuille;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PortefeuilleMethods {

    public List<Argent> getSommedArgent(Portefeuille portefeuille){
        List<Argent> billets = portefeuille.getArgent();
        Map<String, Double > totalParDevise = billets.stream()
                .collect(Collectors.groupingBy(
                        Argent::getDevise,
                        Collectors.summingDouble(Argent::getValeur)
                ));

        List<Argent> sommedArgent = totalParDevise.entrySet().stream()
                .map(entry -> new Argent(entry.getValue(), entry.getKey()))
                .collect(Collectors.toList());

        return sommedArgent;

    }
    public List<Argent> addArgent(Portefeuille portefeuille , Argent argent){

       List<Argent> nouvelArgent = portefeuille.getArgent();
       nouvelArgent.add(argent);

       return nouvelArgent;
    }

    public List<Carte> addCarte ( Portefeuille portefeuille , Carte carte){
        List<Carte> nouvellesCartes = portefeuille.getCartes();
        nouvellesCartes.add(carte);

        return nouvellesCartes;
    }

    public List<Argent> perdArgent ( Portefeuille portefeuille , Argent argent){
        Double valeurPerdue = -1 * argent.getValeur();
        argent.setValeur(valeurPerdue);

        List<Argent> nouvelArgent = portefeuille.getArgent();
        nouvelArgent.add(argent);
        portefeuille.setArgent(nouvelArgent);

        return getSommedArgent(portefeuille);
    }
}
