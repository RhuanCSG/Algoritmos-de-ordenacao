package algoritmo_de_ordenacao.application;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		int[] vetor ;
		int n = 10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 10 números para o vetor");
		 vetor = new int[n];
		for (int i = 0; i < n; i++)
			vetor[i] = sc.nextInt();

		System.out.println("Vetor não ordenado: " +Arrays.toString(vetor));
		quickSort(vetor, 0, vetor.length - 1);
		System.out.println("Vetor ordenado: " +Arrays.toString(vetor));

		sc.close();

	}

	private static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);

		}
	}

	private static int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1;
		while (i <= fim) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[fim])
				fim--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[fim];
				vetor[fim] = troca;
				i++;
				fim--;
			}
		}
		vetor[inicio] = vetor[fim];
		vetor[fim] = pivo;
		return fim;
	}
	
}