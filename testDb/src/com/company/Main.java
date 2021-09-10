package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	try{
      //  Connection conn= DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
        Connection conn= DriverManager.getConnection("jdbc:sqlite://Users/jalaunross/eclipse-workspace/testDb/testjava.db");
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE contacts(name TEXT, phone INTEGER, email TEXT)");

        //                                                 /Users/jalaunross/eclipse-workspace/testDb/src/com/company/Main.java

    }catch(SQLException e){
        System.out.println("Oppsie doopsie!" + e.getMessage());
    }
    }
}
