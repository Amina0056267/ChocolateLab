package com.demos.bnta.word_guesser.models;

public class Guess {

    private String letter;

    public Guess(String letter) {
        this.letter = letter;
    }

//    POJOS must have empty default constructer and getters and setters

    public Guess() {
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

}
