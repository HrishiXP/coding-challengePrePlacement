import java.util.Scanner;
import java.util.HashMap;

public class LCMPrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int lcm = findLCMUsingPrimeFactors(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static int findLCMUsingPrimeFactors(int a, int b) {
        HashMap<Integer, Integer> primeFactorsA = getPrimeFactors(a);
        HashMap<Integer, Integer> primeFactorsB = getPrimeFactors(b);
        HashMap<Integer, Integer> lcmFactors = new HashMap<>();

        for (Integer key : primeFactorsA.keySet()) {
            int countA = primeFactorsA.get(key);
            int countB = primeFactorsB.getOrDefault(key, 0);
            lcmFactors.put(key, Math.max(countA, countB));
        }

        for (Integer key : primeFactorsB.keySet()) {
            if (!lcmFactors.containsKey(key)) {
                lcmFactors.put(key, primeFactorsB.get(key));
            }
        }

        int lcm = 1;
        for (Integer key : lcmFactors.keySet()) {
            lcm *= Math.pow(key, lcmFactors.get(key));
        }

        return lcm;
    }

    public static HashMap<Integer, Integer> getPrimeFactors(int number) {
        HashMap<Integer, Integer> primeFactors = new HashMap<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors.put(i, primeFactors.getOrDefault(i, 0) + 1);
                number /= i;
            }
        }
        return primeFactors;
    }
}
