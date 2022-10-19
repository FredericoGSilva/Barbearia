/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.helper;

import model.Usuario;
import view.Login;

/**
 *
 * @author Frederico
 */
public class LoginHelper implements IHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }

    @Override
    public Usuario obterModelo() {
        String nome = view.getTxt_Usuario().getText();
        String senha = view.getjPassword_Senha().getText();
        Usuario usuario = new Usuario(nome, senha);
        return usuario;
    }
    
}
