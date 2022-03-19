package p1;

public class TestHeritage {

	public static void main(String[] args) {
		Salle s1= new SalleCours(1,"Salle1",20);
		SalleCours s2 = new SalleCours(2,"Salle2",20);
	//	SalleCours s3=s1;
		
		SalleCours s4=s2;
//5	l'erreur est:	SalleCours s3=s1; parceque on doit faire le cast
		SalleCours s3=(SalleCours)s1;
// s1 est declarer par la classe mere ,donc on doit montrer que s1 est "SalleCours"
		Salle s5 = new Laboratoire(2,"Labo","CHIMIE");
		SalleCours s6 = new SalleCours(2,"Salle2",20);
	//	SalleCours s7 =s5;
		SalleCours s8 = s6;
//9  la ligne qui donne l erreur est SalleCours s7 =s5; parceque s5 est declarer par Salle
		//10 non , parce que s5 est une laboratoire et pas SalleCours
		
	}
	

}
