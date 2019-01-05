/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author asitha
 */
public class Home implements Initializable {

    @FXML
    private ImageView immageAttendence;
    @FXML
    private JFXButton btnAddEnployee;
    @FXML
    private ImageView imageAddEmployee;
    @FXML
    private JFXButton btnPayment;
    @FXML
    private ImageView imgPayment;
    @FXML
    private Label btnClose;
    @FXML
    private AnchorPane pnlMan;
    @FXML
    private JFXButton btnAttendence;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void immageParkinExited(MouseEvent event) {
    }

    @FXML
    private void immageParkinEntered(MouseEvent event) {
    }

    @FXML
    private void btnParkinClicked(MouseEvent event) {
    }

    @FXML
    private void imageFeeExited(MouseEvent event) {
    }

    @FXML
    private void imageFeeEntered(MouseEvent event) {
    }

    @FXML
    private void btnAddOnAction(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(this.getClass().getResource("/lk/ijse/payroll/view/empoly.fxml"));
        pnlMan.getChildren().setAll(pane);
    }

    @FXML
    private void imageReportExited(MouseEvent event) {
    }

    @FXML
    private void imageReportEntered(MouseEvent event) {
    }

    @FXML
    private void btnReportClicked(MouseEvent event) {
    }

    @FXML
    private void systemIfoOnClick(MouseEvent event) {
    }

    @FXML
    private void btnAttendenceOnaction(ActionEvent event) throws IOException {
        AnchorPane pan=FXMLLoader.load(this.getClass().getResource("/lk/ijse/payroll/view/Attendance.fxml"));
        pnlMan.getChildren().setAll(pan);
    }
    
}
