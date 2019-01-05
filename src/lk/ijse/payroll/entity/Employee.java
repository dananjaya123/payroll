/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.entity;

import lk.ijse.payroll.entity.*;

/**
 *
 * @author Sachin
 */
public class Employee {
   private String EmpID;
   private String EmpName;
   private String DOB;
   private String NIC;
   private String Address;
   private int MobileNumber;

    public Employee() {
    }

    public Employee(String EmpID, String EmpName, String DOB, String NIC, String Address, int MobileNumber) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.DOB = DOB;
        this.NIC = NIC;
        this.Address = Address;
        this.MobileNumber = MobileNumber;
    }

    /**
     * @return the EmpID
     */
    public String getEmpID() {
        return EmpID;
    }

    /**
     * @param EmpID the EmpID to set
     */
    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    /**
     * @return the EmpName
     */
    public String getEmpName() {
        return EmpName;
    }

    /**
     * @param EmpName the EmpName to set
     */
    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the MobileNumber
     */
    public int getMobileNumber() {
        return MobileNumber;
    }

    /**
     * @param MobileNumber the MobileNumber to set
     */
    public void setMobileNumber(int MobileNumber) {
        this.MobileNumber = MobileNumber;
    }

   
            
}
