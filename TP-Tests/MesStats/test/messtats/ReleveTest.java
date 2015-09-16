
package messtats;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReleveTest {

	private Releve instance1;
	private Releve instance2;

	public ReleveTest() {
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() {
		System.out.println("nouvelles instances");
		instance1 = new Releve("janvier",14,3,20,60);
		instance2 = new Releve("mars",1,15,100,10); 
	}

	@After
	public void tearDown() {
	}

	/**
	 * Test of getMois method, of class Releve.
	 */
	@Test
	public void testGetMois() {
		System.out.println("Test de getMois");
		assertEquals("janvier", instance1.getMois());
		assertEquals("mars", instance2.getMois()); 
	}

	/**
	 * Test of getJour method, of class Releve.
	 */
	@Test
	public void testGetJour() {
		System.out.println("Test de getJour");
		assertEquals(14, instance1.getJour());
		assertEquals(1, instance2.getJour()); 
	}

	/**
	 * Test of getTemp method, of class Releve.
	 */
	@Test
	public void testGetTemp() {
		System.out.println("Test de getTemp");
		assertEquals(3, instance1.getTemp());
		assertEquals(15, instance2.getTemp()); 
	}

	/**
	 * Test of getPluvio method, of class Releve.
	 */
	@Test
	public void testGetPluvio() {
		System.out.println("Test de getPluvio");
		assertEquals(20, instance1.getPluvio());
		assertEquals(100, instance2.getPluvio());
	}

	/**
	 * Test of getVent method, of class Releve.
	 */
	@Test
	public void testGetVent() {
		System.out.println("Test de getVent");
		assertEquals(60, instance1.getVent());
		assertEquals(10, instance2.getVent());
	}
}