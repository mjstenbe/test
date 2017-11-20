import java.util.Scanner;

public class Karkausvuosi {

	public static void main(String[] args) {

		// Karkausvuosia ovat kaikki 400:lla jaolliset vuodet

		int vuosi = 0;
		Scanner lukija = new Scanner(System.in);

		System.out.println("Anna  vuosi: ");
		vuosi = lukija.nextInt();

		if (vuosi < 1753) {

			if (vuosi % 4 == 0) {
				System.out.println("Oli karkausvuosi!");
			} else {
				System.out.println("Ei ollut karkausvuosi!");
			}
		}

		else {

			if (vuosi % 400 == 0) {
				System.out.println("Oli karkausvuosi!");
			}

			// 4:ll� jaollisista vuosista ne, jotka eiv�t ole 100:lla jaollisia.

			else if (vuosi % 4 == 0 && vuosi % 100 != 0) {
				System.out.println("Oli korkeusvuosi!");
			}
			// Tee ohjelma, joka tarkistaa, onko sy�tetty vuosi karkausvuosi.

			else {
				System.out.println("Ei ollut karkausvuosi!");
			}
		}

	}
}