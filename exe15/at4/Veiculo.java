package at4;

public class Veiculo {
	
	private String nome;
	private String modelo;
	private String ano;
	private int km;
	
	public Veiculo(String nome,String modelo,String ano,int km) {
		this.nome = nome;
		this.modelo = modelo;
		this.ano = ano;
		this.km = km;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}
	
	public String toString() {
		return "marca = "+nome+" modelo = "+modelo+" ano: "+ano+" km: "+km;
	}
	
}
