package domain;

import java.util.List;

public class NotificadorDiarioAlertas {
	
	List<Usuarie> usuaries;
	
	public void notificar() {
		
	}
	
	void suscribirUsuarie (Usuarie usuarie) {
		usuaries.add(usuarie);
	}
	
	void desuscribirUsuarie (Usuarie usuarie) {
		usuaries.remove(usuarie);
	}

}
