package fr.paris10.nanterre.commande;


import java.util.ArrayList;
import java.util.List;

public class RapportCommandes implements Ivisitor {
     private List<Commande> cmd=new ArrayList<Commande>();
    @Override
   public void visit(Client c){
        System.out.println("Client visité :" +c.toString() );

    }
    @Override
    public void visit(Commande o){
        System.out.println("Client visité :" +o.toString() );

    }
    @Override
    public void visit(Ligne l){
        System.out.println("Client visité :" +l.toString() );
    }
    @Override
   public void afficherCommandes(){
        cmd.forEach(System.out::println);
     }

}
