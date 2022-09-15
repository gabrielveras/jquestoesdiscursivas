package bndes2013.vendas;

public class NotaPJ extends NotaFiscal {

    @Override
    public double getValImposto() {
        // método irrelevante para o problema da questão
        return this.getValor() * 0.33333;
    }

}