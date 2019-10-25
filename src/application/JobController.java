package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class JobController 
{
	
	public static String a = "Welcome to the ZUVERSICHT JOB PORTAL!\n\n"+
							"A place where over 10,000 Software Engineers\n"+
							"have found their ideal dream jobs in their desired\n"+
							"field of specification. Now it's your turn!\n"+
							"Click on either 'Login' or 'Sign Up' to continue!";
	@FXML
	Label label;
	@FXML
	AnchorPane ap;
	@FXML
	Button login, signup;
	public void initialize() throws IOException
	{
		label.setText(a);
		label.setWrapText(true);
		label.setStyle("-fx-font-family: \" Monospaced \"; -fx-font-size: 20; -fx-text-fill: black; -fx-font-weight: bold; -fx-font-style: italic;");
	}
	
	  public void open1(ActionEvent e) throws IOException
		{
		  	Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("Signup.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		  
		}
	  
	  public void open2(ActionEvent e1) throws IOException
		{
		  	Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		  
		}
}
