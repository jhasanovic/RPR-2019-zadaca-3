package ba.unsa.etf.rpr;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
    private ObservableList<String> colors= FXCollections.observableArrayList();
    @FXML
    private TextField fldText;
    @FXML
    private Button zeroBtn,oneBtn,twoBtn,threeBtn,fourBtn,fiveBtn,sixBtn,sevenBtn,eightBtn,nineBtn;
    @FXML
    private ChoiceBox choiceColor;

    public ObservableList<String> getColors() {
        return colors;
    }
    public void setColors(ObservableList<String> colors) {
        this.colors = colors;
    }

    @FXML
    public void initialize() {
    colors.add("Default");
    colors.add("Crvena");
    colors.add("Zelena");
    colors.add("Plava");
    choiceColor.setItems(colors);

        choiceColor.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                    if (n.equals("Crvena")) {
                        if(o!=null) {
                            zeroBtn.getStyleClass().removeAll("plaveTipke","zeleneTipke");
                            oneBtn.getStyleClass().removeAll("plaveTipke","zeleneTipke");
                            twoBtn.getStyleClass().removeAll("plaveTipke","zeleneTipke");
                            threeBtn.getStyleClass().removeAll("plaveTipke","zeleneTipke");
                            fourBtn.getStyleClass().removeAll("plaveTipke","zeleneTipke");
                            fiveBtn.getStyleClass().removeAll("plaveTipke","zeleneTipke");
                            sixBtn.getStyleClass().removeAll("plaveTipke","zeleneTipke");
                            sevenBtn.getStyleClass().removeAll("plaveTipke","zeleneTipke");
                            eightBtn.getStyleClass().removeAll("plaveTipke","zeleneTipke");
                            nineBtn.getStyleClass().removeAll("plaveTipke","zeleneTipke");
                        }
                        zeroBtn.getStyleClass().add("crveneTipke");
                        oneBtn.getStyleClass().add("crveneTipke");
                        twoBtn.getStyleClass().add("crveneTipke");
                        threeBtn.getStyleClass().add("crveneTipke");
                        fourBtn.getStyleClass().add("crveneTipke");
                        fiveBtn.getStyleClass().add("crveneTipke");
                        sixBtn.getStyleClass().add("crveneTipke");
                        sevenBtn.getStyleClass().add("crveneTipke");
                        eightBtn.getStyleClass().add("crveneTipke");
                        nineBtn.getStyleClass().add("crveneTipke");
                    } else if(n.equals("Zelena")){
                        if(o!=null) {
                            zeroBtn.getStyleClass().removeAll("crveneTipke","plaveTipke");
                            oneBtn.getStyleClass().removeAll("crveneTipke","plaveTipke");
                            twoBtn.getStyleClass().removeAll("crveneTipke","plaveTipke");
                            threeBtn.getStyleClass().removeAll("crveneTipke","plaveTipke");
                            fourBtn.getStyleClass().removeAll("crveneTipke","plaveTipke");
                            fiveBtn.getStyleClass().removeAll("crveneTipke","plaveTipke");
                            sixBtn.getStyleClass().removeAll("crveneTipke","plaveTipke");
                            sevenBtn.getStyleClass().removeAll("crveneTipke","plaveTipke");
                            eightBtn.getStyleClass().removeAll("crveneTipke","plaveTipke");
                            nineBtn.getStyleClass().removeAll("crveneTipke","plaveTipke");
                        }
                        zeroBtn.getStyleClass().add("zeleneTipke");
                        oneBtn.getStyleClass().add("zeleneTipke");
                        twoBtn.getStyleClass().add("zeleneTipke");
                        threeBtn.getStyleClass().add("zeleneTipke");
                        fourBtn.getStyleClass().add("zeleneTipke");
                        fiveBtn.getStyleClass().add("zeleneTipke");
                        sixBtn.getStyleClass().add("zeleneTipke");
                        sevenBtn.getStyleClass().add("zeleneTipke");
                        eightBtn.getStyleClass().add("zeleneTipke");
                        nineBtn.getStyleClass().add("zeleneTipke");
                    }else if(n.equals("Plava")){
                        if(o!=null) {
                            zeroBtn.getStyleClass().removeAll("crveneTipke","zeleneTipke");
                            oneBtn.getStyleClass().removeAll("crveneTipke","zeleneTipke");
                            twoBtn.getStyleClass().removeAll("crveneTipke","zeleneTipke");
                            threeBtn.getStyleClass().removeAll("crveneTipke","zeleneTipke");
                            fourBtn.getStyleClass().removeAll("crveneTipke","zeleneTipke");
                            fiveBtn.getStyleClass().removeAll("crveneTipke","zeleneTipke");
                            sixBtn.getStyleClass().removeAll("crveneTipke","zeleneTipke");
                            sevenBtn.getStyleClass().removeAll("crveneTipke","zeleneTipke");
                            eightBtn.getStyleClass().removeAll("crveneTipke","zeleneTipke");
                            nineBtn.getStyleClass().removeAll("crveneTipke","zeleneTipke");
                        }
                        zeroBtn.getStyleClass().add("plaveTipke");
                        oneBtn.getStyleClass().add("plaveTipke");
                        twoBtn.getStyleClass().add("plaveTipke");
                        threeBtn.getStyleClass().add("plaveTipke");
                        fourBtn.getStyleClass().add("plaveTipke");
                        fiveBtn.getStyleClass().add("plaveTipke");
                        sixBtn.getStyleClass().add("plaveTipke");
                        sevenBtn.getStyleClass().add("plaveTipke");
                        eightBtn.getStyleClass().add("plaveTipke");
                        nineBtn.getStyleClass().add("plaveTipke");
                    }
                    else if(n.equals("Default")){
                        if(o!=null) {
                            zeroBtn.getStyleClass().removeAll("crveneTipke","plaveTipke","zeleneTipke");
                            oneBtn.getStyleClass().removeAll("crveneTipke","plaveTipke","zeleneTipke");
                            twoBtn.getStyleClass().removeAll("crveneTipke","plaveTipke","zeleneTipke");
                            threeBtn.getStyleClass().removeAll("crveneTipke","plaveTipke","zeleneTipke");
                            fourBtn.getStyleClass().removeAll("crveneTipke","plaveTipke","zeleneTipke");
                            fiveBtn.getStyleClass().removeAll("crveneTipke","plaveTipke","zeleneTipke");
                            sixBtn.getStyleClass().removeAll("crveneTipke","plaveTipke","zeleneTipke");
                            sevenBtn.getStyleClass().removeAll("crveneTipke","plaveTipke","zeleneTipke");
                            eightBtn.getStyleClass().removeAll("crveneTipke","plaveTipke","zeleneTipke");
                            nineBtn.getStyleClass().removeAll("crveneTipke","plaveTipke","zeleneTipke");
                        }
                    }
                }
            });
    }

    public void numberClick(ActionEvent actionEvent) {
        String number=((Button)actionEvent.getSource()).getText();
        fldText.setText(fldText.getText()+number);
    }
}
