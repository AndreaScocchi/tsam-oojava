
public class Persona {

	int altezza;		// centimetri;
	int peso;			// chilogrammi;
	int eta;
	String sesso;		// 'm' o 'f';
	int attivitaFisica;
	/* 
	 1: sedentario;
	 2: moderatamente attivo;
	 3: attivo;
	 4: molto attivo.
	 */
	
	Persona(int alt, int peso, int eta, String sex, int attivita){
		this.altezza = alt;
		this.peso = peso;
		this.eta = eta;
		this.sesso = sex;
		this.attivitaFisica = attivita;
	}
	
	
	
}
