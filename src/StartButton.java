import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

public class StartButton extends Actor {

    GreenfootImage Image = new GreenfootImage("images/flappybird_start_button.png");

    public StartButton() {
        Image.scale(200, 60);
        setImage(Image);
        Greenfoot.start();
    }

    @Override
    public void act() {
        MainWorld mainWorld = new MainWorld();
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(mainWorld);
        }
    }
}
