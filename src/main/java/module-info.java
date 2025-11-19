module com.example.bearsticker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bearsticker to javafx.fxml;
    exports com.example.bearsticker;
}