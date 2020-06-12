package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Usuarie {
	
	String ciudad;
	ServicioMeteorologico obtenedorClima;
	List<Guardarropa> guardarropas = new ArrayList<>();
	List<Propuesta> propuestas = new ArrayList<>();
	
	
	Stream<Prenda> getPrendasAptas(Guardarropa guardarropa) {
		return guardarropa.getPrendasAptas(obtenedorClima, ciudad);
	}
	
	/*public List<Sugerencia> getSugerencias(AdaptadorClima obtenedorClima, GeneradorSugerencias generador, String ciudad) {
		return generador.generarSugerenciasDesde(getPrendasAptas(obtenedorClima,ciudad));
		
	}*/
	
	public void aceptarPropuesta(Propuesta propuesta) {
		propuesta.aceptar();
	}
	
	public void rechazarPropuesta(Propuesta propuesta) {
		propuesta.rechazar();
	}
	
	public Stream<Propuesta> getPropuestasAceptadas () {
		return propuestas.stream().filter(propuesta -> propuesta.fueAceptada());
	}
	
	public void deshacerPropuestas() {
		getPropuestasAceptadas().forEach(propuesta -> propuesta.deshacerEfecto());
	}
	
}
