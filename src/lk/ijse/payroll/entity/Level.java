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
public class Level {
    private String LvlID;
    private String Position;
    private double Basic_Salary;
    private double MedicalFee;

    public Level() {
    }

    public Level(String LvlID, String Position, double Basic_Salary, double MedicalFee) {
        this.LvlID = LvlID;
        this.Position = Position;
        this.Basic_Salary = Basic_Salary;
        this.MedicalFee = MedicalFee;
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
     * @return the Position
     */
    public String getPosition() {
        return Position;
    }

    /**
     * @param Position the Position to set
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * @return the Basic_Salary
     */
    public double getBasic_Salary() {
        return Basic_Salary;
    }

    /**
     * @param Basic_Salary the Basic_Salary to set
     */
    public void setBasic_Salary(double Basic_Salary) {
        this.Basic_Salary = Basic_Salary;
    }

    /**
     * @return the MedicalFee
     */
    public double getMedicalFee() {
        return MedicalFee;
    }

    /**
     * @param MedicalFee the MedicalFee to set
     */
    public void setMedicalFee(double MedicalFee) {
        this.MedicalFee = MedicalFee;
    }
    
    
}
