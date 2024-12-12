package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ReadWriteImages extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
    	 String imagePath = getClass().getResource("/application/bg.png").toExternalForm();
         Image originalImage = new Image(imagePath);
    	
//    	Image originalImage = new Image("application/img.png");
        int width = (int) originalImage.getWidth();
        int height = (int) originalImage.getHeight();

        WritableImage wImage1 = new WritableImage(width, height);
        WritableImage wImage2 = new WritableImage(width, height);

        PixelReader reader = originalImage.getPixelReader();
        PixelWriter writer1 = wImage1.getPixelWriter();
        PixelWriter writer2 = wImage2.getPixelWriter();

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = reader.getColor(x, y);
                writer1.setColor(x, y, color.darker());
                writer2.setColor(x, y, color.brighter());
            }
        }

        HBox root = new HBox();
        root.getChildren().add(new ImageView(originalImage));
        root.getChildren().add(new ImageView(wImage1));
        root.getChildren().add(new ImageView(wImage2));

        Scene scene = new Scene(root, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Image Example");
        stage.show();
    }
}