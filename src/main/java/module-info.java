module com.mycosas.testjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycosas.testjavafx to javafx.fxml;
    exports com.mycosas.testjavafx;
}
