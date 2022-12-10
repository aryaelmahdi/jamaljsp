/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Query;

/**
 *
 * @author LENOVO
 */
public class ProductQuery {
    public String create_trans = "INSERT INTO transaction (nama, IGN, UserID, " + 
            "Product, Payment) VALUES (?, ?, ?, ?, ?)";
    public String create_trans1 = "INSERT INTO transaction (IGN, UserID, " + 
            "Product, Payment) VALUES (?, ?, ?, ?)";
    public String delete = "DELETE FROM transaction WHERE UserID = ?";
    public String update = "UPDATE transaction SET Payment = ?"
            + "Product = ? WHERE UserID = ?";
    public String getByName = "SELECT * FROM transaction where nama = ?";
    public String get = "SELECT IGN, UserID, Payment, Product FROM transaction where nama = ?";
}
