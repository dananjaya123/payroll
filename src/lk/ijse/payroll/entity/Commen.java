/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.entity;

/**
 *
 * @author asitha
 */
public class Commen {
    private Employee employee;
    private Deignationdetail deignationdetail;

    public Commen() {
    }

    public Commen(Employee employee, Deignationdetail deignationdetail) {
        this.employee = employee;
        this.deignationdetail = deignationdetail;
    }

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * @return the deignationdetail
     */
    public Deignationdetail getDeignationdetail() {
        return deignationdetail;
    }

    /**
     * @param deignationdetail the deignationdetail to set
     */
    public void setDeignationdetail(Deignationdetail deignationdetail) {
        this.deignationdetail = deignationdetail;
    }
    
}
