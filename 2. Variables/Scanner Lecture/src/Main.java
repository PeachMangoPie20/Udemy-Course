import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner questions = new Scanner (System.in);
        int count = 0;
        System.out.println("Welcome to my humble abode.");
        System.out.println("So ... What is your name?");
        String name = questions.nextLine();
        count++;

        System.out.println("So your name is " + name +". What a beautiful name.");
        System.out.println("I still have some questions for you. How much are you willing to spend for shoes?");
        Double money = questions.nextDouble();
        count++;
        System.out.println("How many shoes do you buy in a month?");
        int shoes = questions.nextInt();
        count++;
        System.out.println("I see. You spend " + money + " on shoes.");

        System.out.println("How much do you spend in a month for ordering food online?");
        int orderingFood = questions.nextInt();
        count++;
        System.out.println("You are ordering food " + orderingFood + " times a month.");

        System.out.println("\nThank you " + name + " for answering all " + count + " questions.");
        System.out.println("Yearly, you spent " + (money*shoes) + " on shoes.");
        System.out.println("Your food expenses are " + (orderingFood/money) + " times your shoes expenses");



        questions.close();
    }
}
