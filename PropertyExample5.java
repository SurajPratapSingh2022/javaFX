package application;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.SimpleBooleanProperty;

public class PropertyExample5 {
	public static void main(String[] args) {
		ReadOnlyBooleanProperty readOnlyBooleanProperty=new ReadOnlyBooleanWrapper(false);
		readOnlyBooleanProperty.addListener((obs,oldVal,newVal)->{
			System.out.println("readonly value is changed from "+oldVal+" to "+newVal);
		});
		System.out.println("readonly value= "+readOnlyBooleanProperty.getValue());
		
		BooleanProperty booleanProperty=new SimpleBooleanProperty(false);
		booleanProperty.addListener((obs,oldVal,newVal)->{
			System.out.println("booleanProperty value is changed from "+oldVal+" to "+newVal);
			
		});
		System.out.println("booleanProperty value="+booleanProperty.getValue());
		booleanProperty.setValue(true);
		System.out.println("booleanProperty value="+booleanProperty.getValue());
		
		
		
		
		
		
		
		
	}
}
