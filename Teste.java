package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(); // instanciar
		
		conta.setAgencia(234);
		conta.setNumero(98);
		
		conta.depositar(900.34);
		conta.sacar(100.00);
		
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		System.out.println(conta.consultarSaldo());
		
		
		Conta poupanca = new Conta(12345, 88456, 250.50);
		System.out.println(poupanca);
		System.out.println(poupanca.getAgencia());
		System.out.println(poupanca.getNumero());
		System.out.println(poupanca.getSaldo());
		
		
		ContaCorrente cc = new ContaCorrente();
		cc.setAgencia(234);
		cc.setNumero(908);
		cc.setTipo("PF");
		cc.setChequeEspecial(500.50);
		
		System.out.println(cc);
		
		if (conta instanceof ContaCorrente) { // é importante verificar se a variavel conta  do tipo conta é uma instancia : como não é entao não vai cair no erro 
			ContaCorrente c2 = (ContaCorrente) conta;
		}
		
		
		
				
	}
}
