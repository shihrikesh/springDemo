package com.leanring.springDemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.leanring.springDemo")
public class ApplicationConfig {

   /* @Autowired
    @Qualifier("superContraGame")
    private GameConsole scgameConsole;

    *//*@Autowired
    @Qualifier("marioGame")
    private GameConsole gameConsole;*//*

    @Bean
    public MarioGame marioGame() {
        return new MarioGame();
    }

    @Bean
    public SuperContraGame superContraGame() {
        return new SuperContraGame();
    }
   *//* @Bean
    public GameRunner gameRunner(@Qualifier("marioGame") final GameConsole gameConsole){
        return new GameRunner(gameConsole);
    }*//*

    @Bean
    public GameRunner marioGameRunner(@Qualifier("marioGame") final GameConsole gameConsole) {
        return new GameRunner(gameConsole);
    }

    @Bean
    public GameRunner scGameRunner() {
        return new GameRunner(scgameConsole);
    }*/

}
