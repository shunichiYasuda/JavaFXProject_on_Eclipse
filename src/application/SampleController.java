package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SampleController {
	@FXML
	TextArea log;
	
	@FXML
	private void quitAction() {
		System.exit(0);
	}
	
	@FXML
	private void execAction() {
		log.appendText("Hello JavaFX!\n");
	}
}
