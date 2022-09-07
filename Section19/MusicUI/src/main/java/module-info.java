module sample.musicui {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.musicui to javafx.fxml;
    exports sample.musicui;
}