package test;

import set.MySQLConn_SetDate;
import vo.main_20180831_VO.T_1VO;

import java.sql.*;

public class test_20180831 {

    static MySQLConn_SetDate setDate = new MySQLConn_SetDate();

    static Connection connection = null;
    static Statement statement = null;
    static ResultSet resultSet = null;

    final static String sql = "SELECT * FROM t_1;";

    public static void main(String[] args){

        try{
            Class.forName(setDate.getJDBC_DRIVER());
            connection = DriverManager.getConnection(setDate.getDB_URL(),setDate.getUSERNAME() ,setDate.getPASSWORD() );
            System.out.println( "제대로 연결되었습니다." );

            statement = connection.createStatement();

            resultSet = statement.executeQuery(sql);

           while (resultSet.next()){
               T_1VO vo = new T_1VO();

               vo.setOh(resultSet.getInt("oh"));
               vo.setDae(resultSet.getInt("dae"));
               vo.setGeun(resultSet.getString("geun"));

               System.out.println(vo.toString());
           }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
