package pos.controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import pos.bo.BoFactory;
import pos.bo.custom.ItemBo;
import pos.dto.ItemDTO;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.regex.Pattern;

public class AddItemFormController {
    public AnchorPane root;
    public JFXButton btnCancel;
    public JFXTextField txtId;
    public JFXTextField txtprice;
    public JFXTextField txtName;
    public ComboBox cmbCatergory;
    public TextArea txtDes;
   ItemBo bo;
    public void initialize() throws Exception {
        selectCategory();
        bo = BoFactory.getInstance().getBo(BoFactory.BOType.ITEM);
    }
    public void btnCancelOnAction(MouseEvent mouseEvent) throws IOException {
       UiLoader.getInstance().setUI("FoodItemForm.fxml",root);

    }
    public void selectCategory() {
        ObservableList<String> observableList = FXCollections.observableArrayList("Foods", "Drinks","Dessert");
        cmbCatergory.setItems(observableList);
    }
    public void SaveOnAction(ActionEvent actionEvent) throws Exception {
        if (Pattern.compile("^(I00)[1-9]{1,}$").matcher(txtId.getText()).matches()) {
            if (Pattern.compile("^[A-z ]{1,}$").matcher(txtName.getText()).matches()) {
                //if (Pattern.compile("([A-z]|[0-9]){1,}$").matcher(txtDes.getText()).matches()) {
                    if (Pattern.compile(("[0-9]{1,}$")).matcher(txtprice.getText()).matches()) {

                        boolean isSaved = bo.saveItem(
                                new ItemDTO(txtId.getText(),
                                        txtName.getText(),
                                        txtDes.getText(),
                                        cmbCatergory.getValue().toString(),
                                        Double.parseDouble( txtprice.getText()))
                        );
                        System.out.println(isSaved);
                    } else {
                        txtprice.setFocusColor(javafx.scene.paint.Paint.valueOf("red"));
                        txtprice.requestFocus();
                 //   }
//                } else {
//                    txtDes.setFocusColor(javafx.scene.paint.Paint.valueOf("red"));
//                    txtcntNo.requestFocus();

                }
            } else {
                txtName.setFocusColor(javafx.scene.paint.Paint.valueOf("red"));
                txtName.requestFocus();
            }
        } else {
            txtId.setFocusColor(javafx.scene.paint.Paint.valueOf("red"));
            txtId.requestFocus();
        }




    }
    }

