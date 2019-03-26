package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class QuizScreenController implements Initializable{
	
    @FXML
    private Button submitButton;

    @FXML
    private Button retreatButton;
    
    @FXML
    private Button returnGame;
    
    @FXML 
    private Label resultOne;
    
    @FXML 
    private Label resultTwo;
    
    @FXML
    private Label stateName;

    @FXML
    private Label questionOne;

    @FXML
    private Label questionTwo;

    @FXML
    private TextArea answerOne;

    @FXML
    private TextArea answerTwo;
    
    static String answerState;
    static String answerCapital;
    
    @FXML
    void retreatBattle(ActionEvent event){
	    	Stage close = (Stage) retreatButton.getScene().getWindow();
	    	close.close();
    }
    
    @FXML
    void submitAnswers(ActionEvent event) {
    	submitButton.setVisible(false);
    	retreatButton.setVisible(false);
    	returnGame.setVisible(true);
    	
    	String inputState = answerOne.getText().toLowerCase().trim();
    	String inputCapital = answerTwo.getText().toLowerCase().trim();
    	int tally = 0;
    	
    	if(inputState.equals(answerState.toLowerCase())) {
    		resultOne.setText("Correct");
    		tally++;
    		GameScreen.scoreIncrement();
    	} else {
    		resultOne.setText("Incorrect");
    	}
    	
    	if (inputCapital.equals(answerCapital.toLowerCase())) {
    		resultTwo.setText("Correct");
    		GameScreen.scoreIncrement();
    		tally++;
    	} else {
    		resultTwo.setText("Incorrect");
    	}    	
    	
    	//If user answers both questions correctly, change state color to blue
    	//Otherwise, change state color to red
    	if(tally == 2) {
    		GameScreen.changeStateColorWin();
    	} else {
    		GameScreen.changeStateColorLose();
    	}
    	
    }
    
    @FXML
    void returnConquest(ActionEvent event) {
    	Stage close = (Stage) returnGame.getScene().getWindow();
    	close.close();
    }

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		returnGame.setVisible(false);
	}
	
	public static void setState(String state) {
		answerState = state;
	}
	
	public static void setCapital(String capital) {
		answerCapital = capital;
	}

	
}
