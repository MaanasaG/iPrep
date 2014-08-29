public class PermuationString {
  public static void main(String[] args) {
    permutation("abc");
  }

  public static void permutation(String str) { 
    permutation("", str); 
  }

	private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) {
    	System.out.println(prefix);
    }
    else {
        for (int i = 0; i < n; i++) {
        		//System.out.println("i => " + i + " chatAt(i) "+str.charAt(i));
						//System.out.println("perm IN("+prefix +"," +str+")");
						//System.out.println("perm OUT("+prefix + str.charAt(i) + "," +  str.substring(0, i) + str.substring(i+1, n)+")");
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
  }
}
 
