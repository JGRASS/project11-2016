package asocijacije;
import java.io.Serializable;
/**
 * Klasa koja predstavlja osobu koja igra igru
 * 
 * @author Stefana Bogdanovic, Mirjana Stanojevic, Dragana Tanic
 *
 */
public class Osoba implements Serializable{

	/**
	 * Atribut koji predstavlja ime osobe
	 */
	String ime;
	/**
	 * Atribut koji predstavlja prezime osobe
	 */
	String prezime;

	/**
	 * Metoda koja vraca vrednost atributa ime
	 * 
	 * @return ime osobe
	 */
	public String getIme() {
		
		return ime;
	}

	/**
	 * Metoda koja postavlja novu vrednost za atribut ime
	 * 
	 * @param ime
	 * 				Nova vrednost za ime osobe
	 * @throws java.lang.RuntimeException
	 * 				ako je uneto ime prazan String
	 */
	public void setIme(String ime) {
		if (ime.isEmpty()) {
			throw new RuntimeException("Ime ne sme biti prazan string!");
		}
		this.ime = ime;
	}

	/**
	 * Metoda koja vraca vrednost atributa prezime
	 * 
	 * @return prezime
	 */
	public String getPrezime() {
		return prezime;
	}

	/**
	 * Metoda koja postavlja vrednost za atribut prezime
	 * 
	 * @param prezime
	 * 					Nova vrednost za prezime osobe
	 * @throws java.lang.RuntimeException
	 * 					ako je uneto prezime prazan String
	 */
	public void setPrezime(String prezime) {
		if (prezime.isEmpty()) {
			throw new RuntimeException("Prezime ne sme biti prazan string!");
		}
		this.prezime = prezime;
	}
}
