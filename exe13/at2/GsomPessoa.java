package at1;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsomPessoa {
	
	public Pessoa tratar (String json) {
		
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .create();
        
	    Pessoa pessoa = gson.fromJson(json, Pessoa.class);
	    
		return pessoa;
	}

}
