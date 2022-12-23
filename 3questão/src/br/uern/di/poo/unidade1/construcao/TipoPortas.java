package br.uern.di.poo.unidade1.construcao;

public enum TipoPortas { 
    PortaSimples("madeira.compensada","fechadura.Simples",50.00),
    PortaPadrão("madeira.andiroba","fechadura.de.encaixe", 140.00),
    PortaDeLuxo("madeira.ipe","fechadura.do.tipo.tetra",350.00)
    
    ;
    private String madeira;
    private String fechadura;
    private double valor;
    private TipoPortas(String madeira, String fechadura, double valor) {
        this.madeira = madeira;
        this.fechadura = fechadura;
        this.valor = valor;
    }
        public String getFechadura() {
            return fechadura;
        }
        public String getMadeira() {
            return madeira;
        }
        public double getValor() {
            return valor;
        }
        
}
