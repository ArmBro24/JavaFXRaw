import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController extends HelloApplication2452 {

    @FXML
    private TextField tfNumber1;

    @FXML
    private TextField tfNumber2;

    @FXML
    private TextField tfResult;

    @FXML
    private Button btAdd;

    @FXML
    private Button btSubtract;

    @FXML
    public void initialize() {
        btAdd.setOnAction(this::add);
        btSubtract.setOnAction(this::subtract);
        tfNumber1.setOnAction(this::setTfNumber1);
        tfNumber2.setOnAction(this::setTfNumber2);
        tfResult.setOnAction(this::setTfResult);
    }


    @Override
    public void add(ActionEvent actionEvent) {
        double num1 = Double.parseDouble(tfNumber1.getText());
        double num2 = Double.parseDouble(tfNumber2.getText());
        tfResult.setText(String.valueOf(num1 + num2));
    }

    @Override
    public void subtract(ActionEvent actionEvent) {
        double num1 = Double.parseDouble(tfNumber1.getText());
        double num2 = Double.parseDouble(tfNumber2.getText());
        tfResult.setText(String.valueOf(num1 - num2));
    }

    @Override
    public void setTfNumber1(ActionEvent actionEvent){
    }

    @Override
    public void setTfNumber2(ActionEvent actionEvent){
    }

    @Override
    public void setTfResult(ActionEvent actionEvent){
    }

}