package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import verwaltung.Musikstueck;

class TestMusikstueck {

	@Test
	void testTitel() {
		// ich teste
		Musikstueck musikstueck1 = new Musikstueck();
		musikstueck1.setTitel("Hallo Nacht");
		assertEquals(musikstueck1.getTitel(), "Hallo Nacht");
	}
	
	@Test
	void testInterpret() {
		Musikstueck musikstueck1 = new Musikstueck();
		musikstueck1.setInterpret("Kraftklub");
		assertEquals(musikstueck1.getInterpret(), "Kraftklub");
	}
	
	@Test
	void testGenre() {
		Musikstueck musikstueck1 = new Musikstueck();
		musikstueck1.setGenre("Rock Pop");
		assertEquals(musikstueck1.getGenre(), "Rock Pop");
	}
	
	@Test
	void testPfad() {
		Musikstueck musikstueck1 = new Musikstueck();
		musikstueck1.setPfad("Bester Pfad evaaa");
		assertEquals(musikstueck1.getPfad(), "Bester Pfad evaaa");
	}

}
