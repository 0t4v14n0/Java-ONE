package at3;

public class ContaBancaria {
	
	private int id;
	private String nome;
	private double saldo;
	private boolean ativo;
	
	public ContaBancaria(int id,String nome,double saldo,boolean ativo) {
		this.id = id;
		this.nome = nome;
		this.saldo = saldo;
		this.ativo = ativo;
	}
	
	public boolean getAtivo() {
		return ativo;
	}
	
	public void contaAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void Depositar(double saldo) {
		this.saldo += saldo;
	}
	
	public void Sacar(double saldo) {
		this.saldo -= saldo;
	}
	
	public String toString() {
		return "ID:"+id+" Nome: "+nome+" Saldo: "+saldo;
	}
	
}
