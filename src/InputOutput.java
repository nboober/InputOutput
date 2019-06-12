import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("The First Decimal Number is... ");
        num1 = scanner.nextDouble();

        System.out.println("The Second Decimal Number is... " );
        num2 = scanner.nextDouble();

        num3 = (num1 + num2)/2;

        System.out.println("The Average is " + num3);
    }
}
