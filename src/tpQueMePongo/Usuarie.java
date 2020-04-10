package tpQueMePongo;

public class Usuarie {
	
	Atuendo atuendo;
	
	public void cargarPrenda (Prenda unaPrenda) {
		if (unaPrenda.esValida()) 
			atuendo.cargarPrenda(unaPrenda);
		
		else throw new PrendaInvalidaException ("Proba con otra prenda");	

}


class PrendaInvalidaException extends Exception {
	new(String msg) {
		super(msg);
	}
}

