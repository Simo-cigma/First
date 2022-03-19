package p1;

public class Laboratoire extends Salle {
	public String type;

	public Laboratoire(int id , String nom ,String type) {
		super(id,nom);
		this.type=type;
		
	}
}
