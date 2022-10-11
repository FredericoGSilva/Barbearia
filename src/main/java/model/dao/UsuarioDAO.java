/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

/**
 *
 * @author Frederico
 */
public class UsuarioDAO {
    
    Connection conexao;
    
    public ResultSet loginUsuario(Usuario usuario) {
        conexao = new Banco().conector();
        try {
            String url = "select * from tb_Usuario where (usuario=? and senha=?)";
            PreparedStatement preparaConsulta = conexao.prepareStatement(url);
            preparaConsulta.setString(1, usuario.getNome());
            preparaConsulta.setString(2, usuario.getSenha());
            ResultSet resultado = preparaConsulta.executeQuery();
            return resultado;
        } catch (SQLException ex) {
            // TRATAR EXCEÇÃO
            return null;
        }
    }
    
    
}
