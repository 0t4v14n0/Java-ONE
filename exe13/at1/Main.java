package at1;

public class Main {

	public static void main(String[] args) {
		
			String json = "{\"nome\":\"Otaviano\",\"idade\":23,\"cidade\":\"Belo Jardim\"}";
			
			GsomPessoa gsom = new GsomPessoa();
			
			Pessoa pessoa = gsom.tratar(json);
			
			System.out.println(pessoa);
			
			System.out.println(pessoa.nome());

			System.out.println(pessoa.idade());

			System.out.println(pessoa.cidade());

	}

}
