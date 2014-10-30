package edu.vinni.study.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by serghii on 28.10.14.
 */
public class Test {
    static String createTableSQL = "CREATE TABLE DBUSER("
            + "USER_ID INTEGER NOT NULL, "
            + "USERNAME VARCHAR(20) NOT NULL, "
            + "CREATED_BY VARCHAR(20) NOT NULL, "
            + "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) "
            + ")";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://ec2-54-83-43-49.compute-1.amazonaws.com:5432/d1c0c47o8vdgjo?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory",
                "nabvuefonkcpxd",
                "kj_VlozDz-5k7PMHvh6MSWdpRF"
        );

        final Statement statement = connection.createStatement();
        statement.execute(createTableSQL);



        connection.close();
    }
}
