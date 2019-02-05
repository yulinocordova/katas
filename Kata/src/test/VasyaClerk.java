package test;

public class VasyaClerk {

	public static void main (String [] arg) {
		
		int[] peopleInLine = new int[] {25, 25, 50, 50, 100};
		int d25 = 0;
	    int d50 = 0;
	    
	    for (int i = 0; i < peopleInLine.length; i++) {
	        
	    	if (peopleInLine[i] == 25) {
	        	d25++;
	        	System.out.println(25);
	        }
	        
	        if (peopleInLine[i] == 50) {
	            d25--;
	            d50++;
	            System.out.println(50);
	        }
	        
	        if (peopleInLine[i] == 100) {
	            if (d50 > 0) {
	                d50--;
	                d25--;
	            } else {
	                d25 -= 3;
	            }
	            System.out.println(100);
	        }
	        
	        if (d25 < 0) {
	        	System.out.println("No");
	        }
	    }
	    
	    System.out.println("yess");
		
	}
	
	
	/*
		      int i, sum=0, change = 0;
		      String a = "";
		      for(i=0; i<peopleInLine.length; i++) {
		          
		          sum += 25;
		          change = (peopleInLine[i] - 25);
		          sum -= change;
		          
		          if(sum < change) {
		            a = "NO";
		          }
		          else a = "YES";
		      }
		      return a;
	*/
	
}
