package dataPools.mysql;

import java.sql.*;
import com.jetbanking.people.Client;

public class ClientDatabase {

    final private String URL = "db_url";
    final private String USERNAME = "db_username";
    final private String PASSWORD = "db_password";

    public Client getClientByName(String firstName, String lastName){
        String sql = "SELECT * FROM clients WHERE first_name=" + firstName + "AND last_name=" + lastName;
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Database connected!");
            Statement stmt = connection.createStatement();
            ResultSet clientReturned = stmt.executeQuery(sql);
            Client client = new Client();
            client.setSin(clientReturned.getString("sin"));
            return client;

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
