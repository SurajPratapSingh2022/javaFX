package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class PropertyExample4 {
    public static void main(String[] args) {
        // Use ReadOnlyDoubleWrapper to create a ReadOnlyDoubleProperty
        ReadOnlyDoubleWrapper readOnlyDoubleWrapper = new ReadOnlyDoubleWrapper(100);
        ReadOnlyDoubleProperty readOnlyDoubleProperty = readOnlyDoubleWrapper.getReadOnlyProperty();
        readOnlyDoubleProperty.addListener((obs, oldVal, newVal) -> {
            System.out.println("readonly value is changed from " + oldVal + " to " + newVal);
        });
        System.out.println("readonly value " + readOnlyDoubleProperty.getValue());

        // Use SimpleDoubleProperty to create a DoubleProperty
        DoubleProperty doubleProperty = new SimpleDoubleProperty(200);
        doubleProperty.addListener((obs, oldVal, newVal) -> {
            System.out.println("doubleProperty value is changed from " + oldVal + " to " + newVal);
        });
        System.out.println("doubleProperty value " + doubleProperty.getValue());
        doubleProperty.setValue(500);
        System.out.println("doubleProperty value " + doubleProperty.getValue());
    }
}
