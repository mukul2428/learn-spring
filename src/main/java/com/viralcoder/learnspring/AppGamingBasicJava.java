package com.viralcoder.learnspring;

import com.viralcoder.learnspring.game.GameRunner;
import com.viralcoder.learnspring.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        // creating instance of mario game
//        var marioGame = new MarioGame();  - for tightly coupled
//        var superContra = new SuperContraGame - for tightly coupled
//        var game = new MarioGame(); - for loosely coupled
        var game = new SuperContraGame(); // - for loosely coupled
        // running mario game using game runner
//        var gameRunner = new GameRunner(marioGame); - for tightly coupled
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
