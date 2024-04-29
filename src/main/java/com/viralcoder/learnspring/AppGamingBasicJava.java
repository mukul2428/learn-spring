package com.viralcoder.learnspring;

import com.viralcoder.learnspring.game.GameRunner;
import com.viralcoder.learnspring.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        // creating instance of mario game
        var marioGame = new MarioGame();
        // running mario game using game runner
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
