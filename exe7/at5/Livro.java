package at5;

public class Livro implements Calculavel {
	
	private String titulo;
	private String autor;
	private double valor;
	private int quantidadePaginas;
	
	public Livro(String titulo,String autor,int quantidadePaginas,double valor) {
		this.titulo = titulo;
		this.autor = autor;
		this.valor = valor;
		this.quantidadePaginas = quantidadePaginas;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}
	
	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}
	
	@Override
	public double calcularPrecoFinal() {
		return valor - (valor * 0.10);
	}
	
	public String toString() {
		return "";
	}

}
