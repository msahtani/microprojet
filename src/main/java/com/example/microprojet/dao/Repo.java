package com.example.microprojet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface Repo <E>{


    default Connection connect() throws SQLException, ClassNotFoundException {

        final String url = "jdbc:mysql://localhost:3306/shop",
                username = "root",
                password = "12345678";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }


    E find(Long id);

    List<E> findAll();

    void add(E obj);

    void update(E obj);

    void delete(E obj);

    void delete(Long id);


}
