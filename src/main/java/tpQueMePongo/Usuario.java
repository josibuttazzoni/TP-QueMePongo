package tpQueMePongo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Usuario {
	
	List<Prenda> guardarropas = new ArrayList<>(); 
	
    public int getTemperatura(String ciudad) {
        @SuppressWarnings("unchecked")
		HashMap<String, Object> datos = (HashMap<String, Object>) new AccuWeatherAPI().getWeather(ciudad).get(0).get("Temperature");
        int temperatura = (int) datos.get("Value");
        return temperatura;
    }
	
	Stream<Prenda> getPrendasAptas(String ciudad) {
		return guardarropas.stream().filter(prenda -> prenda.esAcordePara(this.getTemperatura(ciudad)));
	}
	
	public Sugerencia getSugerencia() {
		return null;
		
	}
	
}
