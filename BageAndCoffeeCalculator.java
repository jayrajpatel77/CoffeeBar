
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class BageAndCoffeeCalculator  extends Application {

	@Override
	public void start(Stage stage)  {
		
		Label l1 = new Label("Select a Bagel");
		Label l2 =new Label("$");
		RadioButton white = new RadioButton("White");
		RadioButton wholeWheat = new RadioButton("Whole Wheat");
		//RadioButton pop = new RadioButton("Pop");
		ToggleGroup t1 = new ToggleGroup();
		
		white.setToggleGroup(t1);
		wholeWheat.setToggleGroup(t1);
		VBox vbox = new VBox(5);
		
		vbox.setSpacing(20);
		
		vbox.setPadding(new Insets(5, 10, 20, 5.0));
		
		vbox.getChildren().addAll(l1, white, wholeWheat);
		
		vbox.setStyle("-fx-border-radius: 0px; -fx-border-width: 2px; -fx-border-color: #053d12;");
		
		
		
	
			
		BorderPane bPane = new BorderPane();
		bPane.setTop(vbox);	
		Scene scene = new Scene(bPane);
	
			
		stage.setScene(scene);
		
		stage.setTitle("Lunch Menu");
			
		stage.show();
		
		
			
			
	}
	public static void main(String[] args) {
		launch(args);
	}
}
	
	
	


