package messtats;

public class Releve {
	private String mois;
	private int jour;
	private int temperature;
	private int pluviometrie;
	private int vent;

	Releve(String vmois, int vjour, int vt, int vp, int vv)
	{}

	String getMois()
	{return "";}

	int getJour()
	{return 0;}

	int getTemp()
	{return 0;}

	int getPluvio()
	{return 0;}

	int getVent()
	{return 0;}

	void afficher()
	{System.out.println("Relev� du "+jour+" "+mois+" : temp�rature = "+temperature+", pluviom�trie = "+pluviometrie+", vent = "+vent);}

}
