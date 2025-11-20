import java.util.*;
public class Bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Showing bitwise and operators\n");
        System.out.print("Please enter the first number:");
        int first = input.nextInt();
        System.out.print("now enter the another number:");
        int second = input.nextInt();
        int result = first & second;
        System.out.println("The result is:"+result);
    }
}
