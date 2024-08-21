import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int smallest = (a + b + Math.abs(a - b)) / 2;
        smallest = (smallest + c + Math.abs(smallest - c)) / 2;

        System.out.println("The smallest number is: " + smallest);
    }
}
