package employeeInterface;
import com.jetbanking.exceptions.InvalidInput;
import com.jetbanking.people.Client;
import dataPools.mysql.ClientDatabase;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;



public class CLI {

    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";
    private static final String TEXT_YELLOW = "\u001B[33m";
    private static final String TEXT_BLUE = "\u001B[34m";
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String URL = System.getenv("MYSQL_DB_HOST");
    private static final String USERNAME = System.getenv("MYSQL_DB_USERNAME");
    private static final String PASSWORD = System.getenv("MYSQL_DB_PASSWORD");

    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.println(TEXT_YELLOW + """
                \tJET BANK
                \t_________________________________________________
                \tAUTHORIZED USERS ONLY
                \t_________________________________________________
                """);
        userInterface();

    }

    public static void userInterface() {
//        Scanner input = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println(TEXT_BLUE + "\t1. " + TEXT_RESET + "Create Account");
            System.out.println(TEXT_BLUE + "\t2. " + TEXT_RESET + "Edit Client");
            System.out.println(TEXT_BLUE + "\t3. " + TEXT_RESET + "Create New Client");
            System.out.println(TEXT_BLUE + "\t4. " + TEXT_RESET + "Edit Client Information");
            System.out.println(TEXT_BLUE + "\t5. " + TEXT_RESET + "Open New Loan");
            System.out.println(TEXT_BLUE + "\t6. " + TEXT_RESET + "Close/Edit Loan");
            System.out.println(TEXT_BLUE + "\t7. " + TEXT_RESET + "Management");
            System.out.println(TEXT_BLUE + "\t- " + TEXT_RESET + "\"q\" to Quit");
            System.out.println(TEXT_BLUE + "\n\tEnter your desired choice below:" + TEXT_RESET);

            switch (input.next()){

                case "1":
                    // Create a class to create new account
                    break;

                case "2":
                    // Create a class to edit an account
                    searchMenu();
                    break;

                case "3":
                    // Create a class to create new client
                    createClient();
                    break;

                case "4":
                    // Create a class to edit a client
                    break;

                case "5":
                    // Create a class to open a loan
                    break;

                case "6":
                    // Create a class to edit/close a loan
                    break;

                case "7":
                    // Create a sub menu for manager
                    break;

                case "q":
                    quit = true;
                    break;
            }
        }
    }
    private static void searchMenu() {
//        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter First Name of Client");
        String firstNameParam = input.next();
        System.out.println("Please enter Last Name of Client");
        String lastNameParam = input.next();

        Client clientReturned = ClientDatabase.getClientByName(firstNameParam, lastNameParam, URL, USERNAME, PASSWORD);

        if(clientReturned == null){
            System.out.println(TEXT_RED + "NO RESULTS...PLEASE CHECK SEARCH CRITERIA");
        }else{
            System.out.println(clientReturned);
        }

    }

    private static void createClient() {
        boolean exit = false;
        while(!exit){
            System.out.println("\nType \"q\" to Quit to Main Menu");
            System.out.println("\nPlease enter First Name of Client");
            String firstNameParam = input.next();
            if(Objects.equals(firstNameParam.toLowerCase(), "q")){
                exit=true;
                break;
            }
            System.out.println("Please enter Last Name of Client");
            String lastNameParam = input.next();
            if(Objects.equals(lastNameParam.toLowerCase(), "q")){
                exit=true;
                break;
            }
            System.out.println("Please enter email address");
            String email = input.next();
            if(Objects.equals(email.toLowerCase(), "q")){
                exit=true;
                break;
            }
            System.out.println("Please enter sin number");
            String sin = input.next();
            if(Objects.equals(sin.toLowerCase(), "q")){
                exit=true;
                break;
            }
            try {
                Client clientToAdd = new Client(firstNameParam, lastNameParam, email, sin);
                System.out.println("\nNew Client created: " +
                        "\n\tFirst Name: " + clientToAdd.getFirstName() +
                        "\n\tLast Name:  " + clientToAdd.getLastName() +
                        "\n\tEmail:      " + clientToAdd.getEmail() +
                        "\n\tSIN:        " + clientToAdd.getSin());
                System.out.println("\nConfirm (y):");
                String confirm = input.next().toLowerCase();
                if(Objects.equals(confirm, "y")){
                    // insert function to add to DataBase
                    exit=true;
                }
                if(Objects.equals(confirm, "q")){
                    exit=true;
                    break;
                }

            } catch (InvalidInput e) {
                System.out.println("Error: " + e);
            }
        }
    }
}