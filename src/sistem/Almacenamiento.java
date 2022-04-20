package sistem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Almacenamiento {
	HashMap<String, ArrayList<ArrayList<Integer>>> clientes=new HashMap<>();
	ArrayList<ArrayList<Integer>> listaGeneralDeCompras =new ArrayList<>();

	public String guardarCliente(String nombre, ArrayList<ArrayList<Integer>> DatosDeCompra) {		
		clientes.put(nombre, DatosDeCompra);
		return "registrado";
	}

	public Map obtenerTodosLosDatos() {	
		return clientes;
	}

	public void compra(ArrayList<Integer> listaDeValores) {
		listaGeneralDeCompras.add(listaDeValores);
	}
	
	public ArrayList<ArrayList<Integer>> obtenerDatosCompraGeneral() {
		return listaGeneralDeCompras;
	}
	
	public void borrarDatosAnt() {
		for (int i=0; i<listaGeneralDeCompras.size(); i++) {
			listaGeneralDeCompras.remove(i);
		}
	}
	
}
