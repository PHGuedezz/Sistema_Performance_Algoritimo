/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimos;

/**
 *
 * @author Guedes
 */
public class SelectionSort {
    public static void main(String[] args) {
        
        //fazendo o vetor com 100 posições
        int[] vetor = new int[10]; 
        for(int i = 0; i < vetor.length;i++){
            
            //colocando numeros aleatorios no vetor;
            //transformando os valores floats em inteiros
            vetor[i] = (int)(Math.random() * vetor.length); 
            
        }

        //Algoritiom de Ordenação
        int menor,aux;
        
        for(int i=0; i < vetor.length; i++){
            menor = i;
            for(int j = i+1; j< vetor.length; j++)
                if (vetor[j] < vetor[menor]){
                    menor = j;
            aux = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = aux;
            }
        }
        
        System.out.println("Validação do Algoritimo");
        for(int i = 0; i < vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }
}
