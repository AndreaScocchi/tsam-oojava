
public class Salute {
		
	double calcoloMB(int alt, int peso, String sex, int eta, int attivita){
		String maschio = "m";
		String femmina = "f";
		double MB = 0;
		
			if (sex.equals(maschio)){
				MB = 655 + (13.8 * peso) + (1.8 * alt) + (4.7 * eta);
			}
			if (sex.equals(femmina)){
				MB = 655 + (9.6 * peso) + (1.8 * alt) + (4.7 * eta);
			}
			
			switch (attivita){
			case 1:
				MB = MB + (MB * 20 / 100);
				break;
			case 2:
				MB = MB + (MB * 30 / 100);
				break;
			case 3:
				MB = MB + (MB * 40 / 100);
				break;
			case 4:
				MB = MB + (MB * 50 / 100);
				break;	
			}

		return MB;
	}
}
