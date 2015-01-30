/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	if(args.length == 0)
    		System.out.println( "Welcome ghost!!" );
    	else
    	{
    		for(String name: args)
    			System.out.println("Welcome " + name +"!");
    	}
    }
}