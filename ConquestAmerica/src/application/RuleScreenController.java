package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RuleScreenController {

    @FXML
    private Button closeButton;

    @FXML
    void quitRules(ActionEvent event) {
    	Stage stage = (Stage) closeButton.getScene().getWindow();
    	stage.close();
    }
    
}
