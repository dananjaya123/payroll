/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom.impl;

import java.util.ArrayList;
import lk.ijse.payroll.dao.CrudUtil;
import lk.ijse.payroll.dao.custom.attendanceDAO;
import lk.ijse.payroll.entity.Attendance;


/**
 *
 * @author Sachin
 */
public class attendanceDAOImpl implements attendanceDAO{

    @Override
    public boolean add(Attendance entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Attendance entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Attendance search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Attendance> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAttendance(Attendance attend) throws Exception {
        return CrudUtil.executeUpdate("call AddAttendence(?,?,?,?,?,?,?,?)", attend.getAtendanceID(),attend.getDesDetailID(),attend.getLvlID(),attend.getATDate(),attend.getINTime(),attend.getOutTime(),attend.getISCome(),attend.getOT())>0;
    }

  

  
}
