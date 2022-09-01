package model.entities;

import model.exceptions.Excecoes;

public class Conta {
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double LimiteDeRetirada;
	
	public Conta() {
		
	}
	
	public Conta(Integer numero, String titular, Double saldo, Double limiteDeRetirada) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		LimiteDeRetirada = limiteDeRetirada;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteDeRetirada() {
		return LimiteDeRetirada;
	}

	public void setLimiteDeRetirada(Double limiteDeRetirada) {
		LimiteDeRetirada = limiteDeRetirada;
	}
	
	public void deposito(double quantidade) {
		saldo += quantidade;
		
	}
	
	public void saque(double quantidade) {
		verificacaoSaque(quantidade);
		saldo -= quantidade;
		
	}
	
	private void verificacaoSaque(double quantidade) {
		if(quantidade > getLimiteDeRetirada()) {
			throw new Excecoes("Erro de saque: A quantia excede o limite de saque");
		}
		if(quantidade > getSaldo()) {
			throw new Excecoes("Erro de saque: Saldo insuficiente");
		}
		
	}
	
	
	

}
