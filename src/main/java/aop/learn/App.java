package aop.learn;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HashMap<String, String> map = new HashMap<String, String>();
    	map.put("meng", "hello");
    	map.entrySet();
        System.out.println( "Hello World!" );
    }
}
