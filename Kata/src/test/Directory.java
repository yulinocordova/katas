package test;

public class Directory {

	//Did you mean
	public static void main(String[] args) {
		
	System.out.println(	levenshteinDistance("cherry","strawbery"));
	}
	
	// assertEquals("strawberry", dictionary.findMostSimilar("strawbery"));
	// assertEquals("cherry", dictionary.findMostSimilar("berry"));
	
	private static int levenshteinDistance(String word1, String word2){
        int m = word1.length();
        int n = word2.length();

        int[][] countingArray = new int[m][n];

        for(int i = 0; i < m; i++){
            countingArray[i][0] = i;
        }

        for(int i = 0; i < n; i++){
            countingArray[0][i] = i;
        }

        int cost;
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(word1.charAt(i) == word2.charAt(j)){
                    cost = 0;
                }
                else{
                    cost = 1;
                }

                countingArray[i][j] = Math.min(
                        Math.min(countingArray[i-1][j] + 1, countingArray[i][j-1] + 1),
                        countingArray[i - 1][j-1] + cost);
            }
        }
        return countingArray[m - 1][n - 1];
    }

	
}
