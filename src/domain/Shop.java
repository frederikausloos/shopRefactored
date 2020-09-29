package domain;

import java.util.ArrayList;

public class Shop {
    ArrayList<Product> producten;

    public Shop() {
        producten = new ArrayList<>();
    }

    public void add (Product p){
        producten.add(p);
    }

    public ArrayList<Product> getProducten (){
        return producten;
    }

    public Product getProduct (String id){
        for (Product p : producten){
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
}
