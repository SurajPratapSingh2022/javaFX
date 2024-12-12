package application;

import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class PropertyExample2 {
    public static void main(String[] args) {
        // Corrected to use ReadOnlyStringWrapper for initialization
        ReadOnlyStringWrapper readOnlyStringWrapper = new ReadOnlyStringWrapper("Hello World1");
        ReadOnlyStringProperty readOnlyStringProperty = readOnlyStringWrapper.getReadOnlyProperty();
        readOnlyStringProperty.addListener((obs, oldVal, newVal) -> {
            System.out.println("Value is changed from " + oldVal + " to " + newVal);
        });
        System.out.println("Value = " + readOnlyStringProperty.getValue());

        // StringProperty example with corrected listener
        StringProperty stringProperty = new SimpleStringProperty("Hello World2");
        stringProperty.addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> obs, String oldVal, String newVal) {
                System.out.println("Value is changed from " + oldVal + " to " + newVal);
            }
        });
        System.out.println("Value = " + stringProperty.getValue());
        stringProperty.setValue("Hii World2");
        System.out.println("Value = " + stringProperty.getValue());
    }
}
