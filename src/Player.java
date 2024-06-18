import greenfoot.*;


public class Player extends Actor {

    GreenfootImage Image = new GreenfootImage("images/FlappyBirdNormal.png");
    private int speed;
    private double accelerateSpeed = -10;
    double gravity = 0.5;
    double jumpHeight = -9;

    public Player(int speed) {
        setSpeed(speed);
        Image.scale(49, 35);
        setImage(Image);
        Greenfoot.start();
    }

    @Override
    public void act (){

            if (!getIntersectingObjects(Pipe.class).isEmpty()) {
                gameOver();
            }
            if (getY() > getWorld().getHeight() - 150) {
                gameOver();
            }
            setLocation(getX(), (int) (getY() + accelerateSpeed));
            jump();
            tilt();
            accelerateSpeed = accelerateSpeed + gravity;

    }

    private void jump (){
        if(Greenfoot.isKeyDown("space")){
            accelerateSpeed = jumpHeight;
        }
    }
    private void tilt () {
        if (accelerateSpeed < -0 ) {
            setRotation(-35);
        } else if (accelerateSpeed > 0 ) {
            setRotation(35);
        }
    }
    private void gameOver(){
            GameOver gameOver = new GameOver(309, 85);
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            TitleScreenWorld titleScreen = new TitleScreenWorld();
            Greenfoot.setWorld(titleScreen);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
