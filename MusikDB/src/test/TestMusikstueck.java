package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import verwaltung.Musikstueck;

class TestMusikstueck {

	@Test
	void testTitel() {
		Musikstueck musikstueck1 = new Musikstueck();
		musikstueck1.setTitel("Hallo Nacht");
		assertEquals(musikstueck1.getTitel(), "Hallo Nacht");
	}

}
