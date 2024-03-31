import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;

public abstract class HelloApplication2452 extends Application {
    private TextField tfNumber1 = new TextField();
    private TextField tfNumber2 = new TextField();
    private TextField tfResult = new TextField();
    @FXML
    public Button btAdd = new Button();
    @FXML
    public Button btSubtract = new Button();
    @FXML
    public Button btMultiply = new Button();
    @FXML
    public Button btDivide = new Button();
    @FXML
    public Button res = new Button();
    @FXML
    public Button exit = new Button();

    @Override
    public void start(@org.jetbrains.annotations.NotNull Stage primaryStage) {
    }


    public abstract void add(ActionEvent actionEvent);

    public abstract void subtract(ActionEvent actionEvent);

    public abstract void multiply(ActionEvent actionEvent);

    public abstract void divide(ActionEvent actionEvent);

    public abstract void btExit(ActionEvent actionEvent);

    public abstract void setTfNumber1(ActionEvent actionEvent);

    public abstract void setTfNumber2(ActionEvent actionEvent);

    public abstract void setTfResult(ActionEvent actionEvent);
}