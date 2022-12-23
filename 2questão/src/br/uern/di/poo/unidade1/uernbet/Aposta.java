package br.uern.di.poo.unidade1.uernbet;

public class Aposta {
    private Evento evento;
    private Resultado resultado;
    private double valorApostado;
    public Aposta(Evento evento, Resultado resultado, double valor) {
        this.evento = evento;
        this.resultado = resultado;
        valorApostado = valor;
    }
    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public Resultado getResultado() {
        return resultado;
    }
    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
    public double getValorApostado() {
        return valorApostado;
    }
    public void setValorApostado(double valor) {
        valorApostado = valor;
    }
    public double calculaLucro(Evento evento){
        double resultado=0.0;
        if(evento.getResultado()==Resultado.TIME1)
        {
            
        resultado=(valorApostado*evento.getMulTime1())-valorApostado;
        return resultado;
        }   
        else if(evento.getResultado()==Resultado.TIME2){
            resultado=(valorApostado*evento.getMulTime2())-valorApostado;
            return resultado;
        }
        else{
            resultado=(valorApostado*evento.getMultEmpate())-valorApostado;
            return resultado;
        }
    }
}

