package domain;

public class PropuestaEliminar extends Propuesta {

	public PropuestaEliminar(Guardarropa guardarropa, Prenda prenda) {
		super(guardarropa, prenda);
	}
	
	@Override public void aceptar() {
		guardarropa.quitarPrenda(prenda);
	}
	
	@Override public void deshacerEfecto() {
		guardarropa.agregarPrenda(prenda);
	}

}
