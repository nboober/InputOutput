import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("The First Temperature is... ");
        num1 = scanner.nextDouble();

        System.out.println("The Second Temperature is... " );
        num2 = scanner.nextDouble();

        num3 = (num1 + num2)/2;

        System.out.println("The Average Temperature is " + num3);
    }
}
