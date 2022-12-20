
import java.sql.*;
import java.io.*;


class Fun {
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

            // create a query
            String q="insert into table1(tName,tCity) values(?,?)";

            //get the preparedStatement object;

            PreparedStatement pstmt = con.prepareStatement(q);
            

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Name:- ");
            String name = br.readLine();

            System.out.println("Enter City:- ");
            String city = br.readLine();

            // set the values to query

            pstmt.setString(1, name);
            pstmt.setString(2, city);

            pstmt.executeUpdate();

            System.out.println("inserted...");

            con.close();

           


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
