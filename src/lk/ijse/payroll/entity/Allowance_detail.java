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
public class Allowance_detail {
    private String LvlID;
    private String Allowance_ID;

    public Allowance_detail() {
    }

    public Allowance_detail(String LvlID, String Allowance_ID) {
        this.LvlID = LvlID;
        this.Allowance_ID = Allowance_ID;
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
     * @return the Allowance_ID
     */
    public String getAllowance_ID() {
        return Allowance_ID;
    }

    /**
     * @param Allowance_ID the Allowance_ID to set
     */
    public void setAllowance_ID(String Allowance_ID) {
        this.Allowance_ID = Allowance_ID;
    }
    
    
}
