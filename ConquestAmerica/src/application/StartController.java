package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StartController{

    @FXML
    private AnchorPane startPane;

    @FXML
    private Button startGame;

    @FXML
    private Button ruleScreen;

    @FXML
    private Button quitButton;

    @FXML
    void gameStart(ActionEvent event){
    	try {
    		GameScreen game = new GameScreen();
        	Stage gameStage = new Stage();
        	game.start(gameStage);
        	gameStage.show();
        	
        	Stage close = (Stage) startGame.getScene().getWindow();
        	close.close();
    	} catch(Exception e) {
    		System.out.println("Can not load new window");
    	}
    }
    
    @FXML
    void ruleScreen(ActionEvent event) {
    	try {
    		
	    	Parent Rules = FXMLLoader.load(getClass().getResource("RuleScreen.fxml"));
	    	Scene root = new Scene(Rules);
	    	Stage owner = (Stage) startGame.getScene().getWindow();
	    	Stage stage = new Stage();
	    	
	    	stage.initModality(Modality.WINDOW_MODAL);
	    	stage.initOwner(owner);
	    	stage.setTitle("Conquest Rules");
	    	stage.setScene(root);
	    	stage.show();
    	} catch(Exception e) {
    		System.out.println("Can not load new window");
    	}
    }
    
    @FXML
    void quitStart(ActionEvent event) {
    	Stage stage = (Stage) quitButton.getScene().getWindow();
    	stage.close();
    }
}