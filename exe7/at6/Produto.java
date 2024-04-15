package at6;

public class Produto implements Vendavel {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
    	return nome;
    }

    @Override
    public double calcularPrecoTotal() {
        return preco * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        double precoTotalComDesconto = calcularPrecoTotal() * (1 - percentualDesconto);
        System.out.println("Preço total do produto '" + nome + "' com desconto: R$" + precoTotalComDesconto);
    }
}