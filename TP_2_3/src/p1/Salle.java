package p1;

public class Salle {

	public int id ;
	public String nom;
	public Salle() {}
	public Salle(String nom) {
		this.nom = nom;
	}
	public Salle(int id  , String nom) {
		this.id = id;
		this.nom = nom;
	}
	 void calculer(){
		System.out.println(this.nom);
	}
		void changer () { 
		this.nom = "new nom" ;
		}
	public Salle(int id )	 {
		this.id = id;
	}
	}
	
	


