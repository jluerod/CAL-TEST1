package es.upo.cal;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.ArrayUtils;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Suma: "+ sum() );
        System.out.println( "\nResta: "+ res() );
        System.out.println( "\nMultiplicacion: "+ mul(palabras) );
        System.out.println( "\nDivision "+ div(palabras) );
    }
    public static int sum() {
	return 4 + 2;
    }
    public static int res() {
	return 4-2;
    }
    public static int mul() {
	return 4*2;
	
	
    }
  
    public static int div() {
	
	return 4/2;
    }
}
