package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos empregados serão registrados? ");
		Integer num_empregados = sc.nextInt();
		List<Funcionario> lista = new ArrayList<>();

		for (int i = 0; i < num_empregados; i++) {
			System.out.println("\nFuncionário #" + (i + 1) + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Salário: ");
			Double salario = sc.nextDouble();

			Funcionario funcionario = new Funcionario(id, nome, salario);
			lista.add(funcionario);
		}

		System.out.print("\nEntre com o id do fucionario que irá ter o salário aumentado: ");
		int id_salario = sc.nextInt();
		//Funcionario f = lista.stream().filter(x -> x.getId() == id_salario).findFirst().orElse(null);
		Integer pos = position(lista, id_salario);

		if (pos == null) {
			System.out.println("\nESSE ID NÃO EXISTE!");
		} else {
			System.out.println("\nEntre com a porcentagem");
			double porcentagem = sc.nextDouble();
			//funcionario.acrescentaSalario(porcentagem);
			lista.get(pos).acrescentaSalario(porcentagem);
		}

		System.out.println("\nLista de empregados: ");
		for (Funcionario func : lista) {
			System.out.println(func);
		}
		sc.close();
	}
	
	public static Integer position(List<Funcionario> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
