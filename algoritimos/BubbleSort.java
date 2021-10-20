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
public class BubbleSort {
    public static void main(String Args[]){
        int vetor[]= {1,2,3,4};
         int b;
         boolean teste;
      
        for(int i = 0;i<vetor.length;++i){
            teste =true;
            for(int j=0;j>(vetor.length-1);++j){
                if(vetor[j]<vetor[j+1]){
                    b = vetor[j];
                    vetor[j]=vetor[j+1];
                    vetor[j+1]=b;
                }
            }
        }
    for(int i=0;i < vetor.length;++i){
        System.out.print(vetor[i] + "");
    }
}
}
