package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class QuizRecapController implements Initializable {

    @FXML
    private Button playAgain;

    @FXML
    private Button quitGame;
    
    @FXML
    private Label userScorelbl;


    
    @FXML
    void gameStart(ActionEvent event){ //starts new game
    	try {
    		GameScreen test = new GameScreen();
        	Stage gameStage = new Stage();
        	test.start(gameStage);
        	gameStage.show();
	    	
	    	Stage close = (Stage) playAgain.getScene().getWindow();
	    	close.close();
    	} catch(Exception e) {
    		System.out.println("Can not load new window");
    	}
    }
    
    @FXML
    void quitGame(ActionEvent event) { //Quit game
    	Stage stage = (Stage) quitGame.getScene().getWindow();
    	Stage test = (Stage) GameScreen.gameScore.getScene().getWindow();
    	stage.close();
    	test.close();
    	
    }

    
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		userScorelbl.setText(GameScreen.gameScore.getText());
	}
} //end class