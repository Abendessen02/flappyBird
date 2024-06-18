import greenfoot.*;

public class GameOver extends Actor {


    GreenfootImage Image = new GreenfootImage("images/GameOverScreen.png");
    public GameOver(int width, int height){
         Image.scale(width, height);
        setImage(Image);
    }
}
