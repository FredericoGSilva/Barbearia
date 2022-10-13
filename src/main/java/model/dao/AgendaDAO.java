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
import model.Agendamento;
import model.Cliente;
import model.Servico;

/**
 *
 * @author Frederico
 */
public class AgendaDAO {
    Connection conector = new Banco().conector();
    ArrayList<Agendamento> listaAgendamento = new ArrayList<>();
    
    public ArrayList<Agendamento> recuperDados() {
        try {
            String sql = "select * from tb_Agendamento";
            PreparedStatement statement = conector.prepareStatement(sql);
            statement.execute();
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                Servico servico = new Servico();
                int id = resultSet.getInt("id");
                cliente.setNome(resultSet.getString("cliente"));
                servico.setDescricao(resultSet.getString("servico"));
                float valor = resultSet.getFloat("valor");
                String data = resultSet.getString("dataAgendamento");
                String hora = resultSet.getString("hora");
                Agendamento agendamento = new Agendamento(id, cliente, servico, valor, data, hora);
                listaAgendamento.add(agendamento);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na classe AgendaDAO: " + ex);
        }
        return listaAgendamento;
    }
    
}