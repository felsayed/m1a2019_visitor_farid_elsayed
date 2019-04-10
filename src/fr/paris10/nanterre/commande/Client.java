package fr.paris10.nanterre.commande;

import java.util.ArrayList;

public class Client implements Ivisitable{
    private ArrayList<Commande> commande=new ArrayList<Commande>();
    private String name;
    @Override
    public void accept(Ivisitor visitor){
        visitor.visit(this);
        this.commande.forEach(x -> x.accept(visitor));
    }

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCommande(Commande c){
        this.commande.add(c);
    }

    public ArrayList<Commande> getList() {
        return commande;
    }

    @Override
    public String toString() {
        return "Client{" +
                "commande=" + commande +
                ", name='" + name + '\'' +
                '}';
    }
}
