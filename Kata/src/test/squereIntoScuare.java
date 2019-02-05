package test;

public class squereIntoScuare {
	public static void main(String[] args) {
		
		String resul =  decompose(11);  
		System.out.println(resul);
		
	}
	
	 public static String decompose(long n) {
		    String l = tryDecomp(n * n, (long)Math.sqrt(n * n - 1));
		    return l != null ? l.trim() : l;
		  }
	
	  private static  String tryDecomp(long nb, long rac) {
		    if (nb == 0) return "";
		    String l = null;
		    long i = rac;
		    while (i >= (long)Math.sqrt(nb/2.0) + 1) {
		      long diff = nb - i * i;
		      rac = (long)Math.sqrt(diff);
		      l = tryDecomp(diff, rac);
		      if (l != null) { return l + " " + i; }
		      i -=1;
		    }
		    return null;
		  }
		 
}
