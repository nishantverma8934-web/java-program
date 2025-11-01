public class OperatorsExample{
    public static void main(String[] args) {
    int a = 10,b = 5;
    int addition = a+b;
    int subtraction =a-b;
    int multiplication =a*b;
    int division =a/b;
    int modulus =a%b;
    system.out.println("Arithmetic Operators:");
    system.out.println("Addition:"+addition);
    system.out.println("Multiplication:"+multiplication);
    system.out.println("Division:"+division);
    system.out.println("Modulus:"+modulus);
    boolean isEqual=(a==b);
    boolean isNotEqual=(a!=b);
    boolean isGreater=(a>b);
    boolean isLess=(a<b);
    system.out.println("\nRelational Operators:");
    system.out.println("Is Equal:"+isEqual);
    system.out.println("Is Not Equal:"+isNotEqual);
    system.out.println("Is Greater:"+isGreater);
    system.out.println("Is Less:"+isLess);
    blloean x = true, y = false;
    boolean andResult = x&&y;
    boolean orResult=x||y;
    boolean notResult=!x;
    system.out.println("\nLogical Operators:");
    system.out.println("AND:"+andResult);
    system.out.println("OR:"+orResult);
    system.out.println("Not:"+notResult);
    int c = 15;
    c +=5;
    int d = 8;
    d *=3;
    system.out.println("\nAssignment Operators:");
    system.out.println("c after+=:"+c);
    system.out.println("d after *=:"+ d);
    }
}