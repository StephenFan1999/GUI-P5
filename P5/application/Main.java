package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// create label
			Label mylabel = new Label("Steve's Label");
			System.out.println(mylabel.getText());
			
			//Build Combo Box
			ObservableList<String> options =
					FXCollections.observableArrayList(
							"Option 1",
							"Option 2",
							"Option 3"
					);
			
			final ComboBox comboBox = new ComboBox(options);
			
			BorderPane root = new BorderPane();
			
			// set label in center of pane
			root.setTop(mylabel);
			root.setLeft(comboBox);
			
			// width,height
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			//create title bar
			primaryStage.setTitle("Steve's Title Bar");
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//use command-line here, before calling launch
		
		launch(args);
	}
}
