public class PerfectNumbers1to1000 {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 to 1000 are: ");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
