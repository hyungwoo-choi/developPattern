package Observer.After;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject{
    private List<Integer> scores = new ArrayList<Integer>();
    public void addScore(int score){
        scores.add(score);
        nofityObservers();
    }
    public List<Integer> getScoreRecord(){
        return scores;
    }

}
