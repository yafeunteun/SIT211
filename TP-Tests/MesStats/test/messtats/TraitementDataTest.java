
package messtats;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TraitementDataTest {
	private TraitementData instance;

	public TraitementDataTest() {
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() {
		System.out.println("nouvelle instance");
		instance = new TraitementData();
	}

	@After
	public void tearDown() {
	}


	/**
	 * Test of moyenne method, of class TraitementData.
	 * Error case
	 */
	@Test
	public void testMoyenneErreur() {
		System.out.println("Test de moyenne erreur div par zero");
		assertEquals(0.0, instance.moyenne(), 0.0);
	}

	/**
	 * Test of getMaximum method, of class TraitementData.
	 */
	@Test
	public void testGetMaximum() {
		System.out.println("Test de getMaximum");
		assertEquals(-100, instance.getMaximum());
	}

	/**
	 * Test of getMinimum method, of class TraitementData.
	 */
	@Test
	public void testGetMinimum() {
		System.out.println("Test de getMinimum");
		assertEquals(2000, instance.getMinimum());
	}

	/**
	 * Test of getNbVal method, of class TraitementData.
	 */
	@Test
	public void testGetNbVal() {
		System.out.println("Test de getNbVal");
		assertEquals(0, instance.getNbVal());
	}

	/**
	 * Test of getSomme method, of class TraitementData.
	 */
	@Test
	public void testGetSomme() {
		System.out.println("Test de getSomme");
		assertEquals(0, instance.getSomme());
	}

	/**
	 * Test of majMaximum method, of class TraitementData.
	 */
	@Test
	public void testMajMaximum() {
		System.out.println("Test de majMaximum");
		int m=instance.getMaximum();
		instance.majMaximum(m+1);
		assertEquals(m+1, instance.getMaximum());
		instance.majMaximum(m);  
		assertEquals(m+1, instance.getMaximum());
	}

	/**
	 * Test of majMinimum method, of class TraitementData.
	 */
	@Test
	public void testMajMinimum() {
		System.out.println("Test de majMinimum");
		int m=instance.getMinimum();
		instance.majMinimum(m-1);
		assertEquals(m-1, instance.getMinimum());
		instance.majMinimum(m); 
		assertEquals(m-1, instance.getMinimum());
	}

	/**
	 * Test of incNbVal method, of class TraitementData.
	 */
	@Test
	public void testIncNbVal() {
		System.out.println("Test de incNbVal");
		int m=instance.getNbVal();
		instance.incNbVal();
		assertEquals(m+1, instance.getNbVal());
		instance.incNbVal(); 
		assertEquals(m+2, instance.getNbVal());
	}

	/**
	 * Test of majSomme method, of class TraitementData.
	 */
	@Test
	public void testMajSomme() {
		System.out.println("Test de majSomme");
		int m=instance.getSomme();
		instance.majSomme(50);
		assertEquals(m+50, instance.getSomme());
		instance.majSomme(30); 
		assertEquals(m+80, instance.getSomme()); 
	}

	/**
	 * Test of moyenne method, of class TraitementData.
	 */
	@Test
	public void testMoyenne() {
		System.out.println("Test de moyenne");
		instance.majSomme(100);
		instance.incNbVal();
		instance.incNbVal();
		instance.incNbVal();
		assertEquals((float)(instance.getSomme())/instance.getNbVal(), instance.moyenne(), 0.0);
	}

}