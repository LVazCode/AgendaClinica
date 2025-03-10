/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alfaclinica;

/**
 *
 * @author letic
 */
public class InformacoesExame {
    private String exame;
    private String medico;
    private String dia;
    private String data;
    private String hora;
    
    public InformacoesExame(String exame, String medico, String dia, String data, String hora){
        this.exame = exame;
        this.medico = medico;
        this.dia = dia;
        this.data = data;
        this.hora = hora;
    }

    public String getExame() {
        return exame;
    }

    public String getMedico() {
        return medico;
    }

    public String getDia() {
        return dia;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
