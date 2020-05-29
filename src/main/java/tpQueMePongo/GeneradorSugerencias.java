package tpQueMePongo;

import java.util.List;
import java.util.stream.Stream;

public interface GeneradorSugerencias {
	
	public List<Sugerencia> generarSugerenciasDesde(Stream<Prenda> prendas);

}
