package at3;

public class ContaCorrente extends ContaBancaria {
	
	private static double valorTarifa = 15;

	public ContaCorrente(int id, String nome, double saldo, boolean ativo) {
		super(id, nome, saldo, ativo);
	}
	
	public void tarifaMensal() {
		double saldo = getSaldo();
		if(saldo >= valorTarifa) {
			System.out.println("Tarifa debitada da conta de valor: "+valorTarifa);
			setSaldo(saldo - valorTarifa);
		} else {
			contaAtivo(false);
			System.out.println("Conta cancelada");
		}
	}

}
