public class PRGEntregable1Extra
{
    public static boolean ejercicio2(int[] a, int ini, int fin){
        if(ini>=fin) 
            return true;
        else if (a[fin]/2==a[fin-1]) 
            return ejercicio2(a, ini, --fin);
        else 
            return false;
    }
   
    public static boolean ejercicio2Lanzadera(int[] a){
       return ejercicio2(a, 0, a.length-1);
    }
   
    public static boolean ejercicio3(int[] a, int ini, int fin){  
       if(fin<2)
            return true;
       else if (a[fin]!=a[fin-1]*a[fin-2])
            return false;
       else 
            return ejercicio3(a, ini, --fin);
    }
   
    public static boolean ejercicio3Lanzadera(int[] a){
       return ejercicio3(a, 0, a.length-1);
    }
    
    //No necesita lanzadera?
    public static void ejercicio4(int [] a,int p, int v){
         if(p<=a.length-1 && p>=0)
            if(a[p]<v)
                a[p]=v;
         if(p-1>-1 && a[p-1]<v)
            ejercicio4(a,p-1,v);
         if(p+1<a.length && a[p+1]<v)
            ejercicio4(a,p+1,v);
    }
    
    //Prueba ejercicio 4. No funciona si metes array vacio
    public static void main (String[] args){
        int [] kevin = {2, 9, 4, 1, 5, 6, 8, 4};
        ejercicio4(kevin, 3, 7);
        for(int i=0; i<kevin.length; i++){ System.out.print(kevin[i]); }
        System.out.println();
        int[] carlos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ejercicio4(carlos, 3, 7);
        for(int i=0; i<carlos.length; i++){ System.out.print(carlos[i]); }
        System.out.println();
    }
}
