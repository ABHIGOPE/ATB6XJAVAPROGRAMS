package Practice.Sep;
import java.util.*;
public class PrimeNumber {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int number = sc.nextInt(); // Example number
            boolean isPrime = isPrime(number);

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        // Function to check if a number is prime
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false; // Numbers <= 1 are not prime
            }

            // Check divisors from 2 to sqrt(n)
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false; // n is not prime
                }
            }

            return true; // n is prime
        }
    }


