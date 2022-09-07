module sample.musicui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens sample.musicui to javafx.fxml;
    exports sample.musicui;
}