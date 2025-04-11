package com.example.ex1_chap4_eleve;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Eleve e1 = new Eleve("Erwan");
        Eleve e2 = new Eleve("Florent");
        e1.ajouterNote(15);
        e1.ajouterNote(18);
        e1.ajouterNote(-2);
        e1.ajouterNote(22);
        System.out.println(e1);


        Unite u1 = new Unite("SIO");
        u1.ajoutEleve(e1);


    }
}