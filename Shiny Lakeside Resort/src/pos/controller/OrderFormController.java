package pos.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderFormController {
    public AnchorPane root;
    public TextField txtDate;
    public TextField txtDiscount;
    public TextField txtID;
    public TableColumn clmnID;
    public TableColumn clmnName;
    public TableColumn clmnPrice;
    public TableColumn clmnDescription;
    public TableColumn clmnDiscount;
    public TableColumn clmnQuantity;
    public Button btnMakeOrder;
    public Button btnCancel;
    public TextField txtTotal;
    public ComboBox cmbCategory;
    public ComboBox cmbItem;
    public TextField txtQuantity;
    public JFXButton btnAdd;

    public void btnCancelOnAction1(MouseEvent mouseEvent) throws IOException {
        UiLoader.getInstance().setUI("MainForm.fxml",root);
    }

    public void btnMakeOrderOnAction(ActionEvent actionEvent) {
    }

    public void btnAddOnAction(ActionEvent actionEvent) {
    }
}
