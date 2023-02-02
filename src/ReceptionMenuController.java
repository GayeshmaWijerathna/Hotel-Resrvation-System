import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionMenuController {


    public void logOutOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Main.fxml"));
        Stage stage=(Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void cancelOnClick(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("cancelBooking.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Blue Ocean RRS");
        stage.getIcons().add(new Image("/Images/ICON.png"));
        stage.setAlwaysOnTop(true);
        stage.show();
    }

    public void registerOnClick(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("RegisterForm.fxml"));
        Stage stage=(Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Blue Ocean RRS");
        stage.getIcons().add(new Image("/Images/ICON.png"));
        stage.show();
    }

    public void checkAvailableOnClick(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("CheckAvailabilityForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Blue Ocean RRS");
        stage.getIcons().add(new Image("/Images/ICON.png"));
        stage.setAlwaysOnTop(true);
        stage.show();

    }
}
