module com.example.transportes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.transportes to javafx.fxml;
    exports com.example.transportes;
}