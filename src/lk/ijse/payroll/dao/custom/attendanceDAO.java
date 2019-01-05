/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom;

import lk.ijse.payroll.dao.CrudDAO;
import lk.ijse.payroll.entity.Attendance;

/**
 *
 * @author Sachin
 */
public interface attendanceDAO extends CrudDAO<Attendance, String>{

    public boolean addAttendance(Attendance attend)throws Exception;
    
}
