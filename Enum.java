/**
*Author John Tyler Gafford
*November 1, 2016
*jtg2246@email.vccs.edu
*This program will prompt the user to select a month
*from the list provided then output a responce
*according to the seleceted month
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.ColumnConstraints;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.beans.value.ChangeListener;

public class Enum extends Application{
	public enum Month{ January, February, March, April, May, June, July,
		August, September, October, November, December
	}
	@Override
	public void start(Stage primaryStage){

		GridPane grid = new GridPane();
		for(int col=0; col<5; col++){
			ColumnConstraints column = new ColumnConstraints();
			column.setPercentWidth(20);
			grid.getColumnConstraints().add(column);
		}
		for(int ro=0; ro<3; ro++){
			RowConstraints row = new RowConstraints();
			row.setPercentHeight(33);
			grid.getRowConstraints().add(row);
		}

		Label prompt = new Label("Please select a Month");
		prompt.setStyle("-fx-font-size: 20px;");
		grid.add(prompt, 1, 0);
		GridPane.setColumnSpan(prompt, 3);
	
		Button cancelb = new Button("Cancel");
		grid.add(cancelb, 3, 2);

		ComboBox<Month> months = new ComboBox<Month>();
		months.getItems().add(Month.January);
		months.getItems().add(Month.February);
		months.getItems().add(Month.March);
		months.getItems().add(Month.April);
		months.getItems().add(Month.May);
		months.getItems().add(Month.June);
		months.getItems().add(Month.July);
		months.getItems().add(Month.August);
		months.getItems().add(Month.September);
		months.getItems().add(Month.October);
		months.getItems().add(Month.November);
		months.getItems().add(Month.December);
		grid.add(months, 1, 1);
		GridPane.setColumnSpan(months, 3);

		Label outputs = new Label("");
		outputs.setStyle("-fx-font-size: 20px;");
		GridPane.setColumnSpan(outputs, 3);

		ChangeListener<Month> output = (observable, oldValue, newValue)->{
			Month inputs = months.getValue();
			switch(inputs){
				case December:
					outputs.setText("Do you want to build a snow man?");
					grid.getChildren().remove(prompt);
					grid.getChildren().remove(outputs);
					grid.add(outputs, 1, 0);
				break;
				case January:
					outputs.setText("Do you want to build a snow man?");
					grid.getChildren().remove(prompt);
					grid.getChildren().remove(outputs);
					grid.add(outputs, 1, 0);
				break;
				case February:
					outputs.setText("Do you want to build a snow man?");
					grid.getChildren().remove(prompt);
					grid.getChildren().remove(outputs);
					grid.add(outputs, 1, 0);
				break;
				case March:
					outputs.setText("Happy Spring days!");
					grid.getChildren().remove(prompt);
					grid.getChildren().remove(outputs);
					grid.add(outputs, 1, 0);
				break;
				case April:
					outputs.setText("Happy Spring days!");
					grid.getChildren().remove(prompt);
					grid.getChildren().remove(outputs);
					grid.add(outputs, 1, 0);
				break;
				case May:
					outputs.setText("Happy Spring days!");
					grid.getChildren().remove(prompt);
					grid.getChildren().remove(outputs);
					grid.add(outputs, 1, 0);
				break;
				case June:
					outputs.setText("It's a summer time.");
					grid.getChildren().remove(prompt);
					grid.getChildren().remove(outputs);
					grid.add(outputs, 1, 0);
				break;
				case July:
					outputs.setText("It's a summer time.");
					grid.getChildren().remove(prompt);
					grid.getChildren().remove(outputs);
					grid.add(outputs, 1, 0);
				break;
				case August:
					outputs.setText("It's a summer time.");
					grid.getChildren().remove(prompt);
					grid.getChildren().remove(outputs);
					grid.add(outputs, 1, 0);
				break;
				case September:
					outputs.setText("Welcome to the foliage season!");
					grid.getChildren().remove(prompt);
					grid.getChildren().remove(outputs);
					grid.add(outputs, 1, 0);
				break;
				case October:
					outputs.setText("Welcome to the foliage season!");
					grid.getChildren().remove(prompt);
					grid.getChildren().remove(outputs);
					grid.add(outputs, 1, 0);
				break;
				case November:
					outputs.setText("Welcome to the foliage season!");
					grid.getChildren().remove(prompt);
					grid.getChildren().remove(outputs);
					grid.add(outputs, 1, 0);
				break;
				default:
			}	
		};

		cancelb.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent cancela){
				System.exit(0);
			}
		});

		months.valueProperty().addListener(output);

		Scene scene= new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
