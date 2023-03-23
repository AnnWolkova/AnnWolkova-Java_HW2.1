module com.example.java_hw1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_hw1 to javafx.fxml;
    exports com.example.java_hw1;
}