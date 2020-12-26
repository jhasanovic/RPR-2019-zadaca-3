package ba.unsa.etf.rpr;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ZadacaController {
    public ChoiceBox choiceColor;
    private ObservableList<String> boje= FXCollections.observableArrayList();

    public ObservableList<String> getBoje() {
        return boje;
    }

    public void setBoje(ObservableList<String> boje) {
        this.boje = boje;
    }

    @FXML
    public void initialize() {
    boje.add("Default");
    boje.add("Crvena");
    boje.add("Zelena");
    boje.add("Plava");
    choiceColor.setItems(boje);
    }
}
