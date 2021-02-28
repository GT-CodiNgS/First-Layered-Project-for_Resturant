package pos.controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SettingsFormController implements Initializable {

    public JFXButton btnDefault;

    public AnchorPane root;
    public ComboBox cmbColor;
    public String red;
    public String green;
    public String black;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.add("red");
        observableList.add("Dark");
        observableList.add("Army Green");
        cmbColor.setItems(observableList);


    }

    public void btnDefaultOnAction(ActionEvent actionEvent) {
        root.setStyle("-fx-background-color: linear-gradient(to top,#34495e, #2c3e50)");
        
    }

    public void clrPick(ActionEvent actionEvent) {



    }


    public String getColorCode(){
        String c=(String) cmbColor.getValue();
        switch (c){
            case "red":
                return "#800517";
            case "Dark":
                return "#0C090A";
            case "Army Green":
                return "#254117";
        }
        return  null;

    }


    public void cmbColorOnAction(ActionEvent actionEvent) {
        String c=getColorCode();
        this.root.setStyle("-fx-background-color:"+c);
        //new BookingFormController().root.setStyle("-fx-background-color:"+c);
    }

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        UiLoader.getInstance().setUI("MainForm.fxml",root);
    }
}
