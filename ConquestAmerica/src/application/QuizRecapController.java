package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class QuizRecapController {

    @FXML
    private Button playAgain;

    @FXML
    private Button quitGame;

    @FXML
    private Label AlabamaQuestionOne;

    @FXML
    private Label AlaskaQuestionOne;

    @FXML
    private Label ArizonaQuestionOne;

    @FXML
    private Label ArkansasQuestionOne;

    @FXML
    private Label CaliforniaQuestionOne;

    @FXML
    private Label ColoradoQuestionOne;

    @FXML
    private Label ConnecticutQuestionOne;

    @FXML
    private Label DelawareQuestionOne;

    @FXML
    private Label FloridaQuestionOne;

    @FXML
    private Label GeorgiaQuestionOne;

    @FXML
    private Label HawaiiQuestionOne;

    @FXML
    private Label IdahoQuestionOne;

    @FXML
    private Label IllinoisQuestionOne;

    @FXML
    private Label IndianaQuestionOne;

    @FXML
    private Label IowaQuestionOne;

    @FXML
    private Label KansasQuestionOne;

    @FXML
    private Label KentuckyQuestionOne;

    @FXML
    private Label LouisianaQuestionOne;

    @FXML
    private Label MaineQuestionOne;

    @FXML
    private Label MarylandQuestionOne;

    @FXML
    private Label MassQuestionOne;

    @FXML
    private Label MichiganQuestionOne;

    @FXML
    private Label MinnesotaQuestionOne;

    @FXML
    private Label MississippiQuestionOne;

    @FXML
    private Label MissouriQuestionOne;

    @FXML
    private Label AlabamaQuestionTwo;

    @FXML
    private Label AlaskaQuestionTwo;

    @FXML
    private Label ArizonaQuestionTwo;

    @FXML
    private Label ArkansasQuestionTwo;

    @FXML
    private Label CaliforniaQuestionTwo;

    @FXML
    private Label ColoradoQuestionTwo;

    @FXML
    private Label ConnecticutQuestionTwo;

    @FXML
    private Label DelawareQuestionTwo;

    @FXML
    private Label FloridaQuestionTwo;

    @FXML
    private Label GeorgiaQuestionTwo;

    @FXML
    private Label HawaiiQuestionTwo;

    @FXML
    private Label IdahoQuestionTwo;

    @FXML
    private Label IllinoisQuestionTwo;

    @FXML
    private Label IndianaQuestionTwo;

    @FXML
    private Label IowaQuestionTwo;

    @FXML
    private Label KansasQuestionTwo;

    @FXML
    private Label KentuckyQuestionTwo;

    @FXML
    private Label LouisianaQuestionTwo;

    @FXML
    private Label MaineQuestionTwo;

    @FXML
    private Label MarylandQuestionTwo;

    @FXML
    private Label MassQuestionTwo;

    @FXML
    private Label MichiganQuestionTwo;

    @FXML
    private Label MinnesotaQuestionTwo;

    @FXML
    private Label MississippiQuestionTwo;

    @FXML
    private Label MissouriQuestionTwo;

    @FXML
    private Label MontanaQuestionOne;

    @FXML
    private Label NebraskaQuestionOne;

    @FXML
    private Label NevadaQuestionOne;

    @FXML
    private Label NewHampshireQuestionOne;

    @FXML
    private Label NewJerseyQuestionOne;

    @FXML
    private Label NewMexicoQuestionOne;

    @FXML
    private Label NewYorkQuestionOne;

    @FXML
    private Label NorthCarolinaQuestionOne;

    @FXML
    private Label NorthDakotaQuestionOne;

    @FXML
    private Label OhioQuestionOne;

    @FXML
    private Label OklahomaQuestionOne;

    @FXML
    private Label OregonQuestionOne;

    @FXML
    private Label PennsylvaniaQuestionOne;

    @FXML
    private Label RhodeIslandQuestionOne;

    @FXML
    private Label SouthCarolinaQuestionOne;

    @FXML
    private Label SouthDakotaQuestionOne;

    @FXML
    private Label TennesseeQuestionOne;

    @FXML
    private Label TexasQuestionOne;

    @FXML
    private Label UtahQuestionOne;

    @FXML
    private Label VermontQuestionOne;

    @FXML
    private Label VirginiaQuestionOne;

    @FXML
    private Label WashingtonQuestionOne;

    @FXML
    private Label WestVirginiaQuestionOne;

    @FXML
    private Label WisconsinQuestionOne;

    @FXML
    private Label WyomingQuestionOne;

    @FXML
    private Label MontanaQuestionTwo;

    @FXML
    private Label NebraskaQuestionTwo;

    @FXML
    private Label NevadaQuestionTwo;

    @FXML
    private Label NewHampshireQuestionTwo;

    @FXML
    private Label NewJerseyQuestionTwo;

    @FXML
    private Label NewMexicoQuestionTwo;

    @FXML
    private Label NewYorkQuestionTwo;

    @FXML
    private Label NorthCarolinaQuestionTwo;

    @FXML
    private Label NorthDakotaQuestionTwo;

    @FXML
    private Label OhioQuestionTwo;

    @FXML
    private Label OklahomaQuestionTwo;

    @FXML
    private Label OregonQuestionTwo;

    @FXML
    private Label PennsylvaniaQuestionTwo;

    @FXML
    private Label RhodeIslandQuestionTwo;

    @FXML
    private Label SouthCarolinaQuestionTwo;

    @FXML
    private Label SouthDakotaQuestionTwo;

    @FXML
    private Label TennesseeQuestionTwo;

    @FXML
    private Label TexasQuestionTwo;

    @FXML
    private Label UtahQuestionTwo;

    @FXML
    private Label VermontQuestionTwo;

    @FXML
    private Label VirginiaQuestionTwo;

    @FXML
    private Label WashingtonQuestionTwo;

    @FXML
    private Label WestVirginiaQuestionTwo;

    @FXML
    private Label WisconsinQuestionTwo;

    @FXML
    private Label WyomingQuestionTwo;


    @FXML
    void gameStart(ActionEvent event){
    	try {
	    	Parent Game = FXMLLoader.load(getClass().getResource("GameScreen.fxml"));
	    	Scene root = new Scene(Game);	
	    	Stage stage = new Stage();
	    	stage.setTitle("Game Rough");
	    	stage.setScene(root);
	    	stage.show();
	    	
	    	Stage close = (Stage) playAgain.getScene().getWindow();
	    	close.close();
    	} catch(Exception e) {
    		System.out.println("Can not load new window");
    	}
    }
    
    @FXML
    void quitGame(ActionEvent event) {
    	Stage stage = (Stage) quitGame.getScene().getWindow();
    	stage.close();
    }
}
