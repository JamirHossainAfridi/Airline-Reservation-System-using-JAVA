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
import Models.Reserve;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Reservation extends Reserve{
    Database db;
    Connection con;
    PreparedStatement pst;
    
    public Reservation() {
        super();
        db = new Database();
        con = db.getConnection();
    }
    
    public int createAccount( Reserve r) {
        int res = 0;
        String sql = "";
        
        try {
            sql = "INSERT INTO  Reserved (`Name`,`Phone`,`FlightName`,`Seatno`,`Price`,`PaymentType`,`TransactionCode`) VALUES(?, ?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            
            pst.setString(1, r.getName());
            pst.setString(2, r.getPhone());
            pst.setString(3, r.getFlightName());
            pst.setString(4, r.getSeatno());
            pst.setString(5, r.getprice());
            pst.setString(6, r.getPaymentType());
            pst.setString(7, r.getTransactionCode());
            
            res = pst.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return res;
    }
    
}
