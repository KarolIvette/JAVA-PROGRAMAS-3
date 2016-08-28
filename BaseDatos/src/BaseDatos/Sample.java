package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample
{
  public static void main(String[] args) throws ClassNotFoundException
  {
    // load the sqlite-JDBC driver using the current class loader
    Class.forName("org.sqlite.JDBC");

    Connection connection = null;
    try
    {
      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30);  // set timeout to 30 sec.

      statement.executeUpdate("drop table if exists person");
      statement.executeUpdate("create table person (id integer, nombre string, edad integer)");
      statement.executeUpdate("insert into person values(1, 'Jose',22)");
      statement.executeUpdate("insert into person values(2, 'Karol',20)");
      statement.executeUpdate("insert into person values(3, 'Ivette',21)");
      statement.executeUpdate("insert into person values(4, 'Joaquin',12)");
      statement.executeUpdate("insert into person values(5, 'Karla',13)");
      ResultSet rs = statement.executeQuery("select * from person");
      while(rs.next())
      {
        // read the result set
    	System.out.println("id = " + rs.getInt("id"));
        System.out.println("nombre = " + rs.getString("nombre"));
        System.out.println("edad = " + rs.getString("edad"));
      }
    }
    catch(SQLException e)
    {
      // if the error message is "out of memory", 
      // it probably means no database file is found
      System.err.println(e.getMessage());
    }
    finally
    {
      try
      {
        if(connection != null)
          connection.close();
      }
      catch(SQLException e)
      {
        // connection close failed.
        System.err.println(e);
      }
    }
  }
}

