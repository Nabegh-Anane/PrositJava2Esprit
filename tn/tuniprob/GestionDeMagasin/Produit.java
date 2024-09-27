package tn.tuniprob.gestionmagasin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produit {
    int id;
    String lib;
    String brand;
    double price;
    Date dateExpiration;

    public Produit() {
        this.id = 0;
        this.lib = "";
        this.brand = "";
        this.price = 0.0;
        this.dateExpiration = new Date(); 
    }

    public Produit(int id, String lib, String brand, double price, Date dateExpiration) {
        this.id = id;
        this.lib = lib;
        this.brand = brand;
        setPrice(price);
        this.dateExpiration = dateExpiration;
    }


    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Le prix ne peut pas être négatif.");
            this.price = 0.0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void afficher() {
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Identifiant : " + id);
        System.out.println("Libellé : " + lib);
        System.out.println("Marque : " + brand);
        System.out.println("Prix : " + price);
        System.out.println("Date d'expiration : " + sdf.format(dateExpiration));
        System.out.println("********************");
    }

    public boolean isManquantInfos() {
        return this.price == 0.0;
    }

    @Override
    public String toString() {
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Produit [ID=" + id + ", Libellé=" + lib + ", Marque=" + brand + ", Prix=" + price + ", Date d'expiration=" + sdf.format(dateExpiration) + "]";
    }
}
