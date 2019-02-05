package test;

public class Fibonacci {

	public static void main(String[] args) {
		
		long numero = 1;
		
		long resultado1 = 0;
		//long resultado2 = 0;
		long resultado2 = 1;
		long ope = 0;
		long estado=0;
		long[] fin = new long [3];
		
		for (long i = 1; i <= numero; i++) {
			
//			resultado1 = fibonacci(i);
//			resultado2 = fibonacci(i+1);
//			ope = resultado1 * resultado2;
//			System.out.println(ope);
//			if(numero <= ope) {
//				System.out.println(ope);
//				break;
//			}
			
			
			
			System.out.println("i: "+i+" resultado1: "+resultado1+" resultado2: "+resultado2);
			
			ope = resultado1 * resultado2;
			
			if(ope >= numero) {
				break;
			}
			
			long auxF = resultado2;
			resultado2 = resultado1 + resultado2;
			
			resultado1 = auxF;
			
			
		}             
		
		
		
		if(numero == ope) {
			estado = 1;
		}
		fin[0] = resultado1;
		fin[1] = resultado2;
		fin[2] = estado;
		System.out.println(fin[0]);
	}
	
	public static long fibonacci(long n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
	
//	
//	 // your code
//    long n = 0;
//    long nPlus = 1;  
//    long[] re = new long[1];
//    
//    while(n*nPlus < prod) {
//      nPlus = n + nPlus;
//      n = nPlus - n;
//    }
//    
//    return re;
//		//return null;
//    
}
