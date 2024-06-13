package employeeInterface;
import com.jetbanking.people.Client;
import dataPools.mysql.ClientDatabase;
import java.sql.SQLException;
import java.sql.SQLOutput;
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



    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println(TEXT_YELLOW + """
                \tJET BANK
                \t_________________________________________________
                \tAUTHORIZED USERS ONLY
                \t_________________________________________________
                """);
        userInterface();

    }

    public static void userInterface() throws SQLException {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println(TEXT_BLUE + "\t1. " + TEXT_RESET + "Create Account");
            System.out.println(TEXT_BLUE + "\t2. " + TEXT_RESET + "Edit Account");
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
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter First Name of Client");
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
}