package tugas.upl;

public class Kubus {
	Persegi Persegi;
	
	public Kubus(Persegi Persegi) {
		this.Persegi=Persegi;
	}
	public Kubus() {
		this.Persegi=null;
	}
	public double hitungVol() {
		double sisi=Persegi.getSisi();
		return sisi*sisi*sisi;
	}
	
	public double hitungLuasP() {
		double luas = Persegi.hitungLuas();
		return 6*luas;
	}
	public double hitungLuasP(Persegi Persegi) {
		return 6*Persegi.hitungLuas();
	}
}
