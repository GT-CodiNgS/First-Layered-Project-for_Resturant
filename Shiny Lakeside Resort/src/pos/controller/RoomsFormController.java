package pos.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class RoomsFormController {
    public ComboBox cmbRoomNum;
    public TextField txtBedType;
    public TextField txtPrice;
    public TextField txtAvailabilty;
    public TableView tblRoom;
    public TableColumn clmnRoomNum;
    public TableColumn clmnBedType;
    public TableColumn clmnACType;
    public TableColumn clmnAvailability;
    public TableColumn clmnPrice;
    public ImageView imgRooms;
    public Button btnCancel;
    public AnchorPane root;

    public void btnCancelOnAction(ActionEvent actionEvent) throws IOException {
         UiLoader.getInstance().setUI("MainForm.fxml",root);
    }
}
