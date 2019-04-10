package fr.paris10.nanterre.commande;

public class Ligne implements Ivisitable{
    private String name;

    @Override
    public void accept(Ivisitor visitor){
        visitor.visit(this);

    }
    String getName(){
        return name;
    }
    public Ligne(String Name)
    {
        name=Name;
    }
}
