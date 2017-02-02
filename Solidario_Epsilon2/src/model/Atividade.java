/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fabec
 */
public class Atividade {
    
        public int id_evento;
        public String evento;
        public int numeroPessoas;
        public String veiculo;
        public String data;
        public String responsavel;

    public Atividade() {
        
    }        
        

    public int getid_evento() {
        return id_evento;
    }

    public void setID_Evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getevento() {
        return evento;
    }

    public void setevento(String evento) {
        this.evento = evento;
    }
//8
    public int getnumeroPessoas() {
        return numeroPessoas;
    }

    public void setnumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
        
        
}
