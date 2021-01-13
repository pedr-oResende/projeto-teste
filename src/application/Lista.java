package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Rose");
		list.add("Sina");
		list.add("Eren");
		list.add(2, "Marco");
		
		
		System.out.println("Tamanho da lista: " + list.size());
		for (String x: list) {
			System.out.print(x + " ");
		}
		/*
		System.out.println("\n-----------------------");
		System.out.println("Tamanho da lista: " + list.size());
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x: list) {
			System.out.print(x + " ");
		}
		*/
		System.out.println("\n-----------------------");
		System.out.println("Tamanho da lista: " + list.size());
		System.out.println("Endereço de Eren: " + list.indexOf("Eren"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		System.out.println("\n-----------------------");
		for (String x: result) {
			System.out.print(x + " ");
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println("\n"+ name);
	}

}
