package pos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import pos.bo.BoFactory;
import pos.bo.custom.CustomerBo;
import pos.dto.CustomerDTO;
import pos.view.tm.CustomerTM;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class CustomerFormController {
    public AnchorPane root;
    public JFXTextField txtName;
    public JFXTextField txtEmail;
    public JFXTextField txtAddress;
    public TableView tblCustomers;
    public TableColumn clmnnic;
    public TableColumn clmnid;
    public TableColumn clmnname;
    public TableColumn clmnAddress;
    public TableColumn clmnContactNum;
    public TableColumn clmnEmail;
    public Button btnRefresh;
    public Button btnCancel;
    public JFXButton btnUpdate;
    public JFXTextField txtID;
    public JFXTextField txtNIC;
    public TableColumn clmnBtn;
    public JFXTextField txtContact;

    CustomerBo bo;
    public void initialize() throws Exception {
        bo = BoFactory.getInstance().getBo(BoFactory.BOType.CUSTOMER);

        clmnnic.setCellValueFactory(new PropertyValueFactory<>("nicNo"));
       clmnid.setCellValueFactory(new PropertyValueFactory<>("id"));
        clmnname.setCellValueFactory(new PropertyValueFactory<>("name"));
        clmnAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        clmnContactNum.setCellValueFactory(new PropertyValueFactory<>("cntNum"));
        clmnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        loadAllCustomer();

        tblCustomers.getSelectionModel().selectedItemProperty().addListener(((observable, oldValue, newValue) -> {
            setData((CustomerTM) newValue);
        }));

    }

    private void setData(CustomerTM tm) {
        txtNIC.setText(tm.getNicNo());
        txtID.setText(tm.getId());
        txtName.setText(tm.getCntNum());
       txtAddress.setText(tm.getAddress());
       txtContact.setText(tm.getCntNum());
        txtEmail.setText(tm.getEmail());
    }

    private void loadAllCustomer() throws Exception {
        ObservableList<CustomerTM> tmList = FXCollections.observableArrayList();
        List<CustomerDTO> allCustomers = bo.getAllCustomers();
        for (CustomerDTO dto : allCustomers) {
            CustomerTM tm = new CustomerTM(dto.getNicNo(), dto.getId(), dto.getName(), dto.getAddress(),
                    dto.getCntNum(), dto.getEmail());
            tmList.add(tm);


        }
       tblCustomers.setItems(tmList);
    }


    public void btnCancelOnAction(MouseEvent mouseEvent) throws IOException {
        UiLoader.getInstance().setUI("MainForm.fxml",root);
    }

    public void btnRefreshOnAction(ActionEvent actionEvent) {

    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }

    public void SearchOnAction(ActionEvent actionEvent) throws Exception {
        CustomerDTO customerDTO = bo.getCustomer(txtNIC.getText());
        txtID.setText(customerDTO.getNicNo());
        txtName.setText(customerDTO.getName());
        txtAddress.setText(customerDTO.getAddress());
        txtContact.setText(customerDTO.getCntNum());
        txtEmail.setText(customerDTO.getEmail());
    }
}
