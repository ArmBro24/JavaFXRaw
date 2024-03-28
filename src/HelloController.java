import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController extends HelloApplication2452 {

    @FXML
    private TextField tfTitle;

    @FXML
    public EventHandler<ActionEvent> btAdd = new EventHandler<>() {
        HelloApplication2452 helloApp = new HelloApplication2452();

        @Override
        public void handle(ActionEvent actionEvent) {
            helloApp.add();
        }
    };
}