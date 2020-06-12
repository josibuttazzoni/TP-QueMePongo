package domain;

import java.util.HashMap;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {
	
	AccuWeatherAPI apiClima = new AccuWeatherAPI();
	
	public int getTemperatura(String ciudad) {
		
		@SuppressWarnings("unchecked")
		HashMap<String, Object> datos = (HashMap<String, Object>) apiClima.getWeather(ciudad).get(0).get("Temperature");
		int temperatura = (int) datos.get("Value");
	    return temperatura;
	    
	}

}