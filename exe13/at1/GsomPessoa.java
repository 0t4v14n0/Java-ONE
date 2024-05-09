package at1;

import com.google.gson.Gson;

public class GsomPessoa {
	
	public Pessoa tratar (String json) {
	    Gson gson = new Gson();
	    Pessoa pessoa = gson.fromJson(json, Pessoa.class);
		return pessoa;
	}

}
