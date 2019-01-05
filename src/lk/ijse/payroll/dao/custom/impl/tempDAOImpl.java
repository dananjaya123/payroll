/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.payroll.dao.CrudUtil;
import lk.ijse.payroll.dao.custom.tempDAO;
import lk.ijse.payroll.entity.Temp;

/**
 *
 * @author asitha
 */
public class tempDAOImpl implements tempDAO {

    
    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public ArrayList<Temp> getAll() throws Exception {
       ArrayList<Temp> emp= new ArrayList<>();
       ResultSet rst=CrudUtil.executeQuery("call loodTemp()");
        while (rst.next()) {            
            emp.add(new Temp(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7)));
        }
        return emp;
    }

    @Override
    public boolean add(Temp temp) throws Exception {
        return CrudUtil.executeUpdate("CALL TEMP(?,?,?,?,?,?,?)",temp.getAtendanceID(),temp.getDesDetailID(),temp.getLvlID(),temp.getEmpID(),temp.getATDate(),temp.getINTime(),temp.getOutTime())>0;
    
    }

    @Override
    public boolean update(Temp entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Temp search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
