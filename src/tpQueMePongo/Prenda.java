package tpQueMePongo;

import java.util.HashMap;
import java.util.Objects;

public class Prenda {
	
	TipoDePrenda tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama;
	

	public Categoria getGategoria() {
		return tipo.getCategoria();
	}
	

	public Prenda(TipoDePrenda tipo, Material material, Color color, Trama trama) {
	  this.tipo = Objects.requireNonNull(tipo, "El tipo de prenda es obligatorio");
	  this.material = Objects.requireNonNull(material, "El material es obligatorio");
	  this.colorPrimario = Objects.requireNonNull(color, "El color primario es obligatorio");
	  this.trama = Objects.requireNonNull(trama, "El color primario es obligatorio");
	}
	
	public boolean esAcordePara(HashMap<?, ?> temperatura) {
		return false;
		
	}
	
	
	
}

enum Material {}

enum Color {}

enum Trama {LISA, RAYADA, A_CUADROS}