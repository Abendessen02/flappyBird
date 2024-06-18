
import greenfoot.GreenfootImage;
import greenfoot.World;
import java.util.concurrent.ThreadLocalRandom;

public class MainWorld extends World {

    Player player;
    private int flappyCounter = 0;
    private int pipeCounter;
    public int score = 0;
    public int firstPipe = 212;
    public boolean isPaused = true;
    Score scoreObj = null;

    public MainWorld(){
        super(500, 700, 1, false);
        GreenfootImage image = new GreenfootImage("images/FlappyBirdBackground.jpg");
        image.scale(image.getWidth()-100,image.getHeight()-500);
        setBackground(image);
        setPaintOrder(Score.class, Pipe.class, Player.class, GameOver.class);
        createScore();
        createPlayer();
    }

    public void createScore(){
        scoreObj = new Score();
        scoreObj.setScore(0);
        addObject(scoreObj, getWidth()/2, getHeight()/10);
    }

    public void createPlayer() {
        player = new Player(10);
        addObject(player, 100, getHeight()/2);
    }

    public void act (){
        pipeCounter++;
            if (pipeCounter % 100 == 0) {
                createPipe();
            }

            if (pipeCounter >= firstPipe) {
                if (flappyCounter % 100 == 0) {
                    score++;
                    scoreObj.setScore(score);
                }
                flappyCounter++;
            }
    }

    private void createPipe() {
        Pipe pipeUp = new Pipe(100, 500, 4, 0);
        Pipe pipeDown = new Pipe(100, 500, 4    , 180);
        var spawnHeight = generatePipeSpawnHeight();
        addObject(pipeUp, getWidth(), getHeight() - spawnHeight);
        addObject(pipeDown, getWidth(), getHeight() - getHeight() - spawnHeight);
    }
    private int generatePipeSpawnHeight(){
        return ThreadLocalRandom.current().nextInt(0,  150);
    }
}
