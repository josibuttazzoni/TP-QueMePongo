package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Usuario {
	
	List<Prenda> guardarropas = new ArrayList<>(); 
	
	
	Stream<Prenda> getPrendasAptas(AdaptadorClima obtenedorClima, String ciudad) {
		int temperatura = obtenedorClima.getTemperatura(ciudad);
		return guardarropas.stream().filter(prenda -> prenda.esAcordePara(temperatura));
	}
	
	public List<Sugerencia> getSugerencias(AdaptadorClima obtenedorClima, GeneradorSugerencias generador, String ciudad) {
		return generador.generarSugerenciasDesde(getPrendasAptas(obtenedorClima,ciudad));
		
	}
	
}
