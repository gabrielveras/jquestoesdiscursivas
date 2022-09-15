## FGV - 2012 - Senado Federal

### Analista Legislativo - Análise de Sistemas - Reaplicação

Em uma lista encadeada, um novo espaço de memória é alocado para armazenar cada novo elemento inserido na estrutura. Desta forma, o espaço total de memória gasto pela lista é proporcional ao número de elementos nela armazenados. No entanto, não podemos garantir que os elementos da lista sejam armazenados em posições contíguas de memória, não sendo possível, portanto, o acesso direto aos elementos da lista. Para que seja possível percorrer todos os elementos da lista, devemos explicitamente guardar o encadeamento dos elementos, o que é feito armazenando-se, junto com a informação de cada elemento, um ponteiro para o próximo elemento da lista.

A figura a seguir ilustra o arranjo da memória de uma lista encadeada.

![ [cabeca] -> [info1] -> [info2] -> [info3] -> ... ](figura1.png)

A classe ListaNos a seguir, implementa uma lista simplesmente encadeada, não ordenada, onde cada nó é uma instância de NoInt, cujo código é também fornecido.

    /* O código fornecido está no repositório */

Complete o código dos métodos em ListaNos para que os métodos tenham o comportamento descrito nos comentários.

1. correta implementação do método esvazia()
2. correta implementação do método adiciona()
3. correta implementação do método remove()
4. correta implementação do método insere()
5. correta implementação do método tamanho()
6. manutenção da estrutura da lista encadeada

Sua solução deve atender às seguintes restrições:
- Você não pode adicionar novas variáveis de classe ou instância à classe ListaNos.
- Você pode assumir que nenhum dos parâmetros passados aos métodos faz com que estes falhem em tempo de execução.