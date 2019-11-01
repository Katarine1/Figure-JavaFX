package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Rectangle;
import util.Alerts;

public class RectangleController implements Initializable {
	
	Rectangle rectangle;
	double width = 0.0;
	double height = 0.0;

	@FXML
	private TextField txtWidth;
	
	@FXML
	private TextField txtHeight;
	
	@FXML
	private Button btCalculate;
	
	@FXML
	private Label labelArea;
	
	@FXML
	private Label labelPerimeter;
	
	private void calculate() {
		
		initializeObjects();
		if(width == 0 && height == 0) {
			Alerts.showMessage("Atenção!", null, "Informe um número válido.", AlertType.ERROR);
		}else {
			try {			
				labelArea.setText(String.format("%.2f", rectangle.area(width,height)));
				labelPerimeter.setText(String.format("%.2f",rectangle.perimeter(width,height)));
			}
			catch(NullPointerException e) {
				Alerts.showMessage("Atenção!", null, e.getMessage(), AlertType.ERROR);
			}
		}
	}
	
	private void initializeObjects() {
		rectangle = new Rectangle();
		width = Double.parseDouble(txtWidth.getText());
		height = Double.parseDouble(txtHeight.getText());
	}
	
	@FXML
	public void onBtCalculate(ActionEvent event) {
		calculate();		
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}		
}
