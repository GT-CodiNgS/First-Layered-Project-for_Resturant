package pos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import pos.bo.BoFactory;
import pos.bo.custom.CustomerBo;
import pos.db.DBConnection;
import pos.dto.CustomerDTO;
import pos.view.tm.CustomerTM;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Pattern;

public class AddCustomerFormController extends Component {
    public AnchorPane root;
    public JFXButton btnCancel;
    public JFXButton btnSave;
    public JFXTextField txtid;
    public JFXTextField txtNIC;
    public JFXTextField txtname;
    public JFXTextField txtaddress;
    public JFXTextField txtcntNo;
    public JFXTextField txtEmail;

    CustomerBo bo;
    public void initialize() throws Exception {
        bo = BoFactory.getInstance().getBo(BoFactory.BOType.CUSTOMER);
    }

    public void btnCancelOnAction(MouseEvent mouseEvent) throws IOException {
        UiLoader.getInstance().setUI("Booking.fxml", root);
    }


    public void btnSaveOnAction(ActionEvent actionEvent) throws Exception {
        if (Pattern.compile("^[0-9]{12}[A-z]$").matcher(txtNIC.getText()).matches()) {
            if (Pattern.compile("\"^(C00)[1-9]{1}$\"").matcher(txtid.getText()).matches()) {
            if (Pattern.compile("^[A-z]{1,}$").matcher(txtname.getText()).matches()) {
                if (Pattern.compile("^[A-z,0-9 ,/-]{10,}|[ ]$").matcher(txtaddress.getText()).matches()) {
                    if (Pattern.compile("[0-9]{10}$").matcher(txtcntNo.getText()).matches()) {
                        if (Pattern.compile("[A-z]{1,20}(@)[a-z]{1,}$").matcher(txtEmail.getText()).matches()) {

                            boolean isSaved = bo.saveCustomer(
                                    new CustomerDTO(txtNIC.getText(),
                                            txtid.getText(),
                                            txtname.getText(),
                                            txtaddress.getText(),
                                            txtcntNo.getText(),
                                            txtEmail.getText())
                            );
                        } else {
                            txtEmail.setFocusColor(javafx.scene.paint.Paint.valueOf("red"));
                            txtEmail.requestFocus();
                        }
                    } else {
                        txtcntNo.setFocusColor(javafx.scene.paint.Paint.valueOf("red"));
                        txtcntNo.requestFocus();

                    }
                } else {
                    txtaddress.setFocusColor(javafx.scene.paint.Paint.valueOf("red"));
                    txtaddress.requestFocus();
                }
            } else {
                txtname.setFocusColor(javafx.scene.paint.Paint.valueOf("red"));
                txtname.requestFocus();
            }

        } else {

            txtid.setFocusColor(Paint.valueOf("red"));
            txtid.requestFocus();
        }
        } else {

            txtNIC.setFocusColor(Paint.valueOf("red"));
            txtNIC.requestFocus();
        }

    }
}