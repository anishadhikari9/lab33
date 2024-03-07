module com.example.hr_management_anish {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.hr_management_anish to javafx.fxml;
    exports com.example.hr_management_anish;
}