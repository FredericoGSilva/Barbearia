/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.helper;

import model.Agendamento;
import view.CancelaAgendamento;

/**
 *
 * @author Frederico
 */
public class CancelarAgendamentoHelper implements IHelper {
    
    private final CancelaAgendamento view;

    public CancelarAgendamentoHelper(CancelaAgendamento view) {
        this.view = view;
    }

    @Override
    public Agendamento obterModelo() {
        int id = Integer.parseInt(view.getjTextField1_Id().getText());
        return new Agendamento(id);
    }

    @Override
    public void limparTelas() {
    }
    
    
}
