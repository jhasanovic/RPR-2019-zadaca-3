package ba.unsa.etf.rpr.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NoviController {
    @FXML
    private TextField fldIme;
    @FXML
    private ProgressBar progressBar;

    @FXML
    public void initialize() {
        fldIme.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                if (n.length()>0 && n.length()<10) {
                    progressBar.getStyleClass().removeAll("zeleniProgress");
                    progressBar.setProgress(n.length()/10.);
                    progressBar.getStyleClass().add("crveniProgress");
                } else {
                    progressBar.getStyleClass().removeAll("crveniProgress");
                    progressBar.setProgress(n.length()/10.);
                    progressBar.getStyleClass().add("zeleniProgress");
                }
            }
        });
    }
    public void zatvoriProzor(ActionEvent actionEvent) {
        Node n = (Node) actionEvent.getSource();
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();
    }

    public void okBtnClick(ActionEvent actionEvent) {
        //ako nema 10 karaktera u imenu, prikazati alert
        if (fldIme.getLength()<10) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Neispravno ime");
            alert.setHeaderText("Neispravno ime studenta");
            alert.setContentText("Ime studenta treba biti najmanje 10 karaktera dugačko");

            alert.showAndWait();
        }
    }
}
