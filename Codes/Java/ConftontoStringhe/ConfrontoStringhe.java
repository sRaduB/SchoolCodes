public class ConfrontoStringhe
{
    public static void main(String[] args)
    {
    	String a = new String ("pippo");
		String b = new String ("pippo");
		
		System.out.println(a == "pippo"); 		// errore = false
		System.out.println(a == b); 			// errore = false
		
		System.out.println(a.equals("pippo")); // corretto = true
		System.out.println(a.equals(b)); 		// corretto = true
		
		System.out.println(a.compareTo("pluto")); // negativo "pippo" < "pluto"
		System.out.println(a.compareTo("beta"));  // positivo "pippo" > "beta"
		System.out.println(a.compareTo("pippo")); // 0 "pippo" e "pippo" uguali
		 
    }
}
