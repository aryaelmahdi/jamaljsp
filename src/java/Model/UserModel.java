/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LENOVO
 */
public class UserModel {
    private String Login;
    private String Nama;
    private String Pass;
    
    public String getLogin(){
        return Login;
    }
    
    public void setLogin(String Login){
        this.Login = Login;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(){
        this.Nama = Nama;
    }
    
    public String getPass(){
        return Pass;
    }
    
    public void setPass(String Pass){
        this.Pass = Pass;
    }
}
