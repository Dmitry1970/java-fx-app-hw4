module ru.gb.javafxapphw4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.javafxapphw4 to javafx.fxml;
    exports ru.gb.javafxapphw4;
}