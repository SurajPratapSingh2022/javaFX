package application;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MediaControl extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\suraj\\eclipse-workspace\\javaFX\\src\\application\\video.mp4");
		String urlString=file.toURI().toURL().toString();
		Media media=new Media(urlString);
		
		MediaPlayer mediaPlayer=new MediaPlayer(media);
//		mediaPlayer.setAutoPlay(true);
//		System.out.println("Playing media");
		
		MediaView mediaView=new MediaView(mediaPlayer);
		mediaView.setFitWidth(640);
		mediaView.setFitHeight(480);
		
		HBox hbox=new HBox();
		hbox.setSpacing(10);
		Button playButton=new Button("Play");
		Button pauseButton=new Button("Pause");
		Button stopButton=new Button("Stop");
		Button resetButton=new Button("Reset");
		
		playButton.setOnAction((e)->mediaPlayer.play());
		pauseButton.setOnAction((e)->mediaPlayer.pause());
		stopButton.setOnAction((e)->mediaPlayer.stop());
		resetButton.setOnAction((e)->mediaPlayer.seek(Duration.ZERO));
		
		hbox.getChildren().addAll(playButton,pauseButton,stopButton,resetButton);
		
		VBox root=new VBox();
		root.setAlignment(Pos.CENTER);
		root.getChildren().add(mediaView);
		root.getChildren().add(hbox);
		stage.setScene(new Scene(root,700,550));
		stage.setTitle("MediaPlayer Example");
		stage.show();
	}

}
