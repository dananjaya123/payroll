/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.payroll.dao.custom.employeeDAO;
import lk.ijse.payroll.dao.custom.impl.employeeDAOImpl;
import lk.ijse.payroll.dao.custom.impl.levelDAOImpl;
import lk.ijse.payroll.dao.custom.levelDAO;
import lk.ijse.payroll.entity.Deignationdetail;
import lk.ijse.payroll.entity.Employee;
import lk.ijse.payroll.entity.Commen;
import lk.ijse.payroll.entity.Level;
import lk.ijse.payroll.other.IDgenaratore;

/**
 * FXML Controller class
 *
 * @author asitha
 */
public class employeeController implements Initializable {

    private static levelDAO lAO = new levelDAOImpl();
    @FXML
    private JFXTextField textEmployeeID;
    @FXML
    private JFXTextField textEmployeeName;
    @FXML
    private JFXTextField textDateOfBirth;
    @FXML
    private JFXTextField textNIC;
    @FXML
    private JFXTextField textAddress;
    @FXML
    private JFXTextField textPhoneNUm;
    @FXML
    private JFXComboBox<String> comboLevelId;
    @FXML
    private JFXTextField textPosition;
    @FXML
    private JFXTextField textDDID;
    @FXML
    private JFXTextField textBasicSalary;

    private employeeDAO eDAO = new employeeDAOImpl();
    private levelDAO leDAO=new levelDAOImpl();
    @FXML
    private Label lblDete;
    @FXML
    private TableView<Employee> tableEmployee;
    private TableColumn<Employee, String> colEnployeeLevel;
    @FXML
    private JFXButton btnAdd;
    @FXML
    private JFXButton btnDelete;
    @FXML
    private JFXButton update;
    @FXML
    private TableColumn<Employee, String> colEnployeeID;
    @FXML
    private TableColumn<Employee, String> colEnployeeName;
    @FXML
    private TableColumn<Employee, String> colEmployeeAddress;
    @FXML
    private TableColumn<Employee, String> colDateOfBirth;
    @FXML
    private TableColumn<Employee, String> colPhoneNumber;
    @FXML
    private TableColumn<Employee, String> colNIC;
    @FXML
    private JFXTextField textMedicalFee;
    @FXML
    private AnchorPane pnlLevelAdd;
    @FXML
    private JFXButton btnLevelAdd;

    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        leDAO = new levelDAOImpl();
        loadToCombo();
        lblDete.setText(LocalDate.now().toString());
        try {
            tblEmployeeView();
            setEmployeeID();
        } catch (Exception ex) {
            Logger.getLogger(employeeController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void textEmployeeIDOnAction(ActionEvent event) {
        textEmployeeName.requestFocus();
        
    }

    @FXML
    private void textEmployeeNameOnAction(ActionEvent event) {
        textDateOfBirth.requestFocus();
    }

    @FXML
    private void textDateOfBirthOnAction(ActionEvent event) {
       textNIC.requestFocus();
    }

    @FXML
    private void textNICOnActon(ActionEvent event) {
        textAddress.requestFocus();
    }


    @FXML
    private void textPhoneNUmOnActon(ActionEvent event) {
        comboLevelId.requestFocus();
    }

    @FXML
    private void addOnAction(ActionEvent event) throws Exception {
        Employee employee = new Employee(textEmployeeID.getText(), textEmployeeName.getText(), textDateOfBirth.getText(), textNIC.getText(), textAddress.getText(), Integer.parseInt(textPhoneNUm.getText()));
        Deignationdetail deignationdetailDTO = new Deignationdetail(textDDID.getText(), textEmployeeID.getText(), comboLevelId.getSelectionModel().getSelectedItem(), lblDete.getText());
        Commen commens = new Commen(employee, deignationdetailDTO);
        boolean isAdded = eDAO.addEmp(commens);
        if (isAdded) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "ERROR ADD", ButtonType.OK);
            a.show();
            clearTextFields();
            
        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Added", ButtonType.OK);
            a.show();
        }
    }

    @FXML
    private void deleteOnAction(ActionEvent event) {
        try {
            String empID= tableEmployee.getSelectionModel().getSelectedItem().getEmpID();
            if (eDAO.deleleteEmployee(empID)) {
                new Alert(Alert.AlertType.CONFIRMATION, "SUCCESS DELETE", ButtonType.OK).show();
            } else {
                new Alert(Alert.AlertType.ERROR, "ERROR DELETE", ButtonType.OK).show();
            }
        } catch (Exception ex) {
            Logger.getLogger(employeeController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }


    void loadToCombo() {
        try {
            ArrayList<Level> all = lAO.getAll();
            ArrayList<String> s = new ArrayList<>();
            for (Level a : all) {
                s.add(a.getLvlID());

            }
            comboLevelId.getItems().addAll(s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearTextFields() {
        textAddress.clear();
        textBasicSalary.clear();
        textDDID.clear();
        textDateOfBirth.clear();
        textEmployeeName.clear();
        textNIC.clear();
        textPhoneNUm.clear();
        textPosition.clear();
    }

    private void tblEmployeeView() throws Exception {
        tableEmployee.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("EmpID"));
        tableEmployee.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("EmpName"));
        tableEmployee.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("DOB"));
        tableEmployee.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("NIC"));
        tableEmployee.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("Address"));
        tableEmployee.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("MobileNumber"));
        

        tableEmployee.setItems(FXCollections.observableArrayList(eDAO.getAll()));

    }

    @FXML
    private void textAddressOaction(ActionEvent event) {
        textPhoneNUm.requestFocus();
    }

    @FXML
    private void updateOnAction(ActionEvent event) {
    }
// ParkingAreaDTO searchParkingArea = parkingAreaBO.searchParkingAreaByVehicleCategory(cmboVehicleCategory.getValue());
  //      textParkingArea.setText(searchParkingArea.getArea_Name());

    @FXML
    private void comboLevelIdOnAction(ActionEvent event) {
        try {
            Level searLever=leDAO.search(comboLevelId.getValue());
            textPosition.setText(searLever.getPosition());
            textBasicSalary.setText(""+searLever.getBasic_Salary());
            textMedicalFee.setText(""+searLever.getMedicalFee());
        } catch (Exception ex) {
            Logger.getLogger(employeeController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void textPositionOnActon(ActionEvent event) {
    }

    @FXML
    private void textDDIDOnAction(ActionEvent event) {
    }

    @FXML
    private void textBasicSalaryOnAction(ActionEvent event) {
    }


    private void setEmployeeID() {
        try {
            String EmpID;
            EmpID = IDgenaratore.getNewID("Employee", "EmpID", "E");
            textEmployeeID.setText(EmpID);
        } catch (SQLException ex) {

        } catch (ClassNotFoundException ex) {

     }
        
        try {
            String ddID;
            ddID = IDgenaratore.getNewID("DeignationDetail", "DesDetailID", "E");
            textDDID.setText(ddID);
        } catch (SQLException ex) {

        } catch (ClassNotFoundException ex) {

     }
 }

    @FXML
    private void textMedicalFeeOnacton(ActionEvent event) {
    }

    @FXML
    private void btnLevelAddOnAction(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(this.getClass().getResource("/lk/ijse/payroll/view/LevelAdd.fxml"));
        pnlLevelAdd.getChildren().setAll(pane);
    }
}