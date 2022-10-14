/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Frederico
 */
public class Banco {
    
    public static Connection conector() {
         Connection conexao = null;
         try {
            String url = "jdbc:mysql://127.0.0.1:3306/barbearia?user=root&password=abril1999";
            conexao = DriverManager.getConnection(url);
            return  conexao;
        } catch (SQLException ex) {
            System.out.println("Falha na conexão com o banco: " + ex.getMessage());
            return null;
        }
    }
}
