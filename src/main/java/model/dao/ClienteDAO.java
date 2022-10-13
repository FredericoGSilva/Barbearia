/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author Frederico
 */
public class ClienteDAO {
    Connection conector = new Banco().conector();
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public ArrayList<Cliente> recuperarDados() {
        try {
            String url = "select * from tb_Clientes";
            PreparedStatement statement = conector.prepareStatement(url);
            statement.execute();
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String sexo = resultSet.getString("sexo");
                String dataNascimento = resultSet.getString("dataNascimento");
                String telefone = resultSet.getString("telefone");
                String email = resultSet.getString("email");       
                String rg = resultSet.getString("rg");
                String endereco =resultSet.getString("endereco");
                String cep = resultSet.getString("cp");
                Cliente cliente = new Cliente(id, nome, sexo, dataNascimento, telefone, email, rg, endereco, cep);      
                listaClientes.add(cliente);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na classe ClienteDAO: " + ex);
        }
        return listaClientes;
    }
}
