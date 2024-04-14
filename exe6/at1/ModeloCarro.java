package at1;

public class ModeloCarro extends Carro {

	public ModeloCarro(String modelo) {
		super(modelo);
	}
	
    public static void main(String[] args) {
    	
    	Carro meuCarro = new Carro("Porsche 911");
    	
    	meuCarro.addPrecoAno1(800000);
    	meuCarro.addPrecoAno1(777777);
    	meuCarro.addPrecoAno1(789999);
    	
    	meuCarro.addPrecoAno2(888888);
    	meuCarro.addPrecoAno2(699999);
    	meuCarro.addPrecoAno2(900000);
    	
    	meuCarro.addPrecoAno3(756789);
    	meuCarro.addPrecoAno3(897654);
    	meuCarro.addPrecoAno3(739896);
    	
    	System.out.println(meuCarro);

    }

}
