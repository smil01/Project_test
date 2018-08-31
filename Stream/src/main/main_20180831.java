package main;

import java.sql.Connection;
import java.sql.DriverManager;

public class main_20180831 {

    static Connection conn = null;

    public static void main(String [] args){
        try{

            String jdbcUrl= "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC" ;
            String dbId="root";
            String dbPass= "1234";

            Class.forName( "com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcUrl,dbId ,dbPass );
            System.out.println( "제대로 연결되었습니다." );
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
