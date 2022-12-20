import java.sql.*;

class FirstJDBC{
    public static void main(String []args)
    {
        try{
            //load the driver:
            Class.forName("com.mysql.cj.jdbc.Driver");


            //create a connection
            String url = "jdbc:mysql://localhost:3306/youtube";
            String user="root";
            String password = "Jayesh123!@#";
            Connection con=DriverManager.getConnection(url, user, password);


           // Create a query
           String q="create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null,tCity varchar(400))";

           // create a statement
           Statement stmt = con.createStatement();
           stmt.executeUpdate(q);
           System.out.println("Table created in table");

           con.close();


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}