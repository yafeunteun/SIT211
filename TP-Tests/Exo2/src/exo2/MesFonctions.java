package exo2;
/** différentes manières de sommer les valeurs absolues de x, y et z */
public class MesFonctions {

	int f(int x, int y, int z)
	{
		if (x>0)
			if (y>0)
				if (z>0) return x+y;
				else return x+y-z;
			else if (z>0) return x-y+z;
			else return x-y-z;
		else if (y>0)
			if (z>0) return x+y+z;
			else return x-y-z;
		else if(z>0) return x+y+z;
		else return x+y-z;
	}

	int g(int x, int y, int z)
	{
		int r=0;
		if (x>0) r=r+x;
		else r=r-x;
		if (y>0) r=r+y;
		else r=r-y;
		if (z>0) r=r+z;
		else r=r-z;
		return r;
	}

	int h(int x, int y, int z)
	{
		int r=0;
		int[] t={x,y,z};
		for(int i=0;i<3;i++)
			if (t[i]>=0) r=r+t[i];
			else r=r-t[i];
		return r;
	}
}
