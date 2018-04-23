package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Aposta;
import model.Apostador;
import model.Bilhete;
import model.Jogo;
import java.io.Console;
public class Bilheteria {

	public static void main(String[] args) {
		Apostador apostador = new Apostador();
		Bilhete bilhete = new Bilhete();
		Scanner scan = new Scanner(System.in);
		ArrayList[] valores = new ArrayList[5];
		Jogo jogo1 = new Jogo();
		Jogo jogo2 = new Jogo();
		Jogo jogo3 = new Jogo();
		Jogo jogo4 = new Jogo();
		Jogo jogo5 = new Jogo();
		Aposta aposta1 = new Aposta();
		Aposta aposta2 = new Aposta();
		Aposta aposta3 = new Aposta();
		Aposta aposta4 = new Aposta();
		Aposta aposta5 = new Aposta();
		bilhete.setDono(apostador);
		aposta1.setPartida(jogo1);
		aposta1.setBilheteDono(bilhete);
		aposta2.setPartida(jogo2);
		aposta2.setBilheteDono(bilhete);
		aposta3.setPartida(jogo3);
		aposta3.setBilheteDono(bilhete);
		aposta4.setPartida(jogo4);
		aposta4.setBilheteDono(bilhete);
		aposta5.setPartida(jogo5);
		aposta5.setBilheteDono(bilhete);
		System.out.println("Bem vindo a bilheteria do BetShow");
		System.out.println("Ecolha o resultado do jogos a seguir:");
		System.out.println("jogo 1: ");
		aposta1.palpite = scan.nextInt();
		System.out.println("jogo 2: ");
		aposta2.palpite = scan.nextInt();
		System.out.println("jogo 3: ");
		aposta3.palpite = scan.nextInt();
		System.out.println("jogo 4: ");
		aposta4.palpite = scan.nextInt();
		System.out.println("jogo 5: ");
		aposta5.palpite = scan.nextInt();

		

	}

}
