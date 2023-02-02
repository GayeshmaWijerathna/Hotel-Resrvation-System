import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminMenuController {


    //Log Out
    public void logOutOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Main.fxml"));
        Stage stage=(Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    //Update Meal
    public void updateMealsOnAction(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("mealUpdate.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Blue Ocean RRS");
        stage.getIcons().add(new Image("/Images/ICON.png"));
        stage.show();
    }
    //Book Rooms
    public void bookOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("RegisterFormAdmin.fxml"));
        Stage stage=(Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Blue Ocean RRS");
        stage.getIcons().add(new Image("/Images/ICON.png"));
        stage.show();
    }
    //Cancel Booking
    public void cancelBookingOnAction(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("cancelBooking.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Blue Ocean RRS");
        stage.getIcons().add(new Image("/Images/ICON.png"));
        stage.show();
    }
    //Reports
    public void ReportsOnAction(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("ReportsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Blue Ocean RRS");
        stage.getIcons().add(new Image("/Images/ICON.png"));
        stage.show();
    }

    //Update Rooms
    public void updateRoomsOnAction(MouseEvent mouseEvent) throws IOException {

        URL resource = getClass().getResource("updateRooms.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Blue Ocean RRS");
        stage.getIcons().add(new Image("/Images/ICON.png"));
        stage.show();
     }


}
