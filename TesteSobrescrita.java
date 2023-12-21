package br.com.fiap.banco;

public class TesteSobrescrita {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.depositar(1000.00);
		conta1.sacar(200.0);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(1000.00);
		conta2.sacar(200.00);
		
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000.00);
		conta3.sacar(200.00);
		
		
		System.out.println("Conta 1: " + conta1.getSaldo()); // 800
		System.out.println("Conta 2: " + conta2.getSaldo()); //790 pq o objeto instanciado é a conta corrente
		System.out.println("Conta 3: " + conta3.getSaldo()); //790 pq o objeto instanciado é a conta corrente
	}
	
}
