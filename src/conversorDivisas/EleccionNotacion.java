package conversorDivisas;

import javax.swing.JOptionPane;

public class EleccionNotacion {
	
	private Object notacion;
	
	public EleccionNotacion() {
		this.notacion = JOptionPane.showInputDialog(null,"Elija el sistema al que desea convertir el acorde",
				   "Sistema", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { 
						  		 "De Tradicional a Americano",
						         "De Americano a Tradicional",
						       },"");
	}
	
	public Object getNotacion() {
		return this.notacion;
	}
}