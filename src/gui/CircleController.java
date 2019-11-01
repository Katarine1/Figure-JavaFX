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
import model.entities.Circle;
import util.Alerts;

public class CircleController implements Initializable {
	
	Circle circle;
	double radius = 0.0;

	@FXML
	private TextField txtRadius;
	
	@FXML
	private Button btCalculate;
	
	@FXML
	private Label labelArea;
	
	@FXML
	private Label labelPerimeter;
	
	private void calculate() {
		
		initializeObjects();
		if(radius == 0) {
			Alerts.showMessage("Atenção!", null, "Informe um número válido.", AlertType.ERROR);
		}else {
			try {			
				labelArea.setText(String.format("%.2f", circle.area(radius)));
				labelPerimeter.setText(String.format("%.2f",circle.perimeter(radius)));
			}
			catch(NullPointerException e) {
				Alerts.showMessage("Atenção!", null, e.getMessage(), AlertType.ERROR);
			}
		}
	}
	
	private void initializeObjects() {
		circle = new Circle();
		radius = Double.parseDouble(txtRadius.getText());
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
