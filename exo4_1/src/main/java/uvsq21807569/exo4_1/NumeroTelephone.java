package uvsq21807569.exo4_1;

public class NumeroTelephone   {

	private String nomteleph ;
	private String numero ;
	public NumeroTelephone(String nomteleph, String numero) {
		super();
		this.nomteleph = nomteleph;
		this.numero = numero;
	}
	public String getNomteleph() {
		return nomteleph;
	}
	public void setNomteleph(String nomteleph) {
		this.nomteleph = nomteleph;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "NumeroTelephone [nomteleph=" + nomteleph + ", numero=" + numero + "]";
		
	}
	
	
	
}
