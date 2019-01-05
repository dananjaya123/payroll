/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom;

import java.util.ArrayList;
import lk.ijse.payroll.dao.CrudDAO;
import lk.ijse.payroll.entity.Level;

/**
 *
 * @author Sachin
 */
public interface levelDAO extends CrudDAO<Level, String>{

    public ArrayList<String> getLevelID()throws Exception;

    public boolean add(java.util.logging.Level lev);
    
}
