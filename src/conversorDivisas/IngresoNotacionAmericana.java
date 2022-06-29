package conversorDivisas;

import javax.swing.JOptionPane;

public class IngresoNotacionAmericana {
	
	Object notacionAmericana;
	
	public IngresoNotacionAmericana() {
		notacionAmericana = JOptionPane.showInputDialog(null,"Elija el acorde",
				   "Sistema americano", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { 
						         "C",
						         "D",
						         "E",
						         "F",
						         "G",
						         "A",
						         "B",
						       },"");
	}
	
	public Object getNotacionAmericana() {
		return notacionAmericana;
	}
}