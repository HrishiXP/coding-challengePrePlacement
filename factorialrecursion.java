import java.util.Scanner;

public class factorialrecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }
        public static int factorial(int n){
            if (n==0 || n==1) {
                return 1;
                }else{
                    return n*factorial(n-1);
                }
            
        }
}
