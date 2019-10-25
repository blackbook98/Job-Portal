package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Signup 
{
	@FXML
	Button con;
	public void initialize() throws IOException
	{
		
	}
	
	  public void open1(ActionEvent e) throws IOException
		{
		  	Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("Choice.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		  
		}

}
