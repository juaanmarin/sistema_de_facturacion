package sistem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Almacenamiento {
	HashMap<String, ArrayList<ArrayList<Integer>>> clientes=new HashMap<>();
	ArrayList<ArrayList<Integer>> listaGeneralDeCompras;

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
		listaGeneralDeCompras=new ArrayList<>();
	}
	
}
