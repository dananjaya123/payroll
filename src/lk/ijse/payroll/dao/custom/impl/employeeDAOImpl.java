/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.payroll.dao.CrudUtil;
import lk.ijse.payroll.dao.custom.employeeDAO;
import lk.ijse.payroll.entity.Employee;
import lk.ijse.payroll.entity.Commen;
import lk.ijse.payroll.model.CommenDTO;

/**
 *
 * @author Sachin
 */
public class employeeDAOImpl implements employeeDAO {

    @Override
    public boolean add(Employee entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Employee entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Employee> getAll() throws Exception {
        ArrayList<Employee> emp = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery(" call GETALLEMPLOYEE() ");
        while (rst.next()) {
            emp.add(new Employee(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getInt(6)));
        }
        return emp;

    }

    @Override
    public boolean add(CommenDTO commenDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addEmp(Commen commens) throws Exception {
        return CrudUtil.executeUpdate("CALL AddEmployee(?,?,?,?,?,?,?,?,?)", commens.getEmployee().getEmpID(),
                commens.getEmployee().getEmpName(),
                commens.getEmployee().getDOB(),
                commens.getEmployee().getNIC(),
                commens.getEmployee().getAddress(),
                commens.getEmployee().getMobileNumber(),
                commens.getDeignationdetail().getDesDetailID(),
                commens.getDeignationdetail().getLvlID(),
                commens.getDeignationdetail().getDesDate()) > 0;

    }

    @Override
    public boolean deleleteEmployee(String empID) throws Exception {
        return  CrudUtil.executeUpdate("call DeleteEmployee(?)",empID)>0;
    }

}
