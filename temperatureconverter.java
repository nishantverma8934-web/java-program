import java.util.*;
 class Temperatureconverter{
    public static void main(String [] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Faherenheit:");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 31)*5/9;
        System.out.println("Temperature in Celsius:"+celsius);
        input.close();
    }
}