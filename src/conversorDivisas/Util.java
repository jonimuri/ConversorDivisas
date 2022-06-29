package conversorDivisas;

import javax.swing.JOptionPane;

public class Util {
	public String seleccionaConversor(String conversorSeleccionado) {
		String conversor = null;
		if (conversorSeleccionado == "Conversor de divisas") {
			conversor = (String) new EleccionMoneda().getMoneda();
			return conversor;
		}

		if (conversorSeleccionado == "Conversor de notas de guitarra") {
			conversor = (String) new EleccionNotacion().getNotacion();
			return conversor;
		}
		return conversor;
	}
	
	public boolean conversionExiste(String tipoDeConversor) {
		if (tipoDeConversor == "De Peso a Dolar" | 
				tipoDeConversor == "De Peso a Euro" | 
				tipoDeConversor == "De Peso a Libra esterlina" |
				tipoDeConversor == "De Peso a Yen Japonés" |
				tipoDeConversor == "De Peso a Won sul-coreano" |
				tipoDeConversor == "De Dolar a Peso" |
				tipoDeConversor == "De Euro a Peso" |
				tipoDeConversor == "De Libra esterlina a Peso" |
				tipoDeConversor == "De Yen japonés a Peso" |
				tipoDeConversor == "De Won sul-coreano a Peso") {
			return true;
		}else {
			return false;
		}
	}
	
	public float dePesoAMonedaExtranjera(float pesos, float cotizacion) {
		return pesos / cotizacion;
	}
	
	public float deMonedaExtranjeraAPeso(float pesos, float cotizacion) {
		return pesos * cotizacion;
	}
	
	public void continuaTermina(int respuesta) {
		if (respuesta == 0) {
			String conversorSeleccionado = (String) new Menu().getConversorSeleccionado();
			
			Util util = new Util();
			String tipoDeConversor = util.seleccionaConversor(conversorSeleccionado);

			if (util.conversionExiste(tipoDeConversor)) {
				util.convertirMoneda(tipoDeConversor);
			}
			
			String[] sistemasAcordes = new String[2];
			sistemasAcordes[0] = "De Tradicional a Americano";
			sistemasAcordes[1] = "De Americano a Tradicional";
			
			if (tipoDeConversor == sistemasAcordes[0] || tipoDeConversor == sistemasAcordes[1]) {
				String acorde = (String) util.seleccionaTipoSistemaDeAcorde(tipoDeConversor);
				util.muestraAcordeConvertido(acorde);
			}
		}
	}

	public void convertirMoneda(String tipoDeMoneda) {
		float pesos = new IngresoDinero().getImporte();
		float peso;
		float dolar = (float) 121.29;
		float euro = (float) 129.87;
		float libraEsterlina = (float) 152.57;
		float yenJapones = (float) 1.1;
		float wonCoreano = (float) .097;
		int respuesta;
		
		switch (tipoDeMoneda) {
		case "De Peso a Dolar":
			float dolares = dePesoAMonedaExtranjera(pesos, dolar);
			new ValorConversion(dolares, "dolares");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "De Peso a Euro":
			float euros = dePesoAMonedaExtranjera(pesos, euro);
			new ValorConversion(euros, "euros");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "De Peso a Libra esterlina":
			float libra = dePesoAMonedaExtranjera(pesos, libraEsterlina);
			new ValorConversion(libra, "libras");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "De Peso a Yen Japonés":
			float yen = dePesoAMonedaExtranjera(pesos, yenJapones);
			new ValorConversion(yen, "yen");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "De Peso a Won sul-coreano":
			float won = dePesoAMonedaExtranjera(pesos, wonCoreano);
			new ValorConversion(won, "won");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "De Dolar a Peso":
			peso = deMonedaExtranjeraAPeso(pesos, dolar);
			new ValorConversion(peso, "pesos");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "De Euro a Peso":
			peso = deMonedaExtranjeraAPeso(pesos, euro);
			new ValorConversion(peso, "pesos");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "De Libra esterlina a Peso":
			peso = deMonedaExtranjeraAPeso(pesos, libraEsterlina);
			new ValorConversion(peso, "pesos");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "De Yen japonés a Peso":
			peso = deMonedaExtranjeraAPeso(pesos, yenJapones);
			new ValorConversion(peso, "pesos");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "De Won sul-coreano a Peso":
			peso = deMonedaExtranjeraAPeso(pesos, wonCoreano);
			new ValorConversion(peso, "pesos");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		default:
			System.out.println("Esa moneda no existe");
			break;
		}
	}
	
	public String seleccionaTipoSistemaDeAcorde(String sistemaDeAcordes) {
		String acorde = null;
		if (sistemaDeAcordes == "De Tradicional a Americano") {
			acorde = (String) new IngresoAcordeTradicional().getNotacionTradicional();
		}
		
		if (sistemaDeAcordes == "De Americano a Tradicional") {
			acorde = (String) new IngresoNotacionAmericana().getNotacionAmericana();
		}
		return acorde;
	}
	
	public void muestraAcordeConvertido(String acorde) {
		int respuesta;
		switch (acorde) {
		case "Do":	
			new EquivalenciaDeAcorde(acorde, "C");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "Re":	
			new EquivalenciaDeAcorde(acorde, "D");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "Mi":	
			new EquivalenciaDeAcorde(acorde, "E");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "Fa":	
			new EquivalenciaDeAcorde(acorde, "F");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "Sol":	
			new EquivalenciaDeAcorde(acorde, "G");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "La":	
			new EquivalenciaDeAcorde(acorde, "A");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "Si":	
			new EquivalenciaDeAcorde(acorde, "B");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "C":	
			new EquivalenciaDeAcorde(acorde, "Do");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "D":	
			new EquivalenciaDeAcorde(acorde, "Re");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "E":	
			new EquivalenciaDeAcorde(acorde, "Mi");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "F":	
			new EquivalenciaDeAcorde(acorde, "Fa");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "G":	
			new EquivalenciaDeAcorde(acorde, "Sol");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "A":	
			new EquivalenciaDeAcorde(acorde, "La");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;
		case "B":	
			new EquivalenciaDeAcorde(acorde, "Si");
			respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
			continuaTermina(respuesta);
			break;

		default:
			System.out.println("Ese acorde no existe");
			break;
		}
	}
}
