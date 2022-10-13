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
import model.Servico;

/**
 *
 * @author Frederico
 */
public class ServicoDAO {
    
    Connection conector = new Banco().conector();
    ArrayList<Servico> listaServico = new ArrayList<>();
    
    public ArrayList<Servico> recuperarDados() {
        try {
            String sql = "select * from tb_Servico";
            PreparedStatement statement = conector.prepareStatement(sql);
            statement.execute();
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                Servico servico = new Servico();
                servico.setId(resultSet.getInt("id"));
                servico.setDescricao(resultSet.getString("descricao"));
                servico.setValor(resultSet.getFloat("valor"));
                listaServico.add(servico);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na classe ServicoDAO: " + ex);
        }
        return listaServico;
        
    }
}
