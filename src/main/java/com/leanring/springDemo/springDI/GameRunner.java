package com.leanring.springDemo.springDI;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    //@Autowired  // field injection
//    @Qualifier("marioGame")  //uncomment to get marioGame as dependency, by default primary
    private GameConsole game;

    // constructor Injection . Constructor based injection is recommended rather than field or setter based
    public GameRunner(GameConsole game) {
        this.game = game;
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
