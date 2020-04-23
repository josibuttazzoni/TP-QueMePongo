package tpQueMePongo;

public class Prenda {
	
	TipoDePrenda tipo;
	Material material;
	Color color;
	

	}
	

	public Prenda (Tipo unTipo, Material unMaterial, Color unColor){ 
		this.tipo = requireNonNull(unTipo, "La prenda requiere un tipo");
		this.material = requireNonNull(unMaterial, "La prenda requiere un material");
		this.color = requireNonNull(unColor, "La prenda requiere un color primario");
	}
	
	
	
}

enum Material {}

enum Color {}