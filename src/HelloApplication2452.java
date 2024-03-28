import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class HelloApplication2452 extends Application {
    private TextField tfNumber1 = new TextField();
    private TextField tfNumber2 = new TextField();
    private TextField tfResult = new TextField();
    private Button btAdd = new Button("Add");
    private Button btSubtract = new Button("Subtract");
    private Button btMultiply = new Button("Mulitply");
    private Button btDivide = new Button("Divide");

    @Override
    public void start(@org.jetbrains.annotations.NotNull Stage primaryStage) {
    }


    public void add() {
        tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) +
                Double.parseDouble(tfNumber2.getText())));
    }


    public void subtract() {
        tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) -
                Double.parseDouble(tfNumber2.getText())));
    }


    public void multiply() {
        tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) *
                Double.parseDouble(tfNumber2.getText())));
    }

    public void divide() {
        tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) /
                Double.parseDouble(tfNumber2.getText())));
    }
}