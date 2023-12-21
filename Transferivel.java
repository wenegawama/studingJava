package br.com.fiap.banco;

public interface Transferivel {
	
	public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor);
	public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor);
}
