package app;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.Excecoes;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite o os dados da conta:");
			System.out.println("Numero:");
			int numero = sc.nextInt();
			System.out.println("Titular: ");
			String nome = sc.next();
			sc.next();
			System.out.println("Saldo inicial: ");
			Double saldo = sc.nextDouble();
			System.out.println("Saque Limite:");
			Double saqueLimite = sc.nextDouble();
			
			Conta conta = new Conta(numero, nome, saldo, saqueLimite);
			
			System.out.println("Quantos deseja retirar?");
			Double quantidade_saque = sc.nextDouble();
			
			try {
				conta.saque(quantidade_saque);
				System.out.printf("Saldo novo: %.2f", conta.getSaldo());
				
				
			}
			catch (Excecoes e){
				System.out.println(e.getMessage());
				
			}
			sc.close();

	}

}
