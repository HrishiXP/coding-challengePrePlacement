import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            number /= 10;
        }
    }
}
