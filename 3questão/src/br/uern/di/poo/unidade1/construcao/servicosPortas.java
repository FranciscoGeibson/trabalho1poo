package br.uern.di.poo.unidade1.construcao;

public class servicosPortas {
    private static final double taxaLuxo = 0.1;
    private static final double valorm2 = 70.00;
    private static final double portpivo = 250.00;

    public static double valorServico(PortasPoo portaserv) {
        double resultado=0.0;
        double metro2=portaserv.getAltura()*portaserv.getLargura();
        resultado=metro2*valorm2;


        if(portaserv.isPivo())
        {
            resultado+=portpivo;
        }        
        if(portaserv.getTipoPor()==TipoPortas.PortaDeLuxo)
        {
            resultado+=(resultado*taxaLuxo/100);

        }
            return resultado;
    }
}
