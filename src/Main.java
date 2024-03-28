import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;


public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {launch(args);}

    /*Timeline timeline;

    @FXML
    HelloController HC;
    FXMLLoader fxmlLoader;
    private int counter=0;

    public void StartCounter(String status)
    {
        HC = fxmlLoader.getController();
        if(timeline==null) {
            timeline = new Timeline(new KeyFrame(Duration.seconds(1), ev -> {
                HC.getCmd().setText(String.valueOf(counter));
                counter++;
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
        }else{
            if(status=="stop")
                timeline.stop();
            else if(status=="start")
                timeline.play();
        }
    }*/
}