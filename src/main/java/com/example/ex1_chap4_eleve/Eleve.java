package com.example.ex1_chap4_eleve;

import java.util.ArrayList;

public class Eleve {
    private String nom;
    private  ArrayList<Integer> listeNotes;


    public Eleve(String nom, ArrayList<Integer> listeNotes) {
        this.nom = nom;
        this.listeNotes = new ArrayList<>() ;
    }

    public Eleve(String nom) {
        this.nom = nom;
        this.listeNotes = new ArrayList<>() ;
    }

    public void ajouterNote(int note){
        if (note < 0){
            note = 0;
            listeNotes.add(note);
        } else if (note > 20) {
            note = 20;
            listeNotes.add(note);
        }else {
            listeNotes.add(note);
        }



    }

    public String getNom() {
        return nom;
    }
    private  int sommeNotes(){
        int somme = 0;
        for (int notes : listeNotes){
            somme += notes;
        }
        return somme;
    }
    public  double getMoyenne(){
        int compteur = 0;
        for (int nombreNote : listeNotes){
            compteur++;
        }
        double moyenne = sommeNotes()/compteur;
        return moyenne;
    }

    @Override
    public String toString() {
        String moyenne = String.valueOf(getMoyenne());
        return "Eleve : "+ this.nom + "Moyenne : "+ moyenne;
    }
}
