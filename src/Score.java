import greenfoot.Actor;
import greenfoot.*;
import greenfoot.Color;

public class Score extends Actor {
    public Score (){
        GreenfootImage image = new GreenfootImage(100, 50);
        setImage(image);
    }

    public void setScore(int score){
        GreenfootImage image = getImage();
        image.clear();
        image.setColor(Color.BLACK);
        image.drawString("" + score, 30, 30);
    }
}
