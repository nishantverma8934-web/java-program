import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cm:");
        double a = input.nextDouble();
        System.out.print("Enter perpendicular in cm:");
        double b = input.nextDouble();
        double area = 0.5*a*b;
        System.out.print("Area Of Triangle is:"+area+"cm");
    }
}
