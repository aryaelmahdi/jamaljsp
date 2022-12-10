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
public class ProductModel {
    private String username;
    private String uid;
    private String product;
    private String pay;
    private String id;
    
    public String getUsername() {
    return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUid() {
    return uid;
    }
    
    public void setUid(String uid) {
        this.uid = uid;
    }
    
    public String getProduct() {
        return product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }
    
    public String getPay() {
        return pay;
    }
    
    public void setPay(String pay) {
        this.pay = pay;
    }
    
    public String getId() {
        return id;
    }
    
    public void getId(String id){
        this.id = id;
    }
}
