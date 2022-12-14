/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.helper.AgendaHelper;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.dao.AgendaDAO;
import model.dao.ClienteDAO;
import model.dao.ServicoDAO;
import view.Agenda;
import view.CancelaAgendamento;
import view.MenuPrincipal;

/**
 *
 * @author Frederico
 */
public class AgendaController implements IController {

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

    public void atualizarServico() {
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> listaServico = servicoDAO.recuperarDados();
        helper.preencherServicos(listaServico);
    }

    public void atualizarValor() {
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }

    public void inserirDadosBanco() {
        try {
            AgendaDAO agendaDAO = new AgendaDAO();
            agendaDAO.inserirDados(helper.obterModelo());
            helper.limparTelas();
            atualizarTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro AgendaController - inserirDadosBanco: " + e);
        }

    }

    @Override
    public void voltar() {
        view.dispose();
        MenuPrincipal acesso = new MenuPrincipal();
        acesso.setVisible(true);
    }
    
    public void cancelarAgendamentoView() {
        CancelaAgendamento acesso = new CancelaAgendamento();
        acesso.setVisible(true);
    }
}
