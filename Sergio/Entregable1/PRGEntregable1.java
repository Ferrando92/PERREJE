
/**
 * @author Grupo 3 
 */

public class PRGEntregable1
{
   public static boolean contieneCero(int[] a, int ini, int fin){
       if (a[ini]==0) 
            return true;
       else if (ini==fin) 
            return false;
       else 
            return contieneCero(a, ini+1, fin);
   }
   
   public static boolean contieneCeroLanzadera(int[] a){
       return contieneCero(a, 0, a.length-1);
   }
   
   public static boolean esElDoble(int[] a, int ini, int fin){
       if(ini==fin) 
            return false;
       else if (a[ini+1]/2==a[ini]) 
            return true;
       else 
            return esElDoble(a, ini+1, fin);
       
   }
   
   public static boolean esElDobleLanzadera(int[] a){
       return esElDoble(a, 0, a.length-1);
   }
   
   public static boolean esElProducto(int[] a, int ini, int fin){
       if(ini==fin)
            return false;
       else if (a[ini+2]==a[ini]*a[ini+1])
            return true;
       else 
            return esElProducto(a, ini+1, fin);
   }
}
