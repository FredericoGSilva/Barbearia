/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.helper.AgendaHelper;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import model.dao.AgendaDAO;
import model.dao.ClienteDAO;
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
    
    public void atualizarTabela() {
        AgendaDAO agendaDAO = new AgendaDAO();
        ArrayList<Agendamento> listaAdendamento = agendaDAO.recuperDados();
        helper.preencherTabela(listaAdendamento);
    }

    public void atualizarCliente() {
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> listaClientes = clienteDAO.recuperarDados();
        helper.preencherClientes(listaClientes);
    }
    
}
