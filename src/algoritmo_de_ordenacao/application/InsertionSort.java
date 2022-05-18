package algoritmo_de_ordenacao.application;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] vetor ;
		int n = 10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 10 números para o vetor");
		 vetor = new int[n];
		for (int i = 0; i < n; i++)
			vetor[i] = sc.nextInt();

		System.out.println("Vetor não ordenado: " +Arrays.toString(vetor));
		insertionSort(vetor);
		System.out.println("Vetor ordenado: " +Arrays.toString(vetor));

		sc.close();
	}
	
private static void insertionSort(int[] vetor){
		
	    int temp;
		
	    for (int i = 1; i < vetor.length; i++) {
		    for(int j = i ; j > 0 ; j--){
			    if(vetor[j] < vetor[j-1]){
				    temp = vetor[j];
				    vetor[j] = vetor[j-1];
				    vetor[j-1] = temp;
			    }
		    }
	    }
	}

}
