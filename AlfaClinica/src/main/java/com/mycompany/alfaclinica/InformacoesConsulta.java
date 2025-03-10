/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alfaclinica;

/**
 *
 * @author letic
 */
public class InformacoesConsulta {
    private String diaSemana;
    private String data;
    private String hora;
    private String medico;
    private String especialidade;
    
    public InformacoesConsulta(String diaSemana, String data, String hora, String medico, String especialidade){
        this.diaSemana = diaSemana;
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.especialidade = especialidade;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getMedico() {
        return medico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
