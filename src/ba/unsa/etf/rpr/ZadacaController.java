package ba.unsa.etf.rpr;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ZadacaController {
    public ChoiceBox choiceColor;
    private ObservableList<String> colors= FXCollections.observableArrayList();

    public ObservableList<String> getColors() {
        return colors;
    }

    public void setColors(ObservableList<String> colors) {
        this.colors = colors;
    }
    @FXML
    private TextField fldText;
    @FXML
    public void initialize() {
    colors.add("Default");
    colors.add("Crvena");
    colors.add("Zelena");
    colors.add("Plava");
    choiceColor.setItems(colors);
    }

    public void numberClick(ActionEvent actionEvent) {
        String number=((Button)actionEvent.getSource()).getText();
        fldText.setText(fldText.getText()+number);
    }
}
