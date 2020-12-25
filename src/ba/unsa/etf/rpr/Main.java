package ba.unsa.etf.rpr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/zadaca2.fxml"));
        primaryStage.setTitle("Studenti");
        primaryStage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        primaryStage.setMinHeight(291);
        primaryStage.setMinWidth(414);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    /*Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("Neispravno ime");
      alert.setHeaderText("Neispravno ime studenta");
      alert.setContentText("Ime studenta treba biti najmanje 10 karaktera dugačko");

      alert.showAndWait();
*/
}
