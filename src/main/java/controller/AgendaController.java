/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.helper.AgendaHelper;
import java.util.ArrayList;
import model.Agendamento;
import model.dao.AgendaDAO;
import view.Agenda;

/**
 *
 * @author Frederico
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela() {
        AgendaDAO agendaDao = new AgendaDAO();
        ArrayList<Agendamento> listaAgendamento = agendaDao.selecionaDados();
        helper.dadosDoBanco(listaAgendamento);
    }
}
