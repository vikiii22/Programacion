package DebugED;

public class Sumador {

	/**
	 * Suma los primeros cantidad n�meros impares
	 * @param cantidad a sumar
	 * @return
	 */
	public static int sumarImpares(int cantidad) {
		int impar = 1;
		int suma = 0;

		while (cantidad >= 0) {
			suma = suma + impar;
			impar = impar + 2;
			cantidad--;
		}

		return suma;
	}

	public static void main(String[] args) {
		int n = 5;
		int total = sumarImpares(n);

		System.out.println("La suma de los primeros " + n + " n�meros impares es " + total + ".");
	}
}
