package DB;

import java.sql.*;

public class TestDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/webdb","admin","Password@123");
            // con can be assumed as db
        //insert sql
        //1> Write sql
//        String sql = "insert into user (username) values('Sudershan')";
//        Statement st = con.createStatement();
//        st.execute(sql);
//        con.close();
//        System.out.println("Success");



        //delete from user
//        String sql = "delete from user where id  = 2";
//        Statement st = con.createStatement();
//        st.execute(sql);
//        System.out.println("Deleted");






        //update sql


//        String sql = "update user set username= 'Khadka' where id = 5";
//
//        Statement st = con.createStatement();
//        st.execute(sql);
//       System.out.println("Updated");



       //select sql

        String sql = "select * from user";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            System.out.println("id = "+rs.getInt("id") +"\t"+ "username = "+rs.getString("username"));

        }
        System.out.println("Updated");
    }
}
