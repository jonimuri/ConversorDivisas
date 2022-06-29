package conversorDivisas;

import javax.swing.JOptionPane;

public class Continuar {
	public Continuar() {
		int respuesta = JOptionPane.showConfirmDialog(null,"¿Hacer otra conversion?");
		System.out.println(respuesta);
	}
}

//YES_OPTION = 0, 
//NO_OPTION = 1, 
//OK_OPTION = 0, 
//CANCEL_OPTION = 2, 
//CLOSED_OPTION = -1