import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input a number to check if it is prime or not: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(isPrime(number));
        ArrayList<Integer> primeNumbers = getPrimeNumbers(number);
        System.out.println(primeNumbers);
        System.out.println(primeNumbers.size());

    }



    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> getPrimeNumbers(int number) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        //int[] primeNumbers = new int[number];
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
                //primeNumbers[count] = i;
                count++;
            }
        }
        return primeNumbers;
    }
}