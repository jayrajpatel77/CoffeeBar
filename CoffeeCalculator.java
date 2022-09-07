import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CoffeeCalculator  extends Application {

	@Override
	public void start(Stage stage)  {
		
		double whiteBagel =1.25;
		double wholeWheatBagel=1.50;
		double regularCoffe=1.25;
		double cappuccino=2.00;
		double cafeAuLait=1.75;
		double creamcheese=0.50;
		double butter=0.25;
		double blueberry=0.75;
		double rasberryJam=0.75;
		double peachJelly=0.75;
		
		Label l1 = new Label("Select a Bagel");
		
		RadioButton white = new RadioButton("White ($1.25)");
		RadioButton wholeWheat = new RadioButton("Whole Wheat ($1.50)");
		//RadioButton pop = new RadioButton("Pop");
		ToggleGroup t1 = new ToggleGroup();
		
		white.setToggleGroup(t1);
		wholeWheat.setToggleGroup(t1);
		VBox vbox = new VBox(5);
		
		vbox.setSpacing(20);
		
		vbox.setPadding(new Insets(5, 10, 20, 5.0));
		
		vbox.getChildren().addAll(l1, white, wholeWheat);
		
		vbox.setStyle("-fx-border-radius: 0px; -fx-border-width: 2px; -fx-border-color: #053d12;");
		
		
		Label l2 = new Label("Select a Coffee");
		RadioButton none = new RadioButton("none");
		RadioButton regularCoffee = new RadioButton("Regular Coffee($1.25)");
		RadioButton cappciuno = new RadioButton("Cappucciuno ($2.00)");
		RadioButton cafe = new RadioButton("Cafe au lait($1.75)");
		ToggleGroup t2 = new ToggleGroup();
		
		none.setToggleGroup(t2);
		regularCoffee.setToggleGroup(t2);
		cappciuno.setToggleGroup(t2);
		cafe.setToggleGroup(t2);
		VBox vbox1 = new VBox(5);
		
		vbox.setSpacing(20);
		
		vbox.setPadding(new Insets(15, 25, 20, 5.0));
		
		vbox.getChildren().addAll(l2,none,regularCoffee,cappciuno,cafe);
		
		vbox.setStyle("-fx-border-radius: 0px; -fx-border-width: 2px; -fx-border-color: #053d12;");
		
		Label l3 =new Label("Select a Toppings");
		CheckBox c1 = new CheckBox("Cream Cheese");
		CheckBox c2 = new CheckBox("Butter");
		CheckBox c3 = new CheckBox("BlueBerry Jam");
		CheckBox c4 = new CheckBox("rasberry jam");
		CheckBox c5 = new CheckBox("Peach Jelly");
		
		//ToggleGroup t3 = new ToggleGroup();
		
		
		VBox vbox2 = new VBox(5);
		
		vbox.setSpacing(20);
		
		vbox.setPadding(new Insets(15, 25, 20, 5.0));
		
		vbox.getChildren().addAll(l3,c1,c2,c3,c4,c5);
		
		
		TextField text = new TextField();
		TextField text2 = new TextField();
		TextField text3 = new TextField();
		

		Button ctotal = new Button("calulate Total");
		Button clear = new Button("clear");
		Button exit = new Button("exit");
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(ctotal,clear,exit,text,text2,text3);
		
		ctotal.setOnAction(new EventHandler<ActionEvent>(){
			
			
			public void handle(ActionEvent event) {
				
				double total=0;
				if() {
					
				}
				
			}
			
		});
		
		
		//Group root = new Group();
		
		//root.getChildren().addAll(text,text2,text3);
		
			
		BorderPane bPane = new BorderPane();
		bPane.setPrefSize(200, 150);
		bPane.setTop(vbox);	
		bPane.setLeft(vbox1);
		bPane.setRight(vbox2);
		bPane.setBottom(hbox);
		Scene scene = new Scene(bPane);
	
			
		stage.setScene(scene);
		
		stage.setTitle("Coffee and Bagel Bar");
			
		stage.show();
		
		
			
			
	}
	public static void main(String[] args) {
		launch(args);
	}
}
	
	
	


