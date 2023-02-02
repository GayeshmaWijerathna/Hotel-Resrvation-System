import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class SuccessedFormController implements Initializable {
    public Label tokenNo;

    Random r = new Random();
             int rand =r.nextInt(100);
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tokenNo.setText(String.valueOf("[00"+rand+"]"));
    }

}
