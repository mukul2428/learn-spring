package com.viralcoder.learnspring.game;

public class SuperContraGame implements GamingConsole{
    // implementing methods that will perform specific actions when specific button is pressed on game
    public void up(){
        System.out.println("Up");
    }
    public void down(){
        System.out.println("Sit Down");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Shoot a bullet");
    }
}
