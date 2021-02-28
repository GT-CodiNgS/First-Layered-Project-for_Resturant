package pos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BookingFormController {
    public AnchorPane root;
    public TextField txtDate;
    public ComboBox cmbRoomNum;
    public TextField txtPrice;
    public ComboBox cmbNIC;
    public ComboBox cmbACtype;
    public TextField txtName;
    public ImageView btnBooking;
    public TextField txtDays;
    public Button btnRefresh;
    public Button btnCancel;
    public JFXButton btnAddCustomer;
    public JFXDatePicker checkIn;
    public JFXDatePicker checkOut;
    public TextField txtTime;
    public TableColumn clmnbtn;
    public AnchorPane root1;
    public TextField txtUnitPrice;
    SettingsFormController settingsFormController=new SettingsFormController();

    public void initialize() throws IOException {

        setTime();
    }
    private void setTime() {
        Timeline timeline =new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("hh:mm:ss");
            txtTime.setText(LocalDateTime.now().format(formatter));
            txtTime.setStyle("white");
            txtDate.setText((String.valueOf(LocalDate.now())));
            txtDate.setStyle("white");
        }),


                new KeyFrame(Duration.seconds(1)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }



    public void btnAddCustomerOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage=(Stage)root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/pos/view/AddCustomerForm.fxml"))));


        //initUi("AddCustomerForm.fxml");
       // UiLoader.getInstance().setUI("AddCustomerForm.fxml",root);
    }

    public void btnCancelOnAction(MouseEvent mouseEvent) throws IOException {
        UiLoader.getInstance().setUI("MainForm.fxml",root);  }
}
