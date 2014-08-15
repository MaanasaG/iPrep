PrimeNumberSimple 
=======
1. define limit - upper number - 100
1. loop i - through the numbers one to limit
1. loop j from 2 to less than i
1. Use modulus to check the number is prime
1. If modulus never becomes zero in j loop the number is prime

<pre>
i = 1 => j=2 and j not less than 1 => 1 is prime
i = 2 => j=2 and j not less than 2 => 2 is prime
i = 3 => j=2 and j is less than 3 => 3%2 is not 0
         j=3 and j not less than 3 => 3 is prime
i = 4 => j=2 and j is less than 4 => 4%2 is 0 => not prime we break the loop
i = 5 => j=2 and j is less than 5 => 5%2 is not 0
         j=3 and j is less than 5 => 5%3 is not 0
         j=4 and j is less than 5 => 5%4 is not 0
         j=5 and j not less than 5 => 5 is prime
i = 6 => j=2 and j is less than 6 => 6%2 is 0 => not prime we break the loop
i = 7 => j=2 and j is less than 7 => 7%2 is not 0
         j=3 and j is less than 7 => 7%3 is not 0
         j=4 and j is less than 7 => 7%4 is not 0
         j=5 and j is less than 7 => 7%5 is not 0
         j=6 and j is less than 7 => 7%6 is not 0
         j=7 and j not less than 7 => 7 is prime
i = 9 => j=2 and j is less than 9 => 9%2 is not 0
         j=3 and j is less than 9 => 9%3 is 0 => not prime we break the loop
</pre>

<pre>
//Output
/*
Prime numbers between 1 and 100
1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
*/
</pre>

---- 

PrimeNumberOptimized
=======

<pre>
In the simple solution we try to divide every number we find with smaller numbers. In an optimized approach we want to avoid too many calculations. We can first calculate the square root of each number and then use that for the division.
If a modulus calculation of all of the numbers below that square root number produces a result that is not equal to zero, then we have found a prime number.
</pre>

1. define upper limit - 100
1. loop i - thru i to 100
1. calculate num = sqrt(i) and round to get whole number
1. loop j - thru 2 to less than num
1. Use modulus to check the number is prime
1. If modulus never becomes zero in j loop the number is prime

<pre>
//Output
/*
2
3
5
7
11
13
17
19
23
29
31
........
9967
9973
Nr of prime numbers found: 1229
*/
</pre>
