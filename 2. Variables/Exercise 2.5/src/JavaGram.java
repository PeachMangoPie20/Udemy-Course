import java.util.Scanner;

public class JavaGram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up!");

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        //Ask for their last name.
        //Ask: how old are you?
        //Ask them to make a username.
        //Ask what city they live in.
        //Ask what country that's from.


        //Task 2 - Print their information.

        System.out.println("What is your first name?");
        String firstName = scan.nextLine();

        System.out.println("What is your last name?");
        String lastName = scan.nextLine();

        System.out.println("How old are you?");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("What would be your Username?");
        String username = scan.nextLine();

        System.out.println("What city do you live in?");
        String city = scan.nextLine();

        System.out.println("What country are you from?");
        String country = scan.nextLine();

        System.out.println("\nThank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //

        System.out.println("\nYour information:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast NAme: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        //close scanner. It's good practice :D !

        scan.close();
    }
}