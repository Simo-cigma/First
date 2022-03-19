package p1;

public class SalleCours extends Salle {
	int nombreDePlace ;
	
	public SalleCours (int id, String nom, int nbDePlace) {
		super(id,nom);
		this.nombreDePlace= nbDePlace;
	}
	

}
