package bndes2013.estruturas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bndes2013.vendas.*;

public class Arv {
    private ArvNo raiz=null;

    public double totImpostoPF(int dini, int dfim) {
        return calcTotImpostoPF(raiz, dini, dfim);
    }

    public double calcTotImpostoPF(ArvNo r, int dini, int dfim) {
        // você tem que implementar este método
        double imp = 0;
        if (r != null) {
            if (r.data >= dini && r.data <= dfim) {
                for (NotaFiscal nf : r.ln) {
                    if (nf.getClass() == NotaPF.class) {
                        imp += nf.getValImposto();
                    }
                }
            }
            if (r.data >= dini) {
                imp += calcTotImpostoPF(r.esq, dini, dfim);
            }
            if (r.data <= dfim) {
                imp += calcTotImpostoPF(r.dir, dini, dfim);
            }
        }
        return imp;
    }

    private NotaPF criaNotaPF(double valor) {
        NotaPF o = new NotaPF();
        o.valor = valor;
        return o;
    }

    private NotaPJ criaNotaPJ(double valor) {
        NotaPJ o = new NotaPJ();
        o.valor = valor;
        return o;
    }

    private ArvNo criaNo(int data, NotaFiscal nf[]) {
        ArvNo o = new ArvNo();
        o.data = data;
        o.ln = nf;
        return o;
    }

    @Test
    public void test() {
        ArvNo no220101 = criaNo(220101, new NotaFiscal[]{ criaNotaPF(200.00) });
        ArvNo no220201 = criaNo(220201, new NotaFiscal[]{ criaNotaPJ(300.00) });
        ArvNo no220301 = criaNo(220301, new NotaFiscal[]{ criaNotaPF(100.00) });
        no220201.esq = no220101;
        no220201.dir = no220301;
        ArvNo no220501 = criaNo(220501, new NotaFiscal[]{ criaNotaPJ(300.00) });
        ArvNo no220601 = criaNo(220601, new NotaFiscal[]{ criaNotaPF(100.00) });
        ArvNo no220701 = criaNo(220701, new NotaFiscal[]{ criaNotaPF(200.00) });
        no220601.esq = no220501;
        no220601.dir = no220701;
        ArvNo no220401 = criaNo(220401, new NotaFiscal[]{ criaNotaPJ(500.00) });
        no220401.esq = no220201;
        no220401.dir = no220601;
        double imp = calcTotImpostoPF(no220401, 220201, 220531);
        assertEquals(10.0, imp, 0.0);
    }

}