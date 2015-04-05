/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.application.Application;
import javafx.scene.control.DatePicker;
import org.controlsfx.control.action.Action;
import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;

public class FXMLDocumentController implements Initializable 
{

@FXML
    private TextArea we;
@FXML
    public  TextField seven;
@FXML
    public static Button cc;
@FXML
    public static Button conti;

@FXML
    public TextField eight;
@FXML
    public TextField nine;
@FXML
    private PasswordField ten;
@FXML
    private PasswordField eleven;
@FXML
    private TextField twelve;
@FXML
    private TextField thirteen;
@FXML
    private TextField forteen;
@FXML
    private TextField one;
@FXML
    private TextField two;

@FXML
    private TextField four;
@FXML
    private TextArea five;
@FXML
    private TextField six;
    


@FXML
    private ComboBox bir;
@FXML
    private ComboBox ms;
@FXML
    private ComboBox cat;
@FXML
    private Label xx;
@FXML
    private Label xxx;
@FXML
private DatePicker dp;
@FXML
private Button ale;
    private Object stage;
   
   

 @FXML
    public void handleButtonAction(ActionEvent event) 
    {
      Action response = Dialogs.create()
        .owner(stage)
        .title("Confirmation ")
        .masthead(" This will clear all the data inputed by you ")
        .message("Are you sure you want to clear the data? ")
        .actions(Dialog.ACTION_YES, Dialog.ACTION_NO)
        .showConfirm();

if (response == Dialog.ACTION_YES) {
     seven.setText("  ");
        eight.setText("  ");
        nine.setText("  ");
        ten.setText("");
        eleven.setText("");
       // twelve.setText("  ");
        thirteen.setText("  ");
        forteen.setText("  ");
      one.setText("  ");
       two.setText("  ");
       //three.setText("  ");
        four.setText("  ");
        six.setText("  ");
        five.setText(" ");
        xx.setText(" ");
        xxx.setText(" ");
} else {
    // ... user chose NO, CANCEL, or closed the dialog
}
        //bir.setText("  ");         
    }
    @FXML
    public void handleButtonAction2(ActionEvent event) 
    {
        int count=0;
        String a = ten.getText();
        String b = eleven.getText();
        String c=four.getText();
        int len=c.length();
        if(!a.equals(b))
        {
           xx.setText("*Passwords do not match"); 
           
        }else{count++;}
        if(!(len==10))
        {
             xxx.setText("*Enter 10 digits Mobile number"); 
        }else{count++;}
        
        String pp=seven.getText();
        String pp1=one.getText();
        String pp2=two.getText();
        String pp3=four.getText();
        String pp4=five.getText();
        String pp5=six.getText();
       // String pp6=eight.getText();
        String pp7=nine.getText();
        String pp8=ten.getText();
        String pp9=eleven.getText();
        String pp10=thirteen.getText();
        String pp11=forteen.getText();
       
       if(pp.equals("")||pp1.equals("")||pp2.equals("")||pp3.equals("")||pp4.equals("")||pp5.equals("")||pp7.equals("")||pp8.equals("")||pp10.equals("")||pp11.equals(""))
       {
       Dialogs.create()
        .owner(stage)
        .title(" ALERT ")
        .masthead(" Missing out something ")
        .message("Mandatory field is empty ")
        .showWarning();
        }
       if(!pp8.equals("")&&pp9.equals(""))
       {
          Dialogs.create()
        .owner(stage)
        .title(" ALERT ")
        .masthead(" Missing out something ")
        .message("Please confirm your password ")
        .showWarning();
        
          
          
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
    }
        // TODO    
}
