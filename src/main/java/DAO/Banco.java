/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

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
            String url = "jdbc:mysql://localhost:3306/Barbearia?user=root&abril1999";
            conexao = DriverManager.getConnection(url);
            return  conexao;
        } catch (SQLException ex) {
            System.out.println("Falha na conexão com o banco: " + ex.getMessage());
            return null;
        }
    }
}
