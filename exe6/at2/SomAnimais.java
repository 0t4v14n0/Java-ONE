package at2;

public class SomAnimais {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.emitirSom(); 
        
        Gato gato = new Gato();
        gato.emitirSom();
        gato.ronrona();
        
        Cachorro dog = new Cachorro();
        dog.emitirSom();
        dog.abanaRabo();
        
        Papagaio papa = new Papagaio();
        papa.emitirSom();
        papa.cra();
        
    }
}
