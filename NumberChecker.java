import java.util.Scanner;
public class NumberChecker {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Number Checker\n");
        System.out.println("Please enter a Number:");
        int num = input.nextInt();
        if (num > 0){
            System.out.println("your number is positive");
        }else if(num == 0){
            System.out.println("your number is zero");
        } else{
            System.out.println("your number is negative");
        }
    }
}