package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TreeViewControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		TreeView<String> treeView=new TreeView();
		
		TreeItem<String> root=new TreeItem<>("Files");
		treeView.setRoot(root);
		
		TreeItem<String> pictures=new TreeItem<>("Pictures");
		TreeItem<String> musics=new TreeItem<>("Music");
		TreeItem<String> videos=new TreeItem<>("Videos");
		
		root.getChildren().addAll(pictures,musics,videos);
		
		TreeItem<String> p1=new TreeItem<>("Pictures1");
		TreeItem<String> m1=new TreeItem<>("Music1");
		TreeItem<String> v1=new TreeItem<>("Videos1");
		TreeItem<String> p2=new TreeItem<>("Pictures2");
		TreeItem<String> p3=new TreeItem<>("Pictures2");
		TreeItem<String> m2=new TreeItem<>("Music2");
		TreeItem<String> v2=new TreeItem<>("Videos2");
		
		pictures.getChildren().addAll(p1,p2,p3);
		musics.getChildren().addAll(m1,m2);
		videos.getChildren().addAll(v1,v2);
		
		//show or hide root node
		treeView.setShowRoot(true);
		
		treeView.getSelectionModel()
		.selectedItemProperty()
		.addListener(new ChangeListener<TreeItem<String>>() {

			@Override
			public void changed(ObservableValue<? extends TreeItem<String>> arg0, TreeItem<String> arg1,
					TreeItem<String> newValue) {
				// TODO Auto-generated method stub
				if(newValue != null)
					System.out.println("Selected Item: "+newValue.getValue());
				
			}
		
		});
		
		String path="application\\img.png";
		Image image=new Image(path,20,20,true,true);
//		ImageView icon=new ImageView(image);
		
		root.setGraphic(new ImageView(image));
		pictures.setGraphic(new ImageView(image));
		musics.setGraphic(new ImageView(image));
		videos.setGraphic(new ImageView(image));
		p1.setGraphic(new ImageView(image));
		p2.setGraphic(new ImageView(image));
		p3.setGraphic(new ImageView(image));
		m1.setGraphic(new ImageView(image));
		m2.setGraphic(new ImageView(image));
		v1.setGraphic(new ImageView(image));
		v2.setGraphic(new ImageView(image));
		
		
		BorderPane rootPane=new BorderPane();
		rootPane.setCenter(treeView);
		Scene scene=new Scene(rootPane,400,400);
		stage.setScene(scene);
		stage.show();
	}

}
