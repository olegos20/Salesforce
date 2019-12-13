package ua.oleh.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class ContactsDao {
    private static ResultSet rs;
    private String first_name;
    private String last_name;
    private long contact_id;
    private long organization_id;
    private String sql;
    private static Statement stmt;
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public long getContact_id() {
        return contact_id;
    }
    public void setContact_id(long contact_id) {
        this.contact_id = contact_id;
    }
    public long getOrganization_id() {
        return organization_id;
    }
    public void setOrganization_id(long organization_id) {
        this.organization_id = organization_id;
    }
    public String getByFirstLetterAndName(String letter, String name){
        return sql="SELECT * from contacts "+"INNER JOIN organizations ON " +
                "contacts.contact_id = organizations.contact_id where first_name LIKE'"+letter+"%' AND organizations.organization_name='"+name+"'";
    }
    public static void main(String[] args) throws IOException {//for test all in psvm
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
            Scanner sc;
            ContactsDao contactsDao = new ContactsDao();
            System.out.println("Input a first letter");
            sc = new Scanner(System.in);
        String letter = sc.nextLine();
            System.out.println("Input organization_name");
             String name=sc.nextLine();
            stmt = con.createStatement();
            query= contactsDao.getByFirstLetterAndName(letter,name);
        try {
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String contact_id = rs.getString("contact_id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                System.out.println("contact_id : " +contact_id);
                System.out.println("first_name : " +first_name);
                System.out.println("last_name : "+last_name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        finally {
            try { stmt.close(); } catch(SQLException se) { se.printStackTrace();}
            try { rs.close(); } catch(SQLException se) { se.printStackTrace(); }
    }
}}
