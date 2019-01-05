/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.payroll.dao.CrudUtil;
import lk.ijse.payroll.dao.custom.levelDAO;
import lk.ijse.payroll.entity.Level;



/**
 *
 * @author Sachin
 */
public class levelDAOImpl implements levelDAO{

    @Override
    public ArrayList<String> getLevelID() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Level entity) throws Exception {
        return CrudUtil.executeUpdate("call LevelAdd(?,?,?,?)",entity.getLvlID(),entity.getPosition(),entity.getBasic_Salary(),entity.getMedicalFee())>0;

    }

    @Override
    public boolean update(Level entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Level search(String id) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("call SEARCHLEVEL(?)",id);
        while (rst.next()) {            
            return new Level(rst.getString(1),rst.getString(2),rst.getDouble(3),rst.getDouble(4));
        }
        return null;
    }

    @Override
    public ArrayList<Level> getAll() throws Exception {
        ArrayList<Level> alLevel = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("CALL SEARCHCOMBOEMPLOYEE()");
        while(rst.next()){
            alLevel.add(new Level(rst.getString(1),rst.getString(2),rst.getDouble(3),rst.getDouble(4)));
        }
        return alLevel;
    }

    @Override
    public boolean add(java.util.logging.Level lev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
