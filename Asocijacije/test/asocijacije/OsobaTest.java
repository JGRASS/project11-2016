package asocijacije;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OsobaTest {
	private Osoba o;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		o = new Osoba();
	}

	@After
	public void tearDown() throws Exception {
		o = null;
	}

	@Test
	public void testSetImeSveOk() {
		String ime = "Pera";

		o.setIme(ime);

		assertEquals(ime, o.getIme());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImeNull() {
		o.setIme(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImePrazan() {
		o.setIme("");
	}

	@Test
	public void testSetPrezimeSveOk() {
		String prezime = "Peric";

		o.setPrezime(prezime);

		assertEquals(prezime, o.getPrezime());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrezimeNull() {
		o.setPrezime(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrezimePrazan() {
		o.setPrezime("");
	}
}
