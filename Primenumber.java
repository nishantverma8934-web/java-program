import java.util.Scanner;

public class Primenumber {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number:");
    int n = input.nextInt();
    boolean isprime = true;
    for( int i = 2 ; i < n ; i++){
        if( n % i == 0){
            isprime = false;
            break;
        }
    }
    if(isprime)
    {
        System.out.print("The number is prime");
    }else{
        System.out.print("This not a prime number");
    }

}
}