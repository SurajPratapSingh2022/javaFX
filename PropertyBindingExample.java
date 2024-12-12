package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class PropertyBindingExample {
	public static void main(String[] args) {
		IntegerProperty xProperty=new SimpleIntegerProperty(10);
		IntegerProperty yProperty=new SimpleIntegerProperty(0);
		IntegerProperty zProperty=new SimpleIntegerProperty(0);
		
		xProperty.addListener((obs,oldVal,newVal)->{
			System.out.println("Value of X is changed from "+oldVal+" to "+newVal);
		});
		yProperty.addListener((obs,oldVal,newVal)->{
			System.out.println("Value of Y is changed from "+oldVal+" to "+newVal);
		});
		zProperty.addListener((obs,oldVal,newVal)->{
			System.out.println("Value of Z is changed from "+oldVal+" to "+newVal);
		});
		
		
		System.out.println("Value of X="+xProperty.getValue());
		System.out.println("Value of Y="+yProperty.getValue());
		System.out.println("Value of Z="+zProperty.getValue());
		
		yProperty.bind(xProperty);
		zProperty.bind(xProperty.multiply(2));
		
		System.out.println("Value of X="+xProperty.getValue());
		System.out.println("Value of Y="+yProperty.getValue());
		System.out.println("Value of Z="+zProperty.getValue());
		
		xProperty.setValue(20);
		System.out.println("Value of X="+xProperty.getValue());
		System.out.println("Value of Y="+yProperty.getValue());
		System.out.println("Value of Z="+zProperty.getValue());
		
	}
}
