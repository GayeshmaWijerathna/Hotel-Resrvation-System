import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;


public class MainController {

    public TextField userName;
    public TextField password;

    public void signInOnAction(ActionEvent event) throws IOException {

        if (userName.getText().equals("Admin") && password.getText().equals("1234")) {
            Parent root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else if (userName.getText().equals("Reception") && password.getText().equals("1234")) {
            Parent root = FXMLLoader.load(getClass().getResource("ReceptionMenu.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {

            URL resource = getClass().getResource("alertWindow.fxml");
            Parent load = FXMLLoader.load(resource);
            Scene scene = new Scene(load);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Blue Ocean RRS");
            stage.getIcons().add(new Image("/Images/ICON.png"));
            stage.setAlwaysOnTop(true);
            stage.setResizable(false);
            stage.show();

        }
    }
}