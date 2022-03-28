package tugas.upl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class KubusTest {
	Kubus Kubus;
	@BeforeEach
	public void setKubus() {
		Kubus = new Kubus();
	}
	//using mock object
	@Test
	@DisplayName("Luas Kubus")
	public void testGetLuasKubus() {
		Persegi Persegi = mock(Persegi.class);
		when(Persegi.hitungLuas()).thenReturn(40.0); 
		assertEquals(240.0,Kubus.hitungLuasP(Persegi));
	}
}