package view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class View extends Application {

    @Override
    public void start(Stage kinsaleStage) throws Exception {
        kinsaleView(kinsaleStage);
        youghalView();
    }

    public void kinsaleView(Stage kinsaleStage) {

        // Stage
        kinsaleStage.setTitle("Kinsale View");

        // Scene
        BorderPane root = new BorderPane();
        Scene kinsaleScene = new Scene(root, 1280, 720);
        kinsaleStage.setScene(kinsaleScene);

        // Layout

        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);

        HBox topLayout = new HBox();
        topLayout.setAlignment(Pos.CENTER);

        // Components

        Button sailBoat = new Button();
        sailBoat.setText("Sail Boat");

        Button aircraftCarrier = new Button();
        aircraftCarrier.setText("Aircraft Carrier");

        Button destroyer = new Button();
        destroyer.setText("Destroyer");

        TextArea info = new TextArea();
        info.setEditable(false);
        info.maxHeight(50);

        Font font = Font.font("Roboto", FontWeight.BOLD, FontPosture.REGULAR, 25);

        Label title = new Label();
        title.setText("Kinsale");
        title.setFont(font);

        // Deployment

        buttons.getChildren().addAll(sailBoat, aircraftCarrier, destroyer);
        topLayout.getChildren().addAll(title);
        root.setCenter(buttons);
        root.setBottom(info);
        root.setTop(topLayout);
        kinsaleStage.show();
    }

    public void youghalView() {
        // Stage
        Stage youghalStage = new Stage();
        youghalStage.setTitle("Youghal View");

        // Scene
        BorderPane root = new BorderPane();
        Scene kinsaleScene = new Scene(root, 1280, 720);
        youghalStage.setScene(kinsaleScene);

        // Layout

        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);

        HBox topLayout = new HBox();
        topLayout.setAlignment(Pos.CENTER);

        // Components

        Button sailBoat = new Button();
        sailBoat.setText("Sail Boat");

        Button aircraftCarrier = new Button();
        aircraftCarrier.setText("Aircraft Carrier");

        Button destroyer = new Button();
        destroyer.setText("Destroyer");

        TextArea info = new TextArea();
        info.setEditable(false);
        info.maxHeight(50);

        Font font = Font.font("Roboto", FontWeight.BOLD, FontPosture.REGULAR, 25);

        Label title = new Label();
        title.setText("Youghal");
        title.setFont(font);

        // Deployment

        buttons.getChildren().addAll(sailBoat, aircraftCarrier, destroyer);
        topLayout.getChildren().addAll(title);
        root.setCenter(buttons);
        root.setBottom(info);
        root.setTop(topLayout);
        youghalStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}