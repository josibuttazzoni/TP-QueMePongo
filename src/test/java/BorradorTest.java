import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.Borrador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BorradorTest {
    
	@DisplayName("Un Borrador sin TipoPrenda debe arrojar NullPointerException al instanciarse")
    @Test
    public void borradorSinTipoPrenda() {
        NullPointerException excepcion = assertThrows(NullPointerException.class, () -> {
        	new Borrador(null);
        });

        String mensajeEsperado = "El tipo de prenda es obligatorio";
        assertEquals(mensajeEsperado, excepcion.getMessage());
    }

    
}