package com.example.microprojet.dao;

import com.example.microprojet.model.Client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class ClientRepo implements Repo<Client>{

    // TODO: singleton pattern

    private ClientRepo(){}

    private static ClientRepo instance;

    public static ClientRepo getInstance(){
        if(instance == null)
            instance = new ClientRepo();

        return instance;
    }


    @Override
    public Client find(Long id) {

        Client client = null;

        final String SQL = "SELECT * FROM Client WHERE id =" + id;
        ResultSet res;

        try(
             Connection connection = connect();
             Statement statement = connection.createStatement();
        ){

            res = statement.executeQuery(SQL);

            if(res.next()){
                // Long id, String email, String nom, String prenom, String adresse, int codePostal, String ville, String tel, String passwd
                // TODO: create a constructor
                client = new Client(
                        res.getLong("id"),
                        res.getString("email"),
                        res.getString("nom"),
                        res.getString("prenom"),
                        res.getString("adresse"),
                        res.getInt("code_postal"),
                        res.getString("ville"),
                        res.getString("tel"),
                        res.getString("password")
                );
            }

        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

        return client;

    }

    @Override
    public Set<Client> findAll() {

        Set<Client> clients = new HashSet<>();

        final String SQL = "SELECT * FROM Client";

        ResultSet res;

        try(
                Connection connection = connect();
                Statement statement = connection.createStatement();
        ){

            res = statement.executeQuery(SQL);

            while (res.next()){
                // Long id, String email, String nom, String prenom, String adresse, int codePostal, String ville, String tel, String passwd
                // TODO: create a constructor
                clients.add(
                    new Client(
                            res.getLong("id"),
                            res.getString("email"),
                            res.getString("nom"),
                            res.getString("prenom"),
                            res.getString("adresse"),
                            res.getInt("code_postal"),
                            res.getString("ville"),
                            res.getString("tel"),
                            res.getString("password")
                    )
                );
            }

        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

        return clients;


    }

    @Override
    public void add(Client obj) {

    }

    @Override
    public void update(Client obj) {

    }

    @Override
    public void delete(Client obj) {
        delete(obj.getId());
    }

    @Override
    public void delete(Long id) {
        // TODO: full impl
    }
}
