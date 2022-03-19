package p1;

public class main {

	public static void main(String[] args) {
	 Salle o1 = new Salle();
	 Salle o2 = new Salle("Salle informatique");
	 Salle o3 = new Salle(2 , "Salle des Cours");
	 System.out.println(o1.id +" "+ o1.nom );
	 System.out.println(o2.id +" "+ o2.nom );
	 System.out.println(o3.id +" "+ o3.nom );
	 o3.calculer();

	}

}
