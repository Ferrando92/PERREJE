
public class Recursivos {
	public static int suma(int a[],int i)
	{
		if(i>=a.length)
			return 0;
		else
			return a[i]+suma(a,++i);
	}
	public static int sumaDescendente(int[]a,int i)
	{
		if(i==0)
			return a[0];
		else
			return a[i]+sumaDescendente(a,--i);
	}
	
	public static void main(String[]Args)
	{
		int []arry={1,2,3,4};
		System.out.println(sumaDescendente(arry,arry.length-1));
		
	}
}
