package senadofederal2012;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// uma lista simplesmente encadeada onde cada nó é
// uma instância de NoInt
public class ListaNos {

    // cabeca é uma referencia para o primeiro nó da list
    private NoInt Cabeca = null;

    // remove todos os nós da lista
    public void esvazia() {
        // seu código aqui
        while (this.Cabeca != null) {
            NoInt prox = this.Cabeca.prox;
            this.Cabeca.prox = null;
            this.Cabeca = prox;
        }
    }

    // adiciona um novo nó à lista. O nó é adicionado
    // no início da lista, e é referenciado por cabeca
    public void adiciona(NoInt no) {
        // seu código aqui
        if (this.Cabeca == null) {
            this.Cabeca = no;
        } else {
            NoInt atual = this.Cabeca;
            while (atual.prox != null) {
                atual = atual.prox;
            }
            atual.prox = no;
        }
    }

    // insere um no na posição pos, ou, em outras palavras,
    // o novo nó passa a ocupar a posição pos da lista.
    // O nó referenciado por cabeca é o nó 0
    public void insere(NoInt no, int pos) {
        // seu código aqui
        if (this.Cabeca == null || pos == 0) {
            no.prox = this.Cabeca;
            this.Cabeca = no;
        } else {
            int i = 1;
            NoInt atual = this.Cabeca;
            while (i < pos && atual.prox != null) {
                i++;
                atual = atual.prox;
            }
            no.prox = atual.prox;
            atual.prox = no;
        }
    }

    // remove a primeira ocorrência do nó da lista cujo
    // conteúdo é o mesmo do nó passado como parâmetro
    public void remove(NoInt no) {
        // seu código aqui
        if (this.Cabeca != null) {
            if (this.Cabeca.getNum() == no.getNum()) {
                this.Cabeca = this.Cabeca.prox;
            } else {
                NoInt atual = this.Cabeca;
                while (atual.prox != null && atual.prox.getNum() != no.getNum()) {
                    atual = atual.prox;
                }
                if (atual.prox != null) {
                    atual.prox = atual.prox.prox;
                }
            }
        }
    }

    // retorna o número de nós na lista encadeada
    public int tamanho() {
        // seu código aqui
        int tam = 0;
        NoInt atual = this.Cabeca;
        while (atual != null) {
            tam++;
            atual = atual.prox;
        }
        return tam;
    }

    public void print() {
        int i = 0;
        NoInt atual = this.Cabeca;
        while (atual != null) {
            System.out.println("[" + i + "] : " + atual.getNum());
            i++;
            atual = atual.prox;
        }
    }

    @Test
    public void test() {
        ListaNos lista = new ListaNos();
        lista.adiciona(new NoInt(1));
        lista.adiciona(new NoInt(3));
        lista.insere(new NoInt(2), 1);
        lista.adiciona(new NoInt(5));
        lista.adiciona(new NoInt(4));
        lista.remove(new NoInt(5));
        lista.remove(new NoInt(6));
        lista.insere(new NoInt(5), 5);
        lista.print();
        assertEquals(lista.tamanho(), 5);
    }

}