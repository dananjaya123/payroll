/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javax.swing.text.html.HTML;
import lk.ijse.payroll.dao.custom.attendanceDAO;
import lk.ijse.payroll.dao.custom.deignationdetailDAO;
import lk.ijse.payroll.dao.custom.impl.attendanceDAOImpl;
import lk.ijse.payroll.dao.custom.impl.deignationdetailDAOImpl;
import lk.ijse.payroll.dao.custom.impl.tempDAOImpl;
import lk.ijse.payroll.dao.custom.tempDAO;
import lk.ijse.payroll.entity.Attendance;
import lk.ijse.payroll.entity.Deignationdetail;
import lk.ijse.payroll.entity.Temp;
import lk.ijse.payroll.other.IDgenaratore;

/**
 * FXML Controller class
 *
 * @author asitha
 */
public class AttendnceController implements Initializable {

    @FXML
    private JFXTextField textDesDetailID;
    @FXML
    private JFXTextField textEmpID;
    @FXML
    private Label lblAttendnceDate;
    @FXML
    private Label lblInTime;
    @FXML
    private Label lblOutTime;
    @FXML
    private JFXButton btnInTime;
    @FXML
    private JFXButton btnOutTime;
    @FXML
    private JFXTextField texAttendnceID;
    @FXML
    private JFXTextField textLeveID;
    @FXML
    private JFXTextField textOTHour;
    @FXML
    private JFXTextField textOTRate;
    @FXML
    private JFXTextField textOTAmount;
    @FXML
    private TableView<Temp> tableAttendance;
    @FXML
    private TableColumn<Temp, String> columEmployeeId;
    @FXML
    private TableColumn<Temp, String> columInTime;
    deignationdetailDAO deisDAO =new deignationdetailDAOImpl();
    tempDAO tempDao=new tempDAOImpl();
    @FXML
    private TableColumn<Temp, String> columAttendanceId;
    @FXML
    private TableColumn<Temp, String> columDesDetailID;
    @FXML
    private TableColumn<Temp, String> columLevelID;
    
    private static tempDAO temDAO= new tempDAOImpl();
    @FXML
    private TableColumn<?, ?> columDate;
    private Label lblInTime2;
    private Label lblInTime1;
    private Label lblIdate1;
    
    attendanceDAO aDAO=new attendanceDAOImpl();
    @FXML
    private Label lblIntme2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            loadTable();
            setEmployeeID();
            lblAttendnceDate.setText(LocalDate.now().toString());
            lblInTime.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
            lblOutTime.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
        } catch (Exception ex) {
            Logger.getLogger(AttendnceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void texAttendnceOnAction(ActionEvent event) {
    }

    @FXML
    private void IntimeOnAction(ActionEvent event) throws Exception { 
        String OutTime="00.00";
        Temp temp=new Temp(texAttendnceID.getText(), textDesDetailID.getText(),textLeveID.getText(),textEmpID.getText(), lblAttendnceDate.getText(),lblInTime.getText(),OutTime );
        boolean isAdded=tempDao.add(temp);
         if (isAdded) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Added", ButtonType.OK);
            a.show();
           
            
        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Error in Added", ButtonType.OK);
            a.show();
        }
         
    }

    @FXML
    private void OutTimeOnAction(ActionEvent event) throws Exception {
        LocalTime lt= LocalTime.now();
        LocalTime time=lt;
        int hour = time.getHour();
        String inTim = lblIntme2.getText();
        String suBTIme=inTim.substring(0,2);
        int inTimeHour=Integer.parseInt(suBTIme);
        System.out.println(inTimeHour);
        System.out.println(hour);
        int timeOt=hour-inTimeHour;
        String ststus="is Out";
        
        int oiHouta=timeOt-8;
        textOTHour.setText(""+oiHouta);
        double totl=oiHouta*200;
        textOTAmount.setText(""+totl);
        
        Attendance attend = new Attendance(texAttendnceID.getText(), textDesDetailID.getText(),textLeveID.getText(),lblAttendnceDate.getText(),lblIntme2.getText(), lblInTime.getText(),ststus, timeOt);
        boolean isAdded=aDAO.addAttendance(attend);
        
       
    }

    private void setEmployeeID() {
       try {
            String AID;
            AID = IDgenaratore.getNewID("Attendance", "AtendanceID ", "A");
            texAttendnceID.setText(AID);
        } catch (SQLException ex) {

        } catch (ClassNotFoundException ex) {

     }
    }

    @FXML
    private void textDesDetailIDOnAction(ActionEvent event) {
        try {
            Deignationdetail searLever=deisDAO.search(textDesDetailID.getText());
            textEmpID.setText(searLever.getEmpID());
            textLeveID.setText(""+searLever.getLvlID());
        } catch (Exception ex) {
            Logger.getLogger(employeeController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void textEmpIDOnAction(ActionEvent event) {
    }

    @FXML
    private void textLevelIDOnActon(ActionEvent event) {
    }

    @FXML
    private void textOTHourOnAction(ActionEvent event) {
    }

    @FXML
    private void textOTRateOnAction(ActionEvent event) {
    }

    @FXML
    private void textOTAmountOnAction(ActionEvent event) {
    }


    @FXML
    private void textDesDetailIDKeyReleased(KeyEvent event)throws Exception{
//         
    }

    private void loadTable()throws Exception{
        tableAttendance.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("AtendanceID"));
        tableAttendance.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("DesDetailID"));
        tableAttendance.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("LvlID"));
        tableAttendance.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("EmpID"));
        tableAttendance.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("INTime"));
        tableAttendance.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("ATDate"));

        

        tableAttendance.setItems(FXCollections.observableArrayList(temDAO.getAll()));

    }

    @FXML
    private void tableMouseClicked(MouseEvent event) {
//        btnInTime.setDisable(true);
        Temp temp = tableAttendance.getSelectionModel().getSelectedItem();
        texAttendnceID.setText(temp.getAtendanceID());
        textDesDetailID.setText(temp.getDesDetailID());
        textLeveID.setText(temp.getLvlID());
        textEmpID.setText(temp.getEmpID());
        lblIntme2.setText(temp.getINTime());
//        lblIdate1.setText(temp.getATDate());
        
        try {
            
            
           tableAttendance.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("AtendanceID"));
        tableAttendance.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("DesDetailID"));
        tableAttendance.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("LvlID"));
        tableAttendance.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("EmpID"));
        tableAttendance.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("INTime"));
//        tableAttendance.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("ATDate"));
        
            ArrayList<Temp> aa = temDAO.getAll();
            tableAttendance.setItems(FXCollections.observableArrayList(aa));
        } catch (Exception ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
}
