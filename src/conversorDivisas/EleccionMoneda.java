package conversorDivisas;

import javax.swing.JOptionPane;

public class EleccionMoneda{
	
	private Object moneda;
	
	public EleccionMoneda() {
		moneda = JOptionPane.showInputDialog(null,"Elija la moneda a la que desea convertir el dinero",
				   "Moneda", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { 
						  		 "De Peso a Dolar",
						         "De Peso a Euro",
						         "De Peso a Libra esterlina", 
						         "De Peso a Yen Japonés", 
						         "De Peso a Won sul-coreano",
						         "De Dolar a Peso",
						         "De Euro a Peso",
						         "De Libra esterlina a Peso",
						         "De Yen japonés a Peso",
						         "De Won sul-coreano a Peso"
						       },"");
	}
	
	public Object getMoneda() {
		return this.moneda;
	}
}