import java.util.*;

class Calculator{
   /**
 * @param args
 */
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("For Sum of two number press 1");
    System.out.println("For Substracton of two number press 2");
    System.out.println("For Multiplication of two number press 3");
    System.out.println("For division of two number press 4");
    int button = sc.nextInt();
    System.out.println("Enter first number :  ");
    int a = sc.nextInt();
System.out.println("Enter Second number : ");   
    int b = sc.nextInt();
    int sum = a + b;
    int sub = a - b;
    int mul = a * b;
    int div = a / b;
    switch (button) {
            case 1:
            System.out.println(sum );
            break;
            case 2:
            System.out.println(sub);
            break;
            case 3:
            System.out.println(mul);
            break;
            case 4:
            System.out.println(div);
            break;
        default:
        System.out.println("Please enter a valid operator ");
            break;
    }
   }
}