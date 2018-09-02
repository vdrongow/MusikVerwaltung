package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import verwaltung.Musikstueck;
import verwaltung.Verwaltung;

class TestVerwaltung {

	@Test
	void testDBzeile() {
		Verwaltung v = new Verwaltung();
		String[] feld = v.zeileEinlesen("Wie man Feuer macht;Großstadtgeflüster;Pop;cooler Pfad;");
		
		assertEquals(feld[0], "Wie man Feuer macht");
		assertEquals(feld[1], "Großstadtgeflüster");
		assertEquals(feld[2], "Pop");
		assertEquals(feld[3], "cooler Pfad");
		assertEquals(feld.length, 4);
	}
	
	@Test
	void testEinlesen() throws IOException {
		Verwaltung v = new Verwaltung();
		assertEquals(v.getMusikstuecke().size(), 0);
		String path = this.getClass().getResource("testDB").getPath();
		v.einlesen(path);
		assertEquals(v.getMusikstuecke().size(), 1);
		ArrayList<Musikstueck> al = v.getMusikstuecke();
		Musikstueck m = al.get(0);
		assertEquals(m.getInterpret(), "Großstadtgeflüster");
	}

}
