package com.viralcoder.learnspring.game;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("package com.viralcoder.learnspring.game")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            // printed supercontra/mario up method using gamingconsole interface
            context.getBean(GamingConsole.class).up();
            // printed all methods of game using gamerunner
            context.getBean(GameRunner.class).run();
        }
    }
}
