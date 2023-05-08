module com.shadow.shadowfxprojects {
    requires javafx.controls;
    requires javafx.fxml;
    requires barcode;
    requires zxing.core;
    requires qrgen;

    opens com.shadow.Main to javafx.fxml;
    exports com.shadow.Main;
    exports com.shadow.controllers;
    opens com.shadow.controllers to javafx.fxml;
}