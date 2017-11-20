import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		double pituus, paino;
		Scanner lukija = new Scanner(System.in);

		System.out.println("Anna paino: ");
		paino = lukija.nextDouble();

		System.out.println("Pituus (m): ");
		pituus = lukija.nextDouble();

		double painoindeksi = paino / (pituus * pituus);

		// Normituloksen
		System.out.println("Painoindeksisi on: " + painoindeksi);

		// Mutoiltuna
		System.out.printf("Painoindeksisi on: %.2f \n", painoindeksi);

		// Muotoilua v 2.

		System.out.printf("Painat %5f ja olet %5f pitkä. "
				+ "Painoindeksisi on: %.2f", paino, pituus, painoindeksi);

	}

}
