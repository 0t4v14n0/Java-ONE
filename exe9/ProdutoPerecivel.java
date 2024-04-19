package at1;

public class ProdutoPerecivel extends Produto {
	
	private String dataValidade;

	public ProdutoPerecivel(String nome, double preco, int quantidade,String dataValidade) {
		super(nome, preco, quantidade);
		this.dataValidade = dataValidade;
	}
	
	public String toString() {
		return super.toString()+" Validade: "+dataValidade;
	}

}
