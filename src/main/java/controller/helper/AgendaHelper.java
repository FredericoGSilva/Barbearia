/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.helper;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import view.Agenda;

/**
 *
 * @author Frederico
 */
public class AgendaHelper {

    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void dadosDoBanco(ArrayList<Agendamento> listaAgendamento) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTable1_Agendamentos().getModel();
        tableModel.setNumRows(0);

        for (Agendamento agendamento : listaAgendamento) {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada()
            });
        }

    }
}
