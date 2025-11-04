import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number:");
        double first = input.nextDouble();
        System.out.print("Enter a second number:");
        double second = input.nextDouble();
        System.out.println("\n Result is:"+first * second);
    }
}