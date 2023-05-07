package com.leanring.springDemo.springDI;

public class MarioGame implements GameConsole {

    public void up() {
        System.out.println("MG up");
    }

    public void down() {
        System.out.println("MG down");
    }

    public void left() {
        System.out.println("MG left");
    }

    public void right() {
        System.out.println("MG right");
    }

}
