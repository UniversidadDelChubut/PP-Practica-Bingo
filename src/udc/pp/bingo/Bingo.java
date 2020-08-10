package udc.pp.bingo;

public class Bingo {
	
	void mainBingo() {
		
		boolean programaExistoso = true;
		
		int[][] carton1 = {};
		int[][] carton2 = {};
		int[][] carton3 = {};
		int[][] carton4 = {};
		int[][] carton5 = {};
		int[][] carton6 = {};
		
		boolean mismos = mismosNumeros(carton1, carton2);
		System.out.println("CARTON 1 idem CARTON 2     " + (mismos ? "SI" : "NO") + " => " + ( mismos ? "OK!!!" : "FAIL!!!"));
		mismos = mismosNumeros(carton1, carton3);
		System.out.println("CARTON 1 idem CARTON 3     " + (mismos ? "SI" : "NO") + " => " + (!mismos ? "OK!!!" : "FAIL!!!"));
		
		boolean valido = esValido(carton1);
		System.out.println("CARTON 1 es valido?        " + (valido ? "SI" : "NO") + " => " + ( valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton4);
		System.out.println("CARTON 4 es valido?        " + (valido ? "SI" : "NO") + " => " + ( valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton5);
		System.out.println("CARTON 5 es valido?        " + (valido ? "SI" : "NO") + " => " + (!valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton6);
		System.out.println("CARTON 6 es valido?        " + (valido ? "SI" : "NO") + " => " + (!valido ? "OK!!!" : "FAIL!!!"));
		
		System.out.println("Los cartones");
		System.out.println("CARTON 1");
		imprimirCarton(carton1);
		System.out.println("CARTON 2");
		imprimirCarton(carton2);
		System.out.println("CARTON 3");
		imprimirCarton(carton3);
		System.out.println("CARTON 4");
		imprimirCarton(carton4);
		System.out.println("CARTON 5");
		imprimirCarton(carton5);
		System.out.println("CARTON 6");
		imprimirCarton(carton6);
		
		
		if (programaExistoso) {
			System.out.println("Pasó todas las pruebas!");
		} else {
			System.out.println("Hay algoritmos por mejorar!");
		}
		
		
		
	}

	/**
	 * Devuelve verdadero si el carton es válido.
	 * Un carton válido está conformado por tres lineas de cinco números.
	 * Debe tener al menos un número de cada decena.
	 * No puede tener más de dos números de cada decena. 
	 * No debe tener números repetidos ni fuera del rango del 1 al 90. 
	 * Tener en cuenta que la octava docena incluye del 80 al 90.
	 * @param carton El carton a analizar
	 * @return Verdadero si el cartón es válido.
	 */
	boolean esValido (int[][] carton) {
		return false;
	}

	/**
	 * 
	 * @param carton1 El primer cartón
	 * @param carton2 El segundo cartón
	 * @return Verdadero si ambos cartones tienen los mismos quince números 
	 */
	boolean mismosNumeros(int[][] carton1, int[][] carton2) {
		return false;
	}
	
	/**
	 * 
	 * @param carton
	 * @param bolillas
	 * @return
	 */
	boolean hayLinea(int[][] carton, int[] bolillas) {
		return false;
	}

	/**
	 * 
	 * @param carton1
	 * @param bolillas
	 * @return
	 */
	boolean hayBingo(int[][] carton1, int[] bolillas) {
		return false;
	}

	/**
	 * 
	 * @param carton
	 */
	void imprimirCarton(int[][] carton) {
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	// Pronto entenderemos porqué esto tiene esta forma. Paciencia!
	public static void main(String[] args) {
		new Bingo().mainBingo();
	}
	
}
