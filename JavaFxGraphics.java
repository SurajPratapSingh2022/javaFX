package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

public class JavaFxGraphics extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root=new Group();
		
//		Text text=new Text();
//		text.setText("Welcome");
//		text.setX(100);
//		text.setY(100);
//		text.setFont(Font.font("Times New Roman",60));
//		text.setFill(Color.RED);
//		text.setStroke(Color.BLACK);
//		text.setStrokeWidth(.5);
//		text.setStrikethrough(true);
//		root.getChildren().add(text);
		
		
//		Line line=new Line();
//		line.setStartX(100);
//		line.setStartY(100);
//		line.setEndX(200);
//		line.setEndY(200);
//		line.setStrokeWidth(5);
//		line.setStroke(Color.RED);
//		line.setOpacity(0.5);
//		root.getChildren().add(line);
		
		
//		Rectangle rectangle=new Rectangle();
//		rectangle.setX(100);
//		rectangle.setY(100);
//		rectangle.setWidth(200);
//		rectangle.setHeight(100);
//		rectangle.setFill(Color.YELLOW);
//		rectangle.setStroke(Color.RED);
//		rectangle.setStrokeWidth(5);
//		rectangle.setArcHeight(20);
//		rectangle.setArcWidth(20);
//		root.getChildren().add(rectangle);
		
		
//		Polygon polygon=new Polygon(100,200,300,200,200,100);
//		polygon.setFill(Color.YELLOW);
//		polygon.setStroke(Color.RED);
//		polygon.setStrokeWidth(5);
//		root.getChildren().add(polygon);
		
		
//		Circle circle=new Circle();
//		circle.setCenterX(200);
//		circle.setCenterY(200);
//		circle.setRadius(100);
//		circle.setFill(Color.YELLOW);
//		circle.setStroke(Color.BLACK);
//		circle.setStrokeWidth(3);
//		root.getChildren().add(circle);

		
//		Ellipse ellipse=new Ellipse();
//		ellipse.setCenterX(200);
//		ellipse.setCenterY(200);
//		ellipse.setRadiusX(100);
//		ellipse.setRadiusY(50);
//		ellipse.setFill(Color.YELLOW);
//		ellipse.setStroke(Color.BLACK);
//		ellipse.setStrokeWidth(3);
//		root.getChildren().add(ellipse);
		
		
//		Arc arc=new Arc();
//		arc.setCenterX(200);
//		arc.setCenterY(200);
//		arc.setRadiusX(200);
//		arc.setRadiusY(200);
//		arc.setStartAngle(0);
//		arc.setLength(60);
//		arc.setType(ArcType.ROUND);
//		arc.setFill(Color.GREENYELLOW);
//		arc.setStroke(Color.BLACK);
//		root.getChildren().add(arc);
		
		
//		Image image=new Image(getClass().getResourceAsStream("brain.png"));
//		ImageView imageView=new ImageView(image);
//		imageView.setX(200);
//		imageView.setY(200);
//		root.getChildren().add(imageView);
		
		
//		QuadCurve quad=new QuadCurve();
//		quad.setStartX(100);
//		quad.setStartY(220);
//		quad.setControlX(250);
//		quad.setControlY(0);
//		quad.setEndX(500);
//		quad.setEndY(220);
//		root.getChildren().add(quad);
		
//		QuadCurve quad=new QuadCurve(100,220,250,0,500,220);
//		root.getChildren().add(quad);
		
		
		CubicCurve cubic=new CubicCurve();
		cubic.setStartX(100);
		cubic.setStartY(150);
		cubic.setControlX1(400);
		cubic.setControlY1(40);
		cubic.setControlX2(175);
		cubic.setControlY2(250);
		cubic.setEndX(500);
		cubic.setEndY(150);
		root.getChildren().add(cubic);
		
		
		
		Scene scene=new Scene(root,800,600);
		stage.setScene(scene);
		stage.show();
		stage.setTitle("Graphics Programming");
		
	}

}
