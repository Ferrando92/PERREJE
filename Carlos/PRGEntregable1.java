/**
 * @author Grupo 3 
 */

import java.util.Arrays;

public class PRGEntregable1
{
   public static boolean ejercicio1(int[] a, int ini, int fin){
       if (ini>=fin) 
            return false;
       else if (a[ini]==0) 
            return true;
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
  
  public static void main (String [] args){
    System.out.println("Casos ejercicio 1");
    System.out.print("Array vacio: "); 
    int [] a = {};
    System.out.println(ejercicio1Lanzadera(a));
    int [] b = {5,3,6,8,2,4,9};
    System.out.print("Array sin ceros "+Arrays.toString(b)+": ");
    System.out.println(ejercicio1Lanzadera(b));
    int [] c = {5,3,6,0,7,8,4};
    System.out.print("Array con ceros "+Arrays.toString(c)+": "); 
    System.out.println(ejercicio1Lanzadera(c));
    System.out.println("-----------");
    System.out.println("Casos ejercicio 9");
    System.out.print("Ambos arrays vacios: "); 
    int [] d = {};
    int [] e = {};
    System.out.println(ejercicio9Lanzadera(d,e));
    System.out.print("Primer array vacio: "); 
    int [] f = {};
    int [] g = {3,5,6};
    System.out.println(ejercicio9Lanzadera(f,g));
    System.out.print("Segundo array vacio: "); 
    int [] h = {6,2,5};
    int [] i = {};
    System.out.println(ejercicio9Lanzadera(h,i));
    int [] j = {3};
    int [] k = {9};
    System.out.print("Arrays de un solo elemento "+Arrays.toString(j)+","+Arrays.toString(k)+": "); 
    System.out.println(ejercicio9Lanzadera(j,k));
    int [] l = {3,6,2,7,9,5};
    int [] m = {5,2,6,8,6,4};
    System.out.print("Arrays cualquiera de mismo tamaño "+Arrays.toString(l)+","+Arrays.toString(m)+": "); 
    System.out.println(ejercicio9Lanzadera(l,m));
  }
}
