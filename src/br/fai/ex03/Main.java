package br.fai.ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}
	
	private void start() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		int idade = scanner.nextInt();
		
		if(idade > 20) {
			System.out.println("A idade é maior que 20");
		}else if (idade > 12 && idade > 17) {
			System.out.println("A idade esta entre 12 e 17");
		}else if (idade == 7 || idade > 5) {
			System.out.println("Idade igual a 7 ou superior que 5 a ");
		}else {
			System.out.println("Outras Combbinaçoes");
		}
	
		
	}

}
