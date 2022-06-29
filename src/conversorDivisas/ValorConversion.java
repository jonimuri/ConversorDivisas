package conversorDivisas;

import javax.swing.JOptionPane;

public class ValorConversion {
	public ValorConversion(double importe, String moneda) {
		JOptionPane.showMessageDialog(null, "Tiene " + importe + " " + moneda);
	}
}
