
public class PotilaitaJaLaakreita {

	public static void main(String[] args) {

		/*
		 * Monen rivin kommentti
		 *
		 * 12. PotilaitaJaLaakareita.java Tee ohjelma, jossa on kaksi
		 * kokonaislukutyyppist� muuttujaa: potilaidenLkm (21) ja laakareidenLkm
		 * (5). Tulosta n�yt�lle kuinka monta ihmist� sairaalassa yhteens� on,
		 * kun sairaalassa on pelk�st��n potilaita ja l��k�reit�.
		 * 
		 */

		int potilaidenLkm = 21;
		int laakareidenLkm = 5;

		System.out.println("Yhteens� ihmisi�: " + (potilaidenLkm + laakareidenLkm));

		// Potilaita tulee lis��
		// potilaidenLkm = potilaidenLkm +1;
		potilaidenLkm++;

		System.out.println("Yhteens� ihmisi�: " + potilaidenLkm);

		// L��k�reit� l�htee 3

		// laakareidenLkm = laakareidenLkm-3;
		laakareidenLkm -= 3;

		System.out.println("Yhteens� l��k�reiden lukum��r�: " + laakareidenLkm);

		double tulos = potilaidenLkm / laakareidenLkm;

		System.out.println("Potilaat l��k�ri� kohden: " + tulos);

		// Kaavakkeet

		int lomakkeita = 18;

		System.out.println("Voidaan palvella: " + (lomakkeita / 3));

		// K�ytet��n ns. jakoj��nn�s -operaattoria, eli moduloa (%)
		// Modulo palauttaa siis jakolaskun jakoj��nn�ksen, ei jakolaskun
		// tulosta

		// Esim.

		// 20 / 3 = 6.6667 (kokonaislukujaossa j�tet��n desimaalit huomiomatta)
		// 20 % 3 = 2
		// Jakoj��nn�s 2 syntyy siit� ett�
		// M��ritelm�n mukaan modulo = luku - (jakaja*kokonaisjaon tulos)
		// 3*6=18 ==> 20-18 = 2

		// T�ll� kurssilla oleellista on tiet��, ett� modulolla voidaan tutkia
		// helposti luvun jaollisuutta ja l�hinn� sit�, meneek� jako tasan, eli
		// onko modulo == 0

		System.out.println("J�ljelle j�i: " + (lomakkeita % 3));

		// Muuta double-luku 4.7654 int-tyyppiseksi kokonaisluvuksi 4 ja tulosta
		// se n�yt�lle.

		double luku = 4.7654;

		System.out.println((int) luku);

		// ErikoismerkkienTulostus.java
		// Tulosta ruudulle seuraava teksti k�ytt�en pelk�st��n
		// System.out.print()-metodia:
		// IDE: �Eclipse�
		// Workspace: �H:\eclipse_workspace�

		System.out.println("IDE: \"Eclipse\"");
		System.out.println("Workspace: \"H:\\eclipse_workspace\"");

	}

}
