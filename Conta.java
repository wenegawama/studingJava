package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta bancaria
 * @author Wenega Wama
 * @version 1.0 
 */

public class Conta implements Serializable{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta() {
		
	}

	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}


	/**
	 * Depositar da classe
	 * @param valor
	 */
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	/**
	 * Retirar um valor do saldo da conta
	 * @param valor
	 * @see depositar
	 */
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	
	/**
	 * Verifica o saldo da conta
	 * @return o valor do saldo da conta
	 */
	public double consultarSaldo(){
		return this.saldo;
	}

	/*
	@Override
	public String toString() {
		return "Conta: agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo ;
	}
	*/
	
	
}
