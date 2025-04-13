package caso2;

public class convertir {
	
	private double cel;
	private double km;
	private int min;
	
	public convertir(int min) {
		this.min = min;
	}

	public convertir(double cel, double km) {
		this.cel = cel;
		this.km = km;
	}

	public double Convertir(double cel) {
		return (cel * 9/5) + 32;
	}
	public double Convertir1 (double km) {
		return km*0.621371;
	}
	public int Convertir1(int min) {
		return min*60;
	}
	
}
