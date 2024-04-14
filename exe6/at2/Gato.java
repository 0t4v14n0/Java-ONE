package at2;

public class Gato extends Animal {
	public Gato() {
		super();
	}
	
    @Override
    public void emitirSom() {
        System.out.println("Miau Miau Miau!");
    }
    
    public void ronrona() {
    	System.out.println("renhau-nhau,renhau-nhau,renhau-nhau");
    }
}
