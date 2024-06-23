package com.viralcoder.learnspring.game;

public class GameRunner {
    // (if used Mario game instance) we have to make changes in game runner class
    // in order to run another game instead of mario game
    // hence it is called tightly coupled

    // MarioGame game;

    // so, use below interfaces to make it loosely coupled
    GamingConsole game;

    public GameRunner(GamingConsole game){
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
