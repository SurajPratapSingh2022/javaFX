package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class PropertyExample{
	public static void main(String[] args) {
		Person p=new Person();
		p.getNameProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> obj,String oldVal,String newVal) {
				System.out.println("Name value is changed from "+oldVal+"to"+newVal);
			}
		});
		p.setName("Ram Kumar");
		System.out.println("Name is: "+p.getName());
		p.setName("Sandeep Kumar");
		System.out.println("Name is: "+p.getName());
		p.setName("Kuldeep Kumar");
		System.out.println("Name is: "+p.getName());
		
		
		
	}
	

}
