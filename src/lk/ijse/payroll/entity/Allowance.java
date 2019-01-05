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
public class Allowance {
    private String Allowance_ID;
    private double Food_VAL;
    private double Transport_VAL;
    private double Medical_VAL;

    public Allowance() {
    }

    public Allowance(String Allowance_ID, double Food_VAL, double Transport_VAL, double Medical_VAL) {
        this.Allowance_ID = Allowance_ID;
        this.Food_VAL = Food_VAL;
        this.Transport_VAL = Transport_VAL;
        this.Medical_VAL = Medical_VAL;
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

    /**
     * @return the Food_VAL
     */
    public double getFood_VAL() {
        return Food_VAL;
    }

    /**
     * @param Food_VAL the Food_VAL to set
     */
    public void setFood_VAL(double Food_VAL) {
        this.Food_VAL = Food_VAL;
    }

    /**
     * @return the Transport_VAL
     */
    public double getTransport_VAL() {
        return Transport_VAL;
    }

    /**
     * @param Transport_VAL the Transport_VAL to set
     */
    public void setTransport_VAL(double Transport_VAL) {
        this.Transport_VAL = Transport_VAL;
    }

    /**
     * @return the Medical_VAL
     */
    public double getMedical_VAL() {
        return Medical_VAL;
    }

    /**
     * @param Medical_VAL the Medical_VAL to set
     */
    public void setMedical_VAL(double Medical_VAL) {
        this.Medical_VAL = Medical_VAL;
    }
    
    
 
}
