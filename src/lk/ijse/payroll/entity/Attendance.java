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
public class Attendance {

    private String AtendanceID;
    private String DesDetailID;
    private String LvlID;
    private String ATDate;
    private String INTime;
    private String OutTime;
    private String  ISCome;
    private int OT;

    public Attendance() {
    }

    public Attendance(String AtendanceID, String DesDetailID, String LvlID, String ATDate, String INTime, String OutTime, String ISCome, int OT) {
        this.AtendanceID = AtendanceID;
        this.DesDetailID = DesDetailID;
        this.LvlID = LvlID;
        this.ATDate = ATDate;
        this.INTime = INTime;
        this.OutTime = OutTime;
        this.ISCome = ISCome;
        this.OT = OT;
    }

    /**
     * @return the AtendanceID
     */
    public String getAtendanceID() {
        return AtendanceID;
    }

    /**
     * @param AtendanceID the AtendanceID to set
     */
    public void setAtendanceID(String AtendanceID) {
        this.AtendanceID = AtendanceID;
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
     * @return the ATDate
     */
    public String getATDate() {
        return ATDate;
    }

    /**
     * @param ATDate the ATDate to set
     */
    public void setATDate(String ATDate) {
        this.ATDate = ATDate;
    }

    /**
     * @return the INTime
     */
    public String getINTime() {
        return INTime;
    }

    /**
     * @param INTime the INTime to set
     */
    public void setINTime(String INTime) {
        this.INTime = INTime;
    }

    /**
     * @return the OutTime
     */
    public String getOutTime() {
        return OutTime;
    }

    /**
     * @param OutTime the OutTime to set
     */
    public void setOutTime(String OutTime) {
        this.OutTime = OutTime;
    }

    /**
     * @return the ISCome
     */
    public String getISCome() {
        return ISCome;
    }

    /**
     * @param ISCome the ISCome to set
     */
    public void setISCome(String ISCome) {
        this.ISCome = ISCome;
    }

    /**
     * @return the OT
     */
    public int getOT() {
        return OT;
    }

    /**
     * @param OT the OT to set
     */
    public void setOT(int OT) {
        this.OT = OT;
    }

   

}
