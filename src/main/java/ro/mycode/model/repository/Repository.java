package ro.mycode.model.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Repository {
    private String JdbcURL="jdbc:mysql://localhost:3306/banking?" + "autoReconnect=true&useSSL=false";
    private String username="root";
    private String password="root";
    private Connection connection=null;
    private Statement statement=null;


    public Repository(){
        try{
            connection= DriverManager.getConnection(JdbcURL,username,password);
            statement=connection.createStatement();
            System.out.println("S-a conectat ");

        }catch (SQLException e){
            System.out.println("eroare la conectarea cu baza de datee");

        }
    }
    public void exectuteStatement(String execute){
        try{
            statement.execute(execute);
        }catch (SQLException exc){
            System.out.println("nu am reusit" + execute);
        }
    }




}
