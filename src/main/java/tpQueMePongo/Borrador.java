package tpQueMePongo;

import java.util.Objects;

public class Borrador {
	
	TipoDePrenda tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama;
	
	public Borrador(TipoDePrenda tipoPrenda) {
		this.tipo = Objects.requireNonNull(tipoPrenda, "El tipo de prenda es obligatorio");
	}
	
	public void especificarMaterial (Material material) {
		 this.validarMaterialConsistenteConTipoDePrenda(material);
		 this.material = material;
	}
	
	public void especificarColorPrimario (Color colorPrimario) {
		this.colorPrimario = Objects.requireNonNull(colorPrimario, "El colorPrimario de prenda es obligatorio");
	}
	
	public void especificarColorSecundario (Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}
	
	public void especificarTrama (Trama trama) {
		if (trama == null) {
			this.trama = Trama.LISA;
		}
		else this.trama = trama;
	}
	
	boolean validarMaterialConsistenteConTipoDePrenda(Material material) {
		return true;
	}
	
	public Prenda crearPrenda() {
		return new Prenda(tipo, material, colorPrimario, trama);
	}
}
