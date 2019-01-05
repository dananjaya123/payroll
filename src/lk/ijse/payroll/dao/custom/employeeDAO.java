/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom;

import lk.ijse.payroll.dao.CrudDAO;
import lk.ijse.payroll.entity.Employee;
import lk.ijse.payroll.entity.Commen;
import lk.ijse.payroll.model.CommenDTO;

/**
 *
 * @author Sachin
 */
public interface employeeDAO extends CrudDAO<Employee, String>{


    
    public boolean add(CommenDTO commenDTO)throws Exception;

    public boolean addEmp(Commen commens)throws Exception;

    public boolean deleleteEmployee(String empID)throws Exception;
    
}
