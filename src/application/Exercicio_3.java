package application;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("\nProcure um número na matriz: ");
		int numero = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] == numero) {
						System.out.printf("Posição: %d, %d:\n", i, j);
						if(j > 0) System.out.printf("Esquerda: %d\n", mat[i][j-1]);
						if (j < (mat[i].length - 1)) System.out.printf("Direita: %d\n", mat[i][j+1]);
						if (i > 0) System.out.printf("Cima: %d\n", mat[i-1][j]);
						if (i < (mat.length - 1)) System.out.printf("Baixo: %d\n", mat[i+1][j]);
						System.out.println("------------------");
					}
			}
		}

		sc.close();

	}

}
