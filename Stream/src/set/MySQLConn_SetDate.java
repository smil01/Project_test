package set;

/* 普通のDBコネクトデータ　*/

public class MySQLConn_SetDate {
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final String DB_URL = "jdbc:mysql://localhost:3306/book_ex?serverTimezone=UTC";
    final String USERNAME = "root";
    final String PASSWORD = "1234";

    public String getJDBC_DRIVER() {
        return JDBC_DRIVER;
    }

    public String getDB_URL() {
        return DB_URL;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    @Override
    public String toString() {
        return "MySQLConn_SetDate{" +
                "JDBC_DRIVER='" + JDBC_DRIVER + '\'' +
                ", DB_URL='" + DB_URL + '\'' +
                ", USERNAME='" + USERNAME + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                '}';
    }
}
