package com.example.microprojet.model;

import java.util.List;

public class LigneCommande {

    private Long numCmd ;

    private Long codeArticle ;

    private int qteCmd ;

    private Commande commande ;
    private List<Article>  articles ;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Long getNumCmd() {
        return numCmd;
    }

    public void setNumCmd(Long numCmd) {
        this.numCmd = numCmd;
    }

    public Long getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(Long codeArticle) {
        this.codeArticle = codeArticle;
    }

    public int getQteCmd() {
        return qteCmd;
    }

    public void setQteCmd(int qteCmd) {
        this.qteCmd = qteCmd;
    }
}
