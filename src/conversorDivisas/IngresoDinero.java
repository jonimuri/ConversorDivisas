package conversorDivisas;

import javax.swing.JOptionPane;

public class IngresoDinero {
	
	private float importe;
	
	public IngresoDinero() {
		importe = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir"));
	}
	
	public float getImporte() {
		return this.importe;
	}
}