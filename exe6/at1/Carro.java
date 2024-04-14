package at1;

public class Carro {
	
	private String modelo;
	private double ano1;
	private int quant1;
	private double ano2;
	private int quant2;
	private double ano3;
	private int quant3;
	
	public Carro(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getAno1() {
		return ano1;
	}

	public void setAno1(double ano1) {
		this.ano1 = ano1;
	}

	public int getQuant1() {
		return quant1;
	}

	public void setQuant1(int quant1) {
		this.quant1 = quant1;
	}

	public double getAno2() {
		return ano2;
	}

	public void setAno2(double ano2) {
		this.ano2 = ano2;
	}

	public int getQuant2() {
		return quant2;
	}

	public void setQuant2(int quant2) {
		this.quant2 = quant2;
	}

	public double getAno3() {
		return ano3;
	}

	public void setAno3(double ano3) {
		this.ano3 = ano3;
	}

	public int getQuant3() {
		return quant3;
	}

	public void setQuant3(int quant3) {
		this.quant3 = quant3;
	}
	
	public void addPrecoAno1(double preco) {
		this.ano1 += preco;
		this.quant1 ++;
	}
	
	public void addPrecoAno2(double preco) {
		this.ano2 += preco;
		this.quant2 ++;
	}
	
	public void addPrecoAno3(double preco) {
		this.ano3 += preco;
		this.quant3 ++;
	}
	
	public double getMediaAno1() {
		return ano1 / quant1;
	}
	
	public double getMediaAno2() {
		return ano2 / quant2;
	}
	
	public double getMediaAno3() {
		return ano3 / quant3;
	}
	
    public double getMenorPreco() {
        return Math.min(ano1, Math.min(ano2, ano3));
    }

    public double getMaiorPreco() {
        return Math.max(ano1, Math.max(ano2, ano3));
    }
	
	public String toString() {
		return "Modelo do Carro: "+ modelo +"  \n"
			+  "Quantidade Vendidos Ano 1: "+ quant1 +" Media: "+getMediaAno1()+"\n"
			+  "Quantidade Vendidos Ano 2: "+ quant2 +" Media: "+getMediaAno2()+"\n"
			+  "Quantidade Vendidos Ano 3: "+ quant3 +" Media: "+getMediaAno3()+"\n"
			+  "Maior Preco: "+ getMaiorPreco() +"\n"
			+  "Menor Preco: "+ getMenorPreco() +"\n";
	}
	
	

}
