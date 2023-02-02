import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UpdateRoomsController {

    public Pane paneRoom;

    public void roomUpdate(ActionEvent event) {
        Node node = (Node) event.getSource();
        Stage stage1 = (Stage) node.getScene().getWindow();
        stage1.close();
    }
}
