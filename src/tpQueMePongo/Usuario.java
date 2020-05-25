package tpQueMePongo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Usuario {
	
	List<Prenda> guardarropas = new ArrayList<>(); 
	
	@SuppressWarnings("rawtypes")
	public List<HashMap> getClima () {
		return new AccuWeatherAPI().getWeather("Buenos Aires, Argentina");
	}
	
	public Atuendo getSugerencia() {
		return null;
		
	}
	
}
