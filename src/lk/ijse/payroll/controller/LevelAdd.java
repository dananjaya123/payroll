/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import lk.ijse.payroll.dao.custom.impl.levelDAOImpl;
import lk.ijse.payroll.dao.custom.levelDAO;
import lk.ijse.payroll.entity.Level;

/**
 * FXML Controller class
 *
 * @author asitha
 */
public class LevelAdd implements Initializable {

    @FXML
    private JFXTextField textPositionAdd;
    @FXML
    private JFXTextField textBasicSalaryAdd;
    @FXML
    private JFXTextField textMedicalFeeAdd;
    @FXML
    private JFXButton btnAdd;
    @FXML
    private JFXButton btnBack;
    
    private levelDAO leDAO= new levelDAOImpl();
    @FXML
    private JFXTextField textLevel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void textPositionAddOnActon(ActionEvent event) {
    }

    @FXML
    private void textBasicSalaryAddOnAction(ActionEvent event) {
    }

    @FXML
    private void textMedicalFeeAddOnacton(ActionEvent event) {
    }

    @FXML
    private void btnAddOnAction(ActionEvent event) throws Exception {
        Level lev = new Level(textLevel.getText(), textPositionAdd.getText(),Double.parseDouble(textBasicSalaryAdd.getText()),Double.parseDouble(textMedicalFeeAdd.getText()));
        boolean isAdded=leDAO.add(lev);
         if (isAdded) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Added", ButtonType.OK);
            a.show();
           
            
        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "ERROR ADD", ButtonType.OK);
            a.show();
        }
        
    }

    @FXML
    private void btnBackOnAction(ActionEvent event) throws Exception {
        
         
    }
    

    private void clearTextFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void TextLevelOnAction(ActionEvent event) {
    }

    private static class extMedicalFeeAdd {

    }


}