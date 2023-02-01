module vidmot.reiknivel {
    requires javafx.controls;
    requires javafx.fxml;


    opens vidmot.reiknivel to javafx.fxml;
    exports vidmot.reiknivel;
}
