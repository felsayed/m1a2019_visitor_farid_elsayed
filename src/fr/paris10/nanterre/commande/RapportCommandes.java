package fr.paris10.nanterre.commande;


 public class RapportCommandes implements Ivisitor {
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

     }

}
