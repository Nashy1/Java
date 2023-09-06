module com.example.java_dummiesbook6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_dummiesbook6 to javafx.fxml;
    exports com.example.java_dummiesbook6;
    exports com.example.java_dummiesbook6.Chapter1;
    opens com.example.java_dummiesbook6.Chapter1 to javafx.fxml;
    exports com.example.java_dummiesbook6.Chapter2;
    opens com.example.java_dummiesbook6.Chapter2 to javafx.fxml;
    exports com.example.java_dummiesbook6.Chapter3;
    opens com.example.java_dummiesbook6.Chapter3 to javafx.fxml;
}