import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

public class Database {
    String name,password;
    int flag=0;

    Database(String name, String password){
        this.name = name;
        this.password = password;

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/UniversityData","root","");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from admin");

            while(resultSet.next()){
                if(Objects.equals(resultSet.getString("name"), name) && Objects.equals(resultSet.getString("password"), password)){
                    System.out.println("Logged In");
                    return;
                }
                else {
                    flag = 1;
                }
            }
            if (flag==1){
                System.out.println("Invalid Username Or Password");
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e + " Database not connected");
        }
    }
}
