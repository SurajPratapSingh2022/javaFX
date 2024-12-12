package application;

import java.io.File;
import java.util.List;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileChooserExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FileChooser fileChooser=new FileChooser();
		fileChooser.setTitle("Select your files");
		
		fileChooser.setInitialDirectory(new File("C:\\Users\\suraj\\eclipse-workspace\\javaFX\\src\\application"));
//		fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
		
		FileChooser.ExtensionFilter filter1=new FileChooser.ExtensionFilter("All Files","*.*");
		FileChooser.ExtensionFilter filter2=new FileChooser.ExtensionFilter("JPEG Files","*.jpg");
		FileChooser.ExtensionFilter filter3=new FileChooser.ExtensionFilter("PNG Files","*.png");
		FileChooser.ExtensionFilter filter4=new FileChooser.ExtensionFilter("Java Files","*.java");
		
		fileChooser.getExtensionFilters().addAll(filter1,filter2,filter3,filter4);
		
		//open single file
//		File file=fileChooser.showOpenDialog(stage);
//		if(file != null)
//			System.out.println("Selected File: "+file.getAbsolutePath().toString());
//		else
//			System.out.println("No File Selected");
		
		
		//open multiple file
//		List<File> fileList=fileChooser.showOpenMultipleDialog(stage);
//		if(fileList != null) {
//			System.out.println("Selected Files: ");
//			for(int i=0; i<fileList.size(); i++) {
//				System.out.println(fileList.get(i).getAbsolutePath().toString());
//			}
//		}else {
//			System.out.println("No File selected");
//		}
		
		
		//open save Dialog
		File file=fileChooser.showSaveDialog(stage);
		if(file != null)
			System.out.println("Selected File: "+file.getAbsolutePath().toString());
		else
			System.out.println("No File Selected");
		
	}

}
