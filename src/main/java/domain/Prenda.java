package domain;

public class Prenda {
	
	TipoDePrenda tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama;
	Clasificacion clasificacion;
	
	

	public Categoria getGategoria() {
		return tipo.getCategoria();
	}
	

	public Prenda(TipoDePrenda tipo, Material material, Color color, Color colorSec, Trama trama, Clasificacion clasificacion) {
	  this.tipo = tipo;
	  this.material = material;
	  this.colorPrimario = color;
	  this.colorSecundario = colorSec;
	  this.trama = trama;
	  this.clasificacion = clasificacion;
	}
	
	public boolean esAcordePara(int temperatura) {
		return tipo.esAcordePara(temperatura);
	}
	
	
	
}