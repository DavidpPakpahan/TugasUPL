package tugas.upl;

public class Persegi {
	protected double sisi;
	
	public Persegi(double sisi) {
		this.sisi=sisi;
	}
	
	public double hitungLuas() {
		return sisi*sisi;
	}
	public double hitungKel() {
		return 4*sisi;
	}
	public double getSisi() {
		return this.sisi;
	}
}

