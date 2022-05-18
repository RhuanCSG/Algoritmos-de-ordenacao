package algoritmo_de_ordenacao.application;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] vetor ;
		int n = 10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 10 números para o vetor");
		 vetor = new int[n];
		for (int i = 0; i < n; i++)
			vetor[i] = sc.nextInt();

		System.out.println("Vetor não ordenado: " +Arrays.toString(vetor));
		bubbleSort(vetor);
		System.out.println("Vetor ordenado: " +Arrays.toString(vetor));

		sc.close();
        
	}
	
	private static void bubbleSort(int vetor[]) {
		int i, j, t = 0;
		for (i = 0; i < vetor.length -1; i++) {
			for (j = 1; j < (vetor.length - i); j++) {
				if (vetor[j - 1] > vetor[j]) {
					t = vetor[j - 1];
					vetor[j - 1] = vetor[j];
					vetor[j] = t;
				}
			}
		}
	}

}
