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
public class UserQuery {
    public String getByUsername = "SELECT * FROM users WHERE loginid = ?";
    public String getByName = "SELECT * FROM users where nama = ?";
    public String getusers = "SELECT loginid, password FROM users where nama = ?";
    public String update = "UPDATE users SET password = ? where nama = ?";
    public String delete = "DELETE FROM transaction WHERE id_tr = ?";
    public String gettrans = "SELECT * FROM transaction where UserID = ?";
}
