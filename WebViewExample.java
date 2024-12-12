package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebViewExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	TextField textField;
	Button b1,b2,b3,b4,b5;
	WebEngine webEngine;

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root=new BorderPane();
		Scene scene=new Scene(root,600,400);
		scene.setFill(Color.BLACK);
		stage.setScene(scene);
		stage.setTitle("WebView Example");
		stage.show();
			
		WebView webView=new WebView();
		BorderPane.setMargin(webView, new Insets(10));
		root.setCenter(webView);
			
		webEngine=webView.getEngine();
			
			
		textField=new TextField();
		b1=new Button("Search");
		b2=new Button("Home");
		b3=new Button("Load HTML");
		b4=new Button("Execute JavaScript");
		b5=new Button("Reload Page");
			
		b1.setOnAction(this::loadUrl);
		b2.setOnAction(this::loadHome);
		b3.setOnAction(this::loadHtml);
		b4.setOnAction(this::runJavaScript);
		b5.setOnAction(this::reloadPage);
			
		HBox hbox=new HBox(10);
		hbox.getChildren().addAll(textField,b1,b2,b3,b4,b5);
		BorderPane.setMargin(hbox, new Insets(10,10,0,10));
		root.setTop(hbox);
	}
	private void loadUrl(ActionEvent e) {
		String url=textField.getText().toString();
		webEngine.load(url);
	}
	private void loadHome(ActionEvent e) {
		webEngine.load("http://www.google.com");
	}
	private void loadHtml(ActionEvent e) {
		StringBuilder sb=new StringBuilder()
				.append("<html>")
				.append("<body>")
				.append("<h1>Hello,This is an HTML Page</h1>")
				.append("Color:<input type='text' id='abc'/>")
				.append("</body>")
				.append("</html>");
		webEngine.loadContent(sb.toString());
		
	}
	private void runJavaScript(ActionEvent e) {
		String myScript="var color=document.getElementById('abc').value;\r\n"+"document.body.style.background=color";
		webEngine.executeScript(myScript);
	}
	private void reloadPage(ActionEvent e) {
		webEngine.reload();
	}
}
