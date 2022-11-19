module com.mycompany.clothesshopmanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.clothesshopmanager to javafx.fxml;
    exports com.mycompany.clothesshopmanager;
}
