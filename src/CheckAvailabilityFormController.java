import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class CheckAvailabilityFormController {
    public void showUnderOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("MaintainanceForm .fxml"));
        Stage stage=(Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Blue Ocean RRS - Under Maintain");
        stage.getIcons().add(new Image("/Images/ICON.png"));
        stage.show();
    }

    public void bookOnAction(MouseEvent mouseEvent) throws IOException {

        Node node = (Node) mouseEvent.getSource();
        Stage stage1 = (Stage) node.getScene().getWindow();
        stage1.close();

        Parent root= FXMLLoader.load(getClass().getResource("RegisterForm.fxml"));
        Stage stage=(Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setTitle("Blue Ocean RRS -Customer Register");
        stage.getIcons().add(new Image("/Images/ICON.png"));
        stage.setScene(scene);
        stage.show();

    }
}
