package tpQueMePongo;

public class TipoDePrenda {
	Categoria categoria;
	
	public TipoDePrenda (Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
}


enum Categoria {
	parteSuperior, calzado, parteInferior, accesorios;
}
