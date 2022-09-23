import java.util.*;
public class Main {
    public static void main(String[] args) {
    calc();

    }

    public static void calc(){

        int num1, num2;
        int num3 = 0;
        String ope;

        Scanner sc = new Scanner(System.in); //for integers
        Scanner db = new Scanner(System.in); //for strings


        System.out.println("Enter first number : ");
        num1 = sc.nextInt();

        System.out.println("Enter operator : +, -, /, * ");
        ope = db.nextLine();

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
        else {
            System.out.println("No operand as such, please retry");
            calc();
        }

        System.out.println("You chose the " + ope + "Operator!");
        System.out.println("The answer is : "+ num3);
    }
}