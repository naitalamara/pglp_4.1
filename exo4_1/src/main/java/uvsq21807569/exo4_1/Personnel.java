package uvsq21807569.exo4_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Personnel implements Personneltype {

	// obligatoire 
	private final String nom;
	private final String prenom ;
	private final String fonction ;
	
	
	
	private final List<NumeroTelephone>numerotelephone ;
	private final LocalDate datenaissance ;
	
	
	public static class builder {
		private final String nom ;
		private final String prenom ;
		private final String fonction;
		
		
		private  List<NumeroTelephone>numerotelephone = new ArrayList<NumeroTelephone>() ;
		private  LocalDate datenaissance= null ;
		
	
	public builder(String nom ,String prenom,String fonction ) {
		this.nom=nom ;
		this.prenom=prenom ;
		this.fonction=fonction ;
	}
	public  builder naissance(LocalDate a) {
		this.datenaissance=a ;
		return this ;
	}
	public builder numerotelph(NumeroTelephone a) {
		this.numerotelephone.add(a);
		return this ;
	}
	
	public Personnel build() {
		return new Personnel(this);
			}
	}
	
	private Personnel(builder builder) {
	
	nom=builder.nom;
	prenom=builder.prenom;
	fonction=builder.fonction;
	numerotelephone=builder.numerotelephone;
	datenaissance=builder.datenaissance;
	
	
	}
	
	
	
	public void affichage() {
		// TODO Auto-generated method stub
		
	
	}
}
