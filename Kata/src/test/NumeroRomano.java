package test;

import java.util.TreeMap;

public class NumeroRomano {

	private static final TreeMap<Integer, String> lista = new TreeMap<>();

    static {
        lista.put(1000, "M");
        lista.put(900, "CM");
        lista.put(500, "D");
        lista.put(400, "CD");
        lista.put(100, "C");
        lista.put(90, "XC");
        lista.put(50, "L");
        lista.put(40, "XL");
        lista.put(10, "X");
        lista.put(9, "IX");
        lista.put(5, "V");
        lista.put(4, "IV");
        lista.put(1, "I");
    }

     private static String aRomano(int numero) {
        
        int l = lista.floorKey(numero);
        if (numero == l) {
          return lista.get(numero);
        }else{
        	System.out.println(lista.get(l));
          return lista.get(l) + aRomano(numero - l);
        }
     }

	
	public static void main(String[] args) {
		
		String numero = aRomano(134);
	      System.out.println(numero);
	       //return numero;
	}
	
}
