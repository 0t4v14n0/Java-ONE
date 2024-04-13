package exe5;

public class IdadePessoa {
	private String nome;
	private int idade;
	
	public IdadePessoa(String nome,int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String maiorIdade() {
		if (idade >= 18) {
			return "Maior de idade";
		}else {
			return "Menor de idade";
		}
	}
	
}
