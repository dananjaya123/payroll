/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dao;

import lk.ijse.payroll.dao.custom.impl.allowanceDAOImpl;
import lk.ijse.payroll.dao.custom.impl.allowance_detailDAOImpl;
import lk.ijse.payroll.dao.custom.impl.attendanceDAOImpl;
import lk.ijse.payroll.dao.custom.impl.deignationdetailDAOImpl;
import lk.ijse.payroll.dao.custom.impl.employeeDAOImpl;
import lk.ijse.payroll.dao.custom.impl.levelDAOImpl;
import lk.ijse.payroll.dao.custom.impl.net_salaryDAOImpl;
import lk.ijse.payroll.dao.custom.impl.salaryadvanceDAOImpl;


/**
 *
 * @author Sachin
 */
public class DAOFactory {

    public enum DAOTypes {
        allowance,
        allowance_detail,
        attendance,
        deignationdetail,
        employee,
        level,
        net_salary,
        salaryadvance;
    }

    public static DAOFactory dAOFactory;

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        if (dAOFactory == null) {
            dAOFactory = new DAOFactory();
        }
        return dAOFactory;
    }

    public <T> T getDAO(DAOTypes dAOTypes) {
        switch (dAOTypes) {
            case allowance:
                return (T) new allowanceDAOImpl();
            case allowance_detail:
                return (T) new allowance_detailDAOImpl();
            case attendance:
                return (T) new attendanceDAOImpl();
            case deignationdetail:
                return (T) new deignationdetailDAOImpl();
            case employee:
                return (T) new employeeDAOImpl();
            case level:
                return (T) new levelDAOImpl();
            case net_salary:
                return (T) new net_salaryDAOImpl();
            case salaryadvance:
                return (T) new salaryadvanceDAOImpl();
            default:
                return null;

        }

    }
}
