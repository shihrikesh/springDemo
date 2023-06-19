package com.leanring.springDemo.springDI;

import org.springframework.stereotype.Service;

@Service
public class SuperContraGame implements GameConsole {

    public void up() {
        System.out.println("SC up");
    }

    public void down() {
        System.out.println("SC down");
    }

    public void left() {
        System.out.println("SC left");
    }

    public void right() {
        System.out.println("SC right");
    }

}
