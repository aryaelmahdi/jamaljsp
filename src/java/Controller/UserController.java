/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ProductModel;
import Model.UserModel;
import Query.UserQuery;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public class UserController extends BaseController{
    UserQuery query = new UserQuery();
    
    public ResultSet getByUsername(String nama) {
        String sql = this.query.getByUsername;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, nama);
        
        return this.getWithParameter(map, sql);
    }
    
    public ResultSet getusers() {
        String sql = this.query.getusers;
        return this.get(sql);
    }

    public boolean update(String nama, UserModel model) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getPass());
        map.put(2, nama);
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    
    public ResultSet deleteByID(String id) {
        String sql = this.query.delete;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        return this.getWithParameter(map, sql);
    }
    public ResultSet gettrans(String id) {
        String sql = this.query.gettrans;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        return this.getWithParameter(map, sql);
    }
    
}
