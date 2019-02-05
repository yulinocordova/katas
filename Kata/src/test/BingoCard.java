package test;
import java.util.*;

public class BingoCard {

	private static String[] res;
	  private static int counter;
	  
	  
	public static void main(String[] args) {
		
	}
	
	
	  
	  public static String[] getCard() {
	    counter = 0;
	    res = new String[24];
	    getRow( 1,15,5,"B");
	    getRow(16,30,5,"I");
	    getRow(31,45,4,"N");
	    getRow(46,60,5,"G");
	    getRow(61,75,5,"O");
	    return res;
	  }
	  
	  private static void getRow(int b, int e, int n, String l) {
	    ArrayList<Integer> row = new ArrayList<Integer>();
	    for (int i = b; i <= e; i++) row.add(new Integer(i)); 
	    Collections.shuffle(row);
	    for (int i = 0; i < n; i++) res[counter++] = l + Integer.toString(row.get(i));
	  }
	
	
}
