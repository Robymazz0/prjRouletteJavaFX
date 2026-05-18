module com.mycompany.roulettejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.roulettejavafx to javafx.fxml;
    exports com.mycompany.roulettejavafx;
}
