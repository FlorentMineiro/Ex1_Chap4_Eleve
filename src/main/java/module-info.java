module com.example.ex1_chap4_eleve {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex1_chap4_eleve to javafx.fxml;
    exports com.example.ex1_chap4_eleve;
}