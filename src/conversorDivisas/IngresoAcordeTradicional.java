package conversorDivisas;

import javax.swing.JOptionPane;

public class IngresoAcordeTradicional {
	
	private Object notacionTradicional;
	
	public IngresoAcordeTradicional() {
		notacionTradicional = JOptionPane.showInputDialog(null,"Elija el acorde",
				   "Sistema tradicional", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { 
						  		 "Do",
						         "Re",
						         "Mi",
						         "Fa",
						         "Sol",
						         "La",
						         "Si",
						       },"");
	}
	
	public Object getNotacionTradicional() {
		return notacionTradicional;
	}
}
