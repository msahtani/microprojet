package com.example.microprojet.model;

import java.util.ArrayList;
import java.util.List;

public class Commande {

    private Long numCmd ;

    private String codeClient ;

    private String date ;
    private Client client ;

    private List<LigneCommande> ligneCommande ;

    public Long getNumCmd() {
        return numCmd;
    }

    public void setNumCmd(Long numCmd) {
        this.numCmd = numCmd;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
