package domain;

public class PropuestaAgregar extends Propuesta {

	public PropuestaAgregar(Guardarropa guardarropa, Prenda prenda) {
		super(guardarropa, prenda);
	}
	
	@Override public void aceptar() {
		guardarropa.agregarPrenda(prenda);
	}
	
	@Override public void deshacerEfecto() {
		guardarropa.quitarPrenda(prenda);
	}
	

}
