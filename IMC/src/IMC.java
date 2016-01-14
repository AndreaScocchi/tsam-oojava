
public class IMC {

	public static void main(String[] args) {
		
		Salute salute = new Salute();
		Persona persona = new Persona(1.80, 80);
		
		String classe = salute.calcoloClasse(persona.altezza, persona.peso);
		
		System.out.println(classe);
	}

}
