package com.viralcoder.learnspring;
import com.viralcoder.learnspring.game.GameRunner;
import com.viralcoder.learnspring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// this is using spring- loosely coupled
public class App03GamingSpringBeans {
    public static void main(String[] args) {
        // launching spring context, GamingConfiguration will have all beans
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            // printed supercontra/mario up method using gamingconsole interface
            context.getBean(GamingConsole.class).up();
            // printed all methods of game using gamerunner
            context.getBean(GameRunner.class).run();
        }
    }
}
