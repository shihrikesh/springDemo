package com.leanring.springDemo;

import com.leanring.springDemo.config.ApplicationConfig;
import com.leanring.springDemo.springDI.GameConsole;
import com.leanring.springDemo.springDI.GameRunner;
import com.leanring.springDemo.springDI.MarioGame;
import com.leanring.springDemo.springDI.SuperContraGame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        GameConsole gameConsole = applicationContext.getBean(MarioGame.class);
        gameConsole.up();
        gameConsole.down();
        gameConsole.left();
        gameConsole.right();

        gameConsole = applicationContext.getBean(SuperContraGame.class);
        gameConsole.up();
        gameConsole.down();
        gameConsole.left();
        gameConsole.right();

        GameRunner gameRunner = applicationContext.getBean(GameRunner.class);
        gameRunner.runGame();
        /*GameRunner marioGameRunner = (GameRunner) applicationContext.getBean("marioGame");
        marioGameRunner.runGame();

        GameRunner scGameRunner = (GameRunner) applicationContext.getBean("superContraGame");
        scGameRunner.runGame();*/
    }

}
