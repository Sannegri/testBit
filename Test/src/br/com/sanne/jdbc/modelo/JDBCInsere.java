package br.com.sanne.jdbc.modelo;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.sanne.jdbc.ConnectionFactory;

public class JDBCInsere {
    public static void main(String[] args) throws SQLException{
        Connection con = null;
        try {
            con = new ConnectionFactory().getConnection();
            System.out.println("truco");
        } finally {
            con.close();
        }
    }
}