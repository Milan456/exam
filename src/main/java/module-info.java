module hennessy {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens hennessy to javafx.fxml;
    exports hennessy;
}