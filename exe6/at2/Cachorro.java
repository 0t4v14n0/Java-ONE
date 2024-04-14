package at2;

public class Cachorro extends Animal {
	public Cachorro () {
		super();
	}
    @Override
    public void emitirSom() {
        System.out.println("Au au au!");
    }
    
    public void abanaRabo() {
    	System.out.println("Abana Rabo !");
    }
}
