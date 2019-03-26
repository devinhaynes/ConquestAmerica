package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GameScreenController implements Initializable{



    @FXML
    private Label scoreCard;

    @FXML
    private Button surrenderButton;

    @FXML
    private Button attackButton;

    @FXML
    private ChoiceBox<String> stateList;
    
    @FXML
    void attackState(ActionEvent event){
    	try {
    		// Need to select state by click function
    		
    		String attackedState = stateList.getValue();
	    	if (attackedState == "--State--") {
	    		Parent err = FXMLLoader.load(getClass().getResource("Error.fxml"));
		    	Scene root = new Scene(err);
		    	Stage owner = (Stage) attackButton.getScene().getWindow();
		    	Stage stage = new Stage();
		    	
		    	stage.initModality(Modality.WINDOW_MODAL);
		    	stage.initOwner(owner);
		    	stage.setTitle("Error Rough");
		    	stage.setScene(root);
		    	stage.show();
	    	} else {
	    		//Set the state for quiz screen
	    		QuizScreenController quizControl = new QuizScreenController();
	    		quizControl.setState(stateList.getValue());
		    	Parent Game = FXMLLoader.load(getClass().getResource("QuizScreen.fxml"));
		    	Scene root = new Scene(Game);
		    	Stage owner = (Stage) attackButton.getScene().getWindow();
		    	Stage stage = new Stage();
		    	
		    	stage.initModality(Modality.WINDOW_MODAL);
		    	stage.initOwner(owner);
		    	stage.setTitle(stateList.getValue());
		    	stage.setScene(root);
		    	stage.show();
	    	}
	    	
	    	/* NOTES: 
	    	 	find a way to pass what state is being attacked
	    	 	and pass the score back out
	    	 */
    	} catch(Exception e) {
    		System.out.println("Can not load new window");
    	}
    }
    
    @FXML
    void surrenderGame(ActionEvent event){
    	try {
    		Parent Game = FXMLLoader.load(getClass().getResource("QuizRecap.fxml"));
	    	Scene root = new Scene(Game);
	    	Stage stage = new Stage();
	    	stage.setTitle("Recap Rough");
	    	stage.setScene(root);
	    	stage.show();
	    	
	    	Stage close = (Stage) surrenderButton.getScene().getWindow();
	    	close.close();   	
	    	
	    	
	    	/* NOTES: 
    	 		find a way to pass what states have been attacked
    	 		and to pass which questions they got right or wrong
	    	 */
    	} catch(Exception e) {
    		System.out.println("Can not load new window");
    	}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<String> states = FXCollections.observableArrayList(
				"Alabama","Alaska","Arizona","Arkansas","California","California","Colorado","Connecticut","Delaware","Florida",
				"Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine",
				"Maryland","Massachusetts","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey",
				"New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina",
				"South Dakota","Tennesee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming", "--State--");
		
		stateList.setItems(states);
		stateList.setValue("--State--");
		
	}	
	
}
