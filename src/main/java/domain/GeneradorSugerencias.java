package domain;

import java.util.List;
import java.util.stream.Stream;

public interface GeneradorSugerencias {
	
	public List<Atuendo> generarSugerenciasDesde(Stream<Prenda> prendas);

}
