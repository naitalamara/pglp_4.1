package uvsq21807569.exo4_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Personnel a=new Personnel
				.builder("cheklat", "sabrina", "directrice")
				.naissance(LocalDate.parse("1996-06-15" , DateTimeFormatter.ISO_DATE))
				.numerotelph(new NumeroTelephone("mobile","0756143267"))
				.numerotelph(new NumeroTelephone("fixe","0647143267"))
				.build();
    	
    	System.out.println(a.getNumerotelephone().equals(a.getNumerotelephone()));
    	System.out.println(a.getNumerotelephone().getClass());
       
       
    		   
    }
}
