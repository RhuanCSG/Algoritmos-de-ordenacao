package algoritmo_de_ordenacao.application;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] vetor ;
		int n = 10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 10 números para o vetor");
		 vetor = new int[n];
		for (int i = 0; i < n; i++)
			vetor[i] = sc.nextInt();

		System.out.println("Vetor não ordenado: " +Arrays.toString(vetor));
		selectionSort(vetor);
		System.out.println("Vetor ordenado: " +Arrays.toString(vetor));

		sc.close();
		
	}
	
	private static void selectionSort(int vetor[]) {
		for (int i = 0; i < vetor.length - 1; i++) {
			int iMin = i;
			for (int j = i + 1; j < vetor.length; j++)
				if (vetor[j] < vetor[iMin])
					iMin = j;
			if (i != iMin) {
				int temp = vetor[i];
				vetor[i] = vetor[iMin];
				vetor[iMin] = temp;
			}
		}
	}

}
