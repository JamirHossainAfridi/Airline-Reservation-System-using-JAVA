/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author JAMIR AFRIDI
 */
public class Reserve {
    private String Name;
    private String Phone;
    private String FlightName;
    private String Seatno;
    private String price;
    private String PaymentType;
    private String TransactionCode;
    
    
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getName() {
        return Name;
    }
    
     public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    public String getPhone() {
        return Phone;
    }
     public void setFlightName(String FlightName) {
        this.FlightName = FlightName;
    }
    
    public String getFlightName() {
        return FlightName;
    }
     public void setSeatno(String Seatno) {
        this.Seatno = Seatno;
    }
    
    public String getSeatno() {
        return Seatno;
    }
    public void setprice(String price) {
        this.price = price;
    }
    
    public String getprice() {
        return price;
    }
     public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }
    
    public String getPaymentType() {
        return PaymentType;
    }
    public void setTransactionCode(String TransactionCode) {
        this.TransactionCode = TransactionCode;
    }
    
    public String getTransactionCode() {
        return TransactionCode;
    }
}
