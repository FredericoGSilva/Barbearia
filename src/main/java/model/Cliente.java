/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Frederico
 */
public class Cliente extends Pessoa {
    private String endereco;
    private String cep;
    
    public Cliente(int id, String nome, String sexo, String dataNascimento, String telefone, String email, String rg, String endereco, String cep) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome) {
        super(id, nome);
    }

    public Cliente() {
        super(null);
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getCep() {
        return cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
}
