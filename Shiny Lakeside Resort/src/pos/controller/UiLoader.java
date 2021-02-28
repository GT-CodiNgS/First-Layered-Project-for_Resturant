package pos.controller;

import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UiLoader {

    private static UiLoader uiLoader;


    public static UiLoader getInstance(){
        return ((uiLoader==null) ? (uiLoader=new UiLoader()): (uiLoader));
     }

    public void setUI(String location,AnchorPane root) throws IOException {
        Stage stage = (Stage)root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../view/"+location))));
    }

}
