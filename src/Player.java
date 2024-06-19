import greenfoot.*;


public class Player extends Actor {

    GreenfootImage Image = new GreenfootImage("images/FlappyBirdNormal.png");
    private double fallingSpeed = -10;
    private double gravity;
    private double jumpHeight;

    public Player(double gravity, double jumpHeight) {
        Image.scale(49, 35);
        setImage(Image);
        Greenfoot.start();
        setGravity(gravity);
        setJumpHeight(jumpHeight);
    }

    @Override
    public void act (){
            if (!getIntersectingObjects(Pipe.class).isEmpty()) {
                gameOver();
            }
            if (getY() > getWorld().getHeight() - 150) {
                gameOver();
            }
            setLocation(getX(), (int) (getY() + fallingSpeed));
            jump();
            neigung();
            fallingSpeed = fallingSpeed + gravity;
    }

    private void jump (){
        if(Greenfoot.isKeyDown("space")){
            fallingSpeed = jumpHeight;
        }
    }
    private void neigung() {
        if (fallingSpeed < -0 ) {
            setRotation(-35);
        } else if (fallingSpeed > 0 ) {
            setRotation(35);
        }
    }
    private void gameOver(){
            GameOver gameOver = new GameOver(309, 85);
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}
