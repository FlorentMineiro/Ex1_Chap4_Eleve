package com.example.ex1_chap4_eleve;

import java.util.ArrayList;
import java.util.Scanner;

public class Unite {
    private String nom;
    private ArrayList<Eleve> lesEleves;

    public Unite(String nom) {
        this.nom = nom;
        this.lesEleves = lesEleves;
    }

    public void ajoutEleve(Eleve e){
        lesEleves.add(e);
    }


    public Eleve getEleveMeilleur(){



        Eleve meilleur = lesEleves.get(0);
        for (Eleve e : lesEleves){
            if (e.getMoyenne() > meilleur.getMoyenne()){
                meilleur = e;
            }
        }
        return meilleur;

    }

    public Eleve getEleve(String nom) {
        return lesEleves.get(Integer.parseInt(nom));
    }

    public ArrayList<Eleve> getElevesMoyInf10() {
        ArrayList<Eleve> resultat = new ArrayList<>();

        for (Eleve mauvais : lesEleves) {
            if (mauvais.getMoyenne() < 10) {
                resultat.add(mauvais);



            }


        }
        return resultat;
    }

    public void saisie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le nom de l'élève");


        }

}
