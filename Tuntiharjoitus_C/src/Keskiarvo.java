import java.util.Scanner;

public class Keskiarvo {

	public static void main(String[] args) {

		// Esitellään muuttujat
		double eka, toka, kolmas;
		
		Scanner lukija = new Scanner(System.in);
		
		// Kysellään tiedot käyttäjältä
		System.out.println("Anna eka luku: ");
		eka = lukija.nextDouble();
		
		System.out.println("Anna toka luku: ");
		toka = lukija.nextDouble();
		
		System.out.println("Anna kolmas luku: ");
		kolmas = lukija.nextDouble();
		
		double keskiarvo = (eka+toka+kolmas) / 3;
		
		System.out.println("Keskiarvo: "+keskiarvo);

	}

}
