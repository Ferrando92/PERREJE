
public class Practica2 {
	/** A es la palabra completa y B el prefijo */
	public static boolean esPrefijo(String a, String b)
	{
	if(b.length()!=0)
		{
			if(a.charAt(0)!=b.charAt(0))
				return false;
			else
				return esPrefijo(a.substring(1,a.length()),b.substring(1, b.length()));
		}
	else
		return true;
	}
	
	public static boolean esSubcadena(String a, String b)
	{
		if(a.charAt(0)== b.charAt(0))
			return esPrefijo(a.substring(1),b.substring(1));
		else
			return esSubcadena(a.substring(1),b);
			
	}
	public static boolean esPalindromo(String a)
	{
		if(a.length() >1)
			if(a.charAt(0)==a.charAt(a.length()-1))
				return esPalindromo(a.substring(1,a.length()-1));
			else
				return false;
		else
			return true;
			
	}
	
	public static void main (String[]args)
	{
		System.out.println(esPalindromo("peep0"));
	}
}
