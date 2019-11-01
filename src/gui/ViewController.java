package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class ViewController implements Initializable{

	public static Stage  parentStage;
	
	@FXML
	private Menu menuExit;
	
	@FXML
	private MenuItem menuItemCircle;
	
	@FXML
	private MenuItem menuItemSquare;
	
	@FXML
	private MenuItem menuItemRectangle;
	
	@FXML
	private MenuItem menuItemTriangle;
	
	@FXML
	public void onMenuExitAction(ActionEvent event) {
		System.exit(0);
		Platform.exit();
	}
	
	@FXML
	public void onMenuItemCircleAction(ActionEvent event) {		
		loadDialog("/gui/CircleForm.fxml", "Circle");
	}
	
	@FXML
	public void onMenuItemSquareAction(ActionEvent event) {
		loadDialog("/gui/SquareForm.fxml", "Square");
	}
	
	@FXML
	public void onMenuItemRectangleAction(ActionEvent event) {
		loadDialog("/gui/RectangleForm.fxml", "Rectangle");
	}
	
	@FXML
	public void onMenuItemTriangleAction(ActionEvent event) {
		loadDialog("/gui/TriangleForm.fxml", "Triangle");
	}
	
	private void loadDialog(String file, String title) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(file));
			Scene scene = new Scene(parent);
			parentStage = new Stage();			
			parentStage.setTitle(title);
			//parentStage.getIcons().add(new Image("/img/img.jpg"));
			parentStage.setResizable(false);
			parentStage.setScene(scene);			
			parentStage.show();			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
}