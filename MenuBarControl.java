package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuBarControl extends Application implements EventHandler<ActionEvent>{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root=new BorderPane();
		Scene scene=new Scene(root,600,400);
		stage.setScene(scene);
		stage.setTitle("MenuBar Example");
		stage.show();
		
		MenuBar menuBar=new MenuBar();
		root.setTop(menuBar);
		
		Menu fileMenu=new Menu("File");
		Menu editMenu=new Menu("Edit");
		Menu helpMenu=new Menu("Help");
		
		menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu);
		
		MenuItem newItem=new MenuItem("New");
//		newItem.setGraphic(new ImageView(new Image("application\\img1.png",16,16,true,true)));
		
		
		
		
		
		
		
		MenuItem openItem=new MenuItem("Open");
		MenuItem saveItem=new MenuItem("Save");
		MenuItem exitItem=new MenuItem("Exit");
		MenuItem cutItem=new MenuItem("Cut");
		MenuItem copyItem=new MenuItem("Copy");
		MenuItem pasteItem=new MenuItem("Paste");
		MenuItem aboutItem=new MenuItem("About");
		
		Menu subMenu=new Menu("Alignment");
		MenuItem leftItem=new MenuItem("Left");
		MenuItem centerItem=new MenuItem("Center");
		MenuItem rightItem=new MenuItem("Right");
		subMenu.getItems().addAll(leftItem,centerItem,rightItem);
		
		SeparatorMenuItem separator=new SeparatorMenuItem();
		
		
		fileMenu.getItems().addAll(newItem,openItem,saveItem,separator,exitItem);
		editMenu.getItems().addAll(cutItem,copyItem,pasteItem,subMenu);
		helpMenu.getItems().addAll(aboutItem);
		
		newItem.setOnAction(this);
		openItem.setOnAction(this);
		saveItem.setOnAction(this);
		exitItem.setOnAction(this);
		copyItem.setOnAction(this);
		cutItem.setOnAction(this);
		pasteItem.setOnAction(this);
		leftItem.setOnAction(this);
		centerItem.setOnAction(this);
		rightItem.setOnAction(this);
		aboutItem.setOnAction(this);
		
		exitItem.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));
	}
	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		MenuItem menuItem=(MenuItem)e.getSource();
		System.out.println(menuItem.getText()+" clicked");
		
	}

}
