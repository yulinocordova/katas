package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FraccionConDenominador {

	public static void main(String[] args) {
		
		
	 System.out.println(properFractions(15));
		
		    /*
		
		System.out.println("-----------");
		  //long n = 15;
	        List<Long> factores = new ArrayList<>();
	        for (long i = 2; i <= n / i; i++) {
	        	System.out.println(n +"  "+ i);
	            while (n % i == 0) {
	            	//System.out.println(i);
	                factores.add(i);
	              System.out.println("- "+ i);
	                n /= i;
	              System.out.println("-- "+ n);
	            }
	        }
	        
	        if (n > 1) {
	        	factores.add(n);
	        }
	        
	        Set<String> hs = new HashSet<>();
	        hs.addAll(factores);
	        factores.clear();
	        factores.addAll(hs);
	        
	        System.out.println("yu -  "+factores.toString());
	        //System.out.println(factores.stream().distinct().sorted().collect(Collectors.toList()));
		*/
	}
	
	public static long properFractions(long n) {
	    if (n==1) return 0;
	    long r=n;
	    for(long d=2;d*d<=n;d++)
	      if(n%d<1){
	        while(n%d<1)
	          n/=d;
	        r-=r/d;
	      }
	    if(n>1) r-=r/n;
	    return r;
	  }
	
	
}
