package tpQueMePongo;

import java.util.Objects;

public class Prenda {
	
	TipoDePrenda tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	

	public Categoria getGategoria() {
		return tipo.getCategoria();
	}
	

	public Prenda(TipoDePrenda tipo, Material material, Color color) {
	  this.tipo = Objects.requireNonNull(tipo, "El tipo de prenda es obligatorio");
	  this.material = Objects.requireNonNull(material, "El material es obligatorio");
	  this.colorPrimario = Objects.requireNonNull(color, "El color primario es obligatorio");
	}
	
	
	
}

enum Material {}

enum Color {}