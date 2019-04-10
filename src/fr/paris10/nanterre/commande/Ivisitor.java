package fr.paris10.nanterre.commande;

public interface Ivisitor {
    void  visit(Client c);
    void visit(Commande o);
    void visit(Ligne l);
    void afficherCommandes();


}
