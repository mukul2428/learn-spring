package com.viralcoder.learnspring;

import com.viralcoder.learnspring.game.GameRunner;
import com.viralcoder.learnspring.game.GamingConsole;
import com.viralcoder.learnspring.game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole gamingConsole(){
        var game = new SuperContraGame();
        return game;
    }
    @Bean
    // since game runner takes gaming console argument so passing that
    public GameRunner gameRunner(GamingConsole gamingConsole){
        var game = new GameRunner(gamingConsole);
        return game;
    }
}
