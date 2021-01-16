
package anonymoushandlerdemo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class AnonymousHandlerDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        Button btnN = new Button("NEW");
        Button btnO = new Button("OPEN");
        Button btnS = new Button("SAVE");
        Button btnP = new Button("PRINT");
        btnN.setOnAction(new EventHandler<ActionEvent>() {

            @Override

            public void handle(ActionEvent event) {

                //btnN.setDisable(true);
                btnO.setDisable(true);
                btnS.setDisable(true);
                btnP.setDisable(true);
                System.out.println("PROESS NEW");

            }

        });
        btnO.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                btnN.setDisable(true);

                btnS.setDisable(true);
                btnP.setDisable(true);

                System.out.println("PROSSES OPEN");
            }
        });
        btnS.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                btnN.setDisable(true);
                btnO.setDisable(true);
                //btnS.setDisable(true);
                btnP.setDisable(true);

                System.out.println("PROSSES SAVE");
            }
        });
        btnP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                btnN.setDisable(true);
                btnO.setDisable(true);
                btnS.setDisable(true);
                

                System.out.println("PROSSES PRINT");
            }
        });

        hbox.getChildren().addAll(btnN, btnO, btnS, btnP);
        StackPane root = new StackPane();
        root.getChildren().add(hbox);

        Scene scene = new Scene(root, 300, 100);

        primaryStage.setTitle(" AnonymousHandlerDemo ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }

}
