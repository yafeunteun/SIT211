
package messtats;

public class TraitementData {
	private int valeurMaximum;
	private int valeurMinimum;
	private int nombreValeurs;
	private int sommeValeurs;

	TraitementData()
	{}

	public int getMaximum()
	{ return 0;}

	public int getMinimum()
	{ return 0;}

	public int getNbVal()
	{ return -1;}

	public int getSomme()
	{ return -1;}

	public void majMaximum(int m)
	{}

	public void majMinimum(int m)
	{}

	public void incNbVal()
	{}

	public void majSomme(int v)
	{}

	public float moyenne()
	{ return 0;}

	public void afficher()
	{
		float moyenne = moyenne();
		System.out.println("Max = "+valeurMaximum+", Min = "+valeurMinimum+", Nb = "+nombreValeurs+", Somme = "+sommeValeurs+", Moyenne = "+moyenne);
	}

}
