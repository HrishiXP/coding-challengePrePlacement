public class ArmstrongNumbers1to1000 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 to 1000 are: ");
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return original == sum;
    }
}
