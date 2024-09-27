package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class GestionMagasins {

    public static void main(String[] args) {
        Date date1 = new Date(2024 - 1900, 9, 30);
        Date date2 = new Date(2024 - 1900, 10, 5);
        Date date3 = new Date(2025 - 1900, 1, 15);

        Produit produit1 = new Produit(1021, "Lait", "Delice", 0.7, date1);
        Produit produit2 = new Produit(2510, "Yaourt", "Vitalait", 0.5, date2);
        Produit produit3 = new Produit(3250, "Tomate", "Sicam", 1.2, date3);

        Magasin magasin = new Magasin(1, "Centre Ville, Tunis", 50);

        magasin.ajouterProduit(produit1);
        magasin.ajouterProduit(produit2);
        magasin.ajouterProduit(produit3);

        magasin.afficherCaracteristiques();

        System.out.println("Nombre total de produits dans ce magasin: " + magasin.getTotalProduits());
    }
}
