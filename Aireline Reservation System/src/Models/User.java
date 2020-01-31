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
public class User {
    
    private String Name;
    private String email;
    private String PassWord;
    private String Phone;
    private String DOB;
    private String Gender;
    
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setPassword(String PassWord) {
        this.PassWord = PassWord;
    }
    
    public String getPassword() {
        return PassWord;
    }
     public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    public String getPhone() {
        return Phone;
    }
     public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
    public String getDOB() {
        return DOB;
    }
     public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    public String getGender() {
        return Gender;
    }
}

