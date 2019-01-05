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
public class Net_salary {
    private String N_SalID;
    private String DesDetailID;
    private String ETF;
    private String EPF;
    private String OT;
    private double salaryBasic;
    private double sal_Advance;
    private double NO_Pay;
    private double Sal_Date;

    public Net_salary() {
    }

    public Net_salary(String N_SalID, String DesDetailID, String ETF, String EPF, String OT, double salaryBasic, double sal_Advance, double NO_Pay, double Sal_Date) {
        this.N_SalID = N_SalID;
        this.DesDetailID = DesDetailID;
        this.ETF = ETF;
        this.EPF = EPF;
        this.OT = OT;
        this.salaryBasic = salaryBasic;
        this.sal_Advance = sal_Advance;
        this.NO_Pay = NO_Pay;
        this.Sal_Date = Sal_Date;
    }

    /**
     * @return the N_SalID
     */
    public String getN_SalID() {
        return N_SalID;
    }

    /**
     * @param N_SalID the N_SalID to set
     */
    public void setN_SalID(String N_SalID) {
        this.N_SalID = N_SalID;
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
     * @return the ETF
     */
    public String getETF() {
        return ETF;
    }

    /**
     * @param ETF the ETF to set
     */
    public void setETF(String ETF) {
        this.ETF = ETF;
    }

    /**
     * @return the EPF
     */
    public String getEPF() {
        return EPF;
    }

    /**
     * @param EPF the EPF to set
     */
    public void setEPF(String EPF) {
        this.EPF = EPF;
    }

    /**
     * @return the OT
     */
    public String getOT() {
        return OT;
    }

    /**
     * @param OT the OT to set
     */
    public void setOT(String OT) {
        this.OT = OT;
    }

    /**
     * @return the salaryBasic
     */
    public double getSalaryBasic() {
        return salaryBasic;
    }

    /**
     * @param salaryBasic the salaryBasic to set
     */
    public void setSalaryBasic(double salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    /**
     * @return the sal_Advance
     */
    public double getSal_Advance() {
        return sal_Advance;
    }

    /**
     * @param sal_Advance the sal_Advance to set
     */
    public void setSal_Advance(double sal_Advance) {
        this.sal_Advance = sal_Advance;
    }

    /**
     * @return the NO_Pay
     */
    public double getNO_Pay() {
        return NO_Pay;
    }

    /**
     * @param NO_Pay the NO_Pay to set
     */
    public void setNO_Pay(double NO_Pay) {
        this.NO_Pay = NO_Pay;
    }

    /**
     * @return the Sal_Date
     */
    public double getSal_Date() {
        return Sal_Date;
    }

    /**
     * @param Sal_Date the Sal_Date to set
     */
    public void setSal_Date(double Sal_Date) {
        this.Sal_Date = Sal_Date;
    }
    
    
}
