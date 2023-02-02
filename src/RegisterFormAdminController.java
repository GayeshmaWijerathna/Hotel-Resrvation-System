import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RegisterFormAdminController {
    public ComboBox cmbBox;
    public TextField regName;
    public TextField regId;
    public TextField addressLine1;
    public TextField addressLine2;
    public TextField contactId;
    public TextField emailId;
    public TextField roomNo;
    public TextField noOfGuest;
    public CheckBox breakfastID;
    public CheckBox lunchID;
    public CheckBox dinnerID;
    public DatePicker chOutdate;
    public DatePicker chInDate;

    public void initialize() {
        // add data
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("Local Meal Package", "Chinese Meal Package", "French Meal Package");
        cmbBox.setItems(list);

    }

    public void confirmOnAction(ActionEvent event) throws IOException {
        regName.clear();
        regId.clear();
        addressLine1.clear();
        addressLine2.clear();
        contactId.clear();
        emailId.clear();
        roomNo.clear();
        noOfGuest.clear();
        breakfastID.setSelected(false);
        lunchID.setSelected(false);
        dinnerID.setSelected(false);
        chInDate.getEditor().clear();
        chOutdate.getEditor().clear();
        cmbBox.getSelectionModel().clearSelection();

        URL resource = getClass().getResource("SuccessedForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Blue Ocean RRS");
        stage.getIcons().add(new Image("/Images/ICON.png"));
        stage.setAlwaysOnTop(true);
        stage.show();
    }

    public void backOnAction(MouseEvent mouseEvent) throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
        Stage stage=(Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
