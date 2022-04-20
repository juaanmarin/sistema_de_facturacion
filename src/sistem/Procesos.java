package sistem;

import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;

public class Procesos {
	
	Almacenamiento miAlmacenamiento=new Almacenamiento();
	
	public void inicio() {
		String menu="MENU\n";
		menu+="1_registrar productos\n";
		menu+="2_salir del sistema\n";
		
		int cod=0;
		do {
			cod=Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (cod==1) {
				registrar();
			}
		} while (cod==1);	
	}

	private void registrar() {
		String listaDeProductos="QUE PRODUCTO DESEA COMPRAR?\n";
		listaDeProductos+="1_papas  precio=2000\n";
		listaDeProductos+="2_gaseosa  precio=1000\n";
		listaDeProductos+="0_SALIR";
		
		int codProducto=0;
		
		String nombre=JOptionPane.showInputDialog("ingrese su nombre");
		do {
			codProducto=Integer.parseInt(JOptionPane.showInputDialog(listaDeProductos));
			String guarda=guardarInfo(codProducto,nombre);
			mostrarDatosCompra();
		} while (codProducto>0 && codProducto<3);
		
	}

	private String guardarInfo(int codProducto, String nombre) {
		int valorT = 0;
		int idProducto=0;
		int cantProductos=Integer.parseInt(JOptionPane.showInputDialog("que cantidad de este producto desea comprar"));
		
		switch (codProducto) {
		case 1:
			valorT=cantProductos*2000;
			break;
		case 2:
			valorT=cantProductos*1000;
			break;
		}
		
		ArrayList<Integer> listaDeValores=new ArrayList<>();
		listaDeValores.add(codProducto);
		listaDeValores.add(cantProductos);
		listaDeValores.add(valorT);
		
		return miAlmacenamiento.guardarCliente(nombre, listaDeValores);
		
	}
	
	private void mostrarDatosCompra() {
		Map datos=miAlmacenamiento.obtenerTodosLosDatos();
		System.out.println(datos);
	}


}
