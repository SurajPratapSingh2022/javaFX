package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//PropertyExample
public class Person {
	private StringProperty nameProperty=new SimpleStringProperty("");
	public void setName(String name) {
		this.nameProperty.setValue(name);
		
	}
	public String getName() {
		return this.nameProperty.getValue();
		
	}
	public StringProperty getNameProperty() {
		return this.nameProperty;
	}
}
