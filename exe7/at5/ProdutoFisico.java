package at5;

public class ProdutoFisico extends Livro implements Calculavel {
	
    public ProdutoFisico(String titulo, String autor, int quantidadePaginas, double valor) {
		super(titulo, autor, quantidadePaginas, valor);
	}

	private double taxaEntrega = 16.60;

	@Override
	public double calcularPrecoFinal() {
		double valorf = taxaEntrega + super.getValor();
		return valorf;
	}

}
