import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

public class Title extends Actor {

    public Title(String pictureFileName) {
        GreenfootImage image = new GreenfootImage(pictureFileName);
        image.scale(300, 90);
        setImage(image);
        Greenfoot.start();
    }
}
