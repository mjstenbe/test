import java.util.Scanner;

public class PIN {

	public static void main(String[] args) {

		// Tee ohjelma, joka kysyy k�ytt�j�lt� PIN-koodia. Kysely� toistetaan
		// kunnes oikea luku (3120) osuu kohdalle. K�yt� teht�v�ss� do � while
		// tai while - toistorakennetta.

		Scanner lukija = new Scanner(System.in);
		int luku = 0;

		while (luku != 3210) {

			System.out.print("Anna PIN: ");
			luku = lukija.nextInt();

			if (luku != 3210) {
				System.out.println("Virheellinen PIN!");
			}

		}

		do {

			System.out.print("Anna PIN: ");
			luku = lukija.nextInt();

			if (luku != 3210) {
				System.out.println("Virheellinen PIN!");
			}

		} while (luku != 3210);
	}

}
