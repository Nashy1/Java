module com.example.java_dummiesbook6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_dummiesbook6 to javafx.fxml;
    exports com.example.java_dummiesbook6;
}