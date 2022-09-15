package prefeituraniteroirj2018;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Utils {

    public static int obterSegundoMenorValor(int[] val) {
        if (val.length > 1) {
            int menor1 = val[0] > val[1] ? val[1] : val[0];
            int menor2 = val[0] > val[1] ? val[0] : val[1];
            for (int i = 2 ; i<val.length ; i++) {
                if (val[i] < menor1) {
                    menor2 = menor1;
                    menor1 = val[i];
                } else if (val[i] < menor2) {
                    menor2 = val[i];
                }
            }
            return menor2;
        } else if (val.length == 1) {
            return val[0];
        } else {
            return 0;
        }
    }

    @Test
    public void tamanhoVazio() {
        int[] array = { };
        assertEquals(0, Utils.obterSegundoMenorValor(array));
    }

    @Test
    public void tamanhoUm() {
        int[] array = { 1 };
        assertEquals(1, Utils.obterSegundoMenorValor(array));
    }

    @Test
    public void tamanhoDois() {
        int[] array = { 7, 3 };
        assertEquals(7, Utils.obterSegundoMenorValor(array));
    }

    @Test
    public void ordenado() {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        assertEquals(2, Utils.obterSegundoMenorValor(array));
    }

    @Test
    public void desordenado() {
        int[] array = { 4, 5, 2, 7, 3, 6  };
        assertEquals(3, Utils.obterSegundoMenorValor(array));
    }

    @Test
    public void contrario() {
        int[] array = { 6, 5, 4, 3, 2, 1 };
        assertEquals(2, Utils.obterSegundoMenorValor(array));
    }

}