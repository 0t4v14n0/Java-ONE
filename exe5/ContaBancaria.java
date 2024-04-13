package exe5;

public class ContaBancaria {
	
	private int numeroConta;
	private double saldo;
	public String titular;
	
	public ContaBancaria(int numeroConta,double saldo,String titular) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString(){
		return "Numero da conta: "+numeroConta+" Saldo: "+saldo+" Titular: "+titular;
	}

}
