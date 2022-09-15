package bndes2013.vendas;

public abstract class NotaFiscal {
    int data;
    String codCliente;
    public double valor; /* alterado para public para poder testar */

    public double getValor() {
        return valor;
    }

    public abstract double getValImposto();

}