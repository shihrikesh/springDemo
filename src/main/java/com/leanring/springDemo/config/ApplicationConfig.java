package com.leanring.springDemo.config;

import com.leanring.springDemo.springDI.GameConsole;
import com.leanring.springDemo.springDI.GameRunner;
import com.leanring.springDemo.springDI.MarioGame;
import com.leanring.springDemo.springDI.SuperContraGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Autowired
    @Qualifier("superContraGame")
    private GameConsole scgameConsole;

    /*@Autowired
    @Qualifier("marioGame")
    private GameConsole gameConsole;*/

    @Bean
    public MarioGame marioGame() {
        return new MarioGame();
    }

    @Bean
    public SuperContraGame superContraGame() {
        return new SuperContraGame();
    }
   /* @Bean
    public GameRunner gameRunner(@Qualifier("marioGame") final GameConsole gameConsole){
        return new GameRunner(gameConsole);
    }*/

    @Bean
    public GameRunner marioGameRunner(@Qualifier("marioGame") final GameConsole gameConsole) {
        return new GameRunner(gameConsole);
    }

    @Bean
    public GameRunner scGameRunner() {
        return new GameRunner(scgameConsole);
    }

}
