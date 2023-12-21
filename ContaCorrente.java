package br.com.fiap.banco;

public class ContaCorrente extends Conta {
	
	private String tipo;
	private double chequeEspecial;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}	
	
	
	public double getSaldoDisponivel(){
		return super.getSaldo() + chequeEspecial;
	}
	@Override
	public String toString() {
		return "ContaCorrente [tipo=" + tipo + ", chequeEspecial=" + chequeEspecial + ", getTipo()=" + getTipo()
				+ ", getChequeEspecial()=" + getChequeEspecial() + ", getSaldoDisponivel()=" + getSaldoDisponivel()
				+ ", getAgencia()=" + getAgencia() + ", getNumero()=" + getNumero() + ", getSaldo()=" + getSaldo()
				+ ", consultarSaldo()=" + consultarSaldo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	@Override // é a sobrescrita => polimorfismo
	public void sacar(double valor) {
		valor += 10;
		super.sacar(valor);
	}
	
	
}
