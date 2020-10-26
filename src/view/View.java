package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View extends Application {

    @Override
    public void start(Stage kinsaleStage) throws Exception {
        Parent root1 = FXMLLoader.load(getClass().getResource("../controller/KinsaleView.fxml"));
        kinsaleStage.setTitle("Kinsale View");
        Scene kinsaleScene = new Scene(root1, 1280, 720);
        kinsaleStage.setScene(kinsaleScene);
        kinsaleStage.show();

        Stage youghalStage = new Stage();
        youghalStage.setTitle("Youghal View");
        Parent root2 = FXMLLoader.load(getClass().getResource("../controller/YoughalView.fxml"));
        Scene youghalScene = new Scene(root2, 1280, 720);
        youghalStage.setScene(youghalScene);
        youghalStage.show();
    }

}