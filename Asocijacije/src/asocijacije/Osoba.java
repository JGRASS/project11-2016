package asocijacije;
import java.io.Serializable;

public class Osoba implements Serializable{

	String ime;
	String prezime;

	public String getIme() {
		if (ime.isEmpty()) {
			throw new RuntimeException("Ime ne sme biti prazan string!");
		}
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		if (prezime.isEmpty()) {
			throw new RuntimeException("Prezime ne sme biti prazan string!");
		}
		this.prezime = prezime;
	}
}
