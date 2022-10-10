/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Frederico
 */
public abstract class Pessoa {
    private int id;
    private String nome;
    private String sexo;
    private String telefone;
    private String email;
    private String rg;
    
    public Pessoa(int id, String nome) {
        this.nome = nome;
        this.id = id;
    }
    
    public Pessoa(int id, String nome, String sexo, String telefone, String email, String rg) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
}
