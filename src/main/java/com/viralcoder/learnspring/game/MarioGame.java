package com.viralcoder.learnspring.game;

//public class MarioGame { // for tightly coupled
//    public void up(){
//        System.out.println("Jump");
//    }
//    public void down(){
//        System.out.println("Go into a hole");
//    }
//    public void left(){
//        System.out.println("Go back");
//    }
//    public void right(){
//        System.out.println("Accelerate");
//    }
//}

public class MarioGame implements GamingConsole { // for loosely coupled
    // implementing methods that will perform specific actions when specific button is pressed on game
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go into a hole");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Accelerate");
    }
}
