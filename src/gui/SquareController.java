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
import model.entities.Square;
import util.Alerts;

public class SquareController implements Initializable {
	
	Square square;
	double lado = 0.0;

	@FXML
	private TextField txtLado;
	
	@FXML
	private Button btCalculate;
	
	@FXML
	private Label labelArea;
	
	@FXML
	private Label labelPerimeter;
	
	private void calculate() {
		
		initializeObjects();
		if(lado == 0) {
			Alerts.showMessage("Atenção!", null, "Informe um número válido.", AlertType.ERROR);
		}else {
			try {			
				labelArea.setText(String.format("%.2f", square.area(lado)));
				labelPerimeter.setText(String.format("%.2f",square.perimeter(lado)));
			}
			catch(NullPointerException e) {
				Alerts.showMessage("Atenção!", null, e.getMessage(), AlertType.ERROR);
			}
		}
	}
	
	private void initializeObjects() {
		square = new Square();
		lado = Double.parseDouble(txtLado.getText());
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
