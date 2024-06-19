import greenfoot.*;

public class GameOver extends Actor {

    private int score;
    GreenfootImage Image = new GreenfootImage("images/GameOverScreen.png");
    public GameOver(int width, int height){
         Image.scale(width, height);
        setImage(Image);
    }

    public void setScore(int score) {
        this.score = score;
    }
}
