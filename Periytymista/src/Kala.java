
public class Kala {

	private String laji;
	private double paino;
	
	static int parvenKoko;
	
		
	public String getLaji() {
		return laji;
	}


	public void setLaji(String laji) {
		this.laji = laji;
	}




	public double getPaino() {
		return paino;
	}




	public void setPaino(double paino) {
		this.paino = paino;
	}




	public static int getParvenKoko() {
		return parvenKoko;
	}




	public static void setParvenKoko(int parvenKoko) {
		Kala.parvenKoko = parvenKoko;
	}




	public Kala() {
		parvenKoko++;
	}




	@Override
	public String toString() {
		return "Kala [laji=" + laji + ", paino=" + paino + "]";
	}


	public Kala(String laji, double paino) {
		super();
		this.laji = laji;
		this.paino = paino;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
