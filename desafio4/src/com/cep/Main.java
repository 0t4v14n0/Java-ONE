package com.cep;

import java.io.IOException;
import com.cep.util.ApiCEP;
import com.cep.util.Cep;

public class Main {
    
    public static void main(String[] args) {
        
        String cep = "55150005";
        
        ApiCEP apiCEP = new ApiCEP();
        
        try {
            Cep novoCep = apiCEP.consultarEnderecoPeloCEP(cep);
            System.out.println(novoCep);
        } catch (IOException | InterruptedException e) {
            System.err.println("Não foi possível obter o endereço a partir desse CEP.");
            e.printStackTrace();
        }
    
    }
}