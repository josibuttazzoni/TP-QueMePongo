package tpQueMePongo;

public class Prenda {
	
	Tipo tipo;
	Categoria categoria;
	String material;
	Color color;
	
	public boolean esValida () {
		
	}
	
	public Prenda (Tipo unTipo, Categoria unaCategoria, Material unMaterial, Color unColor ) {
		
	}
	
	
	
	
}


enum Tipo {
	zapatos, camisaMangaCorta, pantalon;
}

enum Categoria {
	parteSuperior, calzado, parteInferior, accesorios;
}

enum Material {}

enum Color {}