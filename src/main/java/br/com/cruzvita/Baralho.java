package br.com.cruzvita;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

	List<Cartas> baralho = new ArrayList<Cartas>();

	public Baralho() {

		String[] numeros = { "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Rei", "Dama", "Valete" };
		String[] naipes = { "Ouros", "Espadas", "Copas", "Paus" };

		for (String i : naipes) {
			for (String f : numeros) {
				baralho.add(new Cartas(i, f));
			}
		}
		for (int i = 0; i < 4; i++) {
			baralho.add(new Cartas("coringa", "coringa"));
		}
	}

	public void limpa() {
		baralho.clear();
	}

	public void imprimeBaralho() {
		if (baralho.isEmpty()) {
			System.out.println("O baralho está vazio.");
		} else {
		for (Cartas cartas : baralho) {
			System.out.println(cartas.getNaipe() + " de " + cartas.getNumero());
		}
		}
	}

	public boolean temCarta() {
		if (baralho.isEmpty()) {
			System.out.println("Total de " + baralho.size() + " cartas.");
			return true;
		} else {
			System.out.println("Ainda tem " + baralho.size() + " cartas no baralho.");
			return false;
		}

	}

	public void darCarta() {
		if (baralho.isEmpty()) {
			System.out.println("O baralho está vazio.");
		} else {
			System.out.println(baralho.get(0).getNaipe() + " de " + baralho.get(0).getNumero());
			baralho.remove(0);
		}
	}

	public void embaralha() {
		Collections.shuffle(baralho);
		System.out.println("Baralho embaralhado.");
	}

}
