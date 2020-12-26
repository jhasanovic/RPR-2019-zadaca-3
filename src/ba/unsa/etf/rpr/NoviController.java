package ba.unsa.etf.rpr;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NoviController {
    public TextField fldIme;

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
