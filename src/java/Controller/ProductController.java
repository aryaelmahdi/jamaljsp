/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Helper.StringHelper;
import Model.ProductModel;
import Query.ProductQuery;
import Query.UserQuery;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public class ProductController extends BaseController {
    
    UserQuery uq = new UserQuery();
    ProductQuery query = new ProductQuery();
    
    public ResultSet get() {
        String sql = this.query.get;
        return this.get(sql);
    }
    
    public boolean create(ProductModel model) throws ParseException {
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getUsername());
        map.put(2, model.getUid());
        map.put(3, model.getProduct());
        map.put(4, model.getPay());
        String sql = this.query.create_trans1;
        return this.preparedStatement(map, sql);
    }
    public boolean create(ProductModel model, String nama) throws ParseException {
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, nama);
        System.out.println(nama);
        map.put(2, model.getUsername());
        System.out.println(model.getUsername());
        map.put(3, model.getUid());
        System.out.println(model.getUid());
        map.put(4, model.getProduct());
        System.out.println(model.getProduct());
        map.put(5, model.getPay());
        System.out.println(model.getPay());
        String sql = this.query.create_trans;
        return this.preparedStatement(map, sql);
    }
    
    public ResultSet getByName(String Username) {
        String sql = this.query.getByName;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, Username);
        
        return this.getWithParameter(map, sql);
    }
    
    public boolean delete(String UserID) throws ParseException {
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, UserID);
        
        String sql = this.query.delete;
        return this.preparedStatement(map, sql);
    }
    
    ////////////////////////////////////////////////////////////////////
    
}