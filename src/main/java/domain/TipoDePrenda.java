package domain;

public class TipoDePrenda {
	Categoria categoria;
	int temperaturaMaxima;
	
	public TipoDePrenda (Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public boolean esAcordePara(int temperatura) {
		return temperatura < temperaturaMaxima;
	}
}



