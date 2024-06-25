package com.viralcoder.learnspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    // (if used SuperContra game instance) we have to make changes in game runner class
    // in order to run another game instead of SuperContra game
    // hence it is called tightly coupled

    // SuperContra game;

    // so, use below interfaces to make it loosely coupled
    // this will act as GamingConsole game = new SuperContra(); - reference of interface
    GamingConsole game;

    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game){
        this.game = game;
        System.out.println(game);
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
