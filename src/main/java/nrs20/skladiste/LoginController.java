package nrs20.skladiste;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public TextField fldUsername;
    public PasswordField fldPassword;
    public Button btnLogin;
    public Hyperlink hlRegisterAccount;

    public void btnLogin(ActionEvent actionEvent) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/home.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();

            Stage stage = new Stage();
            stage.setTitle("Skladiste");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void passInput(ActionEvent actionEvent) {
    }

    public void usernameInput(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void hlKreirajRacun(ActionEvent actionEvent) {
        otvoriRegistraciju();
    }
    private void otvoriRegistraciju(){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/fxml/registracija.fxml"));
            Scene scene = new Scene(root);
            Stage nStage = new Stage();
            nStage.setScene(scene);
            nStage.setTitle("Registracija");
            nStage.show();
            Stage stage = (Stage) hlRegisterAccount.getScene().getWindow();
            stage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
