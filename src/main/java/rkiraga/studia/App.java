package rkiraga.studia;


import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        com.sun.org.apache.xml.internal.security.Init.init();
        System.out.println( "Hello World!" );
        try {
            byte[] tab = Base64.decode("cXdlcnR5".getBytes());
            System.out.println(new String(tab));
            System.out.println("KOLEJNA LINIJKA");
        } catch (Base64DecodingException e) {
            e.printStackTrace();
        }

    }
}
