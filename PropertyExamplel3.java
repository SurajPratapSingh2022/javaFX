package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.SimpleIntegerProperty;

public class PropertyExamplel3 {
	public static void main(String[] args) {
		ReadOnlyIntegerProperty readOnlyIntegerProperty=new ReadOnlyIntegerWrapper(100);
		readOnlyIntegerProperty.addListener((obs,oldVal,newVal)->{
			System.out.println("ReadOnly: Value is changed from "+oldVal+" to "+newVal);
			
		});
		System.out.println(readOnlyIntegerProperty.getValue());
		
		IntegerProperty integerProperty=new SimpleIntegerProperty(200);
		integerProperty.addListener((obs,oldVal,newVal)->{
			System.out.println("integerProperty: value is changed from "+oldVal+" to "+newVal);
		});
		System.out.println("integerProperty Value="+integerProperty.getValue());
		integerProperty.setValue(500);
		System.out.println("integerProperty value= "+integerProperty.getValue());
	}
}
