module com.example.r6tracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.r6tracker to javafx.fxml;
    exports com.example.r6tracker;
}