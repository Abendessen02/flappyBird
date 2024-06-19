import greenfoot.GreenfootImage;
import greenfoot.World;
import java.util.concurrent.ThreadLocalRandom;

public class MainWorld extends World {

    Player player;
    private int flappyCounter = 0;
    private int pipeCounter;
    private int score = 0;
    public int firstPipe = 212;
    private Score OneDigit = new Score();
    private Score SecondDigit = null;
    private Score ThirdDigit = null;

    public MainWorld(){
        super(500, 700, 1, false);
        GreenfootImage image = new GreenfootImage("images/FlappyBirdBackground.jpg");
        image.scale(image.getWidth()-100,image.getHeight()-500);
        setBackground(image);
        setPaintOrder(Score.class, GameOver.class, Pipe.class, Player.class);
        OneDigit.setScore('0');
        addObject(OneDigit, getWidth()/2-10, getHeight()/10);
        createPlayer();
    }

    public void createPlayer() {
        player = new Player(0.5, -9);
        addObject(player, 100, getHeight()/2);
    }

    public void act (){
        pipeCounter++;
            if (pipeCounter % 100 == 0) {
                createPipes();
            }
            if (pipeCounter >= firstPipe) {
                if (flappyCounter % 100 == 0) {
                    score++;
                     createScoreObjects(score);
                }
                flappyCounter++;
            }
    }

    public void createScoreObjects(int score){
        String numStr = String.valueOf(score);
        char[] result = numStr.toCharArray();
        OneDigit.setScore(result[0]);
        if (score >= 10){
            SecondDigit = new Score();
            SecondDigit.setScore(result[1]);
            addObject(SecondDigit, (getWidth()/2)+10, getHeight()/10);
        }
        if (score >= 100 ){
            SecondDigit = new Score();
            addObject(ThirdDigit, getWidth()/2, getHeight()/10);
            ThirdDigit.setScore(result[2]);
        }
    }
    private void createPipes() {
        Pipe pipeUp = new Pipe(100, 500, 4, 0);
        Pipe pipeDown = new Pipe(100, 500, 4    , 180);
        var spawnHeight = generatePipeSpawnHeight();
        addObject(pipeUp, getWidth(), getHeight() - spawnHeight);
        addObject(pipeDown, getWidth(), getHeight() - getHeight() - spawnHeight);
    }
    private int generatePipeSpawnHeight(){
        return ThreadLocalRandom.current().nextInt(-30,  150);
    }
}
