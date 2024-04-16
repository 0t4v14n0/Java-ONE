package com.spotlura.util;

public class Musicas extends Audio implements Reproduzivel  {
	
	private String cantor;

	public Musicas(String titulo, double duracao,String cantor) {
		super(titulo, duracao);
		this.cantor = cantor;
	}
	
	@Override
    public void exibirInformacoes() {
		super.exibirInformacoes(cantor);
    }
    
    @Override
    public void reproduzir() {
        super.reproduzir();
    }

	@Override
    public void curtir() {
        super.curtir();
    }
    
	@Override
    public void classificar() {
    	super.classificar();
    }

}
