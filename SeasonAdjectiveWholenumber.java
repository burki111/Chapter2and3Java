package Chapter2JavaFundamentals;

import java.util.Scanner;

public class SeasonAdjectiveWholenumber {
    public static void main(String args[]){
        System.out.println("State the adjective");
        Scanner input= new Scanner(System.in);
        String adjective = input.nextLine();

        System.out.println("State the season of the year");
        String season = input.nextLine();

        System.out.println("Enter the number of cups");
        int whole_number = input.nextInt();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + whole_number + " cups of coffee.");

    }
}
