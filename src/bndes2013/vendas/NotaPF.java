package bndes2013.vendas;

public class NotaPF extends NotaFiscal {

    @Override
    public double getValImposto() {
        // você tem que implementar este método
        return this.getValor() * 0.1;
    }

}