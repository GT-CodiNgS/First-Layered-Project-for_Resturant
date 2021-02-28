package pos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.sun.org.omg.CORBA.Initializer;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    public AnchorPane root;
    public JFXButton btnLogin;
    public ImageView btnClose;
    public JFXPasswordField txtPsswrd;
    public JFXTextField txtUsrName;


    public void btnLoginOnAction(MouseEvent mouseEvent) throws IOException {
        String pw=txtPsswrd.getText();
        String name=txtUsrName.getText();
        if (pw.length() > 0 && name.length() > 0) {
            if (name.equalsIgnoreCase("gayash") &&
                    pw.equalsIgnoreCase("1234")) {
                UiLoader.getInstance().setUI("MainForm.fxml",root);

                }else {
                    new Alert(Alert.AlertType.WARNING, "Try Again!!", ButtonType.OK).show();
                }
        } else {
            new Alert(Alert.AlertType.WARNING, "Empty!!", ButtonType.OK).show();
        }
    }

    public void btnCloseOnAction(MouseEvent mouseEvent) {

        Stage stage = (Stage) btnClose.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
