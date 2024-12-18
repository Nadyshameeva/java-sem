module com.example.javasem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;
    requires static lombok;
    requires java.sql;
    requires org.slf4j;


    opens com.example.javasem to javafx.fxml;
    exports com.example.javasem;
}