package ua.oleh.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class OrganizationsDao {
    String organization_name;
    long organization_id;
    private static ResultSet rs;
    private static Statement stmt;
    String sql;
    public String getCoutofContactsByName(String name){
        return sql="Select COUNT(organization_name) from organizations where organization_name LIKE'"+name+"'";
    }
    public static void main(String[] args) throws IOException{
        OrganizationsDao organizationsDao = new OrganizationsDao();
            try {
                String query ;
                FileInputStream fis;
                fis = new FileInputStream("src/main/resources/config.properties");
                Properties property = new Properties();
                property.load(fis);
                String host = property.getProperty("db.host");
                String login = property.getProperty("db.login");
                String password = property.getProperty("db.password");
                Connection con = DriverManager.getConnection(host,login,password);
                Scanner sc = new Scanner(System.in);
                ContactsDao contactsDao = new ContactsDao();
                System.out.println("Input organization_name");
                String name=sc.nextLine();
                stmt = con.createStatement();
                query= organizationsDao.getCoutofContactsByName(name);
                try {
                    rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        System.out.println(rs.getString(1));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try { stmt.close(); } catch(SQLException se) { se.printStackTrace();}
                try { rs.close(); } catch(SQLException se) { se.printStackTrace(); }
            }
    }

}
