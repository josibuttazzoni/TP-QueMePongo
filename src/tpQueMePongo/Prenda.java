package tpQueMePongo;

public class Prenda {
	
	Tipo tipo;
	Categoria categoria;
	Material material;
	Color color;
	
	public boolean esValida () {
		
	}
	

	public Prenda (Tipo unTipo, Material unMaterial, Color unColor){ 
		tipo = requireNonNull(unTipo, "La prenda requiere un tipo");
		material = requireNonNull(unMaterial, "La prenda requiere un material");
		color = requireNonNull(unColor, "La prenda requiere un color primario");
	}
	
	
	
}


enum Tipo {
	zapatos, camisaMangaCorta, pantalon;
}

enum Material {
	
}

enum Categoria {
	parteSuperior, calzado, parteInferior, accesorios;
}


enum Color {}