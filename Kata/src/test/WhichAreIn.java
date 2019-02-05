package test;
import static java.util.Arrays.stream;

import java.util.Arrays;

public class WhichAreIn {

	public static void main(String[] args) {
		
		String a[] = new String[]{ "arp", "live", "strong" };
    	String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
    	
    	System.out.println( Arrays.toString(inArray(a,b)));
	}
	
	public static String[] inArray(String[] array1, String[] array2) {
        return stream(array1).filter(s1 -> stream(array2).anyMatch(s2 -> s2.contains(s1))).sorted().distinct().toArray(String[]::new);
    }
	
}


/*
 * CORDOVA ESTTRADA 
 * 
 
import java.util.Arrays;

public class WhichAreIn { 
	
	public static String[] inArray(String[] array1, String[] array2) {
		 
     String cadena = "";
     int contador =0;
     
     System.out.println(Arrays.toString(array1));
     System.out.println(Arrays.toString(array2));
     
      for(int i = 0 ; i < array1.length ; i++){
       cadena = array1[i];
       for(int j = 0 ; j < array2.length ; j++ ){
         if(array2[j].contains(cadena)){
           contador ++;
           break;
         }
       }
     }
     
     String[] resultado = new String[contador];
     int indice =0;
     for(int i = 0 ; i < array1.length ; i++){
       
       cadena = array1[i];
       //System.out.println(cadena);
       for(int j = 0 ; j < array2.length ; j++ ){
         // System.out.println(cadena);
         if(array2[j].contains(cadena)){
           //System.out.println(cadena);
           resultado [indice] = cadena;
          indice ++;
           break;
         }
         
       }
       
     }
     
     Arrays.sort(resultado);
      System.out.println("Salida" + Arrays.toString(resultado));
     return resultado;
     //return new String[] { "arp" };

	}
}
*/