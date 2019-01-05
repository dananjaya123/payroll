/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.entity;

/**
 *
 * @author Sachin
 */
public class Salaryadvance {
    private String SAID;
    private String DesDetailID;
    private String SADate;
    private double Amount;

    public Salaryadvance() {
    }

    public Salaryadvance(String SAID, String DesDetailID, String SADate, double Amount) {
        this.SAID = SAID;
        this.DesDetailID = DesDetailID;
        this.SADate = SADate;
        this.Amount = Amount;
    }

    /**
     * @return the SAID
     */
    public String getSAID() {
        return SAID;
    }

    /**
     * @param SAID the SAID to set
     */
    public void setSAID(String SAID) {
        this.SAID = SAID;
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
     * @return the SADate
     */
    public String getSADate() {
        return SADate;
    }

    /**
     * @param SADate the SADate to set
     */
    public void setSADate(String SADate) {
        this.SADate = SADate;
    }

    /**
     * @return the Amount
     */
    public double getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(double Amount) {
        this.Amount = Amount;
    }
    
}
