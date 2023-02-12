package com.example.microprojet.dao;

import com.example.microprojet.model.Client;
import com.example.microprojet.model.Commande;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

public class CommandeRepo implements Repo<Commande>{
    @Override
    public Commande find(Long id) {

        Commande commande = null;

        final String SQL = "SELECT * FROM Commande WHERE id =" + id;
        ResultSet res;

        try(
                Connection connection = connect();
                Statement statement = connection.createStatement();
        ){

            res = statement.executeQuery(SQL);

            if(res.next()){

                ClientRepo clientRepo = ClientRepo.getInstance();
                // find the client object
                Client client = clientRepo.find(
                        res.getLong("code_client")
                );

                // create
                commande = new Commande(
                        res.getLong("id"),
                        res.getString("date"),
                        client
                );
            }

        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

        return commande;


    }

    @Override
    public Set<Commande> findAll() {
        return null;
    }

    @Override
    public void add(Commande obj) {

    }

    @Override
    public void update(Commande obj) {

    }

    @Override
    public void delete(Commande obj) {

    }

    @Override
    public void delete(Long id) {

    }
}
