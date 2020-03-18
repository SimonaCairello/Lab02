package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private AlienDictionary dictionary;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtAlien;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtTranslation;

    @FXML
    private Button btnClear;

    @FXML
    void doReset(ActionEvent event) {
    	this.dictionary.reset();
    	
    	txtAlien.clear();
    	txtTranslation.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String s = txtAlien.getText().toLowerCase();
    	
    	String pattern = "[A-Za-z ]*";
    	if(!s.matches(pattern)) {
    		txtTranslation.clear();
    		txtTranslation.appendText("Caratteri non validi!\n");
    		return;
    	}
    	
    	if(s.contains(" ")) {
    		txtTranslation.clear();
    		String[] p = s.split(" ");
    		dictionary.addWord(p[0], p[1]);
    		txtTranslation.appendText("Parola aggiunta al dizionario.\n");
    	}
    	else {
    		txtTranslation.clear();
    		txtTranslation.appendText(dictionary.translateWord(s)+"\n");
    	}
    }

    @FXML
    void initialize() {
    	this.dictionary = new AlienDictionary();
        assert txtAlien != null : "fx:id=\"txtAlien\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTranslation != null : "fx:id=\"txtTranslation\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
