package Maths;

public class SuperPrime {

  public static void main(String[] args) {
    int n = 100;
    System.out.println("Super-Primes less than or equal to " + n + " are :");
    superPrimes(n);
  }

  /**
   *
   * @param n	the range of number to find the super prime number
   * @param isPrime an array of boolean value to identify which is super prime number
   */
  public static void SieveOfEratosthenes(int n, boolean isPrime[]) {
    // Initialize all entries of boolean
    // array as true. A value in isPrime[i]
    // will finally be false if i is Not
    // a prime, else true bool isPrime[n+1];
    isPrime[0] = isPrime[1] = false;
    for (int i = 2; i <= n; i++) {
      isPrime[i] = true;
    }

    for (int p = 2; p * p <= n; p++) {
      // If isPrime[p] is not changed,
      // then it is a prime
      if (isPrime[p] == true) {
        // Update all multiples of p
        for (int i = p * 2; i <= n; i += p) {
          isPrime[i] = false;
        }
      }
    }
  }

  // Prints all super primes less
  // than or equal to n.
  /**
   *
   * @param n the range of number to determine from 0 to n
   */
  public static void superPrimes(int n) {
    // Generating primes using Sieve
    boolean isPrime[] = new boolean[n + 1];
    SieveOfEratosthenes(n, isPrime);

    // Storing all the primes generated
    // in a an array primes[]
    int primes[] = new int[n + 1];
    int j = 0;

    for (int p = 2; p <= n; p++) {
      if (isPrime[p]) {
        primes[j++] = p;
      }
    }

    // Printing all those prime numbers that
    // occupy prime numbered position in
    // sequence of prime numbers.
    for (int k = 0; k < j; k++) {
      if (isPrime[k + 1]) {
        System.out.print(primes[k] + " ");
      }
    }
  }
}
