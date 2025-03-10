/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alfaclinica;

/**
 *
 * @author letic
 */
public class Agendar {
    private String id;
    private boolean disponivel;
    private String usuario;
    private String senha;
    
    public Agendar(String id, boolean disponivel, String usuario, String senha){
        this.id = id;
        this.disponivel = disponivel;
        this.usuario = usuario;
        this.senha = senha;
    }
    

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
}
