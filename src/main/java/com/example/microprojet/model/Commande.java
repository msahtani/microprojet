package com.example.microprojet.model;

import java.util.List;

public class Commande {

    private Long numCmd ;

    private String date ;

    public Commande(Long numCmd, String date, Client client) {
        this.numCmd = numCmd;
        this.date = date;
        this.client = client;
    }

    private Client client ;

    private List<LigneCommande> ligneCommande ;

    public Long getNumCmd() {
        return numCmd;
    }

    public void setNumCmd(Long numCmd) {
        this.numCmd = numCmd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
