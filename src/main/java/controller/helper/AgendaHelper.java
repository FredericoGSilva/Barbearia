/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.helper;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import view.Agenda;

/**
 *
 * @author Frederico
 */
public class AgendaHelper implements IHelper {
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }
    
    public void preencherTabela(ArrayList<Agendamento> listaAgendamento) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTable1_Agendamentos().getModel();
        tableModel.setNumRows(0);
        for (Agendamento agendamento : listaAgendamento) {
            tableModel.addRow(new Object[] {
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        }
        
    }
    
    public void preencherClientes(ArrayList<Cliente> listaClientes) {
        DefaultComboBoxModel comboBox = (DefaultComboBoxModel) view.getjComboBox_Cliente().getModel();
        for (Cliente listaCliente : listaClientes) {
            comboBox.addElement(listaCliente);
        }
    }
    
    public void preencherServicos(ArrayList<Servico> listaServicos) {
        DefaultComboBoxModel comboBox = (DefaultComboBoxModel) view.getjComboBox_Servico().getModel();
        for (Servico listaServico : listaServicos) {
            comboBox.addElement(listaServico);
        }
    }
    
    public Servico obterServico() {
        return (Servico) view.getjComboBox_Servico().getSelectedItem();
    }
    
    public void setarValor(float valor) {
        view.getTxt_Valor().setText(valor + "");
    }
    
    public Cliente obterCliente() {
        return (Cliente) view.getjComboBox_Cliente().getSelectedItem();
    }

    @Override
    public Agendamento obterModelo() { 
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        float valor = Float.parseFloat(view.getTxt_Valor().getText());
        String data = view.getTxt_Data().getText();
        String hora = view.getTxt_Hora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getjTextArea1_Observacao().getText();
        Agendamento agendamento = new Agendamento(cliente, servico, valor, dataHora, observacao);
        return agendamento;
    }
    
    @Override
    public void limparTelas() {
        view.getTxt_Data().setText("");
        view.getTxt_Hora().setText("");
        view.getTxt_Valor().setText("");
        view.getjTextArea1_Observacao().setText("");
    }
    
}
