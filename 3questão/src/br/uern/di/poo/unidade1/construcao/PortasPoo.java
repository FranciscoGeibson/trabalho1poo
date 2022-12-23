package br.uern.di.poo.unidade1.construcao;


public class PortasPoo {
    private TipoPortas tipoPor;
    private double Altura,largura;
    private boolean pivo;
    private static final double prepivo = 350.00;
    private static final double largurapadrao = 0.7, alturapadrao = 1.8;
    public PortasPoo() {
        this.tipoPor=TipoPortas.PortaSimples;
        this.Altura=alturapadrao;
        this.largura=largurapadrao;
        this.pivo=false;
    }
    public PortasPoo(TipoPortas tipoPor, double altura, double largura, boolean pivo) {
        this.tipoPor = tipoPor;
        Altura = altura;
        this.largura = largura;
        this.pivo = pivo;
    }
    public TipoPortas getTipoPor() {
        return tipoPor;
    }
    public void setTipoPor(TipoPortas tipoPor) {
        this.tipoPor = tipoPor;
    }
    public double getAltura() {
        return Altura;
    }
    public void setAltura(double altura) {
        Altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public boolean isPivo() {
        return pivo;
    }
    public void setPivo(boolean pivo) {
        this.pivo = pivo;
    }
    public static double getPrepivo() {
        return prepivo;
    }
    public static double getLargurapadrao() {
        return largurapadrao;
    }
    public static double getAlturapadrao() {
        return alturapadrao;
    }
    
    public double calculaPreco(PortasPoo ports) {
       double resultado=0.0;
       
       if(ports.tipoPor==TipoPortas.PortaSimples)
       resultado=TipoPortas.PortaSimples.getValor();
       else if(ports.tipoPor==TipoPortas.PortaPadrão)
       resultado=TipoPortas.PortaPadrão.getValor();
       else if(ports.tipoPor==TipoPortas.PortaDeLuxo)
       resultado=TipoPortas.PortaDeLuxo.getValor();
       if(ports.isPivo()){
        resultado+=prepivo;
        return resultado;
       }
       return resultado;

    }
    public void exibePorta(PortasPoo ports){
        System.out.println("a madeira é "+ ports.tipoPor.getMadeira());
        System.out.println("a fechadura é"+ ports.tipoPor.getFechadura());
        System.out.printf("a altura é %.2f",ports.getAltura());
        System.out.printf("a largura é :%.2f",ports.getLargura());
        if (ports.isPivo()) {
            System.out.println("a porta é pivotante ");
        } else {
            System.out.println("a porta não é pivotante ");
        }
        System.out.printf("o preço é : %.2f" , calculaPreco(ports));
        System.out.printf("o valor do serviço é :%.2f ", servicosPortas.valorServico(ports));

    }
}

