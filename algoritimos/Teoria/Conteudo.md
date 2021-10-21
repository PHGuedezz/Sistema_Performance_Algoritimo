__Processo de Ordenação de Dados – POD__

A ordenação de dados é o processo que visa organizar um conglomerado de informações em determinada ordem a fim de agilizar e facilitar o processo de busca que estará sendo por um algum algoritmo dando mais desempenho ao sistema, sendo a ordem numérica e a lexicográfica as mais utilizadas.
<br>

A ordenação de dados é o processo que visa organizar um conglomerado de informações em determinada ordem a fim de agilizar e facilitar o processo de busca que estará sendo por um algum algoritmo dando mais desempenho ao sistema, sendo a ordem numérica e a lexicográfica as mais utilizadas.<br>
__Algoritmo de Ordenação__

Os algoritmos de ordenação colocam os elementos de uma determinada memoria em uma determinada ordem, podendo ser organizado de forma completa ou parcial, sendo esta escolha uma atribuição do projeto do sistema.
<br>
Os algoritmos de ordenação colocam os elementos de uma determinada memoria em uma determinada ordem, podendo ser organizado de forma completa ou parcial, sendo esta escolha uma atribuição do projeto do sistema.
<br>
O _Bubble Sort_ foi escolhido para representar os algoritmos baseados em metodologias mais simples como o _Bogo Sort_ e o _Combo Sort_. Os métodos _Selection Sort_ e _Insertion Sort_ foram tratados como métodos intermediários em quesito performático. Por fim os dois últimos, o _Marge Sort_ e o _Quick Sort_ representam os algoritmos feitos com uma metodologia mais refinada e complexa.<br>

__Bubble Sort__
<br>
O algoritmo por flutuação ou como é mais conhecido _Bubble Sort_, é consideravelmente o método mais lento por se tratar de uma analise menos aprofundada do algoritmo em relação aos demais, consequentemente, o método _Bubble Sort_ pode ser considerado o mais simples de todos.
<br>
A essência do método é simplesmente percorrer o vetor _j_ vezes, em cada caso ele fara uma comparação entre _j_ e _j + 1_ e realizar a troca de posição dos elementos se o elemento _j_ for maior que o antecessor. Sendo assim, é notável que o algoritmo _Bubble Sort_ se trata de um algoritmo baseado no método de permutação.
<br>
O algoritmo faz o uso de dois laços de repetição encadeados do tipo for. Sendo o primeiro _for(int i = 0; i< vetor.lenght; ++i)_ que faz com que o percorra o veotr da direita para a esquerda e dentro deste for tem um outro _for(int j = 0; j > (vetor.length – 1 ); ++1)_ que percorre o vetor da esquerda para a direita sendo a consição para o dado da esquerda ser menor que o da diereita é _if(vetor[j] < vetor[j+1])_