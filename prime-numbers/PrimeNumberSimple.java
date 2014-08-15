public class PrimeNumberSimple {
  public static void main(String[] args) {
    //define limit
    int limit = 100;
    System.out.println("Prime numbers between 1 and " + limit);

    //loop through the numbers one by one
    for(int i=1; i < limit; i++){     
      boolean isPrime = true;
      //check to see if the number is prime
      for(int j=2; j < i ; j++){
        if(i % j == 0){
          isPrime = false;
          break;
        }
      }
      // print the number
      if(isPrime) {
        System.out.print(i + " ");
      }
    }
  }
}

//Output
/*
Prime numbers between 1 and 100
1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
*/