package conversorDivisas;

public class Conversor {

	public static void main(String[] args) {
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
