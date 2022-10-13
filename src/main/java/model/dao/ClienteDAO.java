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
                Cliente cliente = new Cliente();
                cliente.setId(resultSet.getInt("id"));
                cliente.setNome(resultSet.getString("nome"));
                cliente.setSexo(resultSet.getString("sexo"));
                cliente.setDataNascimento(resultSet.getDate("dataNascimento"));
                cliente.setTelefone(resultSet.getString("telefone"));
                cliente.setEmail(resultSet.getString("email"));
                cliente.setRg(resultSet.getString("rg"));
                cliente.setEndereco(resultSet.getString("endereco"));
                cliente.setCep(resultSet.getString("cp"));
                listaClientes.add(cliente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na classe ClienteDAO: " + ex);
        }
        return listaClientes;
    }
}
