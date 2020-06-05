package domain;

public class Propuesta {
	
	Estado estado;
	Guardarropa guardarropa;
	Prenda prenda;
	
	public Propuesta (Guardarropa guardarropa, Prenda prenda) {
		this.guardarropa = guardarropa;
		this.prenda = prenda;
		this.estado = Estado.PENDIENTE;
	}
	
	public boolean fueAceptada () {
		return estado == Estado.ACEPTADO;
	}
	
	void rechazar() {
		estado = Estado.RECHAZADO;
	}
	
	void aceptar() {
		estado = Estado.ACEPTADO;
	}

	void deshacerEfecto() {
	}

}
