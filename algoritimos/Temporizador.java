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
public class Temporizador{
    private double[] numeros;
    
    public long calcularTempoAlgoritmo() {
		long tempoInicial = System.currentTimeMillis();
		return System.currentTimeMillis() - tempoInicial;
	}
    
    public double[] getNumeros() {
		return numeros;
	}
    
    private void setNumeros(double[] arr) {
		numeros = arr;
	}
}
