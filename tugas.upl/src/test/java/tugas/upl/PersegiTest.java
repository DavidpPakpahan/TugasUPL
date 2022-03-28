package tugas.upl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class PersegiTest {
	Persegi Persegi;
	@BeforeEach
	public void setPersegi() {
		Persegi = new Persegi(10);
	}
	@Test
	@DisplayName("Sisi Persegi")
	public void testGetSisi() {
		assertEquals(10,Persegi.getSisi());
	}
	@Test
	@DisplayName("Luas Persegi")
	public void testGetLuas() {
		assertEquals(100,Persegi.hitungLuas());
	}
	@Test
	@DisplayName("Keliling Persegi")
	public void testGetKel() {
		assertEquals(40,Persegi.hitungKel());
	}

}

