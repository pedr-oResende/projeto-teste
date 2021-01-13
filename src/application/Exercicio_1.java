package application;

import java.util.Scanner;

import entities.Cadastro;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Cadastro[] vetor = new Cadastro[10];
		char resposta;
		int index = 1;

		do {
			System.out.print("\nQuartos disponíveis: ");
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[j] == null) {
					System.out.print(j + " ");
				}
			}
			System.out.println("\n\nPedido #" + index + ": ");

			System.out.print("Numero do quarto: ");
			int numero_quarto = sc.nextInt();
			
			sc.nextLine();
			if (numero_quarto > (vetor.length - 1) || numero_quarto < 0) {
				System.out.println("OPÇÃO INVÁLIDA!");
			} else if (vetor[numero_quarto] != null) {
				System.out.println("Este quarto já está ocupado!!");
			} else {
				System.out.print("Nome: ");

				String nome = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				vetor[numero_quarto] = new Cadastro(nome, email);
				index++;
			}

			System.out.print("\nDeseja finalizar o pedido (s/n)? ");
			resposta = sc.nextLine().charAt(0);
			
		} while (resposta != 's');

		System.out.println("\nQuartos ocupados:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}

		sc.close();

	}

}
