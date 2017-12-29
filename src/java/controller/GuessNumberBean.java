package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;

@Named(value = "guessNumberBean")
@SessionScoped
public class GuessNumberBean implements Serializable {

    private int RANDOMNUMBER;
    private int max = 10;
    private int min = 1;
    private int userGuess;

    public GuessNumberBean() {
        Random random = new Random();
        RANDOMNUMBER = random.nextInt(max) + 1;
    }

    public String getResponse() {
        if (userGuess == RANDOMNUMBER) {

            return "You guessed right!";
        } else if (userGuess < RANDOMNUMBER) {
            return "Too low!";

        } else {
            return "Too high!";

        }
    }
    
    public String reset(){
        this.userGuess = 0;
        Random random = new Random();
        RANDOMNUMBER = random.nextInt(max) + 1;
        return "index";
    }

    public String getImage() {
        if (userGuess == RANDOMNUMBER) {

            return "img/correct.gif";
        } else {
            return "img/wrong.gif";

        }
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(int userGuess) {
        this.userGuess = userGuess;
    }
}
