import java.util.*;
public class perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter all 4 sides in centimeters:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double perimeter = a+b+c+d;
        System.out.println("paremiter is:"+perimeter);
    }
}
