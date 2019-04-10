package fr.paris10.nanterre.commande;

import java.util.ArrayList;

public class Commande implements Ivisitable{
    private ArrayList<Ligne> ligne=new ArrayList<Ligne>();
    private String Name;
    @Override
    public void accept(Ivisitor visitor){
        visitor.visit(this);
        this.ligne.forEach(x -> x.accept(visitor));

    }
    public String getName(){
        return Name;
    }
    public void addLigne(Ligne l){
        this.ligne.add(l);
    }

    public Commande(String name) {
        Name = name;
    }

    public Commande(ArrayList<Ligne> ligne, String name) {
        this.ligne = ligne;
        Name = name;
    }

    public ArrayList<Ligne> getList() {
        return ligne;
    }
}
