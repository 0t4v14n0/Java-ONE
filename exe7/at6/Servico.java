package at6;

public class Servico implements Vendavel {
    private String nome;
    private double preco;
    private int horas;

    public Servico(String nome, double preco, int horas) {
        this.nome = nome;
        this.preco = preco;
        this.horas = horas;
    }
    
    public String getNome() {
    	return nome;
    }

    @Override
    public double calcularPrecoTotal() {
        return preco * horas;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {

    	System.out.println("Desconto não aplicável a serviços.");
    	
    }
}