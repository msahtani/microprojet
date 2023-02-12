package com.example.microprojet.dao;

import com.example.microprojet.model.Client;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ClientRepo implements Repo<Client>{
    @Override
    public Client find(Long id) {



        try(
             Connection connection = connect();
             Statement statement = connection.createStatement();
        ){

        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    @Override
    public List<Client> findAll() {
        return null;
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
