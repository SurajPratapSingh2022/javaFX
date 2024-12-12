package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class RegionClass extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Label label=new Label("Hello Pane");
		HBox root=new HBox(label);
		Insets insets=new Insets(10,20,10,20);
		root.setPadding(insets);
		root.setMargin(label, new Insets(10));
		
		BorderStrokeStyle borderStrokeStyle=new BorderStrokeStyle(
				StrokeType.INSIDE,
				StrokeLineJoin.MITER,
				StrokeLineCap.BUTT,
				new Double(10),
				new Double(0),
				null
				);
		BorderStroke borderStroke=new BorderStroke(
				Color.RED,
				borderStrokeStyle,
				new CornerRadii(0),
				new BorderWidths(8)
				);
		Border border=new Border(borderStroke);
		
		//setting Background
//		BackgroundFill bgFill=new BackgroundFill(Color.valueOf("#ff00ff"), new CornerRadii(0), new Insets(0));
//		BackgroundFill bgFill2=new BackgroundFill(Color.valueOf("#00ff00"), new CornerRadii(100), new Insets(0));
//		Background bg=new Background(bgFill,bgFill2);
//		
//		root.setBackground(bg);
		
		Image image=new Image("./application/bg.PNG");
		BackgroundImage bgImage=new BackgroundImage(
				image,
				BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.CENTER,
				new BackgroundSize(100,100,true,true,true,true)
				);
		Background bg=new Background(bgImage);
		root.setBackground(bg);
		
		
		root.setBorder(border);
		
		Scene scene=new Scene(root, 400, 400);
		stage.setScene(scene);
		stage.setTitle("Region Class");
		stage.show();
	}

}
