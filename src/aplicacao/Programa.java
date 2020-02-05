package aplicacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Set<Integer> c1 = new HashSet<>();
		Set<Integer> c2 = new HashSet<>();
		Set<Integer> c3 = new HashSet<>();

		System.out.print("Quantos alunos possui o curso A? ");

		int a = leia.nextInt();

		for (int cc = 1; cc <= a; cc++) {
			int cod = leia.nextInt();
			c1.add(cod);
		}

		System.out.print("Quantos alunos possui o curso B? ");

		int b = leia.nextInt();

		for (int cc = 1; cc <= b; cc++) {
			int cod = leia.nextInt();
			c2.add(cod);
		}

		System.out.print("Quantos alunos possui o curso C? ");

		int c = leia.nextInt();

		for (int cc = 1; cc <= c; cc++) {
			int cod = leia.nextInt();
			c3.add(cod);
		}
		
		Set <Integer> c4 = new HashSet<Integer>(c1);
		c4.addAll(c2);
		c4.addAll(c3);
		
		System.out.println("Total de alunos: "+c4.size());

		leia.close();
	}

}
