package ba.unsa.etf.rpr.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

public class ZadacaController {
    private ObservableList<String> colors= FXCollections.observableArrayList();
    @FXML
    private TextField fldText;
    @FXML
    private Button zeroBtn,oneBtn,twoBtn,threeBtn,fourBtn,fiveBtn,sixBtn,sevenBtn,eightBtn,nineBtn;
    @FXML
    private ChoiceBox choiceColor;
    @FXML
    private Slider sliderStudents;
    @FXML
    private ListView<String> lvStudents;
    private ObservableList<String> listViewData = FXCollections.observableArrayList();
    private ObservableList<String> temp = FXCollections.observableArrayList();
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
        listViewData.add("Student1");
        listViewData.add("Student2");
        listViewData.add("Student3");
        listViewData.add("Student4");
        listViewData.add("Student5");

        lvStudents.setItems(listViewData);

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
        sliderStudents.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
               int n=newValue.intValue();
               if(n>=listViewData.size()){
                   if(n==15) n--;

               for(int redniBroj=6;redniBroj<=n;redniBroj++)
                   listViewData.add("Student"+redniBroj);

               if(newValue.intValue()==15)
                   listViewData.add("Student"+fldText.getText());//unos posljednjeg studenta
            }
               else{
                   if(listViewData.size()>=15)
                       listViewData.removeAll("Student"+fldText.getText());
                   for(int i=5;i<listViewData.size();i++)//u listi uvijek ostati barem 5 studenata
                       listViewData.removeAll("Student"+i);
               }
        }
        });
    }

    public void numberClick(ActionEvent actionEvent) {
        String number=((Button)actionEvent.getSource()).getText();
        fldText.setText(fldText.getText()+number);
    }

    public void unosClick(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        Parent root= FXMLLoader.load(getClass().getResource("/fxml/novi.fxml"));
        stage.setTitle("Unos studenta");
        stage.setScene(new Scene(root,USE_COMPUTED_SIZE,USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
    }
}
