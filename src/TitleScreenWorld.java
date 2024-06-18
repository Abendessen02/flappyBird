import greenfoot.GreenfootImage;
import greenfoot.World;


public class TitleScreenWorld extends World {
    StartButton startButton = null;

    public TitleScreenWorld(){
        super(500, 700, 1, false);
        GreenfootImage image = new GreenfootImage("images/FlappyBirdBackground.jpg");
        image.scale(image.getWidth()-100,image.getHeight()-500);
        setBackground(image);
        createTitleScreen();
    }

    public void createTitleScreen(){
        startButton = new StartButton();
        Title title = new Title();
        addObject(title, getWidth()/2 , 300);
        addObject(startButton, getWidth()/2, 400);
    }
}
