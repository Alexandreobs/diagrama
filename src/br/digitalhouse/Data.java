package br.digitalhouse;

import javax.swing.*;

public class Data {
        private int dia;
        private int mes;
        private int ano;

    public Data(int novoDia, int novoMes, int novoAno) {
        dia = novoDia;
        mes = novoMes;
        ano = novoAno;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

