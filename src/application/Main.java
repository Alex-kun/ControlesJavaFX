package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Main extends Application {
	private Stage primaryStage;
	private AnchorPane rootLayout;
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Tablas");
			
			//Load from JavaFX
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Vista.fxml"));
			rootLayout = (AnchorPane) loader.load();
			
			
			Scene scene = new Scene(rootLayout);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
