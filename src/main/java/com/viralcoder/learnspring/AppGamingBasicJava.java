package com.viralcoder.learnspring;

import com.viralcoder.learnspring.game.GameRunner;
import com.viralcoder.learnspring.game.MarioGame;
import com.viralcoder.learnspring.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        // creating instance of mario game
//        var game = new MarioGame();
        var game = new SuperContraGame();
        // running mario game using game runner
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
