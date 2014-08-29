public class PermutationCharArray {
  public static void main(String[] args) {
		permutation("abc");
  }

    // print N! permutation of the elements of array a (not in order)
    // This method only converts string to char array 
    public static void permutation(String s) {
       int N = s.length();
       char[] a = new char[N];
       for (int i = 0; i < N; i++) {
           a[i] = s.charAt(i);
        }
       permutation(a, N);
    }

    private static void permutation(char[] a, int n) {
        if (n == 1) {
            System.out.println(a);
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            permutation(a, n-1);
            swap(a, i, n-1);
        }
    }  

    // swap the characters at indices i and j
    private static void swap(char[] a, int i, int j) {
        char c;
        c = a[i]; 
        a[i] = a[j]; 
        a[j] = c;
    }
}
