package verwaltung;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Verwaltung {
	
	private ArrayList<Musikstueck> musikstuecke = new ArrayList<Musikstueck>();
	
	public void einlesen(String pfad) throws IOException{
		FileInputStream fstream = new FileInputStream(pfad);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String zeile;
		while ((zeile = br.readLine()) != null)   {
			Musikstueck m = new Musikstueck();
			String[] feld = this.zeileEinlesen(zeile);
			m.setTitel(feld[0]);
			m.setInterpret(feld[1]);
			m.setGenre(feld[2]);
			m.setPfad(feld[3]);
			musikstuecke.add(m);
		}
	}
	
	public void schreiben() {
		for (Musikstueck m:this.musikstuecke) {
			
		}
	}
	
	public String[] zeileEinlesen(String zeile) {
		String[] feld = zeile.split(";");
		return feld;
	}
	
	public ArrayList getMusikstuecke() {
		return musikstuecke;
	}
}
