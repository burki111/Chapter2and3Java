package Chapter3cnestedif;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args[]){

        int amount_salary = 30000;
        int years_experience = 2;
        System.out.println("Enter your salary:");
        Scanner input= new Scanner(System.in);
        double salary = input.nextDouble();

        System.out.println("Enter your required experience years:");
        double experience = input.nextDouble();

        if (salary>=amount_salary){
            if(experience>=years_experience){
                System.out.println("Congrats! You are qualified for the loan");
            }
            else{
                System.out.println("Sorry you aren't qualified to get the loan as your employment is less then"
                        +years_experience+ " years ");
            }
        }
        else{
            System.out.println("Sorry you must earn at least" +amount_salary+ "to get qualified for the loan");
        }
    }


}
