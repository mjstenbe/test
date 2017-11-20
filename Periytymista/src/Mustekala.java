
public class Mustekala extends Kala {

	private int lonkeroita;

	public Mustekala() {
		this.setLaji("Mustekala");
		setPaino(25);
		lonkeroita = 8;

	}

	public String toString() {
		 return super.toString() + " Lonkertoita: " + this.lonkeroita;
		//return "Laji: " + this.getLaji() + " Paino: " + this.getPaino() + "Lonkeroita: " + this.lonkeroita;
	}

}
