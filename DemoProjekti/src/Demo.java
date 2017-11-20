import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner lukija = null;
		File tiedosto = new File("c://temp//gradu.txt");

		try {
			lukija = new Scanner(tiedosto);
			while (lukija.hasNextLine()) {
				String rivi = lukija.nextLine();
				System.out.println(rivi);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Tiedostoa	ei löydy..");
		}
	}
}
