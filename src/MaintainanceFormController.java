import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MaintainanceFormController {


    public void logOutOnAction(MouseEvent mouseEvent) {

        Node node = (Node) mouseEvent.getSource();
        Stage stage1 = (Stage) node.getScene().getWindow();
        stage1.close();
    }

    public void addOnAction(ActionEvent event) {

    }

    public void addOnAction2(ActionEvent event) {
    }

    public void addOnAction3(ActionEvent event) {
    }

    public void addOnAction4(ActionEvent event) {
    }
}
