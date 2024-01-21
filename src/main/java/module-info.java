module com.example.r6tracker {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.base;


    opens com.example.r6tracker to javafx.fxml;
    exports com.example.r6tracker;
    exports com.example.r6tracker.Screens;
    opens com.example.r6tracker.Screens to javafx.fxml;
    opens com.example.r6tracker.classes to javafx.base;
}