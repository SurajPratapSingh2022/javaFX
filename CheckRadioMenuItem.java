package application;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CheckRadioMenuItem extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	CheckMenuItem autoSave;
	RadioMenuItem update1;
	RadioMenuItem update2;
	Label label;
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root=new BorderPane();
		Scene scene=new Scene(root,600,400);
		stage.setScene(scene);
		stage.setTitle("MenuBar Example");
		stage.show();
		
		label=new Label("Settings will appear here");
		root.setCenter(new StackPane(label));
		
		MenuBar menubar=new MenuBar();
		Menu fileMenu=new Menu("File");
		Menu editMenu=new Menu("Edit");
		Menu settings=new Menu("Settings");
		menubar.getMenus().addAll(fileMenu,editMenu,settings);
		root.setTop(menubar);
		
		autoSave=new CheckMenuItem("Auto-Save");
		update1=new RadioMenuItem("Auto-Update");
		update2=new RadioMenuItem("Ask for Update");
		ToggleGroup toggleGroup=new ToggleGroup();
		update1.setToggleGroup(toggleGroup);
		update2.setToggleGroup(toggleGroup);
		update1.setSelected(true);
		
		autoSave.setOnAction(this::showSettings);
		update1.setOnAction(this::showSettings);
		update2.setOnAction(this::showSettings);
		
		settings.getItems().addAll(autoSave,update1,update2);
	}
	private void showSettings(ActionEvent e) {
		String str="";
		if(autoSave.isSelected()) {
			str+="AutoSave is ON";
		}else {
			str+="AutoSave is OFF";
		}
		str+="\n";
		if(update1.isSelected()) {
			str+="AutoUpadate is ON";
		}else if(update2.isSelected()) {
			str+="Ask for Update is ON";
		}
		label.setText(str);
	}

}
