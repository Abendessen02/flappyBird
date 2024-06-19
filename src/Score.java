import greenfoot.Actor;
import greenfoot.*;
import greenfoot.Color;

public class Score extends Actor {
    public Score (){
        GreenfootImage image = new GreenfootImage(20, 10);
        setImage(image);
    }

    public void setScore(char score){
        GreenfootImage image = new GreenfootImage(getNumber(score));
        image.scale(20,40);
        setImage(image);
    }

    public String getNumber(char score){
        switch (score){
            case '0':
                return "images/Zero.png";
            case '1':
                return "images/One.png";
            case '2':
                return "images/Two.png";
            case '3':
                return "images/Three.png";
            case '4':
                return "images/Four.png";
            case '5':
                return "images/Five.png";
            case '6':
                return "images/Six.png";
            case '7':
                return "images/Seven.png";
            case '8':
                return "images/Eight.png";
            case '9':
                return "images/Nine.png";
            default:
                return "";
        }
    }
}
