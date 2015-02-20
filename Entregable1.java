/**
 * @author Grupo 3 
 */

public class PRGEntregable1
{
   public static boolean ejercicio1(int[] a, int ini, int fin){
       if (a[ini]==0) 
            return true;
       else if (ini==fin) 
            return false;
       else 
            return ejercicio1(a, ini+1, fin);
   }
   
   public static boolean ejercicio1Lanzadera(int[] a){
       return ejercicio1(a, 0, a.length-1);
   }
   
  public static int ejercicio9(int [] a, int [] b, int ini){
      if (a.length==0 || b.length == 0)
        return 0;
      else if (ini==a.length-1 || ini==b.length-1)
        return a[ini]*b[ini];
      else 
        return a[ini]*b[ini] + ejercicio9(a, b, ++ini); 
   }
   
  public static int ejercicio9Lanzadera(int [] a, int [] b){
      return ejercicio9(a, b, 0);
  }
}
