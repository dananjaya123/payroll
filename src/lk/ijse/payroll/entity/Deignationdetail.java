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
public class Deignationdetail {
   private String DesDetailID;
   private String EmpID;
   private String LvlID;
   private String DesDate;

    public Deignationdetail() {
    }

    public Deignationdetail(String DesDetailID, String EmpID, String LvlID, String DesDate) {
        this.DesDetailID = DesDetailID;
        this.EmpID = EmpID;
        this.LvlID = LvlID;
        this.DesDate = DesDate;
    }

    /**
     * @return the DesDetailID
     */
    public String getDesDetailID() {
        return DesDetailID;
    }

    /**
     * @param DesDetailID the DesDetailID to set
     */
    public void setDesDetailID(String DesDetailID) {
        this.DesDetailID = DesDetailID;
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
     * @return the LvlID
     */
    public String getLvlID() {
        return LvlID;
    }

    /**
     * @param LvlID the LvlID to set
     */
    public void setLvlID(String LvlID) {
        this.LvlID = LvlID;
    }

    /**
     * @return the DesDate
     */
    public String getDesDate() {
        return DesDate;
    }

    /**
     * @param DesDate the DesDate to set
     */
    public void setDesDate(String DesDate) {
        this.DesDate = DesDate;
    }
   
}
