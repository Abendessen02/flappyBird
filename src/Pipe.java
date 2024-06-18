import greenfoot.*;

public class Pipe extends Actor {
    GreenfootImage Image = new GreenfootImage("images/Pipe.png");
    private int pipeSpeed;
    public Pipe(int width, int height, int speed, int rotationDegree){
        setPipeSpeed(speed);
        setRotation(rotationDegree);
        Image.scale(width, height);
        setImage(Image);
     }

    public void act () {
             setLocation(getX() - pipeSpeed, getY());
    }

    public void setPipeSpeed(int pipeSpeed) {
        this.pipeSpeed = pipeSpeed;
    }
}
