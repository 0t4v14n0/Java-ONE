package com.spotlura.util;

public class Podcasts extends Audio implements Reproduzivel  {
	
	private String cast;
	
	public Podcasts(String titulo, double duracao,String cast) {
		super(titulo, duracao);
		this.cast = cast;
	}
	
	@Override
    public void exibirInformacoes() {
		super.exibirInformacoes(cast);
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
