package at6;

public class Main {
	
    public static void main(String[] args) {

    	Produto produto = new Produto("Ovo", 16.70, 3);

        double precoTotalProduto = produto.calcularPrecoTotal();
        System.out.println("Preço total do produto '" + produto.getNome() + "': R$" + precoTotalProduto);

        produto.aplicarDesconto(0.10);

        Servico servico = new Servico("Consultoria", 100.0, 8);

        double precoTotalServico = servico.calcularPrecoTotal();
        System.out.println("Preço total do serviço '" + servico.getNome() + "': R$" + precoTotalServico);

        servico.aplicarDesconto(0.10);
        
    }
}