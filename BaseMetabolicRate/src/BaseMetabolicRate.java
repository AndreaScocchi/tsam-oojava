
public class BaseMetabolicRate {

	public static void main(String[] args) {
		
		Salute salute = new Salute();
		Persona persona = new Persona(180, 70, 20, "f", 2 );
		
		double metabolismo = salute.calcoloMB(persona.altezza, persona.peso, persona.sesso, persona.eta, persona.attivitaFisica);
		
		System.out.println(metabolismo);
		
	}

}
