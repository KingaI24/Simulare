package sample.UI;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import sample.Domain.Agenda;
import sample.Service.ServiceAgenda;

public class Controller {

    public TableView tblAgenda;
    public TableColumn tableColumnId;
    public TableColumn tableColumnName;
    public TableColumn tableColumnDescription;
    public TableColumn tableColumnDate;
    public Button btnSumOnDay;
    public TextField txtDate;
    private ServiceAgenda serviceAgenda;

    private ObservableList<Agenda> fullAgenda = FXCollections.observableArrayList();

    public void setService(ServiceAgenda serviceAgenda) {
        this.serviceAgenda = serviceAgenda;
    }

    @FXML
    private void initialize() {
        Platform.runLater(() -> {
            fullAgenda.addAll(serviceAgenda.showAll());
            tblAgenda.setItems(fullAgenda);
        });
    }

    public void btnMaxOnDayClick(ActionEvent actionEvent) {
        try {
            String search = txtDate.getText();
            PopUp.createPopup(serviceAgenda.maxLengthEvent(search).toString());
        } catch (Exception ex) {
            PopUp.createPopup("Date format not correct");
        }
    }
}
