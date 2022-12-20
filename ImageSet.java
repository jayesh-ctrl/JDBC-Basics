
import java.sql.*;
import java.io.*;


class ImageSet {
    public static void main(String[] args)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            //create a connection
            String url = "jdbc:mysql://localhost:3306/youtube";
            String user="root";
            String password = "Jayesh123!@#";
            Connection con=DriverManager.getConnection(url, user, password);

            String q="insert into images(pic) values(?)";
            PreparedStatement pstmt = con.prepareStatement(q);

            FileInputStream fis=new FileInputStream("sample.jfif");

            pstmt.setBinaryStream(1, fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("done...");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }    
}
