package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
			
		}
		double media = soma/n;
		
		System.out.printf("A média é: %.2f", media);
		sc.close();
	}

}
