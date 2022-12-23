package br.uern.di.poo.unidade1.uernbet;

public class Evento {
    private Resultado resultado;
    private String nomeDoEvento;
    private String nomeDoTime1, nomeDoTime2;
    private double mulTime1, mulTime2, multEmpate;
    public Evento(String nomeDoEvento, String nomeDoTime1, String nomeDoTime2, double mulTime1, double mulTime2,
            double multEmpate) {
        this.nomeDoEvento = nomeDoEvento;
        this.nomeDoTime1 = nomeDoTime1;
        this.nomeDoTime2 = nomeDoTime2;
        this.mulTime1 = mulTime1;
        this.mulTime2 = mulTime2;
        this.multEmpate = multEmpate;
    }
    public String getNomeDoEvento() {
        return nomeDoEvento;
    }
    public void setNomeDoEvento(String nomeDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
    }
    public String getNomeDoTime1() {
        return nomeDoTime1;
    }
    public void setNomeDoTime1(String nomeDoTime1) {
        this.nomeDoTime1 = nomeDoTime1;
    }
    public String getNomeDoTime2() {
        return nomeDoTime2;
    }
    public void setNomeDoTime2(String nomeDoTime2) {
        this.nomeDoTime2 = nomeDoTime2;
    }
    public double getMulTime1() {
        return mulTime1;
    }
    public void setMulTime1(double mulTime1) {
        this.mulTime1 = mulTime1;
    }
    public double getMulTime2() {
        return mulTime2;
    }
    public void setMulTime2(double mulTime2) {
        this.mulTime2 = mulTime2;
    }
    public double getMultEmpate() {
        return multEmpate;
    }
    public void setMultEmpate(double multEmpate) {
        this.multEmpate = multEmpate;
    }
    public Resultado getResultado() {
        return resultado;
    }
    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    
}


