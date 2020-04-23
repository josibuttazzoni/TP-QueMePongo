package tpQueMePongo;

import java.util.Objects;

public class Borrador {
	
	TipoDePrenda tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama;
	
	void especificarTipo (TipoDePrenda tipo) {
		this.tipo = Objects.requireNonNull(tipo, "El tipo de prenda es obligatorio");
	}
	
	void especificarMaterial (Material material) {
		 this.validarMaterialConsistenteConTipoDePrenda(material);
		 this.material = material;
	}
	
	void especificarColorPrimario (Color colorPrimario) {
		this.colorPrimario = Objects.requireNonNull(colorPrimario, "El colorPrimario de prenda es obligatorio");
	}
	
	void especificarColorSecundario (Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}
	
	void especificarTrama (Trama trama) {
		if (trama == null) {
			this.trama = Trama.lisa;
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
