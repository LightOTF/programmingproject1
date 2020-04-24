import java.sql.*;

public class DatabaseTest {

    String className, URL, user, password;
    Connection connection;
    public DatabaseTest(String className, String URL, String user, String password) {
        this.className = className;
        this.URL = URL;
        this.user = user;
        this.password = password;
        this.connection = null;
    }
    public void getConnection() {
        //Load the driver class    DEPRECATED blijkbaar niet langer manueel nodig
/*        try {
            Class.forName(className);
        } catch (ClassNotFoundException ex) {
            System.out.println("Unable to load the class. Terminating the program");
            System.exit(-1);
        }*/
        //get the connection
        try {
            connection = DriverManager.getConnection(URL, user, password);

            String query = "SELECT * from KLANT;";
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                System.out.println(res.getString("klant_vnaam") + " " + res.getString("klant_achternaam"));
            }
        } catch (SQLException ex) {
            System.out.println("Error getting connection: " + ex.getMessage());
            System.exit(-1);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            System.exit(-1);
        }

    }

    public static void main(String[] args){
        DatabaseTest test = new DatabaseTest(
                "com.mysql.jdbc.Driver",
                "jdbc:mysql://dt5.ehb.be:3306/1920PROGESS059",
                "1920PROGESS059",
                "94716235");

        test.getConnection();
    }
}

