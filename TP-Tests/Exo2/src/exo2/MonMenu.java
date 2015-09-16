package exo2;

public class MonMenu {

	private IGenerateur mon_gene;

	public void setGene(IGenerateur mon_gene){
		this.mon_gene = mon_gene;
	}

	public String menu (){
		int choix, x, y, z, r;
		Boolean b;
		String s="";
		MesFonctions mf = new MesFonctions();
		x=-10; 
		y=-2;
		z=-3; 
		System.out.println("Bienvenue dans le menu !");
		choix = mon_gene.un_entier() ;
		while (choix !=0){
			switch(choix) {
			case 1 :
				r = mf.f(x,y,z);
				System.out.println("Exec de f avec x="+x+", y="+y+", z="+z+" : "+r) ;
				s=s+"f="+r;
				break ;
			case 2 :
				r = mf.g(x,y,z);
				System.out.println("Exec de g avec x="+x+", y="+y+", z="+z+" : "+r) ;
				s=s+"g="+r;
				break ;
			case 3 :
				r = mf.h(x,y,z);
				System.out.println("Exec de h avec x="+x+", y="+y+", z="+z+" : "+r) ;
				s=s+"h="+r;
				break ;
			case 4 :
				b = MesVerifs.vf(x,y,z);
				System.out.println("Exec de vf avec x="+x+", y="+y+", z="+z+" : "+b) ;
				s=s+"vf="+b;
				break ;
			case 5 :
				b = MesVerifs.vg(x,y,z);
				System.out.println("Exec de vg avec x="+x+", y="+y+", z="+z+" : "+b) ;
				s=s+"vg="+b;
				break ;
			case 6 :
				b = MesVerifs.vh(x,y,z);
				System.out.println("Exec de vh avec x="+x+", y="+y+", z="+z+" : "+b) ;
				s=s+"vh="+b;
				break ;
			default :
				System.out.println("Erreur de saisie !") ;
				s=s+"erreur saisie";
				break ;
			}
			choix = mon_gene.un_entier() ;
			if (choix != 0) s=s+", ";
		};
		System.out.println("Au revoir et à bientôt !") ;
		if (choix!=0) System.out.println("Impossible !") ;  
		else System.out.print("") ;
		return s;
	}
}
