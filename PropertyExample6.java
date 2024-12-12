package application;

import javafx.beans.property.ListProperty;
import javafx.beans.property.ReadOnlyListProperty;
import javafx.beans.property.ReadOnlyListWrapper;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PropertyExample6 {
    public static void main(String[] args) {
        // Corrected method name for creating ObservableList
        ObservableList<String> list = FXCollections.observableArrayList();
        
        // Correctly initialize ReadOnlyListWrapper and get ReadOnlyListProperty
        ReadOnlyListWrapper<String> readOnlyListWrapper = new ReadOnlyListWrapper<>(list);
        ReadOnlyListProperty<String> readOnlyListProperty = readOnlyListWrapper.getReadOnlyProperty();
        
        readOnlyListProperty.addListener((obs, oldVal, newVal) -> {
            System.out.println("readonly value is changed from " + oldVal + " to " + newVal);
        });
        System.out.println("Readonly value = " + readOnlyListProperty.getValue());

        // Corrected initialization for ListProperty
        ObservableList<String> list2 = FXCollections.observableArrayList();
        ListProperty<String> listProperty = new SimpleListProperty<>(list2);
        
        listProperty.addListener((obs, oldVal, newVal) -> {
            System.out.println("listProperty value is changed from " + oldVal + " to " + newVal);
        });
        System.out.println("listProperty value = " + listProperty.getValue());

        // Add elements to the underlying list, not the property directly
        listProperty.add("Rohan");
        listProperty.add("Sohan");
        System.out.println("listProperty value = " + listProperty.getValue());
    }
}
