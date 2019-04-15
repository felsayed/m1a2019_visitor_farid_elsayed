package com.company;
import fr.paris10.nanterre.commande.Client;
import fr.paris10.nanterre.commande.Commande;
import fr.paris10.nanterre.commande.GroupeClient;
import fr.paris10.nanterre.commande.Ligne;
import fr.paris10.nanterre.commande.*;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

         ArrayList<GroupeClient> groupe=new ArrayList<GroupeClient>();
         Ivisitable client=new Client("els");
         Ivisitable commande=new Commande("Cmd 1");
         Ivisitable ligne = new Ligne("Ligne n°1");
        ((Commande) commande).addLigne((Ligne) ligne);
        ((Client) client).addCommande((Commande) commande);
        GroupeClient groupeClient = new GroupeClient("m1APP");
        groupeClient.addClient((Client) client);
        RapportCommandes rapportCommandes = new RapportCommandes();
        groupeClient.accept(rapportCommandes);
        rapportCommandes.afficherCommandes();

    }
}
