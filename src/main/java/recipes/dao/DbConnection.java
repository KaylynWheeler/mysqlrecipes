package recipes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import recipes.exception.DbException;

public class DbConnection {
	
	private static final String SCHEMA ="recipes";
	private static final String USER="recipes";
    private static final String PASSWORD="recipes";
    private static final String HOST ="localhost";
    private static final int PORT = 3306;
    
    
    public static Connection getConnection() {
    	String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&PASSWORD=%s&useSSL=false",
    			HOST, PORT,SCHEMA,USER,PASSWORD);
    	
    	
    	
    	try {
    		Connection conn = DriverManager.getConnection(url);
    		System.out.println("Successfully obtined connection!");
    		return conn;
    	} catch (SQLException e) {
    		System.out.println("Error getting a connection.");
    		throw new DbException(e);
    		
    	}
    }

    	}

