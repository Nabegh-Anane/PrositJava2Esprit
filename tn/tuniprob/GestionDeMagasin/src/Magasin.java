package tn.tuniprob.gestionmagasin;


public class Magasin {
    private int id;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int nbProduits;

    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[capacite];
        this.nbProduits = 0;
    }

    public boolean ajouterProduit(Produit produit) {
        if (nbProduits < capacite) {
            produits[nbProduits] = produit;
            nbProduits++;
            return true;
        } else {
            System.out.println("Le magasin a atteint sa capacité maximale de " + capacite + " produits.");
            return false;
        }
    }


    public void afficherCaracteristiques() {
        System.out.println("Magasin ID: " + id);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité: " + capacite);
        System.out.println("Produits:");
        for (int i = 0; i < nbProduits; i++) {
            System.out.println(produits[i]);
        }
    }

    public int getTotalProduits() {
        return nbProduits;
    }

    public Produit[] getProduits() {
        return produits;
    }
}
