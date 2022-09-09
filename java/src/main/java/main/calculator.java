package main;

import java.util.Scanner;

public class calculator {
    public static void prompt(){System.out.println("Please enter a number:");}

    public static void main(String [] args){

        int n1, n2, sum;
        Scanner input = new Scanner(System.in);

        System.out.println("Quaternary Calculator: Enter +, -, *, or / to continue");
        String type = input.nextLine();

        if (type.equals("+")){
            prompt();
            n1 = input.nextInt();
            prompt();
            n2 = input.nextInt();
            System.out.println();

            input.close();
            sum = n1 + n2;
            System.out.println("Answer:" + sum);
            }
        else if (type.equals("-")){
            prompt();
            n1 = input.nextInt();
            prompt();
            n2 = input.nextInt();

            input.close();
            sum = n1 - n2;
            System.out.println("Answer:" +sum);
            }
        else if (type.equals("*")){
            prompt();
            n1 = input.nextInt();
            prompt();
            n2 = input.nextInt();

            input.close();
            sum = n1 * n2;
            System.out.println("Answer:" +sum);
        }
        else if (type.equals("/")){
            prompt();
            n1 = input.nextInt();
            prompt();
            n2 = input.nextInt();

            input.close();
            sum = n1 / n2;
            System.out.println("Answer:" +sum);
        }
    }
}
