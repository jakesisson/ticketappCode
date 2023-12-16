package com.example.ticketproject;
//Deleted from implementation exists still in case of implementing customer login controls

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
//import static com.example.ticketproject.Login_Util.registerUser;
//import static com.example.ticketproject.Login_Util.validateLogin;
import static com.example.ticketproject.LoginValidator.validateLogin;
import static com.example.ticketproject.LoginValidator.registerUser;


public class CustomerLoginController implements Initializable {
    @FXML
    private TextField UsernameTextField;

    @FXML
    private TextField PasswordTextField;

    @FXML
    private Button SubmitButton;

    @FXML
    private CheckBox NewUserCheck;

    @FXML
    private Label errorLabel;

    private Stage stage;
    private Scene mainScene;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    Boolean NewUser = false;

    Boolean validUser;

    @FXML
    private void NewUserChecked(ActionEvent event){

        if(NewUserCheck.isSelected()){
            NewUser=true;
        }
        else {
            NewUser=false;
        }


    }

    @FXML
    private void SubmitButtonPressed(ActionEvent event){
        try {
            String enteredUsername = new String(UsernameTextField.getText());
            String enteredPassword = new String(PasswordTextField.getText());

            if(NewUser){
                validUser=registerUser(enteredUsername,enteredPassword,true);
            }
            else {
                validUser=validateLogin(enteredUsername,enteredPassword,true);

            }

            if(validUser){
                errorLabel.setText("Information Accepted");
            }
            else{
                errorLabel.setText("Invalid Login");
                UsernameTextField.setText("");
                PasswordTextField.setText("");
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }


    }



    public void backToMainScene(){
        stage.setScene(mainScene);
    }
    public void setStage(Stage stage){
        this.stage = stage;
    }
    public void setMainScene(Scene mainScene) {
        this.mainScene = mainScene;
    }




}
