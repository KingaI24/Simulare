package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Repository.RepositoryAgenda;
import sample.Service.ServiceAgenda;
import sample.UI.Controller;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = fxmlLoader.load();

        RepositoryAgenda repository = new RepositoryAgenda();
        ServiceAgenda service = new ServiceAgenda(repository);

        service.addEvent(1,"Game", "12.12.2018", 30, "12:12");
        service.addEvent(2,"Game1", "12.12.2019", 40, "12:12");
        service.addEvent(3,"Game2", "12.12.2017", 60, "12:12");
        service.addEvent(4,"Game3", "12.12.2018", 10, "12:12");

        Controller controller =  fxmlLoader.getController();

        primaryStage.setTitle("Agenda Operations");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
