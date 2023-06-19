package com.leanring.springDemo.springDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GameRunner {

    //@Autowired  // field injection
//    @Qualifier("marioGame")  //uncomment to get marioGame as dependency, by default primary
    @Autowired
    //@Qualifier(value = "marioGame")
    @Qualifier(value = "superContraGame")
    private GameConsole game;

    // constructor Injection . Constructor based injection is recommended rather than field or setter based
    public GameRunner() {
        super();
    }

    // setter injection
   /* @Autowired
    public void setGame(GameConsole game) {
        this.game = game;
    }*/

    public void runGame() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
