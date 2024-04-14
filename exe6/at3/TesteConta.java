package at3;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(12,"Otaviano",77777,true);
		
		if(contaCorrente.getAtivo()) {
			System.out.println(contaCorrente);
						
			contaCorrente.tarifaMensal();
			
			System.out.println(contaCorrente);
			
		}else {
			System.out.println("Conta desativada");
		}
	}

}
