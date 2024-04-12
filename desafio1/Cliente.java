package bancodesafio;

public class Cliente {
	
	private  int   id;
	private String nome;
	private double saldo;
	private String tipoconta;
	
	public Cliente(int id ,String nome, double saldo, String tipoconta) {
		this.id = id;
        	this.nome = nome;
        	this.saldo = saldo;
        	this.tipoconta = tipoconta;
        }
	
	//gets e sets...
	
	public int getId () {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTipoconta() {
		return tipoconta;
	}
	
	public void setTipoconta(String tipoconta) {
		this.tipoconta = tipoconta;
	}
	
	public String toString() {
        return " - id: " + id + " - nome: " + nome + " - Saldo: R$"+ saldo +" - Tipo de Conta: "+tipoconta;
    }

}
