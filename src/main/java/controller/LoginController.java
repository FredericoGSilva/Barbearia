/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.helper.LoginHelper;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Usuario;
import model.dao.UsuarioDAO;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author Frederico
 */
public class LoginController {
    
    private final Login view;
    private final LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void usuarioLogin() {
        try {
            Usuario usuario = helper.obterLogin();
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            ResultSet autenticado = usuarioDAO.autenticaUsuario(usuario);
            if (autenticado.next()) {
                MenuPrincipal menuPrincipal = new MenuPrincipal();
                menuPrincipal.setVisible(true);
                view.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.");
            }
        } catch (Exception e) {
        
        }
       
    }
}
