package uvsq21807569.exo4_1;

import java.util.ArrayList;
import java.util.List;

public class Groupe_Personnel implements Personneltype{

	private List<Personneltype> listpers ;
	
	public Groupe_Personnel(){
		listpers=new ArrayList <Personneltype>();
		}
	public void addpersonnel(Personneltype a) {
		listpers.add(a);
	}
	
	public void removepersonnel(Personneltype a) {
		listpers.remove(a);
		
	}
	public List<Personneltype> retournergroupe(){
		return listpers;
	}
	
	public void affichage() {
		// TODO Auto-generated method stub
		
	}
	
	

}
