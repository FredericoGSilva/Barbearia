/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.helper.CancelarAgendamentoHelper;
import model.dao.AgendaDAO;
import view.Agenda;
import view.CancelaAgendamento;

/**
 *
 * @author Frederico
 */
public class CancelaAgendamentoController implements IController {
    
    private final CancelaAgendamento view;
    private final CancelarAgendamentoHelper helper;

    public CancelaAgendamentoController(CancelaAgendamento view) {
        this.view = view;
        helper = new CancelarAgendamentoHelper(view);
    }
    
    public void cancelarAgendamento() {
        AgendaDAO agendaDAO = new AgendaDAO();
        agendaDAO.cancelarAgendamento(helper.obterModelo());
        Agenda acesso = new Agenda();
        acesso.setVisible(true);
    }

    @Override
    public void voltar() {
        Agenda acesso = new Agenda();
        acesso.setVisible(true);
        view.dispose();
    }
}
