import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

public class Title extends Actor {
    GreenfootImage Image = new GreenfootImage("images/flappybird_title.png");

    public Title() {
        Image.scale(300, 90);
        setImage(Image);
        Greenfoot.start();
    }
}
