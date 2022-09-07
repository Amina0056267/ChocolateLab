package com.demos.bnta.word_guesser.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name= "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;


    @OneToMany(mappedBy =  "player")
     private List<Game> games;

    public Player(String name) {
        this.name = name;
        this.games = new ArrayList<>();
            }

    public Player(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
