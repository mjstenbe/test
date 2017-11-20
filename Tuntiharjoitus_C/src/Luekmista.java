import java.util.Scanner;

public class Luekmista {

	public static void main(String[] args) {
		
		String kayttajanNimi, sukuNimi;
		Scanner lukija = new Scanner(System.in );
		
		System.out.print("Anna etunimesi: ");
		kayttajanNimi = lukija.nextLine();
		
		System.out.print("Anna sukunimesi: ");
		sukuNimi = lukija.nextLine();
		
		
		System.out.print("Hei vaan  "+kayttajanNimi );
		System.out.print(" "+sukuNimi );
	}
}
