package fr.paris10.nanterre.commande;

import java.util.ArrayList;

public class GroupeClient implements Ivisitable{
    private String name;
    private ArrayList<Client> clients=new ArrayList<Client>();
    @Override
   public void accept(Ivisitor visitor){
        clients.forEach(x -> x.accept(visitor));
    }

    public GroupeClient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addClient(Client c){
        this.clients.add(c);
    }

    public ArrayList<Client> getList() {
        return clients;
    }
}
