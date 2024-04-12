package exe4;

public class Musica {
	
	private String titulo;
	private String artista;
	private int anoLancamento;
	private double avaliacao;
	private int numAvaliacao;
	
	public Musica(String titulo ,String artista, int anoLancamento, double avaliacao, int numAvaliacao) {
		this.titulo = titulo;
        	this.artista = artista;
        	this.anoLancamento = anoLancamento;
        	this.avaliacao = avaliacao;
        	this.numAvaliacao = numAvaliacao;
    }
	
	public void avaliacao(double avalia) {
		avaliacao += avalia;
		numAvaliacao++;
	}
	
	
	public double retornaMedia() {
		double media = avaliacao/numAvaliacao;
				
		return media;
		
	}
	
	public String toString() {
        return " - titulo: " + titulo + " - Artista: " + artista + " - Ano de Lancamento: "+ anoLancamento +" - Media Avaliacao: "+retornaMedia();
    }

}
