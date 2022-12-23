package br.uern.di.poo.unidade1.construcao;

public class geraPortas {
    public static void main(String[] args) {
        PortasPoo porta1 = new PortasPoo(TipoPortas.PortaSimples,2.0,0.9,true);
        PortasPoo porta2 = new PortasPoo(TipoPortas.PortaPadrão,1.5,0.6,false);
        PortasPoo porta3 = new PortasPoo(TipoPortas.PortaDeLuxo,2.3,1.2,true);
        PortasPoo porta4 = new PortasPoo(TipoPortas.PortaDeLuxo,2.3,1.2,false);

        porta1.exibePorta(porta1);
        porta2.exibePorta(porta2);
        porta3.exibePorta(porta3);
        porta4.exibePorta(porta4);
    }
}
