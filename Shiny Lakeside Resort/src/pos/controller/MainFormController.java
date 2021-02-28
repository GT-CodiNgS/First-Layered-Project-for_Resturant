package pos.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainFormController {
    public AnchorPane root;
    public JFXButton btnLogout;
    public JFXButton btnCustomer;
    public JFXButton btnRooms;
    public JFXButton btnItems;
    public JFXButton btnBooking;
    public JFXButton btnOrder;
    public JFXButton btnIncome;
    public JFXButton btnSettings;

    public void btnBookingOnAction(MouseEvent mouseEvent) throws IOException {
        UiLoader.getInstance().setUI("Booking.fxml",root);

    }


    public void btnOrderOnAction(ActionEvent mouseEvent) throws IOException {
        UiLoader.getInstance().setUI("OrderForm.fxml",root);

    }



    public void btnLogoutOnAction(MouseEvent mouseEvent) throws IOException {
        UiLoader.getInstance().setUI("LoginForm.fxml",root);

    }

    public void btnCustomerOnAction(MouseEvent mouseEvent) throws IOException {
        UiLoader.getInstance().setUI("CustomerForm.fxml",root);

    }

    public void btnRoomsOnAction(ActionEvent mouseEvent) throws IOException {
        UiLoader.getInstance().setUI("Rooms.fxml",root);
    }

    public void btnSettingsOnAction(MouseEvent mouseEvent) throws IOException {
        UiLoader.getInstance().setUI("Settings.fxml",root);
    }

    public void btnItemsOnClicked(MouseEvent mouseEvent) throws IOException {
        UiLoader.getInstance().setUI("FoodItemForm.fxml",root);

    }

    public void btnIncomeOnAction(MouseEvent mouseEvent) {
    }
}
