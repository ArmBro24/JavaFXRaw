import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController extends HelloApplication2452 {

    @FXML
    private TextField tfNumber1;

    @FXML
    private TextField tfNumber2;

    @FXML
    private TextField tfResult;

    @FXML
    private Label sumLabel;

    private double stored;

    @FXML
    public void initialize() {
        tfNumber1.textProperty().addListener((observable, oldValue, newValue) -> updateSumLabel());
        tfNumber2.textProperty().addListener((observable, oldValue, newValue) -> updateSumLabel());

        btAdd.setOnAction(this::add);
        btSubtract.setOnAction(this::subtract);
        btMultiply.setOnAction(this::multiply);
        btDivide.setOnAction(this::divide);

        tfNumber1.setOnAction(this::setTfNumber1);
        tfNumber2.setOnAction(this::setTfNumber2);
        tfResult.setOnAction(this::setTfResult);

        res.setOnAction(this::calculateResult);

        updateSumLabel();
    }

    private void calculateResult(ActionEvent actionEvent){
        double num1 = Double.parseDouble(tfNumber1.getText());
        double num2 = Double.parseDouble((tfNumber2.getText()));

         if(actionEvent.getSource() == res) {
             tfResult.setText(String.valueOf(stored));
         }
    }

    private void updateSumLabel() {
        try {
            double num1 = Double.parseDouble(tfNumber1.getText());
            double num2 = Double.parseDouble(tfNumber2.getText());
            double sum = num1 + num2;
            sumLabel.setText("" + sum);
        }
        catch (NumberFormatException e) {
            sumLabel.setText("0");
        }
    }


    @Override
    public void add(ActionEvent actionEvent) {
        double num1 = Double.parseDouble(tfNumber1.getText());
        double num2 = Double.parseDouble(tfNumber2.getText());
        stored = num1 + num2;
    }

    @Override
    public void subtract(ActionEvent actionEvent) {
        double num1 = Double.parseDouble(tfNumber1.getText());
        double num2 = Double.parseDouble(tfNumber2.getText());
        stored = num1 - num2;
    }

    @Override
    public void multiply(ActionEvent actionEvent){
        double num1 = Double.parseDouble(tfNumber1.getText());
        double num2 = Double.parseDouble(tfNumber2.getText());
        stored = num1 * num2;
    }

    @Override
    public void divide(ActionEvent actionEvent){
        double num1 = Double.parseDouble(tfNumber1.getText());
        double num2 = Double.parseDouble(tfNumber2.getText());
        stored = num1 / num2;
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