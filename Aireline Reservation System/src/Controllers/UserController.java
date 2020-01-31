/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

/**
 *
 * @author JAMIR AFRIDI
 */
import DataBase.Database;
import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserController extends User{
    
    Database db;
    Connection con;
    PreparedStatement pst;
    
    public UserController() {
        super();
        db = new Database();
        con = db.getConnection();
    }
    
    public int createAccount(User u) {
        int res = 0;
        String sql = "";
        
        try {
            sql = "INSERT INTO usertable(`Name`,`email`,`PassWord`,`Phone`,`DOB`,`Gender`) VALUES(?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            
            pst.setString(1, u.getName());
            pst.setString(2, u.getEmail());
            pst.setString(3, u.getPassword());
            pst.setString(4, u.getPhone());
            pst.setString(5, u.getDOB());
            pst.setString(6, u.getGender());
            
            res = pst.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return res;
    }
    
    public boolean checkLogin(User u) {
        
        String sql = "";
        ResultSet rs = null;
        
        try {
            sql = "SELECT * FROM usertable WHERE email = ? and PassWord = ?";
            pst = con.prepareStatement(sql);
            
            pst.setString(1, u.getEmail());
            pst.setString(2, u.getPassword());
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
            
            
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        return false;
    }
}

