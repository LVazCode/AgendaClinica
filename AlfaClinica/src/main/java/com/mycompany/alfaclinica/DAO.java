/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alfaclinica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author letic
 */
public class DAO {
    public boolean existe (Usuario usuario) throws Exception{ 
        String sql = "SELECT * FROM tb_usuario WHERE usuario = ? AND senha  = ?";
        
        try (Connection conn = ConexaoBD.obtemConexao(); 
                PreparedStatement ps = conn.prepareStatement(sql)){ 
            ps.setString(1, usuario.getLogin()); 
            ps.setString(2, usuario.getSenha());
            
            
            try (ResultSet rs = ps.executeQuery()){ 
                return rs.next(); 
        } 
     }
   }
    
    public boolean existeAdmin (Usuario usuario) throws Exception{
        String sql ="SELECT * FROM tb_administrador WHERE usuario = ? AND senha  = ?" ; 
        
        try (Connection conn = ConexaoBD.obtemConexao(); 
                PreparedStatement ps = conn.prepareStatement(sql)){ 
            ps.setString(1, usuario.getLogin()); 
            ps.setString(2, usuario.getSenha());
            
            
            try (ResultSet rs = ps.executeQuery()){ 
                return rs.next(); 
        } 
     }
    }
    
    public void inserir (InformacoesCadastro informacoesCadastro) throws Exception{
        String sql = "INSERT INTO tb_usuario (Nome, Nascimento, Email, Telefone, Usuario, Senha) values (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, informacoesCadastro.getNome());
            ps.setString(2, informacoesCadastro.getDataNascimento());
            ps.setString(3, informacoesCadastro.getEmail());
            ps.setString(4, informacoesCadastro.getTelefone());
            ps.setString(5, informacoesCadastro.getLogin());
            ps.setString(6, informacoesCadastro.getSenha());
            ps.execute();
        }
    }
    
    public void inserirConsulta (InformacoesConsulta informacoesConsulta) throws Exception{
        String sql = "INSERT INTO tb_consultas (dia, data, hora, medico, especialidade, disponivel) values (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, informacoesConsulta.getDiaSemana());
            ps.setString(2, informacoesConsulta.getData());
            ps.setString(3, informacoesConsulta.getHora());
            ps.setString(4, informacoesConsulta.getMedico());
            ps.setString(5, informacoesConsulta.getEspecialidade());
            ps.setBoolean(6, true);
            ps.execute();
        }
    }
    
    public void inserirExame (InformacoesExame informacoesExame) throws Exception{
        String sql = "INSERT INTO tb_exames (exame, medico, dia, data, hora, disponivel) values (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, informacoesExame.getExame());
            ps.setString(2, informacoesExame.getMedico());
            ps.setString(3, informacoesExame.getDia());
            ps.setString(4, informacoesExame.getData());
            ps.setString(5, informacoesExame.getHora());
            ps.setBoolean(6, true);
            ps.execute();
        }
    }
    
    
    
    public void marcar (Agendar agendar) throws Exception {
        String sql = "UPDATE tb_consultas SET disponivel = ?, usuario= ?, senha= ? WHERE id=?";
        try(Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps= conn.prepareStatement(sql)){
            ps.setBoolean(1, agendar.getDisponivel());
            ps.setString(2, agendar.getUsuario());
            ps.setString(3, agendar.getSenha());
            ps.setString(4, agendar.getId());
            ps.execute();
        }
    }
    
    public void desmarcar (String id) throws Exception {
        String sql = "UPDATE tb_consultas SET disponivel = ?, usuario= ?, senha= ? WHERE id=?";
        try(Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps= conn.prepareStatement(sql)){
            ps.setBoolean(1, true);
            ps.setString(2, null);
            ps.setString(3, null);
            ps.setString(4, id);
            ps.execute();
        }
    }
    
    public void excluirConsulta (String id) throws Exception {
        String sql = "DELETE FROM tb_consultas WHERE id = ?";
        try(Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement (sql)){
            ps.setString(1, id);
            ps.execute();
        }
    }
    
    public void marcarExame (Agendar agendar) throws Exception {
        String sql = "UPDATE tb_exames SET disponivel = ?, usuario= ?, senha= ? WHERE id=?";
        try(Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps= conn.prepareStatement(sql)){
            ps.setBoolean(1, agendar.getDisponivel());
            ps.setString(2, agendar.getUsuario());
            ps.setString(3, agendar.getSenha());
            ps.setString(4, agendar.getId());
            ps.execute();
        }
    }
    
    public void desmarcarExame (String id) throws Exception {
        String sql = "UPDATE tb_exames SET disponivel = ?, usuario= ?, senha= ? WHERE id=?";
        try(Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps= conn.prepareStatement(sql)){
            ps.setBoolean(1, true);
            ps.setString(2, null);
            ps.setString(3, null);
            ps.setString(4, id);
            ps.execute();
        }
    }
    
    public void excluirExame (String id) throws Exception {
        String sql = "DELETE FROM tb_exames WHERE id = ?";
        try(Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement (sql)){
            ps.setString(1, id);
            ps.execute();
        }
    }
}
