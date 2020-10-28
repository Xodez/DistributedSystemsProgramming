package view;

import controller.Controller;
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

    Controller c = new Controller();

    @Override
    public void start(Stage kinsaleStage) {

        // adds Blarney as observer to Kinsale and Youghal
        c.addObservers();

        // creates Blarney thread and starts it
        Thread blarneyThread = new Thread(c.getBlarney());
        blarneyThread.start();

        // Launches gui for Kinsale and Youghal
        gui(new Stage(), "Kinsale");
        gui(new Stage(), "Youghal");
    }

    public void gui(Stage stage, String location) {

        // Stage
        stage.setTitle(location + " " + "View");

        // Scene
        BorderPane root = new BorderPane();
        Scene kinsaleScene = new Scene(root, 1280, 720);
        stage.setScene(kinsaleScene);

        // Layout

        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);

        HBox topLayout = new HBox();
        topLayout.setAlignment(Pos.CENTER);

        // Components

        Font textAreaFont = Font.font("Lato", FontWeight.BOLD, FontPosture.REGULAR, 20);

        TextArea info = new TextArea();
        info.setEditable(false);
        info.maxHeight(50);
        info.setFont(textAreaFont);

        Font font = Font.font("Roboto", FontWeight.BOLD, FontPosture.REGULAR, 25);

        Button sailBoat = new Button();
        sailBoat.setText("Sailing Ship");
        sailBoat.setOnAction(e ->{
            c.makeShip(location, sailBoat.getText());
            Thread shipThread = new Thread(c.getSentry(location));
            shipThread.start();
            info.setText("Sail Boat spotted");
        });

        Button aircraftCarrier = new Button();
        aircraftCarrier.setText("Aircraft Carrier");
        aircraftCarrier.setOnAction(e ->{
            c.makeShip(location, aircraftCarrier.getText());
            Thread shipThread = new Thread(c.getSentry(location));
            shipThread.start();
            info.setText("Aircraft Carrier spotted");
        });

        Button destroyer = new Button();
        destroyer.setText("Destroyer");
        destroyer.setOnAction(e ->{
            c.makeShip(location, destroyer.getText());
            Thread shipThread = new Thread(c.getSentry(location));
            shipThread.start();
            info.setText("Destroyer spotted");
        });

        Label title = new Label();
        title.setText(location);
        title.setFont(font);

        // Deployment

        buttons.getChildren().addAll(sailBoat, aircraftCarrier, destroyer);
        topLayout.getChildren().addAll(title);
        root.setCenter(buttons);
        root.setBottom(info);
        root.setTop(topLayout);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}