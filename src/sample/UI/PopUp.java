package sample.UI;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PopUp {

    public static void createPopup(String... args) {
        Stage newStage = new Stage();
        HBox content = new HBox();
        content.setAlignment(Pos.CENTER);

        for (String arg : args) {
            Label message = new Label(arg);
            content.getChildren().add(message);
        }

        Scene scene = new Scene(content, 400, 40);
        newStage.setScene(scene);
        newStage.show();
    }
}
