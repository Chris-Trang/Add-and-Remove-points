module com.example.assignment2q2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment2q2 to javafx.fxml;
    exports com.example.assignment2q2;
}