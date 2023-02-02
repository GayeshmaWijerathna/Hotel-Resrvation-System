import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class MealUpdateController {

    public void mealUpdateOnAction(ActionEvent event) {
        Node node = (Node) event.getSource();
        Stage stage1 = (Stage) node.getScene().getWindow();
        stage1.close();
    }
}
