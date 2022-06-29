package conversorDivisas;

import javax.swing.JOptionPane;

public class Menu {
	
	private Object conversor;
	
	public Menu() {
		conversor = JOptionPane.showInputDialog(null,"Elija el tipo de conversor",
				   "Menu", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Conversor de divisas","Conversor de notas de guitarra"},"");
	}
	
	public Object getConversorSeleccionado() {
		return this.conversor;
	}
}