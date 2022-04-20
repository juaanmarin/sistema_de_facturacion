package sistem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Almacenamiento {
	HashMap<String, ArrayList<Integer>> clientes=new HashMap<>();

	public String guardarCliente(String nombre, ArrayList<Integer> listaDeValores) {		
		clientes.put(nombre, listaDeValores);
		return "registrado";
	}

	public Map obtenerTodosLosDatos() {
		
		return clientes;
	}
	
	
	
}
