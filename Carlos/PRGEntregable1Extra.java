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
    
    public static void ejercicio4(int [] a,int p, int v){
        if(a.length!=0){
            if(p<=a.length-1 && p>=0)
                if(a[p]<v)
                    a[p]=v;
            if(p-1>-1 && a[p-1]<v)
                ejercicio4(a,p-1,v);
            if(p+1<a.length && a[p+1]<v)
                ejercicio4(a,p+1,v);
            }
        }
    
    public static void ejercicio4Prueba (){
        int [] kevin = {2, 9, 4, 1, 5, 6, 8, 4};
        ejercicio4(kevin, 3, 7);
        for(int i=0; i<kevin.length; i++){ System.out.print(kevin[i]); }
        System.out.println();
        int[] carlos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ejercicio4(carlos, 3, 7);
        for(int i=0; i<carlos.length; i++){ System.out.print(carlos[i]); }
        System.out.println();
    }
    
    public static boolean ejercicio5(int [] a, int [] b, int ini, int fin){
        if (ini>fin) 
            return true;
        if (a[ini]==b[ini])
            return ejercicio5(a, b, ++ini, fin);
        else 
            return false;
    }
    
    public static boolean ejercicio5Lanzadera(int [] a, int [] b){
        return ejercicio5(a,b,0,a.length-1);
    }
    
    public static int ejercicio6(int [] a, int [] b, int ini, int fin){
        if (ini>fin)
            return 0;
        else if (a[ini]==b[ini])
            return 1+ejercicio6(a, b, ++ini, fin);
        else 
            return ejercicio6(a, b, ++ini, fin);
    }
   
    public static int ejercicio6Lanzadera(int [] a, int [] b){
       return ejercicio6(a, b, 0, a.length-1);
    }
    
    public static int ejercicio7(char [] a, char c, int ini, int fin){
       if (ini>fin)
            return 0;
       else if (a[ini]==c)
            return 1+ejercicio7(a, c, ++ini, fin);
       else 
            return ejercicio7(a, c, ++ini, fin);
    }
    
    public static int ejercicio7Lanzadera(char [] a, char c){
        return ejercicio7(a, c, 0, a.length-1);
    }
    
    
    
}
