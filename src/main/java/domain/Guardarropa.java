package domain;

import java.util.List;
import java.util.stream.Stream;

public class Guardarropa {
	
	List<Prenda> prendas;
	
	public void agregarPrenda(Prenda prenda) {
		prendas.add(prenda);
	}
	
	public void quitarPrenda(Prenda prenda) {
		prendas.remove(prenda);
	}

	Stream<Prenda> getPrendasAptas(ServicioMeteorologico obtenedorClima, String ciudad) {
		int temperatura = obtenedorClima.getTemperatura(ciudad);
		return prendas.stream().filter(prenda -> prenda.esAcordePara(temperatura));
	}

}
