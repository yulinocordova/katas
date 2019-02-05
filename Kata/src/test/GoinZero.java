package test;

public class GoinZero {
	//Going to zero or to infinity?
	
	public static void main (String [] arg) {
		
		System.out.println(Operacion(5));
	}
	
	public static double Operacion ( int n ){
		double result = 1.0;
	      double frac = 1.0;
	      while (n > 1) {
	          frac /= n--;
	          result += frac;
	      }
	      return (int) (result * 1e6) / 1e6;
	}
	
	/*
	double sum = 1;
    double k = 1;
    for(int i = n ; i > 1 ; i--)
    {
      k = k / i;  
      sum = sum + k;
    }
    return Math.floor(sum*1000000)/1000000d;
	*/
}
