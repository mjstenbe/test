public class Keksi {

	private String nimi;
	private int paino;
	private String valmistuspvm;
	
	static int laskuri;

	public Keksi() {
		laskuri++;
		
		nimi = "Ei annettu";
		paino = 5;
		valmistuspvm = "Ei m��ritelty";
	}
	
	public Keksi(String uusiNimi) {
		this();
		nimi = uusiNimi;

	}

	public Keksi(String uusiNimi, int uusiPaino, String uusiPvm) {
		this("Jaffa");
		nimi = uusiNimi;
		paino = uusiPaino;
		valmistuspvm = uusiPvm;
	}

	public void setPaino(int uusiPaino) {
		if (uusiPaino > 0) {
			paino = uusiPaino;
		}
	}

	public int getPaino() {
		return paino;
	}

	public String toString() {
		return ("Nimi: " + nimi + " Paino: " + paino + " Valmistusp�iv�: " + valmistuspvm + "Laskuri: "+laskuri);
	}
}
