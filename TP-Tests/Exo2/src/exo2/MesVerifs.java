package exo2;

/** différentes manières de verifier si x, y et z sont de même signe */
public class MesVerifs {

	static Boolean vf(int x, int y, int z)
	{
		if (x>=0)
			if (y>=0)
				if (z>=0) return true;
				else return false;
			else if (z>=0) return false;
			else return true;
		else if (y>=0)
			if (z>=0) return true;
			else return false;
		else if(z>=0) return false;
		else return true;
	}

	static Boolean vg(int x, int y, int z)
	{
		return (x>=0)&&(y>=0)&&(y>=0);
	}

	static Boolean vh(int x, int y, int z)
	{
		Boolean et=true, ou=false;
		Boolean[] t={x>=0,y>=0,z>=0};
		for(int i=0;i<3;i++)
		{
			et = et && t[i];
			ou = ou || t[i];
		}
		return (et==ou);
	}
}
