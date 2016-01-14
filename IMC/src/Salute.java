
public class Salute {
	
	String calcoloClasse(double alt, int peso){
		double IMC = 0;
		String classeRischio = "";
		
		IMC = peso / (alt * alt);
		
		if(IMC < 18.5){
			classeRischio = "sottopeso";
		}
		if(18.5 <= IMC && IMC < 25){
			classeRischio = "normale";
		}
		if(25 <= IMC && IMC < 30){
			classeRischio = "sovrappeso";
		}
		if(IMC >= 30){
			classeRischio = "obeso";
		}
		
		return classeRischio;
	}

}
