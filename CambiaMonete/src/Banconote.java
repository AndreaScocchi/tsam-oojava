
public class Banconote {

	int [] banconote = {500, 200, 100, 50, 20, 10, 5, 2, 1};
	String n = "Combinazione banconote:";
	int soluzione;
	String cambiaMonete (int euro){		
		for (int i = 0; i < banconote.length; i++){
				while ((soluzione + banconote[i]) <= euro ){
					soluzione += banconote[i];
					n += "  " + banconote[i];
				}
		}
		return n;
	}
}


