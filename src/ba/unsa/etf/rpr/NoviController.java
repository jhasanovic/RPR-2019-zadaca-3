package ba.unsa.etf.rpr;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class NoviController {
    public void zatvoriProzor(ActionEvent actionEvent) {
        Node n = (Node) actionEvent.getSource();
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();
    }
}
