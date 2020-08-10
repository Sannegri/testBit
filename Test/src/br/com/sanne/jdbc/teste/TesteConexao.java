package br.com.sanne.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.sanne.jdbc.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		   Connection connection = new ConnectionFactory().getConnection();
	          System.out.println("Conexão aberta!");
	          connection.close();
	}

}
