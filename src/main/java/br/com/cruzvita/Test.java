package br.com.cruzvita;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Baralho game = new Baralho();

		int menu = 0;

		while (menu != 5) {
			System.out.println("\n\tBaralho Vita");
			System.out.println("\n1- Embaralha.");
			System.out.println("2- Tirar uma carta.");
			System.out.println("3- Numero de cartas.");
			System.out.println("4- Cartas no baralho.");
			System.out.println("5- Sair");

			menu = sc.nextInt();

			switch (menu) {
			case 1:
				game.embaralha();

				break;
			case 2:
				game.darCarta();

				break;
			case 3:
				game.temCarta();

				break;
			case 4:
				game.imprimeBaralho();

				break;
			case 5:
				System.out.println("Volte sempre");
				break;
			default:
				System.out.println("Opção invalida.");

			}
		}
	}
}
