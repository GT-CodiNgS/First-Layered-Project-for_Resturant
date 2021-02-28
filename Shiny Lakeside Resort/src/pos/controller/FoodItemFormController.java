package pos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FoodItemFormController implements Initializable {
    public AnchorPane root;
    public AnchorPane root1;
    public JFXButton btnAddNew;
    public ImageView imgFood;
    public Button btnCancel;
    public ComboBox cmbItem;
    public JFXTextArea txtDesc;
    public ComboBox cmbID;
    public ComboBox cmbCategory;
    public String x;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.add("Foods");
        observableList.add("Drinks");
        observableList.add("Dessert");
        cmbCategory.setItems(observableList);



 }

    public void setCombo( String h){
        ObservableList<String> observableListFoods = FXCollections.observableArrayList();
        switch (h) {
            case "Foods":

                observableListFoods.add("French Fries");
                observableListFoods.add("Sea Food Rice");
                observableListFoods.add("Fried Calamari");
                cmbItem.setItems(observableListFoods);
                break;
            case "Drinks":

                observableListFoods.add("Coca-Cola");
                observableListFoods.add("Sprite");
                observableListFoods.add("Cream Soda");
                cmbItem.setItems(observableListFoods);
                break;
            case "Dessert":

                observableListFoods.add("Fruit Salad");
                observableListFoods.add("Ice Cream");
                observableListFoods.add("Watalappan");
                cmbItem.setItems(observableListFoods);
                break;
        }
    }

    public void initUI(String location) throws IOException {
        this.root1.getChildren().clear();
        this.root1.getChildren().add(FXMLLoader.load(this.getClass().getResource("/pos/view/"+location)));
    }

    public void btnCancelOnAction(MouseEvent mouseEvent) throws IOException {
        UiLoader.getInstance().setUI("MainForm.fxml",root);
    }

    public void btnAddNewOnAction(MouseEvent mouseEvent) throws IOException {
       /* Stage stage = (Stage)root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../view/AddItemForm.fxml"))));*/
//        initUI("AddItemForm.fxml");


        UiLoader.getInstance().setUI("AddItemForm.fxml",root);
//        Stage open = (Stage)btnAddNew.getScene().getWindow();
//        open.close();
     /*   URL resource = this.getClass().getResource("/pos/view/AddItemForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.centerOnScreen();
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();*/
    }


    public void cmbItemOnAction(ActionEvent actionEvent) {
    }

    public void cmbCategoryOnAction(ActionEvent actionEvent) {
        setCombo((String) cmbCategory.getValue());

    }
}
