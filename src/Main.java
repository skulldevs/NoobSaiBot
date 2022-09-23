import java.util.*;
public class Main {
    public static void main(String[] args) {
        int num1, num2;
        int num3 = 0;
        String ope;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first number : ");
        num1 = sc.nextInt();

        sc.next();
        System.out.println("Enter operator : +, -, /, * ");
        ope = sc.nextLine();

        System.out.println("Enter second number : ");
        num2 = sc.nextInt();

        if (ope.equals("+")){
            num3 = num1+num2;
        }
        else if(ope.equals("-")){
            num3 = num1-num2;
        }else if(ope.equals("/")){
            num3 = num1/num2;
        }else if(ope.equals("*")){
            num3 = num1*num2;
        }

        System.out.println("You chose the " + ope + "Operator!");
        System.out.println("The answer is : "+ num3);


    }
}