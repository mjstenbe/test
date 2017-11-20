
public class PotilaitaJaLaakreita {

	public static void main(String[] args) {

		/*
		 * Monen rivin kommentti
		 *
		 * 12. PotilaitaJaLaakareita.java Tee ohjelma, jossa on kaksi
		 * kokonaislukutyyppistä muuttujaa: potilaidenLkm (21) ja laakareidenLkm
		 * (5). Tulosta näytölle kuinka monta ihmistä sairaalassa yhteensä on,
		 * kun sairaalassa on pelkästään potilaita ja lääkäreitä.
		 * 
		 */

		int potilaidenLkm = 21;
		int laakareidenLkm = 5;

		System.out.println("Yhteensä ihmisiä: " + (potilaidenLkm + laakareidenLkm));

		// Potilaita tulee lisää
		// potilaidenLkm = potilaidenLkm +1;
		potilaidenLkm++;

		System.out.println("Yhteensä ihmisiä: " + potilaidenLkm);

		// Lääkäreitä lähtee 3

		// laakareidenLkm = laakareidenLkm-3;
		laakareidenLkm -= 3;

		System.out.println("Yhteensä lääkäreiden lukumäärä: " + laakareidenLkm);

		double tulos = potilaidenLkm / laakareidenLkm;

		System.out.println("Potilaat lääkäriä kohden: " + tulos);

		// Kaavakkeet

		int lomakkeita = 18;

		System.out.println("Voidaan palvella: " + (lomakkeita / 3));

		// Käytetään ns. jakojäännös -operaattoria, eli moduloa (%)
		// Modulo palauttaa siis jakolaskun jakojäännöksen, ei jakolaskun
		// tulosta

		// Esim.

		// 20 / 3 = 6.6667 (kokonaislukujaossa jätetään desimaalit huomiomatta)
		// 20 % 3 = 2
		// Jakojäännös 2 syntyy siitä että
		// Määritelmän mukaan modulo = luku - (jakaja*kokonaisjaon tulos)
		// 3*6=18 ==> 20-18 = 2

		// Tällä kurssilla oleellista on tietää, että modulolla voidaan tutkia
		// helposti luvun jaollisuutta ja lähinnä sitä, meneekö jako tasan, eli
		// onko modulo == 0

		System.out.println("Jäljelle jäi: " + (lomakkeita % 3));

		// Muuta double-luku 4.7654 int-tyyppiseksi kokonaisluvuksi 4 ja tulosta
		// se näytölle.

		double luku = 4.7654;

		System.out.println((int) luku);

		// ErikoismerkkienTulostus.java
		// Tulosta ruudulle seuraava teksti käyttäen pelkästään
		// System.out.print()-metodia:
		// IDE: ”Eclipse”
		// Workspace: ”H:\eclipse_workspace”

		System.out.println("IDE: \"Eclipse\"");
		System.out.println("Workspace: \"H:\\eclipse_workspace\"");

	}

}
