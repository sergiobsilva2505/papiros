package br.com.sbs.papiros.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

        public Connection getConnection(){

        String url = "jdbc:mysql://localhost:3306/papirosDb?useTimezone=true&serverTimezone=UTC";;
        String user = "root";
        String password = "Alura@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);


            return connection;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

}
