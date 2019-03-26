package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ErrorController {
	@FXML
	private Button panicButton;
	
	@FXML
	private Button returnButton;
	
	@FXML
	void returnGame(ActionEvent event) {
		Stage close = (Stage) panicButton.getScene().getWindow();
    	close.close();
	}
}
